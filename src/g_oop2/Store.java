package g_oop2;

public class Store {
	public static void main(String[] args) {
		//물건정보 넣기
		Desktop d1 = new Desktop("삼성 컴퓨터", 100000);
		Desktop d2 = new Desktop("LG 컴퓨터", 100000);
		
		AirCon ac1 = new AirCon("삼성 에어콘", 200000);
		AirCon ac2 = new AirCon("LG 에어콘", 200000);
		
		TV tv1 = new TV("삼성 TV", 300000);
		TV tv2 = new TV("LG TV", 300000);
		
		Customer c = new Customer();
		System.out.println(d1.getInfo());
		System.out.println(d2.getInfo());
		c.buy((Product)d1); //다형성
//		c.buy(d1); //다형성 //부모 <- new 자식 
//		((Desktop)c.item[0]).programming();
		// c(product) -> buy
		// c.buy(product0,1,2..)
		// c.buy(product0) ... Desktop
		// c.item
		System.out.println(ac1.getInfo());
		System.out.println(ac2.getInfo());
		c.buy(ac1); //다형성
//		((AirCon)c.item[1]).setTemperature();
		
		System.out.println(tv1.getInfo());
		System.out.println(tv2.getInfo());
		c.buy(tv2); //다형성

		c.showItem();
		
	}
}
class Product{
	String name; //이름
	int price;	//가격
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	//상품의 정보를 반환하는 메서드
	String getInfo(){
		return name + "(" + price + "원)";
	}
}

class Desktop extends Product{
	//상속 받을 시 super()는 
	//parameter가 없을때만. 생성자 super()을 자동으로 해준다 
	Desktop(String name, int price){
		super(name, price);
	}
	
	void programming(){
		System.out.println("프로그램을 만듭니다.");
	}
}

class AirCon extends Product{
	AirCon(String name, int price){
		super(name, price);
	}
	
	void setTemperature(){
		System.out.println("온도를 설정합니다.");
	}
}

class TV extends Product{
	TV(String name, int price){
		super(name, price);
	}
	void setChnnel(){
		System.out.println("채널을 변경합니다.");
	}
}

class Customer{
	int money = 1000000;
	
	//모두 사용하기 위해서. TV, Desktop, AirCon
	Product[] item = new Product[100];
	void buy(Product p){//세가지 타입을 모두 받을 수 있어야 하기 때문에 parameter가 Product 타입임.
		if(money < p.price){
			System.out.println("잔돈이 부족하다.");
			return;
		}
		money -= p.price;
		
		for(int i = 0; i < item.length; i++){
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.getInfo()+"를 구매했다.");
	}
	
	void showItem(){
		System.out.println("=================== 장바구니 ==================");
		for(int i =0; i < item.length; i ++){
			if(item[i] == null){
				break;
			}else{
				System.out.println(item[i].getInfo());
			}
		}
		System.out.println("============================================");
	}
}






