import java.util.Arrays;
import java.util.Scanner;

public class Anket {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int kontrol=1;
		int kisiSayisi=0;
		
		int[][] cevaplar = new int[5][10];
		
		
		while(kontrol==1) {	
		kisiSayisi++;
		int puan=0;
		
		System.out.println("Asagida yazan konulari onemine gore 1-10 arasi degerlendirin.");
		System.out.println("1-Ekonomi: ");
		puan = input.nextInt();
		cevaplar[0][puan-1]++;
		
		System.out.println("2-Kuresel isinma");
		puan = input.nextInt();;
		cevaplar[1][puan-1]++;
		
		System.out.println("3-Enerji");
		puan = input.nextInt();
		cevaplar[2][puan-1]++;
		
		System.out.println("4-Teknoloji");
		puan = input.nextInt();
		cevaplar[3][puan-1]++;
		
		System.out.println("5-Kultur");
		puan = input.nextInt();
		cevaplar[4][puan-1]++;
		
		System.out.println("Teste girmek icin 1 testi bitirmek icin 2'ye basin.");
		kontrol = input.nextInt();	
		}
		
		
		for(int k=0;k<5;k++) {
			for(int j=0;j<10;j++) {
				System.out.printf("%d",cevaplar[k][j]);
			}
			System.out.println("");
		}
		double[] toplam = new double[5];
		for(int m=0;m<5;m++) {
			for(int n=0;n<10;n++) {
				toplam[m]+=(n+1)*cevaplar[m][n];
			}
		}
		
		for(double sayilar : toplam) {
			double ortalama = sayilar/kisiSayisi;
			System.out.println(ortalama);
			}
		
		String[] sorular = {"Ekonomi","Kuresel Isinma","Enerji","Teknoloji","Kultur"};
		for(int p=0;p<5;p++) {
			System.out.println(sorular[p] +" "+ toplam[p]);
		}
		
		Arrays.sort(toplam);
		
		
		//toplami buyukten kucuge sirala ve test bittikten sonra tekrar sor.
		
	}
}
