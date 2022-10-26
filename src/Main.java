import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<City> cities = new ArrayList<>();
		cities.add(new City("Paris", "Fransa", "120.000.000"));
		cities.add(new City("New York", "Amerika", "257.000.000"));
		cities.add(new City("İstanbul", "Türkiye", "800.040.231"));
		cities.add(new City("Los Angelas", "Amerika", "200.123.012"));
		cities.add(new City("Şangay", "Çin", "1.000.000.000"));

		ArrayList<Location> locations = new ArrayList<>();
		locations.add(new Location("Paris", "Fransa", "Kroki Mahallesi"));
		locations.add(new Location("New York", "Amerika", "John Mahallesi"));
		locations.add(new Location("İstanbul", "Türkiye", "Ali Mahallesi"));
		locations.add(new Location("Los Angelas", "Amerika", "Cacıki Mahallesi"));
		locations.add(new Location("Şangay", "Çin", "Sank Peterburg Mahallesi"));

		ArrayList<Category> categories = new ArrayList<>();
		categories.add(new Category("Kamil Arsası", "logo.png"));
		categories.add(new Category("Leyla Apartmanı", "logo.png"));
		categories.add(new Category("Kazım Apartmanı", "logo.png"));
		categories.add(new Category("Cumali Arsası", "logo.png"));
		categories.add(new Category("Burak Apartmanı", "logo.png"));

		ArrayList<EstateAgent> estates = new ArrayList<>();
		estates.add(new EstateAgent("Burak", "Bolu", "logo", "054635634", "kuralburak08@gmail.com"));
		estates.add(new EstateAgent("Emir", "Siirt", "logo", "054623423", "emir10@gmail.com"));
		estates.add(new EstateAgent("Talha", "Ankara", "logo", "054342324", "talhayldrm@gmail.com"));

		ArrayList<Advert> adverts = new ArrayList<>();
		adverts.add(new Advert("Geniş Odalı Temiz Ev", "Satılık Ev", "26.10.2022", "Satılık", "Satılık Kamil Arsası logo.png", "850.000 TL", "870 Metrekare", "Paris Fransa Kroki Mahallesi", "Ev.png", "Burak", "Yayında"));
		adverts.add(new Advert("Küçük 3 Odalı Ev", "Kiralık Ev", "26.10.2022", "Kiralık", "Kiralık Leyla Apartmanı logo.png", "3500 TL", "200 Metrekare","New York Amerika John Mahallesi", "Apartman.png", "Kazım", "Yayında"));
		adverts.add(new Advert("Dar Odalı 1+1 Ev", "Satılık Ev", "26.10.2022", "Satılık", "Satılık Burak Apartmanı logo.png", "480.000 TL", "100 Metrekare", "İstanbul Türkiye Ali Mahallesi", "Ev.png", "Remzi", "Yayında"));
		adverts.add(new Advert("Havuzlu Villa", "Satılık Ev", "26.10.2022", "Satılık", "Satılık Recai Arsası logo.png", "2.000.000 TL", "2000 Metrekare", "Şangay Çin Sank Peterburg Mahallesi", "Villa.png", "Rıza", "Yayında"));
		adverts.add(new Advert("Garajı Olan Lüks Ev", "Satılık Ev", "26.10.2022", "Satılık", "Satılık Kazım Arsası logo.png", "1.500.000 TL", "1500 Metrekare", "Bakü Azerbaycan Fatih Mahallesi", "Ev.png", "Kamil", "Yayında"));
		adverts.add(new Advert("Helikopetrli Ev", "Satılık Ev", "26.10.2022", "Satılık", "Satılık Kamil Arsası logo.png", "1.200.000 TL", "870 Metrekare", "Paris Fransa Kroki Mahallesi", "Ev.png", "Efe", "Yayında"));
		adverts.add(new Advert("Normal Aile Evi", "Kiralık Ev", "26.10.2022", "Kiralık", "Kiralık Cumali Arsası logo.png", "450.000 TL", "480 Metrekare", "İstanbul Türkiye Ali Mahallesi", "Ev.png", "Batu", "Yayında"));
		adverts.add(new Advert("Dar Gelirli Aile Evi", "Satılık Ev", "26.10.2022", "Satılık", "Satılık Ramazan Arsası logo.png", "80.000 TL", "80 Metrekare", "New York Amerika John Mahallesi", "Ev.png", "Aziz", "Yayında"));


		
	}

}
