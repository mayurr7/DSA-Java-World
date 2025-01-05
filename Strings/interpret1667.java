package Strings;

public class interpret1667 {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
        return command.replace("()", "o");
    }
}
