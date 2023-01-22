public class AnnoBisestile {
    public static void main(String[] args) {
        /*
        * Come determinare se un anno è bisestile
Dalla regola del calendario gregoriano:
* << Un anno è bisestile se il suo numero è divisibile per 4,
* con l'eccezione degli anni secolari (quelli divisibili per 100)
* che non sono divisibili per 400. >>
*
* I simboli utilizzati nel diagramma di flusso sopra riportato sono quelli che vengono
normalmente applicati nella costruzione dei diagrammi di flusso.
Tali simboli schematizzano il processo di funzionamento di un algoritmo ( algoritmo=
insieme di passaggi necessari per risolvere un problema). In pratica questo diagramma
prevede dei blocchi per l’input dati, l’output e dei blocchi decisionali (if) per gestire le
elaborazioni.
Ogni blocco dovrà essere tradotto dalla opportuna istruzione impartita con la sintassi del
linguaggio di programmazione usato.
        * */

        int year = 2160;

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.printf("Anno %d è bisestile", year);
        } else {
            System.out.printf("Anno %d NON è bisestile", year);
        }

    }}


