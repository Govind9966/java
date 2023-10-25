import java.util.*;
public class end2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Character> list= new ArrayList<>();
        String str= sc.next();
        String s= "";
        for( int i=0;i<str.length();i++){
           if(i==str.length()-1 && str.length() %2 !=0){
            s+=str.charAt(i)+"";
           }
           else if(str.charAt(i)>str.charAt(i+1)){
            s+=str.charAt(i)+"";
           }
           else{
            s+=str.charAt(i+1)+"";

           }
           i++;
        }
        System.out.println(s);

        
    }
    
}
