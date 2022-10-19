import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException;
import java.io.PrintWriter; 
 
public class MakeItGood {
 
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
        PrintWriter pw = new PrintWriter(System.out);
        int test_cases = in.nextInt();
 
        while(test_cases-- > 0){
            int testLen = in.nextInt();
            int arr[] = new int[testLen];
            for(int i = 0; i < testLen; i++){
                arr[i] = in.nextInt();
            }
            if(testLen == 1){
                pw.println(0);
                continue;
            }
            int low = 0;
            int high = testLen - 1;
            int ans = testLen - 2;
            while(low <= high){
                int mid = (low + high) / 2;
                if(valid(arr, mid)){
                    ans = Math.min(ans, mid);
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            pw.println(ans);
        }
        pw.close();
        in.close();
    }

    public static boolean valid(int arr[], int i){
        int j = arr.length - 1;
        int max1 = arr[i], max2 = arr[j];
        while(i <= j){
            if(i + 1 <= j && arr[i + 1] >= max1){
                i++;
                max1 = arr[i];
            }
            else if(j - 1 >= i && arr[j - 1] >= max2){
                j--;
                max2 = arr[j];
            }
            else{
                break;
            }
        }
        if(i >= j){
            return true;
        }
        else{
            return false;
        }
    }
}