import Viajes.Normal;
import Viajes.Servicios;
import Viajes.VIP;

public class Main {
    public static void main(String[] args) {
        VIP pasajeroVip1  = new VIP(null, null, null, null, 0, null, null, null, 0.0,null,false,false,false,false,null,null,0.0);
        VIP pasajeroVip2  = new VIP(null, null, null, null, 0, null, null, null, 0.0,null,false,false,false,false,null,null,0.0);
        VIP pasajeroVip3  = new VIP(null, null, null, null, 0, null, null, null, 0.0,null,false,false,false,false,null,null,0.0);
        VIP pasajeroVip4  = new VIP(null, null, null, null, 0, null, null, null, 0.0,null,false,false,false,false,null,null,0.0);
        VIP pasajeroVip5  = new VIP(null, null, null, null, 0, null, null, null, 0.0,null,false,false,false,false,null,null,0.0);
        VIP pasajeroVip6 = new VIP("VIP2024-123","10","Ale","051316132684",15,"065161","Quito","Guayaquil",2.1,"",true,true,true,false,"Comida","Cobija",20);
        Normal pasajeroNormal = new Normal("2024-123","","","",11,"","","",15.12,"",true,false,15.2);
        pasajeroNormal.mostrarTicket();
        System.out.println();
        pasajeroVip6.mostrarTicket();
        pasajeroVip1.mostrarTicket();
    }
}