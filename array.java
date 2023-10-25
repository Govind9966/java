import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int m= sc.nextInt();
        // int arr[]=new int[n];
        // int arr1[]=new int[m];
        // int arr2[]=new int[m+n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // // for(int i=0;i<n;i++){
        // //     System.out.println(arr[i]);
        // // }
        // for(int i=0;i<m;i++){
        //     arr1[i]=sc.nextInt();
        // }
        
        // for(int i=0;i<n;i++){
        //     arr2[i]=arr[i];
        
            

        // }
        // for(int i=0;i<m;i++){
        //     arr2[n+i]=arr1[i];
        // }
        // Arrays.sort(arr2);
        // for(int i=0;i<(m+n);i++){
        //     System.out.println(arr2[i]);
        // }

        //decimal to binary:
        // int n= sc.nextInt();
        // String s= Integer.toBinaryString(n);
        // System.out.println(s);

        //     BINARY TO DECIMAL
        // String s=sc.nextLine();
        // int d=Integer.parseInt(s,2);
        // System.out.println(d);

        // HCF LCM
        // int n= sc.nextInt();
        // int m=sc.nextInt();
        // int result= m<n?m:n;
        // while(result>0){
        //     if(m%result==0 && n%result ==0){
        //        break;
        //     }
        //     result--;
        // }
        //  System.out.println(result);
        //  int res2=((m*n)/result);
        //   System.out.println(res2);
        //     Find largest number to array
        // int n= sc.nextInt();
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int max=arr[0];
        // for(int i=0;i<n;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        // }
        // System.out.println(max);

        // Sum of arrays elements
        // int n = sc.nextInt();
        // int arr[]= new int [n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();

        // }
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     sum=sum+arr[i];
        // }
        // System.out.println(sum);

        String s=sc.nextLine();
        String str="";
        char a;
        for( int i=0;i< s.length();i++){
            a=s.charAt(i);
            str=a+str;
        }
        System.out.println(str);
        System.out.println(s.substring(0));

    }
    
}
