package cl.kibernumacademy;

public class DiscountService {

    public double calcularDescuento(double precio) {

        double descuento;

        if(precio > 100000) {
            descuento  = precio * 0.15;
            //Si el precio es mayor a 100000, se aplica descuento del 15%
        }else{
            //Si el precio no es mayor a $100.000, se procede a ver si por lo menos es está entre $50.000 y $100.000
            if (precio >= 50000){
                descuento = precio * 0.1;
                //Si el precio esta entre $50.000 y $100.000, se aplica 10% de descuento
            }else{
                //Si el precio no cumple con todo lo anterior, no habrá descuento.
                descuento = 0;
            }
        }
        return descuento;

    }
}
