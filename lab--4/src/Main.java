import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap vao don gia: ");
		double Price = scanner.nextDouble();
		
		System.out.print("Nhap vao ten san pham: ");
		String nameProduct  = scanner.nextLine();
		
		System.out.print("Nhap vao giam gia: ");
		double Sale = scanner.nextDouble();
		
		Product sp1= new Product(nameProduct,Price, Sale);
		scanner.nextLine();
		
		System.out.print("Nhap vao ten san pham: ");
		String tensp2  = scanner.nextLine();
		System.out.print("Nhap vao don gia: ");
		double donGia2 = scanner.nextDouble();
		
		Product sp2= new Product(tensp2,donGia2);
		
		sp1.out();
		sp2.out();
	}

}
