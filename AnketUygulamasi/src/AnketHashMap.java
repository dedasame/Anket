import java.text.ParseException; 
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Comparator; 
import java.util.HashMap; 
import java.util.LinkedHashMap; 
import java.util.List; 
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set; 
import java.util.TreeMap;



public class AnketHashMap {

	public static void main(String[] args) {
		
		int anaKontrol=1;
		while(anaKontrol==1) {
		HashMap<String,Double> sorular = new HashMap<String,Double>();
		
		Scanner input = new Scanner(System.in);
		
		double a=0,b=0,c=0,d=0,e=0;
		
		System.out.println("Asagida yazan konulari onemine gore 1-10 arasi degerlendirin.");
		
		int kontrol=1;
		double puan = 0;
		int kisiSayisi=0;
		
		while(kontrol==1) {
			
			kisiSayisi++;
			
			while(puan<=0||puan>10) {
				System.out.println("1-Ekonomi: ");
				puan = input.nextDouble();
			}
			a+=puan;
			puan=0;

			while(puan<=0||puan>10) {
				System.out.println("2-Kuresel Isinma: ");
				puan = input.nextDouble();
			}
			b+=puan;
			puan=0;


			while(puan<=0||puan>10) {
				System.out.println("3-Enerji: ");
				puan = input.nextDouble();
			}
			c+=puan;
			puan=0;

			while(puan<=0||puan>10) {
				System.out.println("4-Teknoloji: ");
				puan = input.nextDouble();
			}
			d+=puan;
			puan=0;


			while(puan<=0||puan>10) {
				System.out.println("5-Kultur: ");
				puan = input.nextDouble();
			}
			e+=puan;
			puan=0;

			System.out.println("Teste yeniden girmek icin 1 testi bitirmek icin 2'ye basin.");
			kontrol = input.nextInt();	
		}		
		
		
		System.out.println("-----------Puanlar--------------");
		sorular.put("Ekonomi", a);
		sorular.put("Kuresel Isinma",b);
		sorular.put("Enerji",c);
		sorular.put("Teknoloji",d);
		sorular.put("Kultur",e);
		
		
		for(String i:sorular.keySet()) {
			System.out.println(i+":"+sorular.get(i));
		}
		
		System.out.println("------------Ortalamasi-------------");
		
		HashMap<String,Double> ortalama = new HashMap<String,Double>();
		
		ortalama.put("Ekonomi", a/kisiSayisi);
		ortalama.put("Kuresel Isinma", b/kisiSayisi);
		ortalama.put("Enerji", c/kisiSayisi);
		ortalama.put("Teknoloji", d/kisiSayisi);
		ortalama.put("Kultur", e/kisiSayisi);
		
		for(String i:ortalama.keySet()) {
			System.out.println(i+":"+ortalama.get(i));
		}
		
	
		
		System.out.println("Testi sifirlamak ve yeniden baslatmak icin 1'i tuslayin.");
		anaKontrol=input.nextInt();
		}
		System.out.println("Testen ciktiniz.");
	}
}