import myfirstpackage.*;
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
