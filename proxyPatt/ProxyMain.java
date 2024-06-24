package proxyPatt;

public class ProxyMain {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        // ProxyImage는 실제 이미지 객체(RealImage)를 생성하고, 실제 이미지가 필요할 때만 생성되도록 한다.
        // 이를 통해 리소스가 절약되고 성능이 향상될 수 있다.
        image.display();
    }
}
