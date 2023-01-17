public class Main {
    public static void main(String[] args) {
        System.out.println("Array Bidimensionali");

        /*
        colonne  c0    c1    c2
        righ1     1     5     7
        riga2     8     6    10
         */

        //  I forma:
        int[][] dati = new int[][]{
                new int[]{1, 5, 7},
                new int[]{8, 6, 10}
        };

        // II forma:
        int[][] arrayDati = {
                {1, 5, 7},
                {8, 6, 10}
        };

        // III forma:
        int[][] mioArray = new int[][]{
                //    Trimestre    I   II   III  IV
                new int[]{120, 125, 180, 140}, // 2022 incassi totale riga
                {178, 180, 141, 135}, // 2021
                {149, 178, 134, 138},// 2020
                {178, 180, 141, 135}, // 2019
        };

        // Per itarare un array bidimensionale usiamo (normalmente):
        // creiamo un doppio for: uno esterno e uno interno:
        // esterno---> itera RIGHE
        // interno---> itera COLONNE
        for (int i = 0; i < mioArray.length; i++) {
            for (int j = 0; j < mioArray[i].length; j++) {
                System.out.print(mioArray[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("****Itero con forEach****");
        // con ciclo for each bidimensionale
        for (int[] righe : arrayDati) {
            System.out.println();
            for (int colonne : righe) {
                System.out.print(colonne + "\t");
            }
        }

        // Ciclo foreach con singolo array
        int[] datiProva = new int[]{1, 5, 7};
        for (int dato : datiProva) {
            System.out.print(dato + " ");

        }


        System.out.println("\nCalcolo il valore degli incassi dei singoli annuali");
        int anno = 2020;
        int somma = 0;

        for (int riga = 0; riga < mioArray.length; riga++) {
            for (int colonna = 0; colonna < mioArray[riga].length; colonna++) {
                //calcola il totale di ogni singola riga
                somma = somma + mioArray[riga][colonna];
            }
            System.out.println("Anno" + anno + "] = " + somma);
            somma = 0; // rimetto a zero variabile per riutilizzarla nei cicli successivi
            anno++;
        }

        // Somma per trimestri (sommo i valori delle colonne)
        /*
         int[][] mioArray = new int [][]{
          //    Trimestre    I   II   III  IV
                new int []{120, 125, 180, 140}, // 2022 incassi totale riga
                          {178, 180, 141, 135}, // 2021
                          {149, 178, 134, 138} // 2020
         */

        System.out.println();

        int sommacolonne = 0;
        String totaliProgressivi = "";
        for (int ciclo = 0; ciclo < 1; ciclo++) {
            for (int colonne = 0; colonne < mioArray[0].length; colonne++) {


                for (int righe = 0; righe < mioArray.length; righe++) {
                    System.out.print(mioArray[colonne][righe] + " ");
                    sommacolonne = sommacolonne + mioArray[righe][colonne];
                }
                // Creo un array con dati delle somme
                // in una stringa - // 566*586*569*568
                // uso split

                String tmpSomma = sommacolonne + "#";
                totaliProgressivi = totaliProgressivi.concat(tmpSomma);
                sommacolonne = 0;
                System.out.println();


            }

        }// Fine
        // operazione di split
        System.out.println("----------------");
        String[] splittati = totaliProgressivi.split("#");
        for (String elementi: splittati) {
            System.out.print(elementi + " ");

        }
        System.out.println();


        // usando l'array mioarray sommo i valori  dei singoli array


// implemento per stampa solo della matrice;
        for (int[] righe1 : mioArray) {
            System.out.println();
            for (int colonne1 : righe1) {
                System.out.print(colonne1 + "\t");

            }
        }

    }
}
