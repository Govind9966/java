import java.util.*;
public class array1 {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // int n= sc.nextInt();
        // int arr[]= new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // Arrays.sort(arr);
        // for(int i=0;i<n;i++){
        //     System.out.println(arr[i]);
        // }
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for( int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n==1){
            System.out.println(arr[0]);
        }
        if(arr[0]>arr[1]){
             System.out.println(arr[0]);

        }
        if(arr[n-1]>arr[n-2]){
             System.out.println(arr[n-1]);
        }
        for( int i=1;i<n;i++){
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                 System.out.println(arr[i]);
            }
        }


    }
    
}
