import java.util.Scanner;

class Dictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Words");
        String s1 = sc.next();
        String s2 = sc.next();
        DictionarySort(s1, s2);
    }

    private static void DictionarySort(String s1, String s2) {
        for (int i = 0; i < Math.max(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) != (s2.charAt(i))) {
                if ((int) s1.charAt(i) > (int) s2.charAt(i)) {
                    Printer(s2, s1);
                    break;
                } else {
                    Printer(s1, s2);
                    break;
                }
            }
        }
    }

    private static void Printer(String s1, String s2) {
        System.out.println("The Words in order are : ");
        System.out.println(s1);
        System.out.println(s2);
    }
}