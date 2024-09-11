package TugasPraktikum2PBO;

public class MatematikaBeraksi {
    
	public static void main(String[] args) {
        
        InterfaceMatematika mat = new Matematika();

        
        int hasilPertambahan = mat.pertambahan(20, 10);
        int hasilPengurangan = mat.pengurangan(10, 5);
        int hasilPerkalian = mat.perkalian(10, 3);
        double hasilPembagian = mat.pembagian(21, 2);

        
        System.out.println("Pertambahan : 20 + 10 = " + hasilPertambahan);
        System.out.println("Pengurangan : 10 - 5 = " + hasilPengurangan);
        System.out.println("Perkalian : 10 * 3 = " + hasilPerkalian);
        System.out.println("Pembagian : 21 / 2 = " + (int)hasilPembagian);
    }
}


