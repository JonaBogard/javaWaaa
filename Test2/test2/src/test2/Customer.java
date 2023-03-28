package test2;

public class Customer {
	
	String idCustomer;
	String Customer;
	String Telefono;
	String Fax;
	String Email;
	DataCustomer dp=null;
	
	public Customer() {
		dp=new DataCustomer();
	}
	
	public boolean insertCustomer() {
		
		if (dp.insertCustomer(this)) {
			return true;
		}else {
			return false;
		}
		
	}
	
public boolean loadCustomer() {
		
		if (dp.loadCustomer(this)) {
			return true;
		}else {
			return false;
		}
		
	}

public boolean deleteCustomer() {
	
	if (dp.deleteCustomer(this.getIdCustomer())) {
		return true;
	}else {
		return false;
	}
	
}

public boolean updateCustomer() {
	
	if (dp.updateCustomer(this)) {
		return true;
	}else {
		return false;
	}
	
}
	
	public Customer(String idCustomer, String Customer, String Telefono, String Fax, String Email){
		
		super();
		this.idCustomer=idCustomer;
		this.Customer=Customer;
		this.Telefono=Telefono;
		this.Fax=Email;
		
	}
	
	
	public String getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getCustomer() {
		return Customer;
	}
	public void setCustomer(String customer) {
		Customer = customer;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getFax() {
		return Fax;
	}
	public void setFax(String fax) {
		Fax = fax;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

}
