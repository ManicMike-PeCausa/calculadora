public class pruebaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(10, 5);
        System.out.println("Suma: " + calc.realizarOperacion("suma"));
    }
}
