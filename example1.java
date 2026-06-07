class unbox{
    public static void main(String[] args) {
        // Convert String to int using Integer wrapper class
        String s1 = "123";

        // 1) Using Integer.parseInt -> returns primitive int
        int n1 = Integer.parseInt(s1);

        // 2) Using Integer.valueOf -> returns Integer object, then get primitive
        Integer obj = Integer.valueOf(s1);
        int n2 = obj.intValue(); // explicit
        int n3 = obj; // auto-unboxing

        System.out.println("Using Integer.parseInt: " + n1);
        System.out.println("Using Integer.valueOf + intValue: " + n2);
        System.out.println("Using Integer.valueOf + auto-unbox: " + n3);

        // Example with invalid input to show error handling
        String bad = "12a3";
        try {
            int x = Integer.parseInt(bad);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format for input: " + bad);
        }
    }
}