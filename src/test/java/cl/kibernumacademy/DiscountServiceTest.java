package cl.kibernumacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test para DiscountService")
public class DiscountServiceTest {
    private DiscountService discountService;

    @BeforeEach
    void setUp(){
        discountService = new DiscountService();
    }

    @Test
    //Test de descuentos mayor $100000//

    void testDescuento() {

        //Arrange
        double precio = 170000;
        double esperado = precio * 0.85;
        //Act
        double resultado = discountService.calcularDescuento(precio);
        
        //Assert
        assertEquals(esperado, resultado, "Precio mayor a $100000 debe tener descuento del 15%");

    }

    @Test
    //Test de descuentos entre $50000 y $100000//

    void testDescuento_entre50000y100000() {
        //Arrange
        double precio = 70000;
        double esperado = precio * 0.90;
        //Act
        double resultado = discountService.calcularDescuento(precio);

        //Assert
        assertEquals(esperado, resultado, "Precio entre $50000 y $100000 debe tener descuento del 10%");
    }

    @Test
    //Test de descuentos menor de $50000 que no aplica//

    void testDescuento_menorDe50000() {
        //Arrange
        double precio = 49000;
        double esperado = precio;
        //Act
        double resultado = discountService.calcularDescuento(precio);

        //Assert
        assertEquals(esperado, resultado, "Precio menor a $50000 no aplica");
    }

    @Test
    //Test de descuentos borde $100000//

    void testDescuento_borde100000() {
        //Arrange
        double precio = 100000;
        double esperado = precio * 0.90;
        //Act
        double resultado = discountService.calcularDescuento(precio);

        //Assert
        assertEquals(esperado, resultado, "Precio de $100000 debe tener descuento del 10%");
    }

    @Test
   //Test de descuentos borde $50000//

    void testDescuento_borde50000() {
        //Arrange
        double precio = 50000;
        double esperado = precio * 0.90;
        //Act
        double resultado = discountService.calcularDescuento(precio);

        //Assert
        assertEquals(esperado, resultado, "Precio de $50000 debe tener descuento del 10%");
    }

}
