public class ReversingString {
    public static void main(String[] args) {
        String string = "hello world!";
//        System.out.println(reverseWithStringBuilder(string));
        System.out.println(reverseManually(string));
    }

    public static String reverseWithStringBuilder(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static String reverseManually(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = s.length()-1; i >=0; i--){
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }

    
}

