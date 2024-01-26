public class ErrorHandling {
    public static void main(String[] args) {
        try{
            int number = 42;
            int result = number / 0;
        }catch (ArithmeticException e){
            System.out.println("Caught Arithmetic Exception: Division by zero!");
        }finally{
            System.out.println("Division operation completed.\n");
        }

        try{
            int [] a = null;
            int length = a.length;
        }catch (NullPointerException e){
            System.out.println("Caught NullPointerException: Array is null! ");
        }finally{
            System.out.println("Array length operation is completed. \n");
        }

        try{
            String s = "abc";
            int i = Integer.parseInt(s);
        }catch(NumberFormatException e){
            System.out.println("Caught NumberFormatException: String cannot be parsed into integer! ");
        }finally{
            System.out.println("String passing operation completed. \n");
        }
    }
}
