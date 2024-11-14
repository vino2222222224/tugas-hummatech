import java.util.Scanner;
public  class luasSegitiga1 {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan nilai");
        System.out.print("alas \t=");
        double alas = input.nextInt();

        System.out.print("tinggi \t=");
        double tinggi = input.nextInt();
        double luas = (alas * tinggi) / 2;
        System.out.println("hasil");
        System.out.println("luas segitiga = " + luas);
        input.close();

    }



}