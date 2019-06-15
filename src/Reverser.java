class Reverser {
    public static void main(String[] args) {
        String s = "Hello, Hello.";
        s = s.trim();
        s = s + " ";
        String RevString = "";
        String word = "";
        char punc = '\u0000';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (!Character.isLetter(s.charAt(i)))
                    punc = s.charAt(i);
                else
                    word = word + s.charAt(i);
            } else {
                RevString = RevString + Reverse_word(word) + punc + " ";
                word = "";
                punc = '\u0000';
            }
        }
        System.out.print(RevString);
    }

    private static String Reverse_word(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        return reversed;
    }
}