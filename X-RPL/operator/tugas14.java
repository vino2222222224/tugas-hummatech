import java.util.Scanner;
public class tugas14 {
    public static void main(String[] args) {
        //daftar NIS siswa yang lulus 
        int[] nislulus = {1001,1002,1003,1004};

        //membuat scanner untuk input user
        Scanner scenner  = new Scanner(System.in);
        System.out.println("Masukkan NIS: ");
        int inputNIS = scenner.nextInt();

        // memeriksa apakah nis ada dalam dasar
        boolean isLulus = false;
        for(int nis :  nislulus) {
            if (nis == inputNIS) {
                isLulus = true;
                break;
        }
     }
     //menampilkan tugas
     if (isLulus) {
     System.out.println("status: true (lulus)");
     }else{
        System.out.println("status: false (tidak lulus)");
     }
}
}