package No01;

public class LoadingClass {
    // Method 1
    public static int tambah(int a, int b) {
        return a + b;
    }

    // Overloading 1
    public static double tambah(double a, double b) {
        return a + b;
    }

    // Method 2
    public static int kalikan(int a, int b) {
        return a * b;
    }
    // Overloading 2
    public static double kalikan(double a, double b) {
        return a * b;
    }

    // Method 3
    public static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    // Overloading 3
    public static double hitungLuas(double radius) {
        return Math.PI * radius * radius;
    }

    // Method 4
    public static String gabung(String str1, String str2) {
        return str1 + str2;
    }

    // Overloading 4
    public static String gabung(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }

    // Method 5
    public static double konversiSuhu(double suhuCelsius) {
        return (suhuCelsius * 9 / 5) + 32;
    }

    // Overloading 5
    public static double konversiSuhu(int suhuFahrenheit) {
        return (suhuFahrenheit - 32) * 5 / 9;
    }

    // Method 6
    public static int pangkatDua(int angka) {
        return angka * angka;
    }

    // Overloading 6
    public static double pangkatDua(double angka) {
        return angka * angka;
    }

    // Method 7
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    // Overloading 7
    public static double hitungVolume(double jariJari, double tinggi) {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    // Method 8:
    public static int kurang (int a , int b){
        return a-b;
    }
    
    // Overloading 8:
    public static double kurang (double a , double b){
        return a-b;
    }
    

    // Method 9: 
    public static int maksimum(int a, int b) {
        return (a > b) ? a : b;
    }

    // Overloading 9
    public static double maksimum(double a, double b) {
        return (a > b) ? a : b;
    }

    // Method 10
    public static double panjangSisiMiring(double alas, double tinggi) {
        return Math.sqrt(alas * alas + tinggi * tinggi);
    }

    // Overloading 10
    public static double panjangSisiMiring(double panjangSisi) {
        return Math.sqrt(3) * panjangSisi;
    }
}
