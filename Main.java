package projectKRS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListStructure list = new ListStructure();

        String mataKuliah;
        int sks;
        int semester;
        String jadwal;

        System.out.println("""
                --- Menu ---- \

                1. Tambah Mata Kuliah Pertama \

                2. Tambah Mata Kuliah Pada Posisi Tertentu\

                3. Tambah Mata Kuliah Terakhir\

                4. Hapus Mata Kuliah Pertama \

                5. Hapus Mata Kuliah Posisi Tertentu \

                6. Hapus Mata Kuliah Terakhir \

                7. Tampilkan Kartu Rencana Studi \

                8. Keluar""");

        Scanner scanner = new Scanner(System.in);

        int menu = 0;
        while (menu != 9) {
            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            int pos;

            switch (menu) {
                case 1:
                    System.out.print("Masukkan mata kuliah: ");
                    mataKuliah = scanner.nextLine();

                    System.out.print("Masukkan SKS: ");
                    sks = scanner.nextInt();

                    System.out.print("Masukkan semester: ");
                    semester = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukkan jadwal: ");
                    jadwal = scanner.nextLine();

                    list.addHead(new KartuRencanaStudi(mataKuliah, sks, semester, jadwal));
                    break;
                case 2:
                    System.out.print("Masukkan posisi mata kuliah yang ingin ditambah: ");
                    pos = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukkan mata kuliah: ");
                    mataKuliah = scanner.nextLine();

                    System.out.print("Masukkan SKS: ");
                    sks = scanner.nextInt();

                    System.out.print("Masukkan semester: ");
                    semester = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukkan jadwal: ");
                    jadwal = scanner.nextLine();

                    list.addMid(new KartuRencanaStudi(mataKuliah, sks, semester, jadwal), pos);
                    break;
                case 3:
                    System.out.print("Masukkan mata kuliah: ");
                    mataKuliah = scanner.nextLine();

                    System.out.print("Masukkan SKS: ");
                    sks = scanner.nextInt();

                    System.out.print("Masukkan semester: ");
                    semester = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukkan jadwal: ");
                    jadwal = scanner.nextLine();

                    list.addTail(new KartuRencanaStudi(mataKuliah, sks, semester, jadwal));
                    break;
                case 4:
                    list.removeHead();
                    break;
                case 5:
                    System.out.print("Masukkan posisi mata kuliah yang ingin dihapus: ");
                    pos = scanner.nextInt();
                    list.removeMid(pos);
                    break;
                case 6:
                    list.removeTail();
                    break;
                case 7:
                    list.displayElements();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        }

    }
}

