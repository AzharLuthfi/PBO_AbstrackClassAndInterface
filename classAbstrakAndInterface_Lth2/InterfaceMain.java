package classAbstrakAndInterface_Lth2;

public class InterfaceMain {
  public static void main(String[] args) {
	  
    KartuElektronik kartu = new KartuElektronik("IF111", "123");
    System.out.println("Otentikasi : "+ kartu.otentikasi("123"));
    
    PembayaranDigital pembayaranDigital = new PembayaranDigital("example@example.com");
    System.out.println("Otentikasi: " + pembayaranDigital.otentikasi("123"));
    System.out.println("Encoded PIN: " + pembayaranDigital.encode("123"));

  }
}
