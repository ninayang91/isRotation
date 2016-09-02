

public class Main {

    public static void main(String[] args) {
       
       System.out.println(isRotation("waterbottle", "erbottlewaa"));

    }
    
    //waterbottle -> erbottlewat true
    //you have a method isSubstring(like s.contains(s1)) to check if one word is a substring of another
    //check if s2 is a rotation of s1
    
    public static boolean isRotation(String s1, String s2){
    	if(s1.length()<=0 && s1.length()!=s2.length())return false;
    	String s=s1+s1;
    	return s.contains(s2);
    }
    


}