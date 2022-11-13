import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
 
public class App {
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
        int lenOfNumber = in.nextInt();
        int SumOfDIgits = in.nextInt();
 
        if(lenOfNumber == 1){
            if(SumOfDIgits > 9){
                System.out.println("-1 -1");
                in.close();
                return;
            }
 
            System.out.println(SumOfDIgits + " " + SumOfDIgits);
            in.close();
            return;
        }
 
        if(SumOfDIgits == 0){
            System.out.println("-1 -1");
            in.close();
            return;
        }
 
        if(lenOfNumber * 9 < SumOfDIgits){
            System.out.println("-1 -1");
            in.close();
            return;
        }
 
        if(SumOfDIgits < 10){
            String smal = 1 + "";
            for(int i = 1; i < lenOfNumber - 1; i++){
                smal += 0;
            }
            smal += (SumOfDIgits - 1);
 
            String larg = SumOfDIgits + "";
            for(int i = 1; i < lenOfNumber; i++){
                larg += 0;
            }
 
            System.out.println(smal + " " + larg);
            in.close();
            return;
        }

        String larg = "";
        String smal = "";
        int counter = 0;

        while(SumOfDIgits - 9 > 0){
            smal += "9";
            larg += 9;
            SumOfDIgits -= 9;
            counter++;
        }
        if(lenOfNumber - counter == 1){
            smal = SumOfDIgits + smal;
        } else {
            String t = "1";
            smal = (SumOfDIgits - 1) + smal;
            counter += 2;
            for(int i = 1; i <= (lenOfNumber - counter); i++){
                t += 0;
            }
            smal = t + smal;
            counter -= 2;
        }
        larg += SumOfDIgits;
        counter++;
        for(int i = 1; i <= (lenOfNumber - counter); i++){
            larg += 0;
        }
        System.out.println(smal + " " + larg);
        
        in.close();
    }
}