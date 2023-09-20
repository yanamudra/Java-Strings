public class Main {
    public static void main(String[] args) {
        System.out.println(replace("abcdbcd", 'c', 'e'));
        System.out.println(select("abcdefghij", 3, 1));
        System.out.println(select("abcdefghij", 4, 2));
        System.out.println(select("abcdefghij", 2, 5));
        System.out.println(selectReversed("abcdefghij", 3, 1));
        System.out.println(selectReversed("abcdefghij", 4, 2));
        System.out.println(selectReversed("abcdefghij", 2, 5));
    }

    public static String replace(String s, Character c1, Character c2) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c1) {
                result += c2;
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }

    public static String select(String s, int intervalLength, int i) {
        int start = i * intervalLength;
        int end = start + intervalLength;
        String result = "";
        if (start > s.length()) {
            return "";
        }
        if (end > s.length()) {
            end = s.length();
        }
        for (int j = start; j < end; j++) {
            result += s.charAt(j);
        }
        return result;
    }

    public static String selectReversed(String s, int intervalLength, int i) {
        int end = s.length() - intervalLength * i;
        int start = end - intervalLength;
        String result = "";
        if (start < 0) {
           start = 0;
        }
        for (int j = start; j < end; j++) {
            result += s.charAt(j);
        }
        return result;
    }
}