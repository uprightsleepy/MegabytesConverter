package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            int mega = kiloBytes/1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes+" KB = " + mega +" MB and "+ remainder + " KB");
        }
    }
}
