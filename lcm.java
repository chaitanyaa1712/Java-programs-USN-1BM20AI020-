package lcmpackage;

public class lcm {
    int a;
    int b;

    public lcm(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calclcm(int a, int b) {
        int l;
        int x = (a > b) ? a : b;
        for(l = x; l < (a*b); l = l + x)
            if((l % a == 0) && (l % b == 0))
                break;
        return l;
    }
}
