import java.util.Scanner;

public class Product {
	private String name_product;
	private double _price;
	private double _sale;
	public void setNameProduct(String name_product){
		this.name_product = name_product;
	}
	public String getNameProduct(){
		return this.name_product;
	}
	
	public void setPrice(Double _price){
		this._price = _price;
	}
	public double getPrice(){
		return this._price;
	}
	
	public void setSale(Double _sale){
		this._sale = _sale;
	}
	public double getSale(){
		return this._sale;
	}
	
	public Product(String name_product, double _price, double _sale){
		this.name_product = name_product;
		this._price = _price;
		this._sale = _sale;
	}
	public Product(String name_product, double _price){
		this(name_product, _price, 0);
	}
	
	private double getThueNhapKhau() {
		return (_price/100) * 10;
	}
	
	public void inp() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao ten san pham: ");
		name_product = scanner.nextLine();
		System.out.print("Nhap vao don gia: ");
		_sale = scanner.nextDouble();
		System.out.print("Nhap vao giam gia: ");
		_price = scanner.nextDouble();
	}
	
	public void out() {
		System.out.printf("\nThong tin san pham: \n");
		System.out.printf("Ten san pham: %s\n", name_product);
		System.out.printf("Don gia: %.2f\n", _price);
		System.out.printf("Giam gia: %.2f\n", _sale);
		System.out.printf("Thue nhap khau: %.2f\n", getThueNhapKhau());
	}
}
