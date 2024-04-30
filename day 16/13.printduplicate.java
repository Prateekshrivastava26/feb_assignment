class printduplicate {
    public static void main(String[] args) {
        String str = "aassfdrrssa";
        System.out.println("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.print(str.charAt(j) + " ");
                    break;
                }
            }
        }
    }
}