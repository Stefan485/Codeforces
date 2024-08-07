package difficulty1400;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Vacations {

    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
  
        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
  
        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(
                new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
  
        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    }
                    else {
                        continue;
                    }
                }
                buf[cnt++] = (byte)c;
            }
            return new String(buf, 0, cnt);
        }
  
        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
  
            if (neg)
                return -ret;
            return ret;
        }
  
        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
  
        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
  
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
  
            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }
  
            if (neg)
                return -ret;
            return ret;
        }
  
        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0,
                                 BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
  
        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
  
        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }

    public static void main(String[] args) throws Exception {
        Reader in = new Reader();
        int days = in.nextInt();
        int[] options = new int[days];

        for(int i = 0; i < days; i++) {
            options[i] = in.nextInt();
        }
        in.close();

        boolean[][] optionMap = new boolean[3][days];
        int pause = 0;
        if(options[0] == 0){
            pause++;
            optionMap[0][0] = true;
            optionMap[1][0] = false;
            optionMap[2][0] = false;
        } else if (options[0] == 1){
            optionMap[0][0] = false;
            optionMap[1][0] = true;
            optionMap[2][0] = false;
        } else if (options[0] == 2) {
            optionMap[0][0] = false;
            optionMap[1][0] = false;
            optionMap[2][0] = true;
        } else {
            optionMap[0][0] = false;
            optionMap[0][0] = true;
            optionMap[0][0] = true;
        }

        for(int i = 1; i < days; i++) {
            if(options[i] == 0) {
                pause++;
                optionMap[0][i] = true;
                optionMap[1][i] = false;
                optionMap[2][i] = false;
            } else if (options[i] == 1) {
                if(optionMap[1][i - 1] && optionMap[2][i - 1]){
                    optionMap[0][i] = false;
                    optionMap[1][i] = true;
                    optionMap[2][i] = false;
                } else if (optionMap[1][i - 1]) {
                    pause++;
                    optionMap[0][i] = true;
                    optionMap[1][i] = false;
                    optionMap[2][i] = false;
                } else {
                    optionMap[0][i] = false;
                    optionMap[1][i] = true;
                    optionMap[2][i] = false;
                }
            } else if (options[i] == 2) {
                if(optionMap[1][i - 1] && optionMap[2][i - 1]){
                    optionMap[0][i] = false;
                    optionMap[1][i] = false;
                    optionMap[2][i] = true;
                } else if (optionMap[2][i - 1]) {
                    pause++;
                    optionMap[0][i] = true;
                    optionMap[1][i] = false;
                    optionMap[2][i] = false;
                } else {
                    optionMap[0][i] = false;
                    optionMap[1][i] = false;
                    optionMap[2][i] = true;
                }
            } else {
                if(optionMap[1][i - 1] && optionMap[2][i - 1]){
                    optionMap[0][i] = false;
                    optionMap[1][i] = true;
                    optionMap[2][i] = true;
                } else if (optionMap[0][i - 1]) {
                    optionMap[0][i] = false;
                    optionMap[1][i] = true;
                    optionMap[2][i] = true;
                } else if (optionMap[1][i - 1]){
                    optionMap[0][i] = false;
                    optionMap[1][i] = false;
                    optionMap[2][i] = true;
                } else {
                    optionMap[0][i] = false;
                    optionMap[1][i] = true;
                    optionMap[2][i] = false;
                }
            }
        }

        System.out.println(pause);
    }
}
