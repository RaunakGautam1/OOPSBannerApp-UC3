public class OOPSBannerApp {

    public static void main(String[] args) {

        // Each line constructed using String.join()
        String line1 = String.join(" ", "O", "O", "P", "P", "S", "S");
        String line2 = String.join(" ", "O", "O", "P", "P", "S");
        String line3 = String.join(" ", "O", "O", "P", "P", "S", "S");
        String line4 = String.join(" ", "O", "O", "P", "P", "S");
        String line5 = String.join(" ", "O", "O", "P", "P", "S", "S");

        // Print Banner
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}
