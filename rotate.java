import java.util.*;
public class rotate {
    public static void reverse(int arr[],int s,int e){
        while(s<e){
            int tempp=arr[s];
            arr[s]=arr[e];
            arr[e]=tempp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        int arr[]= new int[n];
        for( int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        // 1 2 3 4 5

        // 2 3 4 5 1
        // 3 4 5 1 2
        // 4 5 1 2 3
        reverse(arr,0, n-1);
        reverse(arr, 0,n- k-1);
        // reverse(arr,n-k,n-1);

        // 5 1 2 3 4 
        // 4 5 1 2 3
        // 3 4 5 1 2
        // reverse(arr, 0, n-1);
        // reverse(arr, 0, k-1);
        // reverse(arr,k,n-1);
        for( int i=0;i<n;i++){
            System.out.println(arr[i]);

        }
        
    }
    
}
