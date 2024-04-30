class printspecialcharacter {
    public static void main(String[] args) {
        String str = "prateek@#$eiou";
        str = str.toUpperCase();
        char arr='\u0000';
        char arr1 = '\u0000';
        char arr2 = '\u0000';


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("Vowel =" + ch);

            } else if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*' ||
                    ch == ' ') {
                System.out.println("Special Character = " + ch);
            } else {
                System.out.println("Consonant = " + ch);
            }



        }
    }
}