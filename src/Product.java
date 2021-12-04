
public class Product {
	private String p_name;
	private int p_qty;
	private double p_price;
	private double p_Totalprice;
	
	


	public Product(String p_name, int p_qty, double p_price, double p_Totalprice) {
		super();
		this.p_name = p_name;
		this.p_qty = p_qty;
		this.p_price = p_price;
		this.p_Totalprice = p_Totalprice;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_qty() {
		return p_qty;
	}

	public void setP_qty(int p_qty) {
		this.p_qty = p_qty;
	}

	public double getP_price() {
		return p_price;
	}

	public void setP_price(double p_price) {
		this.p_price = p_price;
	}

	public double getP_Totalprice() {
		return p_Totalprice;
	}

	public void setP_Totalprice(double p_Totalprice) {
		this.p_Totalprice = p_Totalprice;
	}
	
	
	public static void displayFormat() {
		System.out.print("\nName      Quantity    Price   Total Price\n"
				+ "*******************************************************\n");
	}
	 


		
	public void display() {
		System.out.format("%-9s %8d %10.2f %10.2f\n", p_name, p_qty, p_price, p_Totalprice);
	}
		 
	  
	  
	 

	
	
	  

}
