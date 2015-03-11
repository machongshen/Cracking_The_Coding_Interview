package String;

public class reverseString {
	public String reverse ( String s ){
		if(s.length() == 0 || s.length() == 1){
			return s;
		}
		StringBuffer sb = new StringBuffer ();
		for (int i = s.length()-1 ; i > -1 ; i--){
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	public static void main (String [] args){
		reverseString rs = new reverseString();
		System.out.println(rs.reverse("abc"));
		
	}
	
}
