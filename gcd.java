package gcdpackage;

public class gcd {
    int a;
    int b;

    public gcd(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calcgcd(int a, int b) {
        while(a != b) {
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        return b;
    }
}
