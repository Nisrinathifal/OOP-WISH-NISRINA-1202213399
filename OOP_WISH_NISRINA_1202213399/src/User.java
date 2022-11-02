import java.util.jar.Attributes.Name;

public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    String Nama;
    Integer Nomor;


    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setHP(int Nomor){
        this.Nomor = Nomor;
    }


    
    public void tulisan(String[] args){
    System.out.println("Selamat Datang di Restoran EAD");
    System.out.println("Silahkan Register Terlebih Dahulu");
    System.out.println("======================================");
    System.out.println("Nama : " + Nama);
    System.out.println("No.Handphone : " + Nomor);
    System.out.println("Register Success");
    System.out.println("Nama : Nisrina Thifal Khairunnisa");
    System.out.println("No.Handphone : 1202213399");
    System.out.println("======================================");
    System.out.println("1. Menu");
    System.out.println("2. Pilih Menu");
    System.out.println("3. Keluar");
    System.out.println("======================================");
    System.out.println("Masukan Pilihan : ");
}

}

