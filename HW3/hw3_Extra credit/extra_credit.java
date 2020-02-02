
class main {
    public static String reverse(String s) {
        String trimed = s.trim();
        System.out.println(trimed);
        StringBuilder ans = new StringBuilder();
        int j = trimed.length();
        for (int i = trimed.length() - 1; i >= 0 ; i--) {
            if(trimed.charAt(i) == ' '){
                ans.append(trimed.substring(i + 1, j));
                ans.append(trimed.charAt(i));
                while(trimed.charAt(i - 1) == ' '){
                    i--;
                }
                j = i;
            }
            if(i == 0){
                ans.append(trimed.substring(0,j));
            }
        }
        String res = ans.toString();
        return res;
    }
   public static void main(String[] args) {
        // write your code here
        String input = "  good really are Man Spider and   Strange Doctor";
        String res = reverse(input);
        System.out.print(res);
    }
}