package cuentas;

import static cuentas.CCuenta.operativa_cuenta;



public class Main {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);;
        cuenta1.operativa_cuenta(2300);
    }

    
}