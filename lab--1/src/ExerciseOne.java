import java.util.Scanner;

public class ExerciseOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String name = scanner.nextLine();
		System.out.print("Điểm trung bình: ");
		double average = scanner.nextDouble();
		System.out.printf("%s %.2f", name, average);
	}
}
