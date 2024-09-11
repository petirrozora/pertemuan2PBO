package TugasPraktikum2PBO;

public class Matematika implements InterfaceMatematika {
    
    
    public int pertambahan(int a, int b) {
        return a + b;
    }

    
    public int pengurangan(int a, int b) {
        return a - b;
    }

    
    public int perkalian(int a, int b) {
        return a * b;
    }

    
    public double pembagian(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Tidak bisa membagi dengan nol");
            return 0;
        }
    }
}

