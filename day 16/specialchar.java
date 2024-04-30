class specialchar {
    public static void main(String[] args) {
        String str = "prateek@#$eiou";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);


             if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*' ||
                    ch == ' ') {
                System.out.println("Special Character = " + ch);
            }



        }
    }
}