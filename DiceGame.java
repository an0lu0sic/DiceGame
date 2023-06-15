
import java.util.Random;

public class DiceGame{
    public static void main(String[] args){
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


    }
}
