import java.util.*;
import java.util.stream.Collectors;
public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list= new ArrayList<>();
        // // add elements to list
        // list.add(1);
        // list.add(2);
        // // System.out.println(list);
        // list.add(2,5);
        // list.add(3,9);
        // System.out.println(list);
        // //fetech element at particular index
        // int element = list.get(3);
        // System.out.println(element);
        // //set element to particular index or update the element
        // list.set(0,99);
        // System.out.println(list);
        // list.add(43);
        // System.out.println(list);
        // //remove
        // list.remove(4);
        // System.out.println(list);
        // //get the size of the list
        // System.out.println(list.size());
        // //for loop
        // for( int i=0;i<list.size();i++){
        //    System.out.println( list.get(i));
        // }
        // //sort
        // Collections.sort(list);
        // System.out.println(list);
        int n = sc.nextInt();
        for( int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            list.add(a);
        }
        for( int i=0;i<n;i++){
            System.out.print(list.get(i)+" ");
        }
        // for( int i=n-1;i>=0;i--){
        //     System.out.println(list.get(i));
        // }
        
        // Collections.sort(list);
        // System.out.println(list);
        // System.out.println("Enter index where u insert the element:");
        // int b= sc.nextInt();
        // int c=sc.nextInt();
        // list.add(b,c);
        // System.out.println(list);
        //     int d= list.size()/2;
        //     System.out.println("Middle of linkedlist:"+list.get(d));
            ArrayList<Integer> list2 = new ArrayList<>();
            
            // for(int i=n-1;i>=0;i--){
            //     list2.add(i);

            // }
            // //------remove n th node from linked list 
            // int b=sc.nextInt();
            
            // System.out.println(list.get(n-b));

            // Collections.sort(list);
        //                  List<Integer> newList = list.stream() 
        //                               .distinct() 
        //                               .collect(Collectors.toList()); 
  
        // // Print the ArrayList with duplicates removed 
        // System.out.println("ArrayList with duplicates removed: "
        //                    + newList); 

        // list.remove(list.size()/2);
        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i));
        // }
    } 
}