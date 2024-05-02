
public class Divisao {
	public int dividir(int num1, int num2) throws ArithmeticException {
        if (num1 == 0) {
            throw new ArithmeticException("Dividendo não pode ser zero.");
        }
        if (num2 < 10) {
            throw new ArithmeticException("Divisor deve ser maior ou igual a 10.");
        }
        return num1 / num2;
    }
}
