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
    public int plus(){
        return a+b;
    }
}
