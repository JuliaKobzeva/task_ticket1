public class Main {
    public static void main(String[] args) {

        boolean isPalindrome = isPalindrome("Tenet");
        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(String string) {
        string = string.toLowerCase(); //приводит всю строку к нижнему регистру
        StringBuilder builder = new StringBuilder();
        builder.append(string);
        builder.reverse(); // перевочиваем строку методом Builder-а
        return (builder.toString()).equals(string);
    }
}