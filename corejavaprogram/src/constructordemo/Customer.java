package constructordemo;

public class Customer {

	private String customername;
	private int customerid;
	private String customeradress;
	
	Customer(){
		System.out.println("default");
	}
	
	public Customer(String customername, int customerid, String customeradress) {
		super();
		this.customername = customername;
		this.customerid = customerid;
		this.customeradress = customeradress;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomeradress() {
		return customeradress;
	}

	public void setCustomeradress(String customeradress) {
		this.customeradress = customeradress;
	}

	@Override
	public String toString() {
		return "Customer [customername=" + customername + ", customerid=" + customerid + ", customeradress="
				+ customeradress + "]";
	}
	
	
	}

