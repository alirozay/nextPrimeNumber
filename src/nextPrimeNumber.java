import java.util.Scanner;
public class nextPrimeNumber {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input continue to find the next prime number or quit to exit");
		String command = "";
		do {
			for(int i=1 ; i< Integer.MAX_VALUE && !command.equals("quit");i++) {
				boolean isPrime = true;
				for(int j=2; j<= Math.sqrt(i) && isPrime; j++) {
					isPrime = (i%j!=0);
				}
				if(!isPrime) continue;
				else {
					if( (command = keyboard.nextLine()).equals("continue") ) System.out.println(i);
				}
			}
			
		}while(!command.equals("quit"));
	}

}
