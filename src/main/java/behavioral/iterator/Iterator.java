package behavioral.iterator;

import java.util.List;

public class Iterator {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Propiedad p1 = new Propiedad("Apartamento Eixample", "Barcelona", 95.0);
        Propiedad p2 = new Propiedad("Ático Gràcia",         "Barcelona", 130.0);
        Propiedad p3 = new Propiedad("Estudio Malasaña",     "Madrid",    75.0);
        Propiedad p4 = new Propiedad("Loft Palermo",         "Buenos Aires", 60.0);

        ListaPropiedades lista = new ListaPropiedades(List.of(p1, p2, p3, p4));
        cliente.recorrer("Lista por relevancia", lista);

        Nodo raiz = new Nodo(p2);
        raiz.izquierdo        = new Nodo(p1);
        raiz.derecho          = new Nodo(p4);
        raiz.derecho.izquierdo = new Nodo(p3);

        ArbolGeoespacial arbol = new ArbolGeoespacial(raiz);
        cliente.recorrer("Árbol geoespacial (in-orden)", arbol);
    }
}
