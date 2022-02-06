package Zajęcie_4.Wyjątki;

public class StagTraceExample {
    public static void main(String[] args) {
    StagTraceExample stagTraceExample = new StagTraceExample();
    stagTraceExample.method1();
    }
    public void method1(){
    method2();
    }
    public void method2(){
    method3();
    }
    public void method3(){
      throw new RuntimeException("BUM!");
    }
}
