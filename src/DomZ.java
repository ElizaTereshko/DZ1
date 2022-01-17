public class DomZ {
    public static void main(String[] args) {
// Задача 1
        double n = 10;
        double sum = 0;
        for (int i = 2; i <= 7; i++) {
            n = n * 1.1;
            sum = sum + n;
        }
        System.out.println(sum);
// Задача 2
        int a = 1;
        int sam = a;
        for (int i = 3; i <= 24; i = i + 3) {
            a = a * 2;
            sam = sam + a;
        }
        System.out.println(sam);
// Задача 3
        int sym = 0;
        for (int i = 1; i <= 256; i = i * 2) {
            sym = sym + i;
        }
        System.out.println(sym);
// Задача 5
        double c;
        String d;
        String b = "дюйм";
        String e = "дюйма";
        String f = "дюймов";
        for (int i = 1; i <= 20; i++) {
            c = 2.54 * i;
            if (i == 1) {
                d = b;
                System.out.println(i + " " + d + "=" + c + " см");
            } else if (i >= 2 && i < 5) {
                d = e;
                System.out.println(i + " " + d + "=" + c + " см");
            } else if (i >= 5) {
                d = f;
                System.out.println(i + " " + d + "=" + c + " см");
            }
        }
// Задача 6
        for (int i = 2; i <= 100; i+=2) {

                System.out.print(" " + i);

        }
// Задача 7
        int sim = 0;
        for (int i = 1; i <= 99; i+=2) {

                sim = sim + i;

        }
        System.out.println("\n" + sim);
// Задача 4
        int A = 3;
        int B = 9;
        int result = 0;
        for (int i = 1; i <= A; i++) {
            result = result + B;
        }
        System.out.println(result);

// wile-do
// Задача 1
        double N = 10;
        double SUM = 0;
        int I = 1;
        do {
            I++;
            N = N*1.1;
            SUM = SUM + N;
        }
        while (I < 7);
        System.out.println(SUM);
// Задача 2
        int C = 1;
        int D = 0;
        int SAM = 1;
        do {
            D = D + 3;
            C = C*2;
            SAM = SAM + C;
        }
        while ( D < 24);
        System.out.println(SAM);
// Задача 3
        int F = 1;
        int SYM = F;
        do {
            F = F * 2;
            SYM = SYM + F;
        }
        while (F < 256);
        System.out.println(SYM);
//Задача 4
        int L = 2;
        int K = 9;
        int J = 0;
        int H = 0;
        do {
            J++;
            H = H + K;
        }
        while (J < L);
        System.out.println(H);

    }
}

