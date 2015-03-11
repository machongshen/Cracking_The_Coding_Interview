package String;

public class factorial {
 public int fact (int n ){
	 
	 if (n == 1 || n == 0) return n;
	 int result;
	 result = fact(n - 1) * n;
	 return result;
 }
 public static void main(String [] args){
	 factorial f = new factorial();
	 System.out.println(f.fact(1));
 }
}
