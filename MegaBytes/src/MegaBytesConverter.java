public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        int MB = 1024;
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {
            int megaBytes = Math.round(kiloBytes / MB);
            int remainingBytes = kiloBytes - (megaBytes * MB);
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingBytes + " KB");
        }
    }
}
