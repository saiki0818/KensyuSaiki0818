
public class Kakezann {

	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			System.out.print(i + "の段:");
			for (int j = 1; j <= 9; j++) {
				int m = i * j;
				System.out.print(" ");
				if (10 > m)
					System.out.print(0);
				System.out.print(m);
			}
			System.out.println();
		}
	}
}
