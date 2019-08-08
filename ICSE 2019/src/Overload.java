class Overload {
	static double vol;

	public static double volume(double R) {
		vol = (4.0 / 3.0) * (22.0 / 7.0) * Math.pow(R, 3);
		return vol;
	}

	public static double volume(double R, double H) {
		vol = (22. / 7.0) * R * R * H;
		return vol;
	}

	public static double volume(double L, double B, double H) {
		vol = L * B * H;
		return vol;
	}
	public static void main(String args[])
	{
		Overload ob = new Overload();
		ob.volume(10.0);
		System.out.println(vol);
		ob.volume(5.0, 10.0);
		System.out.println(vol);
		ob.volume(3.0, 4.0, 5.0);
		System.out.println(vol);
	}
}
