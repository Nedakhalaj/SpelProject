import java.util.Scanner;

public class InputHandler {
    public static Scanner sc;

    public InputHandler() {
    }


    public static String getString2() {
        while(!sc.hasNextLine()) {
            System.out.println("wrong input! write just one letter. ");
            sc.nextLine();
        }

        return  sc.nextLine();
    }

    public static char getCharacter(){
        System.out.print("Enter a symbol for player1: ");
        String user = getString2();
         return user.charAt(0);
    }

    public static char getCharacter2(){
        System.out.print("Enter a symbol for player2: ");
        String user = getString2();
        return user.charAt(0) ;
    }


    public static int getIntInRange(int min, int max) {
        int number;
        while (true) {
            try {
                number = Integer.parseInt(sc.nextLine());
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.out.println("Please enter a number between " + min + " and " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }




    static {
        sc = new Scanner(System.in);
    }
}
