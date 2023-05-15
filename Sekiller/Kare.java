package Sekiller;

public class Kare extends Sekil {

	public Kare(String adi, int kose) {
		super(adi, kose);
	}

	public void sekilBilgisi() {
		int icAcıToplami = ((super.getKose()-2) * 180);
		int birIcAci = ((super.getKose()-2) * 180) / super.getKose();
		int birDisAci = 180 - birIcAci;
		System.out.println("İç açıları toplamı " + icAcıToplami + " , bir iç açısı " + birIcAci + ", bir dış açısı " + birDisAci + " derece olan "
							+ super.getAdi() + " çizdiriliyor...");
	}
	

	
	

	
}
