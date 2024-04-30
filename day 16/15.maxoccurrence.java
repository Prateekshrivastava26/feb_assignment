class maxoccurrence {
    public static void main(String[] args) {
        String str = "aassfrdgsaaadswaaaa";
        int len = str.length();
        int max = 0;
        char result = 0;
        int [] count = new int[256];
        for (int i =0 ;i<len;i++){
            count[str.charAt(i)]++;
        }
        for (int i =0 ;i<len;i++){
            if(max < count[str.charAt(i)]){
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
