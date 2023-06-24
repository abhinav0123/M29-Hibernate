package org.tnsif.bidirectional;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="Order_master")
public class Order {
	
	@Id
	private int orderid;
	
	@Temporal(TemporalType.DATE)
	private Date purchasedate;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Product>products=new HashSet<>();
	public void addOrder(Product products)
	{
		this.getProducts().add(products);
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public Date getPurchasedate() {
		return purchasedate;
	}

	public void setPurchasedate(Date purchasedate) {
		this.purchasedate = purchasedate;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
	
	
	
	

}