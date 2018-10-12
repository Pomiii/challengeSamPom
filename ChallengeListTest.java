import java.util.Arrays;

public class ChallengeListTest{

  /**
  * Les tests sont Ã  Ã©crire ici.
  * Il peut y avoir plusieurs assert pour chaque methode testÃ©e.
  */


  public static void testMoyenne(){
    assertEquals("Moyenne 2 entiers positifs", 16, ChallengeList.moyenne(4, 28));
    assertEquals("Moyenne 1 entier positif, 1 entier négatif", -12, ChallengeList.moyenne(4, -28));
    assertEquals("Moyenne 1 entier négatif, 1 entier positif", 12, ChallengeList.moyenne(-4, 28));
    assertEquals("Moyenne 1 entier négatif, 1 entier positif égaux", 0, ChallengeList.moyenne(-4, 4));
    assertEquals("Moyenne 2 entiers négatifs", -16, ChallengeList.moyenne(-4, -28));
  }

  public static void testPerimetreCarre(){
    assertEquals("Périmètre carré de 4", 16, ChallengeList.perimetreCarre(4));
    assertEquals("Périmètre carré de 8", 32, ChallengeList.perimetreCarre(8));
    assertEquals("Périmètre carré de 12", 48, ChallengeList.perimetreCarre(12));
    assertEquals("Périmètre carré de 16", 64, ChallengeList.perimetreCarre(16));
    // TODO @A
  }

  public static void testCommenceFini(){
    // TODO @B
  }

  public static void testNonMonotone(){
    // TODO @A
  }

  public static void testTarif(){
    assertEquals("Tarif", "gratuit", ChallengeList.tarif(2));
    assertEquals("Tarif", "reduit", ChallengeList.tarif(6));
    assertEquals("Tarif", "plein", ChallengeList.tarif(24));
    assertEquals("Tarif", "erreur", ChallengeList.tarif(-2));
  }

  public static void testCaGele(){
    // TODO @A
  }

  public static void testFiltreShort(){
    // TODO @B
  }

  public static void testFiltreLetter(){
    // TODO @A
  }


  /**
  * un exemple de test
  */
  public static void testSquareDigits(){
    assertEquals("SquareDigits un seul chiffre", 16, ChallengeList.squareDigits(4));
    assertEquals("SquareDigits plusieurs chiffres", 811181, ChallengeList.squareDigits(9119));
  }


  /****************************************************************************
  * NE PAS TOUCHER CE QUI SUIT
  **/
  public static void main(String[] args){
    testMoyenne();
    testPerimetreCarre();
    testCommenceFini();
    testNonMonotone();
    testSquareDigits();
    testTarif();
    testCaGele();
    testFiltreShort();
    testFiltreLetter();
  }

  public static void assertEquals(String message, String[] expected, String[] res){
    if (java.util.Arrays.deepEquals(expected, res)) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+Arrays.toString(expected)+", res : "+Arrays.toString(res)+")");
    }
  }

  public static void assertEquals(String message, double expected, double res){
    if (Math.abs(expected-res) < 0.0001) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
    }
  }

  public static void assertEquals(String message, int expected, int res){
    if (expected == res) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
    }
  }

  public static void assertTrue(String message, boolean res){
    if (res) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (res : "+res+")");
    }
  }

  public static void assertFalse(String message, boolean res){
    assertTrue(message, !res);
  }
}
