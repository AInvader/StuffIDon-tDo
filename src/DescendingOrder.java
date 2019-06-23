class DescendingOrder {
	@SuppressWarnings("SameParameterValue")
    private static int sortDesc(int num) {
		int desc = 0;
		int[] a = new int[digcount(num)];
		int c = 0;
		while (num > 0) {
			int d = num % 10;
			num=num/10;
			a[c] = d;
			c++;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[j - 1] < a[j]) {
					//swap
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		int power = a.length - 1;
		for (int value : a) {
			desc = desc + value * ((int) (Math.pow(10, power)));
			power--;
		}
		return desc;
	}

	private static int digcount(int num) {
		int c = 0;
		while (num > 0) {
			c++;
			num = num / 10;
		}
		return c;
	}

	public static void main(String[] args) {
		System.out.print(sortDesc(15));
	}
}