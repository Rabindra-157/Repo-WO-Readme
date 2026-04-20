public class ManualReverse {
    public static void main(String[] args) {
        String original = "Gemini";
        String reversed = "";
        
        // Loop from the last index down to 0
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        System.out.println("Reversed: " + reversed);
    }
}