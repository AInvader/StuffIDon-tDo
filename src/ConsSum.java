class ConsSum {
	public static void main(String[] args) {
		int num=5;
		ConsSumPrinter(num);
	}
	private static void ConsSumPrinter(int num) {
		int[] vals =new int[2];
		for (int n=1;n<num;n++) {
			for (int a=1;a<num;a++) {
				if ((n/2)*(2*a+(n-1))==num) {
					vals[0]=a;
					vals[1]=n;
					break;
				}
			}
		}
		SeriesPrinter(vals);
	}
	private static void SeriesPrinter(int[] vals) {
		for (int i=1;i<=vals[1];i++) {
			System.out.print(vals[0]+(i-1)+"  ");
		}
	}
}