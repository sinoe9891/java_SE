public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        String[][] cities = new String[4][2];
        /*
         * +-------------------------+
         * | Country   |  City       |
         * ---------------------------
         * | México    | CDMX        |
         * | Méxicp    | Guadalajara |
         * | Colombia  | Bogotá      |
         * | Colombia  | Medellín    |
         * +-------------------------+
         * */


        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        /*for (int i = 0; i < androidVersions.length; i++) {
            System.out.println(androidVersions[i]);
        }*/

        for (String androidVs : androidVersions) {
            System.out.println(androidVs);
        }
/*
        for (int i = 0; i < days.length; i++) {
            System.out.println(i);
        }
        for (int i = 0; i <=3 ; i++) {
            System.out.println(androidVersions[i]);
        }
*/

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Medellín";
        cities[3][1] = "CDMX";

        /*System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);*/

        /*for (int i = 0; i < cities.length; i++) {
            *//*Este muestra los renglones*//*
            for (int j = 0; j < cities[i].length ; j++) {
             *//*Este muestra los compartimientos que tiene*//*
                System.out.println(cities[i][j]);
                *//*i renglon y j columna*//*
            }
        }*/

        for (String[] pair : cities) {
            for (String name : pair) {
                System.out.println(name);
            }
        }

        System.out.println();
        System.out.println();
        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Mokey";

        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0 ; j++) {
                for (int k = 0; k <= 0 ; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }
        int x = 1; while (x <= 10) System.out.println(++x);
        int i=1, j=2, k=3, m=2; System.out.println ((j >= i) || (k == m));

        int f = 7; char c = 'w'; System.out.println((f >= 6) && (c == 'w'));
    }
}
