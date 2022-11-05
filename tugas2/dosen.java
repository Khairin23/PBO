public class dosen extends elemen {
    private int JumlahHariKerja;
    private int jamsibuk;

    public dosen (String nama, int JumlahHariKerja){
        super(nama);
        this.type = "dosen";
        jamsibuk = JumlahHariKerja *8;
        
    } 

    public void mailCheck(){
        System.out.println(getnama() +  " adalah seorang " + this.type+" dengan jam sibuk " + getJamSibuk() );
    }

    public int getJamSibuk(){
        return jamsibuk;
       }
   
}