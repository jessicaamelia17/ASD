public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public PersegiPanjang(int p, int l){
        panjang = p;
        lebar = l;
    }
    public void cetakInfo (){ 
        System.out.println("Panjang: " + panjang + ", Lebar: " + lebar 
        + ", Luas: " + panjang*lebar + ", Keliling: " + 2*(panjang+lebar));
    }
    public double hitungLuas(){
        return panjang * lebar;
    }
    public double hitungKeliling(){
        return 2*(panjang+lebar);
    }
}

