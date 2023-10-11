package Interface;



public class Main {

	public static void main(String[] args) {
		
		Otomobil oto =new Otomobil();
		oto.setMarka("Ferrari");
		oto.setModel("Spor");
		oto.setYakıtTürü("Benzin");
		oto.setYas(1);
		oto.setÜstüAcikMi(true);
		oto.OzellikleriGöster();
		
		Otobüs otobüs = new Otobüs();
		otobüs.setMarka("Suzuki");
		otobüs.setModel("Otobüs");
		otobüs.setYakıtTürü("Benzin");
		otobüs.setYas(7);
		otobüs.setHizSinirlayici(true);
		otobüs.OzellikleriGöster();

	}

}
