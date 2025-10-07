public class Game {

    public Game() {
        start();
    }


    public void start() {
        Table table = new Table(new int[3][3]);
        Player player = new Player(); // creates players and sets O and X
        int currentPlayer = 1;
        boolean gameEnded = false;


        while (!gameEnded) {
            table.showTable();

            char symbol = table.getSymbol(currentPlayer);
            System.out.println("Player " + currentPlayer + " (" + symbol + "), choose your move:");


            System.out.print("Row (0–2): ");
            int row = InputHandler.getIntInRange(0, 2);// row

            System.out.print("Column (0–2): ");
            int col = InputHandler.getIntInRange(0, 2);//column


            if (table.isCellEmpty(row, col)) {//cell should be empty
                table.placeMark(row, col, currentPlayer);//choose a place
            }

            else {
                System.out.println(" Cell already taken, try again.");
                continue; // skip to next loop (same player retries)
            }


            if (table.checkWin(currentPlayer)) {
                table.showTable();
                System.out.println(" Player " + currentPlayer + " (" + symbol + ") wins!");
                gameEnded = true;
            }

            else if (table.isFull()) {//table should be checked
                table.showTable();
                System.out.println(" It's a tie!");
                gameEnded = true;
            }

            // Otherwise, switch turn
            else {
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            }
        }
    }



}
