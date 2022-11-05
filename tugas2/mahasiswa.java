public class mahasiswa extends elemen {

    private int sks;
    public int jamsibuk;

    public mahasiswa (String nama, int sks){
        super(nama);
        this.type ="Mahasiswa";
        jamsibuk = sks*3;

    } 

    public void mailCheck(){
        System.out.println(getnama() +  " adalah seorang " + this.type+" dengan jam sibuk " + getJamSibuk()+ " " );
    }
 
    public int getJamSibuk(){
     return jamsibuk;
    }


 }
 
 