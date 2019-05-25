package Sorted;

/**
 *
 * @author Rodrigo Mamani
 */
public class MergeSort {

    /**
     * @param ordenar Arreglo a oredenar tipo primitivo
     *
     */
    public void Sort(int[] ordenar) {
        int[] aux = new int[ordenar.length];
        Sort(ordenar, aux, 0, ordenar.length);
    }

    /**
     * @param ordenar Arreglo a oredenar tipo primitivo
     * @param aux Arreglo auxiliar para ordenar
     * @param bot primer elemto de el arreglo
     * @param top ultimo elemento de el arreglo
     *
     */
    private void Sort(int[] ordenar, int[] aux, int bot, int top) {
        // base case
        if (top - bot > 1) {
            int mid = bot + (top - bot) / 2;
            Sort(ordenar, aux, bot, mid);
            Sort(ordenar, aux, mid, top);
            Merge(ordenar, aux, bot, mid, top);
        }
    }

    private void Merge(int[] ordenar, int[] aux, int bot, int mid, int top) {
        int i = bot;
        int j = mid;

        for (int k = bot; k < top; k++) {
            if (i == mid) {
                aux[k] = ordenar[j++];
            } else if (j == top) {
                aux[k] = ordenar[i++];
            } else if (ordenar[j] < ordenar[i]) {
                aux[k] = ordenar[j++];
            } else {
                aux[k] = ordenar[i++];
            }
        }

        for (int k = bot; k < top; k++) {
            ordenar[k] = aux[k];
        }
    }

    public void Show(int[] ordenar) {
        for (int i = 0; i < ordenar.length; i++) {
            System.out.print(ordenar[i] + "-");
        }
        System.out.println();
    }

    /**
     * @param ordenar Arreglo a oredenar tipo que implemente comparable
     *
     */
    public void Sort(Comparable[] ordenar) {
        Comparable[] aux = new Comparable[ordenar.length];
        Sort(ordenar, aux, 0, ordenar.length);

    }

    /**
     * @param ordenar Arreglo a oredenar tipo primitivo
     * @param aux Arreglo auxiliar para ordenar
     * @param bot primer elemto de el arreglo
     * @param top ultimo elemento de el arreglo
     *
     */
    private void Sort(Comparable[] ordenar, Comparable[] aux, int bot, int top) {
        // base case
        if (top - bot > 1) {
            int mid = bot + (top - bot) / 2;
            Sort(ordenar, aux, bot, mid);
            Sort(ordenar, aux, mid, top);
            Merge(ordenar, aux, bot, mid, top);
        }
    }

    private void Merge(Comparable[] ordenar, Comparable[] aux, int bot, int mid, int top) {
        int i = bot;
        int j = mid;

        for (int k = bot; k < top; k++) {
            if (i == mid) {
                aux[k] = ordenar[j++];
            } else if (j == top) {
                aux[k] = ordenar[i++];
            } else if (ordenar[j].compareTo(ordenar[i]) < 0) {
                aux[k] = ordenar[j++];
            } else {
                aux[k] = ordenar[i++];
            }
        }
        for (int k = bot; k < top; k++) {
            ordenar[k] = aux[k];
        }
    }

    public void Show(Comparable[] ordenar) {
        for (int i = 0; i < ordenar.length; i++) {
            System.out.print(ordenar[i] + "-");
        }
        System.out.println();
    }
}
