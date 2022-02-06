package Zajęcie_4.Wyjątki;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws MalformedURLException {
        CheckedExceptionDemo checkedExceptionDemo = new CheckedExceptionDemo();
        checkedExceptionDemo.urlTesterByTryCatch("https://wszib.edu.pl");
        checkedExceptionDemo.urlTesterByTryCatch("https://onet.pl");
        checkedExceptionDemo.urlTesterByTryCatch("httpps://wszib.edu.pl");

        checkedExceptionDemo.urlTesterByThrows("https://wszibb12.edu");

    }

    public void urlTesterByTryCatch(String urlStr) {
        try {
            URL url = new URL(urlStr);
            System.out.println("Protocol to: " + url.getProtocol());
            System.out.println("Host to: " + url.getHost());
        } catch (MalformedURLException e) {
            System.out.println("Niepoprawny url: " + e.getMessage());
        }
    }

    public void urlTesterByThrows(String urlStr) throws MalformedURLException{
        URL url = new URL(urlStr);
        System.out.println("Protocol to: " + url.getProtocol());
        System.out.println("Host to: " + url.getHost());
    }
}
