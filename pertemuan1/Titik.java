public class Titik{
    private double absis;
    private double ordinat;
    //untuk set nilai awal ketika kita membuat objek baru
    static int countitik = 0;

    // Overloading adalah konsep dalam pemrograman berorientasi objek dimana 
    // kita dapat membuat beberapa method dengan nama yang sama dalam satu class, 
    // tetapi dengan parameter yang berbeda.
    //Contoh Overloading 
    public Titik(){
        this.absis = 0;
        this.ordinat = 0;
    }
    
   public Titik(double absis, double ordinat){
    this.absis = absis;
    this.ordinat = ordinat;
    countitik++;//untuk menambah nilai awal ketika kita membuat objek baru
    }
    
    public double getAbsis(){
        return absis;
    }
    public double getOrdinat(){
        return ordinat;
    }
    //this digunakan untuk merujuk pada objek saat ini, misalnya this.absis merujuk pada absis dari objek saat ini 
    // dan this.ordinat merujuk pada ordinat dari objek saat ini
    public void setAbsis(double absis){
        this.absis = absis;
    }
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }
    public void geser(double absis, double ordinat){
        this.absis += absis;
        this.ordinat += ordinat;
    }
    public void printTitik(){
        System.out.println("Titik (" + this.absis + ", " + this.ordinat + ")");
    }


}

class mTitik{
    public static void main(String[] args){
        //contoh penggunaan konstruktor
        Titik titik = new Titik(4,5);
         //contoh penggunaan getter
        System.out.println("Absis titik di set sendiri: " + titik.getAbsis());
        System.out.println("Ordinat titik di set sendiri: " + titik.getOrdinat());

        Titik titik1 = new Titik();
        //contoh penggunaan getter dengan set titik awal 0,0
        System.out.println("Absis dengan set awal 0: " + titik1.getAbsis());
        System.out.println("Ordinat dengan set awal 0: " + titik1.getOrdinat());

        // Mengubah nilai absis dan ordinat menggunakan setter
        titik1.setAbsis(5);
        titik1.setOrdinat(7);
        System.out.println("Absis setelah diubah: " + titik1.getAbsis());
        System.out.println("Ordinat setelah diubah: " + titik1.getOrdinat());   


        //contoh penggunaan method
        titik.setAbsis(4);
        titik.setOrdinat(5);
        titik.printTitik();
        titik.geser(2,3);
        titik.printTitik();
        System.out.println("Jumlah titik yang dibuat: " + Titik.countitik);//memanggil method countitik

    }
}