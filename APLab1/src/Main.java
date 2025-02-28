public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);
        n = n * 3;
        n = n + Integer.parseInt("10101", 2);
        n = n + Integer.parseInt("FF", 16);
        n = n * 6;

        int s = 0;
        while(n > 9)
        {
            int p = n % 10;
            n = n / 10;
            s = s + p;
            System.out.printf("n = %d s = %d\n", n, s);
            if(n < 10 && s != 0) {
                n = n + s;
                s = 0;
            }
        }
        System.out.println(n);

        System.out.println("Willy-nilly, this semester I will learn " + languages[n]);
    }
}