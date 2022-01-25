package fr.esir.mdi.ci;

/**
 * Hello world!.
 *
 */
public class App {
  /**
   * Fonction main initialisant un tableau.
   * @param args je sais pas ce que c'est 
   */
  public static void main(String[] args) {
    Tab mdr = new Tab(2,"omg");
    mdr.setId(0, 2023);
    mdr.setId(1, 666);
    System.out.println("Le tableau : " + mdr.getName() 
        + "; Premier indice = " + mdr.getId(0) + "; deuxieme indice = " + mdr.getId(1));
  }
}
