package implementacija;

import java.util.GregorianCalendar;

import interfejsi.InterfejsMenjacnice;
import kursevi.Kurs;
import valute.Valuta;

public class Menjacnica implements InterfejsMenjacnice {
	@Override
	public void dodajKurs(Valuta valuta, Kurs kurs) {
		if(kurs == null) {
			throw new NullPointerException();
		}
		valuta.getKursValute().add(kurs);

	}
	@Override
	public void obrisiKurs(Valuta valuta, Kurs kurs) {
		if(kurs == null) {
			throw new NullPointerException();
		}
		valuta.getKursValute().remove(kurs);
	}
	@Override
	public Kurs vratiKurs(GregorianCalendar datum, Valuta valuta) {
		if(datum == null) {
			throw new NullPointerException();
		}
		for(int i = 0; i < valuta.getKursValute().size(); i++) {
			 if(valuta.getKursValute().get(i).getDatum() == datum && valuta.getNazivValute().equals(valuta.getNazivValute())){
			 		return valuta.getKursValute().get(i);
			 } 		
		}
		return null;
	}
}
