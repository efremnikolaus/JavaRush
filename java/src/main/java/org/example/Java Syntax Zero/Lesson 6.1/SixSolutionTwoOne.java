import java.util.Scanner;

public class SixSolutionTwoOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
        finally {
            if(scanner != null) {
                scanner.close();
            }
        }
    }
}