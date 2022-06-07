import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Person{
  private Scanner keyboard;

  public Player(){
    keyboard = new Scanner(System.in);
  }

  public boolean hitOrStay(){
    System.out.println( "Your hand " + getHand());
    System.out.println("(1) Hit  or (2) Stay?");
    int choice = keyboard.nextInt();

    if(choice == 1){
      return true;
    }
    else{
      return false;
    }
  }
}