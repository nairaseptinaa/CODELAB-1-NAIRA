import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String nama;
        String jenis_kelamin;
        LocalDate tanggalLahir;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        System.out.print("Masukkan jenis kelamin (L/P): ");
        jenis_kelamin = input.nextLine();

        System.out.print("Tanggal Lahir (yyyy-MM-dd): ");
        String inputTanggal = input.nextLine();
        tanggalLahir = LocalDate.parse(inputTanggal, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        LocalDate tanggalSekarang = LocalDate.now();
        Period selisih = Period.between(tanggalLahir, tanggalSekarang);
        int umurTahun = selisih.getYears();
        int umurBulan = selisih.getMonths();
        int umurHari = selisih.getDays();

        System.out.println("Namamu adalah: " + nama);
        System.out.println("Jenis kelamin: " + jenis_kelamin);
        System.out.println("Umur Anda: " + umurTahun + " tahun " + umurBulan + " bulan " + umurHari + " hari");
    }
}

