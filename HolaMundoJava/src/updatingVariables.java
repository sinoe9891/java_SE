public class updatingVariables {

    public static void main(String[] args) {
        int salario = 1000;

        //bono 200
        salario += salario + 200;
        System.out.println(salario);

        //pensión: 50 descuentos
        salario -= 50;
        System.out.println(salario);

        //2 horas extras 30 c/u
        //comida: 45
        salario += (2 * 30) + 45;
        System.out.println(salario);

        //Actualizando cadenas de textos
        String nombreEmpleado = "Sinoé";
        nombreEmpleado += " Velásquez Cadenas";
        System.out.println(nombreEmpleado);

        nombreEmpleado = "Danny " + nombreEmpleado;
        System.out.println("Tu nombre es " + nombreEmpleado);


    }

}
