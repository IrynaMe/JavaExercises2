public class LettereInFrase {
    public static void main(String[] args) {
                /*
        * Esercizio 1
Creare un programma che conti quante lettere ci sono in una frase, compresi gli spazi
e specifichi quante sono le vocali e quante le consonanti.


Implementazione:
- per le vocali si possono contare le singole vocali.
        *
        * */
        System.out.println("Conto lettere, vocali e consonanti nella frase\n********************** ");

        String input = "Hello world";
        String vocali = "AEIOU";

        String frase = input.toUpperCase();

        int len = frase.length();


        int countVocali = 0;
        int countConsonanti = 0; //65-90 ASCII
        int countSpaces = 0;
        String senzaVocali="";
        for (int i = 0; i < frase.length(); i++) {

            for (int j = 0; j < vocali.length(); j++) {
                if (frase.charAt(i) == vocali.charAt(j)) {
                    frase = frase.replace(frase.charAt(i), '\000');
                }
            }
            if ((frase.charAt(i) >= 65) && (frase.charAt(i) <= 90)) {
                countConsonanti++;
            } else if ((frase.charAt(i) == '\000')){
                countVocali++;
            } else if ((frase.charAt(i) == 32)) {
                countSpaces++;
            }
        }
        //System.out.println("frase senza vocali: " + frase);
        System.out.printf("La frase * %S * contiene %d caratteri, ovvio:%n", input, len);
        System.out.println(countConsonanti + countVocali + " lettere");
        System.out.println(countVocali + " vocali");
        System.out.println(countConsonanti + " consonanti");
        System.out.println(countSpaces + " space(s)");
    }
}
