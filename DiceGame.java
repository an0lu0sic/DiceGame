import java.util.Scanner;
import java.util.Random;

public class DiceGame{
    public static void main(String[] args){

	System.out.println("What is your name?");
	System.out.print("> ");
	Scanner f = new Scanner(System.in);
	String str = f.next();
	System.out.println("Hello, " + str + "!");

	Random purin = new Random(); 
	System.out.println("Rolling dice...");
	System.out.print("Die 1: ");
	int di1 = purin.nextInt(6) + 1;
	System.out.println(di1);
	System.out.print("Die 2: ");
	int di2 = purin.nextInt(6) + 1;
	System.out.println(di2);
	int sum = di1 + di2;
	System.out.println("Total value: "+ sum);

	if (sum > 7) {
	    System.out.println(str + " won!");
	}else{
	    System.out.println(str + " lost");
	}

	

    }
}
