package Sorted;
/**
 *
 * @author Rodrigo Mamani
 * @param <T> debe extender a comparable para poder comparar los elementos
 */
public class QuickSort <T extends Comparable<T>>{

    /**
     *
     * @param ordenar Arreglo que se quiere ordenar
     */
    public void QuickSort(T[] ordenar){
    QuickSort(ordenar,0,ordenar.length-1);
}
/**
 *
 * @param ordenar Arreglo que se quiere ordenar
 * @param p primer elemnto de el arreglo a oredenar
 * @param r ultimo elemento de el arreglo a oredenar
 */
public void QuickSort(T[] ordenar,int p , int r){
    Show(ordenar);
    int j = 0;
    if (p<r) {
        j = particion(ordenar,p ,r);
        QuickSort(ordenar, p, j-1);
        QuickSort(ordenar, j+1, r);
    }  
}
private void Swap(T[] ordenar,int i , int j){
   
    T aux = ordenar[i];
    ordenar[i]=ordenar[j];
    ordenar[j]=aux;
}

    /**
     *
     * @param ordenar Arreglo a ordenar 
     * @param p Primer elemto del arreglo
     * @param r Ultimo elemento del arreglo 
     * @return Retorna la posicion del pivote cambiado
     */
public int particion(T[] ordenar,int p , int r){
    
    T piv = ordenar[p];
    int i = p;
    int j = r+1;
    while(true){
        // encuentra mayor
      while(ordenar[++i].compareTo(piv)<0){
          if(i==r) break;
      }
        // encuantra menor 
      while(ordenar[--j].compareTo(piv)>0){
          if(j==p) break;
      }
      if(i>=j) break;
      Swap(ordenar,i,j);
    }
    Swap(ordenar,p,j);
    
    return j;
}
public void Show(T[] ordenar){
    for(int i = 0 ; i<ordenar.length;i++){
        System.out.print(ordenar[i]+"-");
    }
    System.out.println();
}

}
