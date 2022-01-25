package fr.esir.mdi.ci;

/**
 * Classe tab représentant un tableau.
*/
public class Tab {
  
  
  private String name;
  private int [] blague;
  
  /**
   * Constructeur de notre classe tab.
   * @param taille la taille du tableau
   * @param name le nom de fou furieux de notre tableau
   */
  Tab(int taille, String name) {
    this.name = name;
    blague = new int[taille];
  }
  
  /**
   * Fonction recupérant la valeur à l'indice i.
   * @param i l'indice en question
   * @return la valeur dans le tableau à cet indice
   */
  int getId(int i) {
    return blague[i];
  }
  
  /**
   * écrit une valeur à l'indice i.
   * @param i l'indice du tableau
   * @param valeur la valeur a set
   */
  void setId(int i, int valeur) {
    blague[i] = valeur;
  }
  
  /**
   * Retourn le nom du tableau.
   * @return le nom du tableau
   */
  String getName() {
    return name;
  }
  
  /**
   * Code mort.
   * @return osef
   */
  private String getMp3() {
    return name;
  }
  
}
