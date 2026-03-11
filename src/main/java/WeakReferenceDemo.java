import java.lang.ref.WeakReference;
public class WeakReferenceDemo {
    public static void main(String[] args) throws InterruptedException {
        String str = "Hello World";
        WeakReference<String> weakReference = new WeakReference<>(str);
        Object[] array = new Object[]{weakReference};
        str = null;
        System.gc();
        Thread.sleep(3000);
        System.out.println(array[0]);
    }
}