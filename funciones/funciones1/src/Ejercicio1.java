public class Ejercicio1 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;

        holaMundo();

        System.out.println(suma(num1,num2));
        int resultado = suma(num1, num2);
        System.out.println(resultado);

        int num = 5;
        System.out.println(mayorQue0(num));

        if (mayorQue0(num)){
            System.out.println("El número " + num + " es mayor que cero");
        }else{
            System.out.println("El número " + num + " es menor que cero");
        }

        char caracter = 'a';
        System.out.println("El caracter '"+ caracter + "' tiene asociado el código " + devuelveCodigoASCII(caracter));


        int min = 0;
        int max = 100;
        int aleatorio = generaNumAleatorio(min,max);
        System.out.println("El número aleatorio es " + aleatorio);

        for (int i=0;i<100;i++){

            System.out.println("El número aleatorio es " + generaNumAleatorio(min,max));
        }

    }

    /*Ejercicio1*/
    public static void holaMundo(){
        System.out.println("Hola Mundo");
    }

    /*Ejercicio2*/
    public static int suma(int a, int b){
        return a+b;
    }

    /*Ejercicio3*/

    public static boolean mayorQue0(int num){
        return num>0;
    }

    /*Ejercicio4 Tabla ASCII*/

    public static int devuelveCodigoASCII(char caracter){

        return (int) caracter;

    }

    /*Ejercicio5*/

    public static int generaNumAleatorio(int minimo, int maximo){
        return (int)Math.floor(Math.random() * (minimo-(maximo+1)) + (maximo+1));
    }
}
