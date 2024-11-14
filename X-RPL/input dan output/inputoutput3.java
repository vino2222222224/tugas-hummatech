import java.util.Scanner;
public class inputoutput3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("jenis kelamin: ");
        char jenisKelamin = input.nextLine(). charAt(0);
        System.out.print("nomer sepatu: ");
        int nomerSepatu = input.nextInt();
        System.out.print("sudah menikah: ");
        boolean sudahMenikah = input.nextBoolean();
        
        System.out.println("====hasil====");
        System.out.println("jenis kelamin: " + jenisKelamin);
        System.out.println("nomer sepatu: " + nomerSepatu);
        System.out.println("sudah menikah: " + sudahMenikah);
        input.close();
    }
}
