public class Casting {
    public static void main(String[] args) {
        //En un año ubicar 30 perritos
        // Cuántos perritos ubique al mes

        double mesPerritos = 30.0/12.0;
        System.out.println(mesPerritos);

        //Estimación
        int estimadoMesPerritos = (int) mesPerritos;
        System.out.println(estimadoMesPerritos);

        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double)a/b);

        //Cast Manual
        double c = a/b;
        System.out.println("cast automático " +  c);

        double d = (double) a/b;
        System.out.println("cast manual " + d);

        char n = '1';
        int nI = n;
        System.out.println("cast char código ASCII " + nI);

        short nS = (short) n;
        System.out.println(nS);


        double f = 86.45;
        int i = (int) f;
        System.out.println(i);


    }
}
