package difficulty1200;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class AlternatingSubsequence {
    public static void main(String[] args) throws Exception {

        Reader input = new Reader();
        long tests = input.nextLong();
        while(tests > 0){
            long numbers = input.nextLong();
            List positive = new List();
            List negative = new List();
            long sum = 0;
            for(long i = 0; i < numbers; i++){
                long num = input.nextLong();
                if(num > 0){
                    if(negative.first != null){
                        sum += negative.max;
                        negative.first = null;
                        negative.max = Long.MIN_VALUE;
                    }
                    positive.add(num);
                }
                else{
                    if(positive.first != null){
                        sum += positive.max;
                        positive.max = Long.MIN_VALUE;
                        positive.first = null;
                    }
                    negative.add(num);
                }
            }
            if(positive.first != null){
                sum += positive.max;
            }
            else if(negative.first != null){
                sum += negative.max;
            }
            System.out.println(sum);
            tests--;
        }
        input.close();
    }

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
}

class List{

    class Element{
        long number;
        Element next;
        
        public Element(long number, Element next){
            this.number = number;
            this.next = next;
            }
                
        public Element(long number){
            this(number, null);
        }
    }
        
    public Element first;
    public long max;
    public List(){
        this.first = null;
        this.max = Long.MIN_VALUE;
    }
        
    public void add(long number){
        Element added = new Element(number);
        added.next = first;
        first = added;
        if(first.number > max){
            max = first.number;
        }
    }
}