public class StringBufferVSStringBuilderThreadSafety {
    public static void main(String[] args) {
        // Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer();

        // Creating multiple threads to manipulate StringBuffer
        Runnable stringBufferTask = () -> {
            for (int i = 0; i < 1000; i++) {
                stringBuffer.append("a");
            }
        };

        Runnable stringBufferTask2 = () -> {
            for (int i = 0; i < 1000; i++) {
                stringBuffer.append("b");
            }
        };        

        Thread thread1 = new Thread(stringBufferTask);
        Thread thread2 = new Thread(stringBufferTask2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("StringBuffer length: " + stringBuffer.length());
        System.out.println(stringBuffer.toString());

        // Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        // Creating multiple threads to manipulate StringBuilder
        Runnable stringBuilderTask = () -> {
            for (int i = 0; i < 1000; i++) {
                stringBuilder.append("a");
            }
        };

        Thread thread3 = new Thread(stringBuilderTask);
        Thread thread4 = new Thread(stringBuilderTask);

        thread3.start();
        thread4.start();

        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("StringBuilder length: " + stringBuilder.length());
    }
}
