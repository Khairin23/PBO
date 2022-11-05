public class asdos extends mahasiswa {
    private int JamNgasdos;
    
    public asdos(String nama, int sks, int JamNgasdos) {
        super(nama, sks);
        this.type = "asdos";
        jamsibuk = jamsibuk + JamNgasdos ;
        

    }
 
    public int getJamSibuk(){
        return jamsibuk;
    }

    public void mailCheck(){
        System.out.println(getnama() + " adalah seorang " + this.type+" dengan jam sibuk " + getJamSibuk() );
    }
}
