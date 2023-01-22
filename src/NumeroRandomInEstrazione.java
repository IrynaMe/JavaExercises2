public class NumeroRandomInEstrazione {

        public static void main(String[] args) {
        /*
        * Esercizio 2
Scriviamo un'applicazione che:
- in modo casuale estragga un numero tra 1 e 10 (uso    Math.random() )
- estragga 50 numeri sempre compresi tra 1 e 10
- conti quante volte c'è il numero della prima estrazione tra quelli della seconda

Implementazione:
- Stampare i numeri estratti in blocchi da 10 (usando il metodo del resto )
        * */
            int numeroCasuale = (int) (Math.random() * 11);
            int[] Estrazione=new int[50];
            int count=0;
            System.out.println("*******************\nEstrazione di 50 numeri: ");
            for (int i = 0; i < 50; i++) {
                int numero = (int) (Math.random() * 11);
                if (i% 10 == 0) {
                    System.out.println();
                }
                System.out.printf("%3d", numero);
                if (numero==numeroCasuale){
                    count++;
                }
            }


            System.out.println("\n*******************");
            System.out.printf("Numero casuale * %d * si incontra in estrazione * %d * volte", numeroCasuale, count);

            //System.out.println(Arrays.toString(Estrazione));


        }}
