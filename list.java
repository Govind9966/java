import java.util.*;
public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            int a= sc.nextInt();
            list.add(a);
        }
        for(int i=0;i<n;i++){
            System.out.print(list.get(i)+" ");

        }
        for( int i=0;i<n-1 ;i++){
                           if(list.get(i)!=list.get(i+1)){
                    list1.add(i);
                    

                

            }
        }


        for(int i=0;i<list.size();i++){
            System.out.println(list1.get(i));
        }
    }

    
}
