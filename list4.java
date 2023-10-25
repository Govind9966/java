import java.util.*;
public class list4 {
    public static void reverse(int arr[],int s ,int e){
        while(s<e){
            int tempp=arr[s];
            arr[s]=arr[e];
            arr[e]= tempp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        // ArrayList<String>list2=new ArrayList<>();
        int arr[]= new int[n];
        for( int i=0;i<n ;i++){
            arr[i]= sc.nextInt();
        }
         int k= sc.nextInt();
         reverse(arr, 0, n-1);
         reverse(arr, 0, k-1);
         reverse(arr, k, k-1);
         for( int i=0;i<n ;i++){
            System.out.print(arr[i]+" ");
         }
        // for( int i=0;i<n;i++){
        //     int m = sc.nextInt();
        //     list.add(m);
        // }

        // // for( int i=0;i<n;i++){
        //     String temp=sc.next();
            
        //     list2.add(temp);
        // }
        // System.out.println(list2);

    //    for( int i=0;i<n;i++){
    //     if(list.get(i)%2!=0){
    //         list1.add(list.get(i));

    //     }
    //    }
    //    for( int i=0;i<n;i++){
    //     if(list.get(i)%2==0){
    //         list1.add(list.get(i));

    //     }
    //    }
    //    System.out.println(list1);
    // int k= sc.nextInt();
    // for( int i=n-k;i<n;i++){
    //     list1.add(list.get(i));
    // }
    // for(int i=0;i<n-k;i++){
    //     list1.add(list.get(i));
    // }
    //    System.out.println(list1);
   




    
}
}
