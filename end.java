import java.util.*;
public class end {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // // ques 1.
        // int n= sc.nextInt();
        // int arr[]= new int[n];
        // for( int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // for( int i=n-1;i>=0;i--){
        //     System.out.print(arr[i]+" ");
        // }

        //ques2.
        // int n = sc.nextInt();
        // sc.nextLine();
        // String s= sc.nextLine();
        // String a= sc.next();
        // ArrayList<String> list = new ArrayList<>();
        // String arr[]=s.split(" ");
        // for( int i=0;i<arr.length;i++){
        //     //  System.out.println(arr[i]);
        //     if(arr[i].compareTo(a)>0){
        //         list.add(arr[i]);
               

        //     }
            //// ques 4.:Removing Duplicate Characters from a String
        // }
        // System.out.println(list);

        // String s= sc.next();
        // ArrayList<Character> ne= new ArrayList<>();
        // for( int i=0;i<s.length()-1;i++){
        //     if(s.charAt(i)!=s.charAt(i+1)){
        //         ne.add(s.charAt(i));

        //     }
        //     if(i==s.length()-2){
        //         ne.add(s.charAt(i+1));
        //     }
        // }
        // System.out.println(ne);
        // // ques 3:. Java Program to Find the Length of the Longest String Using Recursion.
        // String s= sc.nextLine();
        // String arr[]=s.split(" ");
        // int max=0;
        // String ans="";
        // for( int i=0;i<arr.length;i++){
        //     if(arr[i].length()>max){
        //         ans=arr[i];
        //         max=arr[i].length();

        //     }
            
        // }
        // System.out.println(ans.length());

        // // ques5:Cost of groceries
        // int n= sc.nextInt();
        // int x= sc.nextInt();
        // int arr[]= new int[n];
        // int arr1[]= new int[n];
        // int b=0;
        // for( int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // for( int i=0;i<n;i++){
        //     arr1[i]= sc.nextInt();
        // }
        // for( int i=0;i<n;i++){
        //     if(arr[i]>=x){
        //         b=i;

        //     }
        // }
        // System.out.println(arr1[b]);

        // ques7:Message Processing
        // String str = sc.nextLine();
        // str= str.trim();
        // String arr[]=str.split(" ");
        // String ans="";
        // for( int i=0;i<arr.length;i++){
        //     arr[i]=arr[i].trim();
        //     ans=ans+arr[i];

        // }
        // System.out.println(ans);
        // //--- second method
        // String atr = sc.nextLine();
        // ArrayList<Character> ch= new ArrayList<>();
        // for( int i=0;i<atr.length();i++){
        //     if(atr.charAt(i)!=' '){
        //         ch.add(atr.charAt(i));

        //     }

        // }
        // for( int i=0;i<ch.size();i++){
        //     System.out.print(ch.get(i));

        // }

        // //ques.8: Kth Element from last Linked List
        // ArrayList<Integer> neww= new ArrayList<>();
        
        

        // while(true){
        //     int i= sc.nextInt();
        //     if(i==-1){
        //         break;
        //     }
        //     neww.add(i);
        // }
        // int k=sc.nextInt();
        // System.out.print(neww.get(neww.size()-k));


        // // ques 9:  Recursive Text Search Program
        // String str= sc.nextLine();
        // String pat= sc.next();
        // ArrayList<Integer> ans= new ArrayList<>();
        // for( int i=0;i<str.length();i++){
        //     if(str.charAt(i)==(pat.charAt(0) )&&(i+pat.length() <=str.length())){
        //         if(str.substring(i,i + pat.length()).equals(pat)){
        //             ans.add(i);


        //         }
        //     }
        // }
        // System.out.println(ans);

            // reverse thee string elements


        // String str = sc.nextLine();
        // String arr[] = str.split(" ");
        // for (int i = 0; i < arr.length; i++) {
        //     StringBuilder sb = new StringBuilder(arr[i]);
        //     arr[i] = sb.reverse().toString();
        // }
        // String ans = "";
        // for (int i = 0; i < arr.length; i++) {
        //     if (i == arr.length - 1) {
        //         ans += arr[i];
        //     } else {
        //         ans += arr[i] + " ";
        //     }
        // }
        // System.out.println(ans);

        // ques 10 pending and alice nd bob also
        String str= sc.nextLine();
        String words[]=str.split(" ");
        StringBuilder reversestr= new StringBuilder();
        for( String word:words){
            StringBuilder reversewords= new StringBuilder(word).reverse();
            reversestr.append(reversewords.append(" "));
        }
        String result=reversestr.toString().trim();
        System.out.println(result);




        



        
    }
    
}
