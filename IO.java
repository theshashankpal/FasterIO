import java.io.*;
import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------

       /*
        int n      = sc.nextInt();        // read input as integer
        long k     = sc.nextLong();       // read input as long
        double d   = sc.nextDouble();     // read input as double
        String str = sc.next();           // read input as String
        String s   = sc.nextLine();       // read whole line as String
      
      	// If you want your input directly into an array you can use the following :
      	   
	int[] arr = sc.nextIntArray();		// read an input line as int array
	long[] arr = sc.nextLongArray();	// read an input line as long array
	double[] arr = sc.nextDoubleArray();	// read an input line as double array
	char[] arr = sc.nextCharArray();	// read an input line as char array
	
	// As a list
	
	List<Integer> list = sc.nextIntList();		// read an input line as List<Integer>
	List<Long> list = sc.nextLongList();		// read an input line as List<Long>
	List<Long> list = sc.nextDoubleList();		// read an input line as List<Double>
	List<Character> list = sc.nextCharList();	// read an input line as List<Character>

        int result = 3*n;
        out.println(result);                    // print via PrintWriter
      */

        // Stop writing your solution here. -------------------------------------



        out.close();
    }



    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int[] nextIntArray() {
            return Stream.of(nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        long[] nextLongArray() {
            return Stream.of(nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        }

        double[] nextDoubleArray() {
            return Stream.of(nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        }

        char[] nextCharArray() {
            return nextLine().replace(" ", "").toCharArray();
        }


        List < Integer > nextIntList() {
            return Stream.of(nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        }

        List < Long > nextLongList() {
            return Stream.of(nextLine().split(" ")).mapToLong(Long::parseLong).boxed().collect(Collectors.toList());
        }

        List < Double > nextDoubleList() {
            return Stream.of(nextLine().split(" ")).mapToDouble(Double::parseDouble).boxed().collect(Collectors.toList());
        }

        List < Character > nextCharList() {
            return Stream.of(nextLine().split(" ")).map(j - > j.charAt(0)).collect(Collectors.toList());
        }

    }
}
