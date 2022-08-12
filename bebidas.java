public class bebidas extends venda{
	private double heineken;
	private double budweiser;
	private double kaiser;
	private double petra;
	
	bebidas(){
		this.heineken= 2.50;
		this.budweiser = 2;		
		this.kaiser = 3;
		this.petra = 2.15;
	}
	
	public double getHeineken() {
		return heineken;
	}
	public void setHeineken(double heineken) {
		this.heineken = heineken;
	}
	public double getKaiser() {
		return kaiser;
	}
	public void setKaiser(double kaiser) {
		this.kaiser = kaiser;
	}
	public double getPetra() {
		return petra;
	}
	public void setPetra(double petra) {
		this.petra = petra;
	}

	public double getBudweiser() {
		return budweiser;
	}

	public void setBudweiser(double budweiser) {
		this.budweiser = budweiser;
	}
}
