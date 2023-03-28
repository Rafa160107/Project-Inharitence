public class Bos extends employee{
    public String nama = "Bandi";
    public int usia = 25;
    public String status = "Sudah Kawin";
    public int gaji = 20000000;
    private int nip = 23009776;
    public int bonus =2000000;
    public int potongan =50000;
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

    public void rapay(){
       if (jamkrja<8){
           int hasil = jamkrja-8*potongan;
        }
    }
    public void bonus(int b){
        if (status == "Sudah Kawin"){
            int total = gaji+bonus;
        }
    }

}
