class Reverser {
    public static void main(String[] args) {
        String s = "Hello, Hello.";
        s = s.trim();
        s = s + " ";
        StringBuilder RevString = new StringBuilder();
        StringBuilder word = new StringBuilder();
        char punc = '\u0000';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (!Character.isLetter(s.charAt(i)))
                    punc = s.charAt(i);
                else
                    word.append(s.charAt(i));
            } else {
                RevString.append(Reverse_word(word.toString())).append(punc).append(" ");
                word = new StringBuilder();
                punc = '\u0000';
            }
        }
        System.out.print(RevString);
    }

    private static String Reverse_word(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
}