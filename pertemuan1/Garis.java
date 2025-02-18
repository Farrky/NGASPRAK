public class Garis{
    private Titik titikAwal;
    private Titik titikAkhir;
    static int countGaris = 0;
    
    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        countGaris++;
    }
    public Garis(){
        this.titikAwal = new Titik(0,0);
        this.titikAkhir = new Titik(1,1);
    }
    static int getcountGaris(){
        return countGaris;
    }
    public Titik gettitikAwal(){
        return titikAwal;
    }
    public Titik gettitikAkhir(){
        return titikAkhir;
    }
    public void settitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }
    public void settitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }
    public double getPanjang(){
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
		double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
		
		return Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY,2));
    }
    public double getGradien(){
		double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
		double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
		
		return deltaY / deltaX;
    }
    public boolean isTegakLurus(Garis G){
		double gradien1 = this.getGradien();
		double gradien2 = G.getGradien();
		
		return Math.abs(gradien1 * gradien2) == -1;
	}
    public boolean isSejajar(Garis G){
        double gradien1 = this.getGradien();
        double gradien2 = G.getGradien();
        
        return gradien1 == gradien2;
    }
    public Titik getTitikTengah(){
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(x, y);
    }
}

class MGaris {
    public static void main(String[] args) {
     
        Titik titik1 = new Titik(2, 3);
        Titik titik2 = new Titik(5, 7);

        Garis garis1 = new Garis(titik1, titik2);
        System.out.println("\nJumlah garis yang dibuat: " + Garis.getcountGaris());
        //objek Garis
        System.out.println("Titik Awal: (" + garis1.gettitikAwal().getAbsis() + ", " + garis1.gettitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + garis1.gettitikAkhir().getAbsis() + ", " + garis1.gettitikAkhir().getOrdinat() + ")");
        
        //panjang garis
        System.out.println("Panjang Garis: " + garis1.getPanjang());

        //gradien garis
        System.out.println("Gradien Garis: " + garis1.getGradien());

        // coba Garis lain
        Titik titik3 = new Titik(1, 1);
        Titik titik4 = new Titik(4, 3);
        Garis garis2 = new Garis(titik3, titik4);

        // cek apakah garis1 tegak lurus dengan garis2
        boolean isTegakLurus = garis1.isTegakLurus(garis2);
        System.out.println("Garis 1 Tegak Lurus dengan Garis 2: " + isTegakLurus);
    }
}