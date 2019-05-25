package Sorted;

/**
 *
 * @author Rodrigo Mamani
 * @param <T> debe extender a comparable para poder comparar los elementos
 */
public class QuickSort<T extends Comparable<T>> {

    /**
     *
     * @param ordenar Arreglo a ordenar tipo primitivo
     */

    public void Sort(int[] ordenar) {
        Sort(ordenar, 0, ordenar.length - 1);
    }

    private void Sort(int[] ordenar, int bot, int top) {
        int j = 0;
        if (bot < top) {
            j = particion(ordenar, bot, top);
            Sort(ordenar, bot, j - 1);
            Sort(ordenar, j + 1, top);
        }
    }

    private int particion(int[] ordenar, int bot, int top) {

        int piv = ordenar[bot];
        int i = bot;
        int j = top + 1;
        while (true) {
            // encuentra mayor
            while (ordenar[++i] <= piv) {
                if (i == top) {
                    break;
                }
            }
            // encuantra menor 
            while (ordenar[--j] >= piv) {
                if (j == bot) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            Swap(ordenar, i, j);
        }
        Swap(ordenar, bot, j);

        return j;
    }

    private void Swap(int[] ordenar, int i, int j) {

        int aux = ordenar[i];
        ordenar[i] = ordenar[j];
        ordenar[j] = aux;
    }

    public void Show(int[] ordenar) {
        for (int i = 0; i < ordenar.length; i++) {
            System.out.print(ordenar[i] + "-");
        }
        System.out.println();
    }

    /**
     * @param ordenar Arreglo a oredenar tipo que implemente comparable
     */
    public void Sort(T[] ordenar) {
        Sort(ordenar, 0, ordenar.length - 1);
    }

    /**
     *
     * @param ordenar Arreglo que se quiere ordenar
     * @param p primer elemnto de el arreglo a oredenar
     * @param r ultimo elemento de el arreglo a oredenar
     */
    private void Sort(T[] ordenar, int bot, int top) {
        //Show(ordenar);
        int j = 0;
        if (bot < top) {
            j = particion(ordenar, bot, top);
            Sort(ordenar, bot, j - 1);
            Sort(ordenar, j + 1, top);
        }
    }

    private void Swap(T[] ordenar, int i, int j) {
        T aux = ordenar[i];
        ordenar[i] = ordenar[j];
        ordenar[j] = aux;
    }

    /**
     *
     * @param ordenar Arreglo a ordenar
     * @param p Primer elemto del arreglo
     * @param r Ultimo elemento del arreglo
     * @return Retorna la posicion del pivote cambiado
     */
    private int particion(T[] ordenar, int bot, int top) {

        T piv = ordenar[bot];
        int i = bot;
        int j = top + 1;
        while (true) {
            // encuentra mayor
            while (ordenar[++i].compareTo(piv) < 0) {
                if (i == top) {
                    break;
                }
            }
            // encuantra menor 
            while (ordenar[--j].compareTo(piv) > 0) {
                if (j == bot) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            Swap(ordenar, i, j);
        }
        Swap(ordenar, bot, j);
        return j;
    }

    public void Show(T[] ordenar) {
        for (int i = 0; i < ordenar.length; i++) {
            System.out.print(ordenar[i] + "-");
        }
        System.out.println();
    }

}
