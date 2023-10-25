import java.util.*;
public class list2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        int arr1[]=  new int[n];
        boolean flag= true;
        for( int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for( int i =0;i<n;i++){
            arr1[i]=arr[n-i-1];
            System.out.println(arr1[i]);

        }
        for( int i=0;i<n;i++){
            if( arr[i]!=arr1[i]){
                flag =false;
                break;

            }

        }
        if(flag== true){
            System.out.println(flag);


        }
        else{
            System.out.println(flag);

        }
        

    }
    
}
