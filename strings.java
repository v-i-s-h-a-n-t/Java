public class strings {
    public static void main(String[] args) {

        String message = "Hello World";
        System.out.println(message);

        // Concatenation
        String concatMessage = "Hello World" + "!!";
        System.out.println(concatMessage);

        // Printing string length/#of characters in the string
        System.out.println(concatMessage.length());

        // Checks if string ends with "!!"
        // Returns either true or false
        System.out.println(concatMessage.endsWith("!!"));

        // Checks if string starts with "A"
        // Returns either true or false
        System.out.println(concatMessage.startsWith("A"));

        // Printing index of the specified character in the string
        System.out.println(message.indexOf("e"));

        // Converts string to lower case
        System.out.println(message.toLowerCase());
    }
}
