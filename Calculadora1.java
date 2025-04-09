public class Calculadora {
    private int num1;
    private int num2;
    
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int realizarOperacion(String operacion) {
        if (operacion.equals("suma")) {
            return suma();
        }
        return 0;
    }
    
    public int suma() {
        return num1 + num2;
    }
	/*cambio*/
   public int multiplicar() {
        return num1 * num2;
    }
      /*  Añadir metodo dividir    */
      public int dividir() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: División por cero");
            return 0;
        }
    }




}
