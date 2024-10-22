package praktikum2.soal3;

//Pada baris ini terjadi error karena nama package yang digunakan tidak sesuai dengan nama file.
//public class Pegawai {
public class Pegawai {
    public String nama;
    //Pada baris ini terjadi kesalahan karena variabel 'asal' bertipe char yang dimana hanya dapat menampung 1 karakter huruf sedangkan, nilai dari variabel 'asal' mada method dan pada program main nilainya harapannya direturn sebagai string.
    //public char asal;
    public String asal;
    public String jabatan;
    //Pada baris ini terjadi error karena atribut 'umur' tidak diinisialisasi dengan nilai.
    //public int umur;
    public int umur = 17;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    //Pada baris ini terjadi error karena method setJabatan tidak memiliki parameter.
    //public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
