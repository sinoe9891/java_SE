public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives -1;
        System.out.println(lives); //4

        lives--; //Decremento
        System.out.println(lives);//3

        lives++; //Incremento
        System.out.println(lives);

        //Prefija
        //Gana un regalo por ganar una vida
        int gift = 100 + lives++; //posfijo
        int gift1 = 100 + ++lives; //prefijo
        System.out.println(gift);
        System.out.println(gift1);
        System.out.println(lives);
    }
}
