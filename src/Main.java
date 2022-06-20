public class Main {
    private int x;

    public Main(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
//        int number = 6;
//        float a = (float) Math.sqrt(number);
//        System.out.print(a);

        Main obj = new Main(5);
        System.out.println(obj.getX());
    }
}
