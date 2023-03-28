import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bos stat = new Bos();
        System.out.println("\nRole : Boss\n==============");
        System.out.println("Nama : "+stat.nama);
        System.out.println("Usia : "+stat.usia);
        System.out.println("Status : "+stat.status);
        System.out.println("NIP : "+stat.getnip());
        System.out.print("Jam Kerja : ");
        int a = sc.nextInt();
        stat.setJamkrja(a);
        if (a<8){
            int ap = (8-a) * 50000;
            System.out.println("Potongan = "+ap);
        }
        else {
            System.out.println("Potongan = 0");
        }

        System.out.println("1.Jika sudah kawin\n2.Jika belum");
        System.out.print("Status : ");
        int b = sc.nextInt();
        stat.bonus(b);
        if (b==1) {
            int ab = stat.bonus+stat.gaji;
            System.out.println("Bonus + Gaji= "+ab);
        }
        else{
            System.out.println("Bonus = 0");
            System.out.println("Gaji = "+stat.gaji);
        }



        Manager stat1= new Manager();
        System.out.println("\nRole : Manager\n===========");
        System.out.println("Nama : "+stat1.nama);
        System.out.println("Usia : "+stat1.usia);
        System.out.println("NIP : "+stat1.getnip());
        System.out.print("Jam Kerja : ");
        int c = sc.nextInt();
        stat1.setJamkrja(c);
        if (c<8){
            int ap = (8-c) * 50000;
            System.out.println("Potongan = "+ap);
        }
        else {
            System.out.println("Potongan = 0");
        }

        System.out.println("1.Jika sudah kawin\n2.Jika belum");
        System.out.print("Status : ");
        int d = sc.nextInt();
        stat1.bonus(d);
        if (d==1) {
           int ab = stat1.bonus+stat1.gaji;
            System.out.println("Bonus + Gaji = "+ab);
        }
        else{
            System.out.println("Bonus = 0");
            System.out.println("Gaji = "+stat1.gaji);
        }

OB statt3 = new OB();
        System.out.println("\nRole : Office Boy\n===========");
        System.out.println("Nama : "+statt3.nama);
        System.out.println("Usia : "+statt3.usia);
        System.out.println("NIP : "+statt3.getnip());
        System.out.print("Jam Kerja : ");
        int e = sc.nextInt();
        statt3.setJamkrja(c);
        if (e<8){
            int ap = (8-c) * 50000;
            System.out.println("Potongan = "+ap);
        }
        else{
            System.out.println("Potongan = 0");
        }

        System.out.println("1.Jika sudah kawin\n2.Jika belum");
        System.out.print("Status : ");
        int f = sc.nextInt();
        statt3.bonus(f);
        if (f==1) {
            int ab = stat1.bonus+stat1.gaji;
            System.out.println("Bonus + Gaji = "+ab);
        }
        else{
            System.out.println("Bonus = 0");
            System.out.println("Gaji = "+statt3.gaji);
        }

        Karyawan stat4 = new Karyawan();
        System.out.println("\nRole : Karyawan\n===========");
        System.out.println("Nama : "+stat4.nama);
        System.out.println("Usia : "+stat4.usia);
        System.out.println("NIP : "+stat4.getnip());
        System.out.print("Jam Kerja : ");
        int g = sc.nextInt();
        statt3.setJamkrja(c);
        if (g<8){
            int ap = (8-c) * 50000;
            System.out.println("Potongan = "+ap);
        }
        else{
            System.out.println("Potongan = 0");
        }

        System.out.println("1.Jika sudah kawin\n2.Jika belum");
        System.out.print("Status : ");
        int h = sc.nextInt();
        statt3.bonus(h);
        if (h==1) {
            int ab = stat1.bonus+stat1.gaji;
            System.out.println("Bonus + Gaji = "+ab);
        }
        else{
            System.out.println("Bonus = 0");
            System.out.println("Gaji = "+statt3.gaji);
        }
    }
}