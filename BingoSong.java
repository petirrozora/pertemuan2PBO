package TugasPraktikum2PBO;

public class BingoSong {
    private String name; 
    private String farmer; 

    
    public BingoSong(String farmer, String name) {
        this.farmer = farmer;
        this.name = name;
    }

    
    public void sing() {
        String bingo = "B-I-N-G-O";
        String clap = "(clap)";
        
        
        printVerse(0);

        
        for (int i = 1; i <= name.length(); i++) {
            printVerse(i);
        }
    }

    
    private void printVerse(int claps) {
        String clapSection = "";
        
        
        for (int i = 0; i < claps; i++) {
            clapSection += "(clap)-";
        }

        
        for (int i = claps; i < name.length(); i++) {
            clapSection += name.charAt(i) + "-";
        }

        
        clapSection = clapSection.substring(0, clapSection.length() - 1);
        
       
        System.out.println("There was a " + farmer + " who had a dog,");
        System.out.println("And " + name + " was his name-o.");
        System.out.println(clapSection);
        System.out.println(clapSection);
        System.out.println(clapSection);
        System.out.println("And " + name + " was his name-o.");
    }
}