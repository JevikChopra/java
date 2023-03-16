class T {
    public static void main(String[] args) {
        System.out.println("200210116051");
        char x = args[0].charAt(0);
        if (Character.isUpperCase(x)) {
            System.out.println("the given string " + args[0] + " valid");
        } else {
            System.out.println(
                    "Error...... Please enter argument which contains first character as Capital letter/uppercase ");
        }
    }
}