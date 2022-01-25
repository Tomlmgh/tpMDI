package fr.esir.mdi.ci;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for FirstPdf.
 */
public class TabTest {
  
  /**
   * Rigorous Test :-).
   */
  @Test
  public void testGetIndice() {
    Tab tableau = new Tab(1, "name");
    tableau.setId(0, 5);
    assertTrue(tableau.getId(0) == 5);
  }
  
  @Test
  public void testGetName() {
    Tab tableau = new Tab(1, "name");
    assertTrue(tableau.getName() == "name");
  }
  
  @Test
  public void testSetIndice() {
    Tab tableau = new Tab(1, "name");
    tableau.setId(0, 5);
    assertTrue(tableau.getId(0) == 4);
  }
  
}