package String;

import java.util.ArrayList;

public class UniqueCharactor {
 public boolean isUnique(String s){
	 
	 s =s.trim();
	 if (s.length()==1)
	 {
		 return true;
	 }
	 ArrayList<Character> list = new ArrayList<Character> ();
	 for (int i =0; i<s.length();i++){
		 char cr= s.charAt(i);
		 if (!list.contains(cr)){
			 list.add(cr);
		 }
		 else
			 return false;
	 }
	 return true;
 }
 public static void main(String args[]){
	 UniqueCharactor a = new UniqueCharactor();
	 System.out.println("abcb:"+a.isUnique("abcb"));
 }
}
