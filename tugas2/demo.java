public class demo {
    public static void main(String[] args) {
        int total_jamsibuk;
        //Polymorphism
        asdos asdos1 = new asdos("Fairuzikun", 24, 1);
        dosen dosen1 = new dosen("Raja OP Damanik", 5);
        asdos asdos2 = new asdos("Angel-chan", 21, 1);
        mahasiswa mahasiswa1 = new mahasiswa("Firman", 20);
        mahasiswa mahasiswa2 = new mahasiswa("Nid to pass this sem", 23);
        dosen dosen2 = new dosen("Nivotko", 3);

        //upcasting
        mahasiswa asdosup = (mahasiswa) asdos2;
        //downcasting
        dosen dosendown = (dosen) dosen2; 
    
        asdos1.mailCheck();
        dosen1.mailCheck();
        asdosup.mailCheck();
        mahasiswa1.mailCheck();
        mahasiswa2.mailCheck();
        dosendown.mailCheck();

        total_jamsibuk = asdos1.jamsibuk+dosen1.getJamSibuk()+asdos2.jamsibuk+mahasiswa1.jamsibuk+mahasiswa2.jamsibuk+dosen2.getJamSibuk();
        System.out.println("Total jam sibuk elemen Fasilkom adalah "+ total_jamsibuk);








    }
}
