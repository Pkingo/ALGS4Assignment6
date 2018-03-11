import edu.princeton.cs.algs4.*;
class Runsort {
  private static Comparable[] aux;

  public static void sort(Comparable[] a) {
    int n = a.length-1;
    int sizeOfLastSubArray = 0;
    int i, lo, mid;
    lo = 0;
    aux = new Comparable[n+1];
    while(true) {
      i = 0;
      mid = 0;
      while(true) {
        lo = i;
        while ((i < n) && !less(a[i+1], a[i])) i++;
        mid = i;
        if (i < n) i++;
        else break;
        while ((i < n) && !less(a[i+1], a[i])) i++;
        merge (a, lo, mid, i);
        if (i < n) i++;
        else break;
      }
      if (lo == 0) break; //meaning that it has only merged once, and therefore everything should be sorted
    }
  }

  public static void insertionSort(Comparable[] a, int lo, int hi) {
    for (int i = lo; i < hi; i++)
      for (int j = i; j > lo && !less(a[j-1], a[j]); j--)
        exch(a, j, j-1);
  }


  private static void merge(Comparable[] a, int lo, int mid, int hi) {
    int i = lo, j = mid+1;
    for (int k = lo; k <= hi; k++)
      aux[k] = a[k];
    for (int k = lo; k <= hi; k++) {
      if (i > mid)                    a[k] = aux[j++];
      else if (j > hi)                a[k] = aux[i++];
      else if (less(aux[j], aux[i]))  a[k] = aux[j++];
      else                            a[k] = aux[i++];
    }
  }

  private static boolean less(Comparable v, Comparable w) {
    return v.compareTo(w) < 0;
  }

  private static void exch(Comparable[] a, int i, int j) {
    Comparable t = a[i];
    a[i] = a[j];
    a[j] = t;
  }

  public static void show(Comparable[] a) {
    for (int i = 0; i < a.length; i++)
      StdOut.println(a[i]);
  }


}
