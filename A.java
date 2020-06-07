public class A {
    private int A1;
    private float A2;

    public int getA1() {
        return A1;
    }

    public int getA2() {
        return A2;
    }

    public void setA1(int a1) {
        this.A1 = a1;
    }

    public void setA2(float a2) {
        this.A2 = a2;
    }

    public static void MA1()  {
        System.out.println("MA1");
    }

    public static void MA2()  {
        System.out.println("MA2");
    }

    public static void MA3()  {
        System.out.println("Alteração a classe A partir do clone");
    }
}