public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled){
            //Send file
            fileSended++;
            System.out.println("Archivo enviado");
        }else{
            fileSended--;
            System.out.println("Por favor enciende el Bluetooth para iniciar la transferencia");
        }

    }
}
