package ut4ta3;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TElementoABTests {
    TArbolBB<Integer> arbol = new TArbolBB<Integer>();


    @Test
    void testTamanioArbolVacio(){
        assertEquals(0, arbol.obtenerTamanio());
    }

    @Test
    void testTamanioArbolConocido(){
        arbol.insertar(new TElementoAB<Integer>(12, 12));
        arbol.insertar(new TElementoAB<Integer>(25, 25));
        arbol.insertar(new TElementoAB<Integer>(14, 14));
        arbol.insertar(new TElementoAB<Integer>(33, 33));
        arbol.insertar(new TElementoAB<Integer>(35, 35));
        arbol.insertar(new TElementoAB<Integer>(88, 88));
        arbol.insertar(new TElementoAB<Integer>(66, 66));
        arbol.insertar(new TElementoAB<Integer>(99, 99));
        arbol.insertar(new TElementoAB<Integer>(5, 5));
        arbol.insertar(new TElementoAB<Integer>(7, 7));
        arbol.insertar(new TElementoAB<Integer>(2, 2));
        arbol.insertar(new TElementoAB<Integer>(1, 1));
        assertEquals(12, arbol.obtenerTamanio());
        
    }

    
    

}