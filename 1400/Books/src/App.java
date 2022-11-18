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
        int numberOfBooks = in.nextInt();
        int numberOfMinutes = in.nextInt();
        int[] arr = new int[numberOfBooks];

        for(int i = 0; i < numberOfBooks; i++){
            arr[i] = in.nextInt();
        }

        int maxChain = 0;
        int i = 0;

        Sll lista = new Sll();
        while(i < arr.length) {
            if(lista.timeUsed + arr[i] <= numberOfMinutes){
                lista.add(arr[i]);
                i++;
            } else {
                if(arr[i] > numberOfMinutes){
                    if(lista.length > maxChain){
                        maxChain = lista.length;
                    }
                    lista.reset();
                    i++;
                } else {
                    if(lista.length > maxChain){
                        maxChain = lista.length;
                    }
                    while(lista.timeUsed + arr[i] > numberOfMinutes) {
                        lista.removeFirst();
                    }
                    lista.add(arr[i]);
                    i++;
                }
            }
        }
        if(lista.length > maxChain){
            maxChain = lista.length;
        }

        System.out.println(maxChain);
        in.close();
    }
}

class Sll{

    private class Element{
        int value;
        Element next;

        public Element(int value){
            this.value = value;
            this.next = null;
        }
    }

    Element head, rear;
    int length;
    int timeUsed;
    public Sll(){
        this.head = null;
        this.rear = null;
        this.length = 0;
        this.timeUsed = 0;
    }

    public void add(int value){
        Element added = new Element(value);
        this.timeUsed += added.value;
        this.length++;
        if(this.head == null){
            this.head = added;
            this.rear = added;
        } else {
            rear.next = added;
            rear = added;
        }
    }

    public void removeFirst(){
        this.timeUsed -= this.head.value;
        if(this.head == this.rear){
            this.head = null;
            this.rear = null;
        } else{
            this.head = this.head.next;
        }
        this.length--;
    }

    public void reset(){
        this.head = null;
        this.rear = null;
        this.length = 0;
        this.timeUsed = 0;
    }
}