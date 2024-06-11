import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import com.obj2.*;

public class FiguraTest {

    @Test
    public void testMoverPunto() {
        Integer x = 1;
        Integer y = 2;
        Punto p = new Punto(x, y);

        Integer xMovimiento = 3;
        Integer yMovimiento = 4;
        p.mover(xMovimiento, yMovimiento);

        Integer valorEsperadoX = 4;
        Integer valorEsperadoY = 6;

        Integer valorObtenidoX = p.getX();
        Integer valorObtenidoY = p.getY();

        assertEquals(valorEsperadoX, valorObtenidoX);
        assertEquals(valorEsperadoY, valorObtenidoY);
    }

    @Test
    public void testAreaElipse() {
        Integer x = 0;
        Integer y = 0;
        Punto centro = new Punto(x, y);

        Double radioMayor = 5.00;
        Double radioMenor = 3.00;
        Elipse elipse = new Elipse(centro, radioMayor, radioMenor);

        Double valorEsperado = Math.PI * 15;

        Double valorObtenido = elipse.area();
    
        assertEquals(valorEsperado, valorObtenido, 0.001);
    }
    

    @Test
    public void testMoverElipse() {
        Integer x = 0;
        Integer y = 0;
        Punto centro = new Punto(x, y);

        Double radioMayor = 5.00;
        Double radioMenor = 3.00;
        Elipse elipse = new Elipse(centro, radioMayor, radioMenor);

        Integer xMovimiento = 3;
        Integer yMovimiento = 4;
        elipse.mover(xMovimiento, yMovimiento);

        Integer xCentroEsperado = 3;
        Integer yCentroEsperado = 4;

        Integer xCentroObtenido = elipse.getCentro().getX();
        Integer yCentroObtenido = elipse.getCentro().getY();

        assertEquals(xCentroEsperado, xCentroObtenido);
        assertEquals(yCentroEsperado, yCentroObtenido);
    }


    @Test
    public void testAreaRectangulo() {
        Integer xInferiorIzquierda = 0;
        Integer yInferiorIzquierda = 0;
        Punto esquinaInferiorIzquierda = new Punto(xInferiorIzquierda, yInferiorIzquierda);

        Integer xSuperiorDerecha = 4;
        Integer ySuperiorDerecha = 5;
        Punto esquinaSuperiorDerecha = new Punto(xSuperiorDerecha, ySuperiorDerecha);

        Rectangulo rectangulo = new Rectangulo(esquinaInferiorIzquierda, esquinaSuperiorDerecha);

        Double valorEsperado = 20.00;

        Double valorObtenido = rectangulo.area();

        assertEquals(valorEsperado, valorObtenido);
    }


    @Test
    public void testMoverRectangulo() {
        Integer xInferiorIzquierdaInicial = 1;
        Integer yInferiorIzquierdaInicial = 1;
        Punto esquinaInferiorIzquierdaInicial = new Punto(xInferiorIzquierdaInicial, yInferiorIzquierdaInicial);

        Integer xSuperiorDerechaInicial = 5;
        Integer ySuperiorDerechaInicial = 6;
        Punto esquinaSuperiorDerechaInicial = new Punto(xSuperiorDerechaInicial, ySuperiorDerechaInicial);
        
        Rectangulo rectangulo = new Rectangulo(esquinaInferiorIzquierdaInicial, esquinaSuperiorDerechaInicial);

        Integer xMovimiento = 2;
        Integer yMovimiento = 3;
        rectangulo.mover(xMovimiento, yMovimiento);

        Integer xInferiorIzquierdaEsperada = 3;
        Integer yInferiorIzquierdaEsperada = 4;
        Integer xSuperiorDerechaEsperada = 7;
        Integer ySuperiorDerechaEsperada = 9;

        Integer xInferiorIzquierdaObtenida = rectangulo.getEsquinaInferiorIzquierda().getX();
        Integer yInferiorIzquierdaObtenida = rectangulo.getEsquinaInferiorIzquierda().getY();
        Integer xSuperiorDerechaObtenida = rectangulo.getEsquinaSuperiorDerecha().getX();
        Integer ySuperiorDerechaObtenida = rectangulo.getEsquinaSuperiorDerecha().getY();

        assertEquals(xInferiorIzquierdaEsperada, xInferiorIzquierdaObtenida);
        assertEquals(yInferiorIzquierdaEsperada, yInferiorIzquierdaObtenida);
        assertEquals(xSuperiorDerechaEsperada, xSuperiorDerechaObtenida);
        assertEquals(ySuperiorDerechaEsperada, ySuperiorDerechaObtenida);
    }


    @Test
    public void testAreaCirculo() {
        Integer xCentro = 0;
        Integer yCentro = 0;
        Punto centro = new Punto(xCentro, yCentro);

        Double radio = 3.00;
        Circulo circulo = new Circulo(centro, radio);

        Double valorEsperado = Math.PI * 9;

        Double valorObtenido = circulo.area();

        assertEquals(valorEsperado, valorObtenido);
    }


