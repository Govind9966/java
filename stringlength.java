import java.util.Scanner;
public class stringlength {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string containing only '1' and '0': ");
        String input = scanner.nextLine();
        scanner.close();

        int onesCount = 0;
        int zerosCount = 0;
        int length = input.length();

        // Count the number of '1's and '0's in the string
        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == '1') {
                onesCount++;
            } else {
                zerosCount++;
            }
        }

        // Calculate the shortest length
        int shortestLength = Math.min(onesCount, zerosCount) * 2;

        System.out.println("Shortest length of the string: " + shortestLength);
    }
}

    
