public class Table {
    int[][] table ;

    public Table(int[][] table) {
        this.table = table;

    }

    public void showTable(){
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j ++){
                char symbol = getSymbol(table[i][j]);
                System.out.print(" " + symbol + " ");
                if (j< table[i].length -1 ){
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i< table.length - 1){
                System.out.println("---+---+---");

            }
        }
    }

    public char getSymbol(int a) {
        if (a == 1) {
            return 'O';
        } else if (a == 2) {
            return 'X';
        }
        return ' '; // empty cell
    }


    public boolean isCellEmpty(int row, int col) {
        return table[row][col] == 0;
    }



    public void placeMark(int row, int col, int player) {
        table[row][col] = player;

    }


    public boolean isFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (table[i][j] == 0){
                    return false;
                }
           return true;
    }

    public boolean checkWin(int player) {
        // Check rows
        for (int i = 0; i < 3; i++)
            if (table[i][0] == player && table[i][1] == player && table[i][2] == player)
                return true;

        // Check columns
        for (int j = 0; j < 3; j++)
            if (table[0][j] == player && table[1][j] == player && table[2][j] == player)
                return true;

        // Check diagonals
        if (table[0][0] == player && table[1][1] == player && table[2][2] == player) return true;
        if (table[0][2] == player && table[1][1] == player && table[2][0] == player) return true;

        return false;
    }




}
