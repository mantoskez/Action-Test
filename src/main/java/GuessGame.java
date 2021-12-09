public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
      this.p1 = new Player();
      this.p2 = new Player();
      this.p3 = new Player();

      int guessP1;
      int guessP2;
      int guessP3;

      boolean p1right = false;
      boolean p2right = false;
      boolean p3right = false;

      int targetNumber = (int) (Math.random() * 10);
        System.out.println("The number I'm thinking is between 0 and 9...");

        while (true){
            System.out.println("The number to guess is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("Player 1 guessed " + guessP1);
            guessP2 = p2.number;
            System.out.println("Player 2 guessed " + guessP2);
            guessP3 = p3.number;
            System.out.println("Player 3 guessed " + guessP1);

            if(guessP1 == targetNumber){
                p1right = true;
            }
            if(guessP2 == targetNumber){
                p2right = true;
            }
            if(guessP3 == targetNumber){
                p3right = true;
            }
            if(p1right || p2right || p3right){
                System.out.println("We have a winner!");
                System.out.println("Player 1 got it right? " + guessP1);
                System.out.println("Player 2 got it right? " + guessP2);
                System.out.println("Player 3 got it right? " + guessP3);
                System.out.println("Game is over!");
                break;
            }
            else {
                System.out.println("No winner so let's go again!");
            }
        }
    }
}