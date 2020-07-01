import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        anadirNumerosConsecutivos(listaNumeros, 3);
        mostrarLista(listaNumeros);
        eliminarNumerosPorPosicion(listaNumeros, 0);
        mostrarLista(listaNumeros);
    }

    private static void anadirNumerosConsecutivos(ArrayList<Integer> listaNumeros, int numero){
        listaNumeros.add(numero);
        listaNumeros.add(++numero);
        listaNumeros.add(++numero);
    }

    private static void eliminarNumerosPorPosicion(ArrayList<Integer> listaNumeros, int posicion){
        listaNumeros.remove(posicion);
    }

    private static void mostrarLista(ArrayList<Integer> listaNumeros){
        System.out.println("---- Mostrando la lista ----");
        for (int i = 0; i < listaNumeros.size(); i++){
            System.out.println("En la posicion " + i + " hay un " + listaNumeros.get(i));
        }
    }
}

