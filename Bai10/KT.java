package Bai10;

public class KT {
	public static void main(String[] args) {
		Product prod1 = new Product("sp1", "gao", 5000);
		OrderDetail ordet1 = new OrderDetail(prod1, 2);
		Product prod2 = new Product("sp2", "nuoc tuong", 15000);
		OrderDetail ordet2 = new OrderDetail(prod2, 3);
		Product prod3 = new Product("sp3", "banh", 2500);
		OrderDetail ordet3 = new OrderDetail(prod3, 5);
			
		System.out.println(ordet1);
		System.out.println(ordet2);
		System.out.println(ordet3);
		}

}
