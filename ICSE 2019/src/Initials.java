class Initials {

    public static void main(String[] args) {
                      
        String name="Albus Wulfric Percival Brian Dumbledore";
        String init=name.charAt(0)+".";
        name=name.trim();
        for (int i=1;i<name.length();i++) {

            char ch=name.charAt(i);
            if (ch==' ')
                init=init+name.charAt(i+1)+".";
        }
        System.out.print(init);
    }
}
