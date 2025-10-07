public class Player {

    char player1 ;
    char player2 ;


    public Player() {
        player1 = ask('O');
        player2 = ask2('X');
    }

    public char ask(char expect){
        char play;
        do {
            play = Character.toUpperCase(InputHandler.getCharacter());
            if (play != expect){
                System.out.println(expect + " is the proper symbol for player 1");
            }
        }while(play != expect);
        return  play;
    }

    public char ask2(char expect) {
        char play;
        do {
            play = Character.toUpperCase(InputHandler.getCharacter2());
            if (play != expect) {
                System.out.println(expect + " is the proper symbol for player 2");
            }
        } while (play != expect);
        return play;
    }

    public char getPlayer1() {
        return player1;
    }

    public char getPlayer2() {
        return player2;
    }


}
