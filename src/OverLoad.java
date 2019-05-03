class OverLoad {
	public static void main(String args[]) {
		OverLoad ob=new OverLoad();
		System.out.println(ob.area(5));
		System.out.println(ob.area(5,6));
		System.out.println(ob.area((double)7,(double)8));
	}
	private double area(int r) {
		return (Math.PI*r*r);
	}
	private double area(int l,int b) {
		return (l*b);
	}
	private double area(double base,double height) {
		return (0.5*base*height);
	}
}