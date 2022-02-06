//package Zajęcie_4.Labo16;
//
//import Zajęcie_4.Wyjątki.ExceptionThrowDemo;
//
//public class PrimeFinder implements Runnable {
//    public long target;
//    public long prime;
//    public boolean finished = false;
//    private Thread runner;
//
//    public static void main(String[] args) {
//        PrimeFinder primeFinder = new PrimeFinder(-45641);
//
//        try {
//            System.out.println(primeFinder.target);
//        }catch () {
//            System.out.println("NegativeNumberException");
//
//        }
//    }
//
//    PrimeFinder(long inTarget) {
//        target = inTarget;
//        if (runner == null) {
//            runner = new Thread(this);
//            runner.start();
//        }
//    }
//    public void run() {
//        long numPrimes = 0;
//        long candidate = 2;
//        while (numPrimes < target) {
//            if (isPrime(candidate)) {
//                numPrimes++;
//                prime = candidate;
//            }
//            candidate++;
//        }
//        finished = true;
//    }
//
//    boolean isPrime(long checkNumber) {
//        double root = Math.sqrt(checkNumber);
//        for (int i = 2; i <= root; i++) {
//            if (checkNumber % i == 0)
//                return false;
//        }
//        return true;
//    }
//}
//
