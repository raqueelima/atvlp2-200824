public class Exemples {
    public static void main(String[] args) {
        try {            
            throw new ArithmeticException("Exemplo");
        } catch (Exception e) {            
            System.out.println("Print: " + e.getMessage());
        } catch (ArithmeticException ae) {           
            System.out.println("Print: " + ae.getMessage());
        }
    }
}
