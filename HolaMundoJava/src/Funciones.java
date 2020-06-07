public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //Área de un circulo
        //pi * r2
        circleArea(y);
        System.out.println("Resultado de la función: " + circleArea(y));

        //área de una esfera
        sphereArea(y);
        System.out.println("Resultado de la función: " + sphereArea(y));

        //volumen de una esfera
        //(4/3) * pi * r3
        sphereVolumen(y);
        System.out.println("Resultado de la función: " + sphereVolumen(y));

        System.out.println("Resultado Pesos a Dolares: " + converToDolar(200, "MXN"));
        System.out.println("Resultado Lempiras a Dolares: " + converToDolar(200, "L."));
        System.out.println("Resultado Pesos Colombianos a Dolares: " + converToDolar(200, "COP"));

    }

    //Funciones
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }


    /**
     * Descripción: Función que especificando su moneda convierte de dinero a dolares.
     *
     * @param cantidad Cantidad de dinero
     * @param moneda Tipo de Moneda: Solo acepta L., MXN o COP
     * @return cantidad devuelve la cantidad actualizada en Dolares.
     * **/
    public static double converToDolar(double cantidad, String moneda){

        switch(moneda){
            case "L.":
                cantidad = cantidad * 0.040;
                break;
            case "MXN":
                cantidad = cantidad * 0.052;
                break;
            case "COP":
                cantidad = cantidad * 0.00031;
                break;
        }
        return cantidad;
    }
}
