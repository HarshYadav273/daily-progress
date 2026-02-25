public class questionE1 {
    public static void main(String[] args) {
        int a1 = 2;
        int a2 = 3;
        int n = 4;
        int nthterm=a1;
        int d=a2-a1;
        for(int i=1;i<n;i++){
            nthterm+=d;
        }System.out.println(nthterm);
    }
}
