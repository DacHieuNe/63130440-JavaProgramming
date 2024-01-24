import java.util.Scanner;

public class ExerciseTwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chieu dai: ");
		double w = scanner.nextDouble();
		System.out.print("Chieu rong: ");
		double h = scanner.nextDouble();
		System.out.printf("Chu vi cua hinh chu nhat la: %.2f\n", (w+h)*2);
		System.out.printf("Dien Tich cua hinh chu nhat la: %.2f\n", (w* h));
		System.out.printf("Canh nho nhat la: %.2f\n", Math.min(w, h));
	}
}
