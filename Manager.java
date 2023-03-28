public class Manager extends employee{
    public String nama = "Rafa";
    public int usia = 20;
    public String status = "Belum Kawin";
    public int gaji = 12000000;
    private int nip = 1077902;
    public int bonus =100000;
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
        public void bonus(int b){
            if (status=="Sudah Kawin"){
int total = gaji +bonus;
            }
    }
}
