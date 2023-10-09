package java_mini_projects;
import java.util.*;//using * symbol import all the util classes
class GuessGame{
    int rand;
    int userInput;
    int counter=1;

    public GuessGame(){ //random number generator Constructor 
        rand=(int)(Math.random()*100);
    }
    public void takeUserInput(){ // user input Method
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number between (1 to 100):");
        userInput=sc.nextInt();
    }
    public int isCorrect(){ // Check correct or not a guessed number method
       return userInput>rand?1:(userInput<rand?-1:0);
    }
    public void noOfGuesses(){ //guess increment method
        counter++;
    }
    public int getCounter(){ //return last attemp of guess number method
        return counter;
    }
    
}
public class GuessNumberGame{
    public static void main(String args[]){
    
        GuessGame game=new GuessGame();
        game.takeUserInput();
         
        if(game.isCorrect()==0){System.out.println("You won the game with First attemp!!");}
        
        else{
        while(game.isCorrect()==1 || game.isCorrect()==-1){
            if(game.isCorrect()==1){
                System.out.println("Your guessed number is Bigger!");
                game.noOfGuesses();
                game.takeUserInput();
            }
            else{
                System.out.println("Your guessed number is Smaller!");
                game.noOfGuesses();
                game.takeUserInput();

            }
        }
        
        System.out.println("YOU WON THE GAME WITH "+game.getCounter()+" ATTEMPS!!");
    }
    }
}


