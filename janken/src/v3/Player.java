package v3;

public abstract class Player {
	private String name;
	private int hand;
	private String result;
	// 次の手を決める戦略の型(インターフェース)
	private NextHand nextHand;
//	private NextHand nextHand = new RandomNextHand();  // 多態性
	
	
	public Player (NextHand nextHand) {
		this.nextHand = nextHand;
	}
	
	
	public String toString() {
		return this.name + ":" + this.hand + ":" + this.result;
	}


	public String getName() {
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHand() {
		return this.hand;
	}


	public void setHand() {
		this.hand = nextHand.decideHand();
	}


	public String getResult() {
		return this.result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	public NextHand getNextHand() {
		return this.nextHand;
	}


	public void setNextHand(NextHand nextHand) {
		this.nextHand = nextHand;
	}
	
	
	
}
