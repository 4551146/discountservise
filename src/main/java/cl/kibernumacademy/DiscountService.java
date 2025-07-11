package cl.kibernumacademy;

public class DiscountService {

    public double calcularDescuento(double precio) {

        if(precio >= 50000 && precio <= 100000){
            return precio * 0.90;
        }else if (precio > 100000){
            return precio * 0.85;
        }
        return precio;
    }

    
}
