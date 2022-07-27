import java.io.*;
import java.util.*;
 
 
public class Main{
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
      	   
	int[] arr = Stream.of(sc.br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	long[] arr = Stream.of(sc.br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
	double[] arr = Stream.of(sc.br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
	char[] arr = sc.br.readLine().replace(" ","").toCharArray();
	
	// As a list
	
	List<Integer> list = Stream.of(scanner.br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
	List<Character> list = Stream.of(br.readLine().split(" ")).map(j -> j.charAt(0)).collect(Collectors.toList());

      int result = 3*n;
      out.println(result);                    // print via PrintWriter
      */

     // Stop writing your solution here. -------------------------------------
	   
	   

      out.close();
   }

     

   //-----------PrintWriter for faster output---------------------------------
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
 
      String nextLine(){
          String str = "";
	  try {
	     str = br.readLine();
	  } catch (IOException e) {
	     e.printStackTrace();
	  }
	  return str;
      }

   }
   //--------------------------------------------------------
}
