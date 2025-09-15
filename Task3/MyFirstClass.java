class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(1,1);
        System.out.println(o.minus());
        for (int i = 0; i<=8; i++){
            for (int j = 0; j<=8; j++){
                o.setA(i);
                o.setB(j);
                System.out.println(o.minus());
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}
class MySecondClass {
    private int a;
    private int b;
    public MySecondClass(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public MySecondClass() {
        this.a = 0;
        this.b = 0;
    }
    public int get_a(){
        return a;
    }
    public int get_b(){
        return b;
    }
    public void setA(int newA) {
        a = newA;
    }
    public void setB(int newB) {
        b = newB;
    }
    public int minus(){
        return a-b;
    }
}
