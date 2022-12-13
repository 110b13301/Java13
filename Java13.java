import java.util.Scanner;
class Exception520 extends Exception { // define Exception520 class
}
class Strnum {
	private int n;
	public void set(int s) throws Exception520 {
		n=s;
		if(n==520) {
			throw new Exception520(); // throw exception "Exception520"
		}
		else {
			System.out.println(n);
		}
	}
}
public class Java13 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Strnum n=new Strnum();
		try {
			int a=sc.nextInt();
			n.set(a);
		}
		catch(Exception520 e) {
			System.out.println("這是由字串520所引起的例外");
		}
	}
}