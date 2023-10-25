import java.util.*;
public class st{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // last 2 ques st-01
        // int n= sc.nextInt();
        // String name[]=new String[n];
        // String phone[]= new String[n];
        // String email[]= new String[n];
        // for( int i=0;i<n;i++){
        //     name[i]=sc.next();
        //     phone[i]=sc.next();
        //     email[i]= sc.next();

        // }
        // String ne= sc.next();
        // int found=0;
        // for( int i=0;i<n;i++){
        //     if(name[i].compareTo(ne)==0){
        //         System.out.println(name[i]);
        //         System.out.println(phone[i]);
        //         System.out.println(email[i]);
            //      found =1;
            // break;
        //     }
              
        // }
        //  if( found=0){
        //     System.out.println("-1");
        // }

        // //last ques

        // int n= sc.nextInt();
        // String arr[]= new String[n];
        // for( int i=0;i<n;i++){
        //     arr[i]= sc.next();
        // }
        // String s= sc.next();
        // Arrays.sort(arr);
        // for( int i=0;i<n;i++){
        //     if(arr[i].compareTo(s)==0){
        //         System.out.println(i);
                

        //     }
            
        // }
        // int m= sc.nextInt();
        // int n= sc.nextInt();
        // int arr[]= new int[n];
        // for( int i=0;i<n;i++){
        //     arr[i]= sc.nextInt();
        // }
        // // Arrays.sort(arr);
        // for( int i=n-1;i>=0;i--){
        //     System.out.print(arr[i]);
        // }
        // // ques 67
        // String str= sc.next();
        // StringBuilder sb = new StringBuilder(str);
        // int n=sc.nextInt();
        // int m= sc.nextInt();
        // sb.insert(n,'*');
        // sb.insert(m+1,'*');
        // System.out.println(sb);
        int n= sc.nextInt();
        char arr[]= new char[n];
        for( int i=0;i<n;i++){
            arr[i]=sc.next().charAt(i);

        }
        int count=0;
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        for( int i=0;i<n;i++){
            if(arr(i).compareTo(keys(i))){

            }

        }
    }
}