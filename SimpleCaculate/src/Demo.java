
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		//String function = new Scanner(System.in).nextLine();
		Scanner sc = new Scanner(System.in);
		String function = sc.nextLine();
		sc.close();

		String[] str = new Classify(function).getString();
		System.out.print(function + " = " + new DijkstraWay(str).getNum());
	}
}
