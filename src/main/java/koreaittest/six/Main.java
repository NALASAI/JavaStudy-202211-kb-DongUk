package koreaittest.six;

class Order{
	private int orderId;
	private String productName;
	private String consumerName;
	private int price;
	private int stock;
	
	public Order(int id, String pName, String cName, int pri, int sto) {
		this.orderId = id; 
		this.productName = pName; 
		this.consumerName = cName; 
		this.price = pri; 
		this.stock = sto; 
	}

	public static OrderBuilder builder() {
		return new OrderBuilder();
	}
	
	public static class OrderBuilder{
		private int Id;
		private String PName;
		private String CName;
		private int pri;
		private int sto;
		
		public OrderBuilder orderId(int Id) {
			this.Id = Id;
			return this;
		}
		
		public OrderBuilder productName(String PName) {
			this.PName = PName;
			return this;
		}
		
		public OrderBuilder consumerName(String CName) {
			this.CName = CName;
			return this;
		}
		
		public OrderBuilder price(int pri) {
			this.pri = pri;
			return this;
		}
		
		public OrderBuilder stock(int sto) {
			this.sto = sto;
			return this;
		}
		
		public Order build() {
			return new Order(Id, PName, CName, pri, sto);
		}
	}
	
	public void showOrderInfo() {
		System.out.println("주문번호: " + orderId);
		System.out.println("상품명: " + productName);
		System.out.println("구매자: " + consumerName);
		System.out.println("가격: " + price);
		System.out.println("수량: " + stock);
	}
}

public class Main {
	public static void main(String[] args) {
		Order order = null;
		order = Order.builder().orderId(100).productName("Samsung GalaxyBook2 Pro").consumerName("홍길동").price(1450000).stock(2).build();
		order.showOrderInfo();
	}
}
