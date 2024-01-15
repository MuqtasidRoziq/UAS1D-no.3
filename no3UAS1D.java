import java.util.ArrayList;

public class no3UAS1D {
    public static void main(String[] args) {
        ArrayList<String> NamaPasien = new ArrayList<>();
        ArrayList<Integer> UmurPasien = new ArrayList<>();
        ArrayList<String> StatusVaksin = new ArrayList<>();

        for (int i = 0; i < 105; i++) {
            NamaPasien.add("Pasien " + (i + 1));
            UmurPasien.add(((int) (Math.random() * 80)));
            StatusVaksin.add("Belum Vaksin");
        }
        int [] TahunLahir = new int [105];
        for (int i = 0; i < 105; i++) {
            TahunLahir[i] = 2024-UmurPasien.get(i);

        }
        for (int i = 0; i < 105; i++) {
            System.out.println(NamaPasien.get(i) + " | " + UmurPasien.get(i) + " | " + StatusVaksin.get(i) + " | " + TahunLahir[i]);
        }

    }
}
