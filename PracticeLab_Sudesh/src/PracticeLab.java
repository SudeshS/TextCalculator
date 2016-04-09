import java.util.Scanner;

public class PracticeLab {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x = 0, y = 0;
		String inputStr = input.nextLine();
		for (int i=0; i<inputStr.length(); i=add(i, 1)) {
			switch (inputStr.charAt(i)) {
			case '+' :
				break;
			case '-' :
				break;
			case '*' :
				break;
			case '/' :
				break;
			default : 
				if (inputStr.charAt(i) == '2') {
					System.out.println("k its 1 or somethin" + (int) inputStr.charAt(i));
				}
			}
		}
		System.out.println("Adding: " + add(x, y));
		System.out.println("Subtracting: " + subtract(x, y));
		System.out.println("Multiplying: " + multiply(x, y));
		System.out.println("Dividing: " + divide(x, y));
		input.close();
	}
	
	public static int add(int x, int y) {
		return(x + y);
	}
	public static int subtract(int x, int y) {
		return add(x, multiply(y, -1));
	}
	public static int multiply(int x, int y) {
		int z = 0; 
		if (x==0 || y==0)
			return 0;
	
		else if ((x>0 && y>0) || (x<0 && y>0)) {
			for (int i=0; i<y; i = add(i, 1)) {
				z = add(z, x);
			}
			return z;
		}
		else if (x>0 && y<0)
			return multiply(y, x);
			
		else if (x<0 && y<0) {
			x = absolute(x);
			y = absolute(y);
			return multiply(x,y);
		}
			
		return z;
	}
	public static String divide(int x, int y) {
		int counter = 0;
		if (x > 0 && y > 0) {
			for (int i=y; i<=x; i=add(i, y)) {
				counter = add(counter, 1);
			}
			if(counter==0) {
				return "sorry decimals too hard... thx Tim... " + Integer.toString(subtract(x, multiply(y, counter))) + "/" + Integer.toString(y);
			}
			else if (subtract(multiply(x, counter), y) == 0) {
				return Integer.toString(counter);
			}
			else {
				return Integer.toString(counter) + " " + Integer.toString(subtract(x, multiply(y, counter))) + "/" + Integer.toString(y);
			}
		}
		else if (x<0 && y<0) {
			x = absolute(x);
			y = absolute(y);
			return divide(x, y);
		}
		else if (x<0 && y>0 || x>0 && y<0) {
			x = absolute(x);
			y = absolute(y);
			return "-" + divide(x, y);
		}
		else if (x==0 && y!=0) {
			return "0";
		}
		else if (x==0 && y==0) {
			return "Watchu even doin cuz?!";
		}
		else {
			return "Error of some sort... (maybe divide by zero?)";
		}
		
	}
	public static int absolute(int x) {
		int counter = 0;
		for (int i=x; i<0; i=add(i,1)) {
			counter = add(counter, 1);
		}
		return counter;
	}
}
