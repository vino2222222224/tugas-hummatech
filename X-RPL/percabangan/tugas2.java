import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int belanja;
        System.out.println("input total bulanja anda");
        belanja = input.nextInt();
        if  (belanja >= 500000) {
            System.out.println("selamat anda mendapatkan hadiah gantungan kunci");            
        } else{
            int selisihbelanja = 500000 -  belanja ;
            System.out.println("belanja anda kurang dari 500000");
            System.out.println("silahkan tambah belanja anda lagi senilai RP" +  selisihbelanja);
            System.out.println("agar bisa mendapat bonus gantungan kunci");


        }
}
}

