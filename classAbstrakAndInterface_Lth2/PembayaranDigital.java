package classAbstrakAndInterface_Lth2;

public class PembayaranDigital implements kartu {
	  private String email;

	  public PembayaranDigital(String email) {
	      this.email = email;
	  }

	  @Override
	  public boolean otentikasi(String pinInput) {
	      // Authentication logic
	      return true; // Example: always true
	  }

	  @Override
	  public String encode(String pin) {
	      // Encoding implementation
	      return pin; // Example: no encoding
	  }
}