    @Test
    public void testMoverCirculo() {
        Integer xCentroInicial = 2;
        Integer yCentroInicial = 2;
        Punto centroInicial = new Punto(xCentroInicial, yCentroInicial);

        Double radio = 3.00;
        Circulo circulo = new Circulo(centroInicial, radio);

        Integer xMovimiento = 3;
        Integer yMovimiento = 4;
        circulo.mover(xMovimiento, yMovimiento);

        Integer xCentroEsperado = 5;
        Integer yCentroEsperado = 6;

        Integer xCentroObtenido = circulo.getCentro().getX();
        Integer yCentroObtenido = circulo.getCentro().getY();

        assertEquals(xCentroEsperado, xCentroObtenido);
        assertEquals(yCentroEsperado, yCentroObtenido);
    }


    @Test
    public void testAreaCuadrado() {
        Integer xInferiorIzquierda = 0;
        Integer yInferiorIzquierda = 0;
        Punto esquinaInferiorIzquierda = new Punto(xInferiorIzquierda, yInferiorIzquierda);

        Integer xSuperiorDerecha = 4;
        Integer ySuperiorDerecha = 4;
        Punto esquinaSuperiorDerecha = new Punto(xSuperiorDerecha, ySuperiorDerecha);

        Cuadrado cuadrado = new Cuadrado(esquinaInferiorIzquierda, esquinaSuperiorDerecha);

        Double valorEsperado = 16.00;

        Double valorObtenido = cuadrado.area();

        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    public void testMoverCuadrado() {
        Integer xInferiorIzquierdaInicial = 1;
        Integer yInferiorIzquierdaInicial = 1;
        Punto esquinaInferiorIzquierdaInicial = new Punto(xInferiorIzquierdaInicial, yInferiorIzquierdaInicial);

        Integer xSuperiorDerechaInicial = 5;
        Integer ySuperiorDerechaInicial = 5;
        Punto esquinaSuperiorDerechaInicial = new Punto(xSuperiorDerechaInicial, ySuperiorDerechaInicial);

        Cuadrado cuadrado = new Cuadrado(esquinaInferiorIzquierdaInicial, esquinaSuperiorDerechaInicial);

        Integer xMovimiento = 2;
        Integer yMovimiento = 3;
        cuadrado.mover(xMovimiento, yMovimiento);

        Integer xInferiorIzquierdaEsperada = 3;
        Integer yInferiorIzquierdaEsperada = 4;
        Integer xSuperiorDerechaEsperada = 7;
        Integer ySuperiorDerechaEsperada = 8;

        Integer xInferiorIzquierdaObtenida = cuadrado.getEsquinaInferiorIzquierda().getX();
        Integer yInferiorIzquierdaObtenida = cuadrado.getEsquinaInferiorIzquierda().getY();
        Integer xSuperiorDerechaObtenida = cuadrado.getEsquinaSuperiorDerecha().getX();
        Integer ySuperiorDerechaObtenida = cuadrado.getEsquinaSuperiorDerecha().getY();

        assertEquals(xInferiorIzquierdaEsperada, xInferiorIzquierdaObtenida);
        assertEquals(yInferiorIzquierdaEsperada, yInferiorIzquierdaObtenida);
        assertEquals(xSuperiorDerechaEsperada, xSuperiorDerechaObtenida);
        assertEquals(ySuperiorDerechaEsperada, ySuperiorDerechaObtenida);
    }

    @Test
    public void testAreaTotalFiguras() {
        List<Figura> figuras = new ArrayList<>();
        //Uso los mismos valores que en los tests individuales de area 
        figuras.add(new Elipse(new Punto(0, 0), 5.0, 3.0)); // Su area ya sabemos que da Math.PI * 15
        figuras.add(new Rectangulo(new Punto(0, 0), new Punto(4, 5))); //Su area ya sabemos que da 20.00
        figuras.add(new Circulo(new Punto(0, 0), 3.0)); //Su area ya sabemos que da Math.PI * 9
        figuras.add(new Cuadrado(new Punto(0, 0), new Punto(4, 4))); //Su area ya sabemos que da 16.00
    
        Double areaTotalEsperada = (Math.PI*15) + 20.00 + (Math.PI*9) + 16.00; 

        Double areaTotalObtenida = 0.0;
        for (Figura figura : figuras) {
            areaTotalObtenida += figura.area();
        }
    
        assertEquals(areaTotalEsperada, areaTotalObtenida);
    }
    

    @Test
    public void testCompareToDeFiguras() {
        Integer xInferiorIzquierda = 0;
        Integer yInferiorIzquierda = 0;
        Punto esquinaInferiorIzquierda = new Punto(xInferiorIzquierda, yInferiorIzquierda);

        Integer xSuperiorDerecha = 4;
        Integer ySuperiorDerecha = 4;
        Punto esquinaSuperiorDerecha = new Punto(xSuperiorDerecha, ySuperiorDerecha);

        Cuadrado cuadradoChico = new Cuadrado(esquinaInferiorIzquierda, esquinaSuperiorDerecha);

        Punto esquinaInfIzq2 = new Punto(0, 0);
        Punto esquinaSupDer2 = new Punto(5, 5);
        Cuadrado cuadradoGrande = new Cuadrado(esquinaInfIzq2, esquinaSupDer2);

        assertTrue(cuadradoChico.compareTo(cuadradoGrande) < 0);
        assertTrue(cuadradoGrande.compareTo(cuadradoChico) > 0);
        assertTrue(cuadradoChico.compareTo(cuadradoChico) == 0);
    }
}
