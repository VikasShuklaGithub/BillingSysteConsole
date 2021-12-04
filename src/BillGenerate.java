import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class BillGenerate {

	public static void main(String[] args) {
	
		String p_name="";
		int p_qty=0;
		double p_price=0.0 ;
		double p_totalPrice=0.0;
		double finalPrice=0.0;
		double discount , discountamount;
		double finalAmountAfterDiscount=0.0;
		String invoiceNo="";
		String custname="";
		char choice;
		
		
		Invoice invoice=new Invoice();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Create Invoice");
		
		System.out.println("Enter Invoice Number");
		invoiceNo=sc.nextLine();
		
		System.out.println("Enter Customer Name");
		custname=sc.nextLine();
		
		List<Product> lstProduct = invoice.getLstProduct();
		
		
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
		
		
		
		lstProduct.add(new Product(p_name, p_qty, p_price, p_totalPrice));
		
		
		
		System.out.println("Want to Add More Item ?  (Y or N) ");
		
		choice=sc.next().charAt(0);
		
		sc.nextLine();
		
		invoice=new Invoice(invoiceNo, lstProduct);
		
		}while (choice == 'y' || choice == 'Y');
		
		Product.displayFormat();
		
		for(Product p:lstProduct) {
			p.display();
			
		}
		
		System.out.println("Final Price : "+finalPrice);
		
		invoice.displayInvoiceDetails();
		
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
