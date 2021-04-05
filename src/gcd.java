import java.util.Scanner;

public class gcd {
	public static void main(String[] args) {

		System.out.println("2つの自然数を入力してください.");
		System.out.println("1つ目の自然数 = ");
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		System.out.println("2つ目の自然数 = ");
		int B = scanner.nextInt();
		scanner.close();
		int m = A;
		int n = B;

		if (m < n) {
			int temp = m;
			m = n;
			n = temp;
		}
		/* ユークリッドの互除法 */
		int r = m % n;
		while (r != 0) {
			m = n;
			n = r;
			r = m % n;
		}
		/* 最大公約数を出力 */
		System.out.println(A + "と" + B + "の最大公約数 = " + n + " です。");

	}
}