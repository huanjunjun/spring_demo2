package car_demo;

public class Car {
       private String cname;
       private String crop;
       private String price;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCrop() {
		return crop;
	}
	public void setCrop(String crop) {
		this.crop = crop;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [cname=" + cname + ", crop=" + crop + ", price=" + price + "]";
	}
       
}
