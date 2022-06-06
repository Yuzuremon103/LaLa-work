package world;

public class Wand {
	private String name;
	private double power;
	
	
	public Wand(String name) {
		this.setName(name);
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name == null || name.length() <= 2) {
		throw new IllegalArgumentException("名前が短いです");
		}

		this.name = name;
	}
	public double getPower() {
		return this.power;
	}
	public void setPower(double power) {
		if(power < .5 || power > 100.0) {
			String msg = "増幅率は 0.5 ~ 100 の範囲です";
			throw new IllegalArgumentException(msg);
		}
		this.power = power;
	}
	
	
	
}
