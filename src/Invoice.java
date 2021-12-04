import java.util.ArrayList;
import java.util.List;

public class Invoice {
	
	private String invoiceNo;
	private List<Product> lstProduct=new ArrayList<Product>();
	Product product=new Product();
	
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public List<Product> getLstProduct() {
		return lstProduct;
	}
	public void setLstProduct(List<Product> lstProduct) {
		this.lstProduct = lstProduct;
	}
	public Invoice(String invoiceNo, List<Product> lstProduct) {
		super();
		this.invoiceNo = invoiceNo;
		this.lstProduct = lstProduct;
	}
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void displayInvoiceDetails() {
		System.out.println("Invoice No: "+invoiceNo);
		
		
		for(Product p:lstProduct) {
			p.display();
			
		}
	
	}
	
	
	 
	

}
