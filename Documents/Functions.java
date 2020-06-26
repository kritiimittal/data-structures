import java.util.Scanner;

public class Functions {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = scn.nextInt();
		int num = 1;
		int d1 = 1;
		int d2 = 1;

		for (int i = 1; i <= n; i++) {
			num = num * i;
		}

		for (int i = 1; i <= n - r; i++) {
			d1 = d1 * i;
		}

		for (int i = 1; i <= r; i++) {
			d2 = d2 * i;
		}

		float ans = (float) (num / (d1 * d2));
		System.out.println(ans);
	}
}
