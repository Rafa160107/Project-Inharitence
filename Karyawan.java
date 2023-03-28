public class Karyawan extends employee{

    public String nama = "Alliyah";
    public int usia = 19;
    public String status = "Belum Kawin";
    public int gaji = 10000000;
    private int nip = 1109887009;
    public int bonus =80000;
    public int potongan =15000;
    public int jamkrja ;
    public int getJamkrja(){
        return this.jamkrja;
    }
    public void setJamkrja(int a){
        this.jamkrja=a;
    }

    public int getnip(){
        return this.nip;
    }

    public void rapay() {
        if (jamkrja < 8) {
            int hasil = jamkrja - 8 * potongan;
        }
    }
    public void bonus(int f){
        if (status=="Sudah Kawin"){
            int total = gaji +bonus;
        }
    }
}
