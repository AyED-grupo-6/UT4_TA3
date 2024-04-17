package ut4ta3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ut4ta3.TArbolBB;
import ut4ta3.TElementoAB;

public class ArbolVacioTestAltura {

    @Test
    void ArbolVacioTestAltura() {

        TArbolBB arbol = new TArbolBB();

    }

    @Test
    void AlturaDelArbolTest() {
        TArbolBB<TElementoAB> arbol = new TArbolBB<TElementoAB>();
        for (int i = 0; i < 10; i++) {
            TElementoAB elemento = new TElementoAB<>(i, i);
            arbol.insertar(elemento);
        }
        assertEquals(9, arbol.obtenerAltura());

    }

    @Test
    void AlturaDelArbolTest2() {
        TArbolBB<TElementoAB> arbol = new TArbolBB<TElementoAB>();
        TElementoAB raiz = new TElementoAB<>(5, 5);
        arbol.insertar(raiz);

        for (int i = 0; i < 10; i++) {
            TElementoAB elemento = new TElementoAB<>(i, i);
            TElementoAB elemento2 = new TElementoAB<>(i * 11, i);
            arbol.insertar(elemento);
            arbol.insertar(elemento2);
        }

        assertEquals(9, arbol.obtenerAltura());
    }

    @Test
    void AlturaDelArbolTes3SoloRaiz() {
        TArbolBB<TElementoAB> arbol = new TArbolBB<TElementoAB>();
        TElementoAB raiz = new TElementoAB<>(5, 5);
        arbol.insertar(raiz);

        assertEquals(0, arbol.obtenerAltura());
    }

    @Test
    void AlturaDelArbolTestRaizYNodo() {
        TArbolBB<TElementoAB> arbol = new TArbolBB<TElementoAB>();
        TElementoAB raiz = new TElementoAB<>(5, 5);
        arbol.insertar(raiz);
        TElementoAB nodo = new TElementoAB<>(6, 6);
        arbol.insertar(nodo);

        assertEquals(1, arbol.obtenerAltura());
    }

}