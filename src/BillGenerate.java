import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BillGenerate {

	public static void main(String[] args) {
	
		String p_name="";
		int p_qty=0;
		double p_price=0.0;
		double p_totalPrice=0.0;
		double finalPrice=0.0;
		double discount , discountamount;
		double finalAmountAfterDiscount=0.0;
		char choice;
		
		Scanner sc=new Scanner(System.in);
		List<Product> listProduct=new ArrayList<Product>();
		do {
		System.out.println("Enter Product Details : ");
		
		System.out.println("Enter Product Name : ");
		p_name=sc.nextLine();
		
		System.out.println("Enter Product Quantity : ");
		p_qty=sc.nextInt();
		
		System.out.println("Enter Price Per Item");
		p_price=sc.nextDouble();
		
		p_totalPrice=p_price*p_qty;
		
		System.out.println("Total Price : "+p_totalPrice);
		
		finalPrice=finalPrice+p_totalPrice;
		System.out.println("FInal Price : "+finalPrice);
		
		listProduct.add(new Product(p_name, p_qty, p_price, p_totalPrice));
		
		
		System.out.println("Want to Add More Item ?  (Y or N) ");
		
		choice=sc.next().charAt(0);
		
		sc.nextLine();
		
		
		}while (choice == 'y' || choice == 'Y');
		
		Product.displayFormat();
		
		for(Product p:listProduct) {
			p.display();
			
		}
		
		System.out.println("Final Price : "+finalPrice);
		
		if(finalPrice <1000)
		{
			System.out.println("FInal Price : "+finalPrice);
		}
		else if(finalPrice>=1000 && finalPrice < 5000)
		{
			discount=5;
			discountamount=100-discount;
			finalAmountAfterDiscount=(discountamount*finalPrice)/100;
			System.out.println("final Amount After 5 % discount :  "+finalAmountAfterDiscount);
			
		}
		else if(finalPrice>=5000 && finalPrice < 8000)
		{
			discount=10;
			discountamount=100-discount;
			finalAmountAfterDiscount=(discountamount*finalPrice)/100;
			System.out.println("final Amount After 10% discount :  "+finalAmountAfterDiscount);
			
		}
		
		else if(finalPrice>=8000 && finalPrice < 20000)
		{
			discount=12;
			discountamount=100-discount;
			finalAmountAfterDiscount=(discountamount*finalPrice)/100;
			System.out.println("final Amount After 12% discount :  "+finalAmountAfterDiscount);
			
		}
		
		else if(finalPrice>20000)
		{
			discount=15;
			discountamount=100-discount;
			finalAmountAfterDiscount=(discountamount*finalPrice)/100;
			System.out.println("final Amount After 15% discount :  "+finalAmountAfterDiscount);
			
		}

	}

}
