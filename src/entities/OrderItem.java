package entities;



public class OrderItem {
	
	private Integer quantity;
	private Product product;
	private Double price;
	
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Double price,  Product product) {

		this.quantity = quantity;
		this.product = product;
		this.price = price;
	}



	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		product.setPrice(price);
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product)	{
		
		this.product = product;
		
	}
	
	public double subTotal() {
		
		
		return quantity * price;
		
		
	}
	
	@Override
	public String toString() {
		
		return getProduct().getName() 
			+", $"
			+ String.format("%.2f", price)
		    + ", Quantity "
		    + quantity
		    + ",  Subtotal: $"
		    + String.format("%.2f", subTotal());
	}
}


