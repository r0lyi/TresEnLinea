import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @ParameterizedTest
    @CsvSource({"3,34,37","42,52,94" , "8,-3,5"})
    void sumar(int num1,int num2,int r) {
        Calculadora cal=new Calculadora();
        Assertions.assertEquals(r,cal.sumar(num1,num2));
    }

    @ParameterizedTest
    @CsvSource({"80,10,70","-5,-6,1" , "8,-3,11"})
    void restar(int num1, int num2,int r) {
        Calculadora cal=new Calculadora();
        Assertions.assertEquals(r,cal.restar(num1,num2));
    }

    @Test
    void multiplicar_1() {
        Calculadora cal=new Calculadora();
        Assertions.assertEquals(10,cal.multiplicar(5,2));
    }
    void multiplicar_negativo() {
        Calculadora cal=new Calculadora();
        Assertions.assertEquals(-25,cal.multiplicar(-5,5));
    }

    @Test
    void dividir() {
        Calculadora cal=new Calculadora();
        int prob=cal.dividir(30,3);
        Assertions.assertEquals(10,prob);
    }
    @Test
    void dividir_negativo() {
        Calculadora cal=new Calculadora();
        int prob=cal.dividir(-40,10);
        Assertions.assertEquals(-4,prob);
    }
}