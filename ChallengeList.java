public class ChallengeList {

  /**
  * retourne la moyenne de a et de b
  */
  public static double moyenne(int a, int b){

    return (a+b)/2;

    // TODO @A
  }

  /**
  * retourn le perimetre d'un carre de cÃ´tÃ© a
  */
  public static int perimetreCarre(int a){

    return a*4;

  }

  /**
  * retourne vrai si les 2 lettres du dÃ©but et de la fin sont les mÃªmes
  * ex "ABCDDFAB" : true
  */
  public static boolean commenceFini(String mot){
    //if (mot.length(0,1) == mot.length(-1))
    // TODO @A
    return false;
  }

  /**
  * retourne vrai si le mot contient des lettres diffÃ©rentes
  * ex "AAAAAA" : false
  * "AAAHAA" : true
  */
  public static boolean nonMonotone(String mot){

    char[] tableau = new char[mot.length()];
    tableau = mot.split(" ");

    for (int i = 0; i < mot.length()-1; i++) {
      if (tableau[i+1].equals(tableau[i])) {
        return false;
      }
      else {
        return true;
      }

    }

  }

  /**
  * retourne le tarif associÃ© Ã  l'Ã¢ge :
  * "gratuit" pour les moins de 3 ans
  * "reduit" pour les 3 Ã  12 ans
  * "plein" pour les autres
  * "erreur" si age nÃ©gatif
  **/
  public static String tarif(int age){
    // TODO @A
    return null;
  }

  /**
  * retourne un message correspondant Ã  la tempÃ©rature :
  * "Ã§a gÃ¨le" si la temperature est nÃ©gative
  * "Ã§a caille" pour une temperature entre 0 et 5
  * "RAS" pour une temperature en 5 et 90
  * "Ã§a bouille" si la tempÃ©rature est supÃ©rieure Ã  90
  * "erreur" si la tempÃ©rature est infÃ©rieure Ã  -274
  **/
  public static String caGele(int temperature){

    String message;
    if (temperature < 0) {
       message = "ça gèle";
    }
    if (0 < temperature && temperature < 5) {
      message = "ça caille";
    }
    if (5 < temperature && temperature < 90) {
      message = "RAS";
    }
    if (90 < temperature) {
      message = "ça bouille";
    }
    if (temperature < -274) {
      message = "Erreur";
    }

    return message;
  }

  /**
  * parcourt le tableau de noms et retourne une liste de tous les noms qui ont une longueur > 2
  **/
  public static String[] filtreShort(String[] noms){
    // TODO @A
    return null;
  }

  /**
  * parcourt le tableau de noms et retourne une liste de tous les noms qui commencent par lettre
  **/
  public static String[] filtreLetter(String[] noms, char lettre){
    String[] resultat = new String[];
    String leNom;

    for (int i = 0; i < noms.length(); i++) {
      leNom = noms[i];
      if (leNom[0].equals(lettre)) {
        resultat[i] = leNom;
      }
    }

    return resultat;
  }


  /**
  * un exemple
  **/
  public static int squareDigits(int n) {
    String res="";
    for (char digit : (n+"").toCharArray()){
      int d = Character.getNumericValue(digit);
      res = res + (d*d);
    }
    return Integer.parseInt(res);
  }


}
