//  Nama    : Adeline Fellita Marwa
//  NIM     : M0521002

class MyThread extends Thread {
    int length;
    String marker;

    public MyThread(int length, String marker){
        this.length = length;
        this.marker = marker;

        var mainThread = Thread.currentThread().getName();
        System.out.println(this.getName() + " is created on " + mainThread);
    }

    @Override
    public void run(){
        int count = 0;
        while(count < length){
            Thread.sleep(1000);

            count++;
            var progressString = getProgress(count, marker);
            System.out.println(this.getName() + ": " + progressString);
        }
    }

    private String getProgress(int count, String marker){
        var result = "";
        for(int i=0; i<count; i++){
            result+=marker;
        }

        return result;
    }
}

public class PPBO_11_Latihan1 {
    public static void main(String[] args) {
        System.out.println("Hello from thread '" + Thread.currentThread().getName() + "'\n");

        var thread1 = new MyThread(10, "#");
        var thread2 = new MyThread(5, ">");

        thread1.start();

        Thread.sleep(1500);

        thread2.start();
    }
}

/* 
 * Jawablah pertanyaan berikut
 * 1. Jelaskan mengapa program di atas tidak bisa dijalankan (memiliki error/exception)
 *    Jawab : karena tidak ada InteruptedException pada saat menggugnakan fungsi sleep()
 * 
 * 
 * 2. Jelaskan dan terapkan bagaimana cara mengatasinya. Kemudian, kumpulkan program dalam keadaan sudah bisa dijalankan
 *    Jawab : bisa menggunakan try catch untuk menghandle InteruptedException.
 * 
 * 
 * 3. Jelaskan secara singkat algoritma program di atas
 *    Jawab : Program ini membuat 2 thread baru (thread-0 dan thread-1)
 *            thread-0 mencetak # sebanyak i=1 sampai i=10 kali, dengan mencetak i kali # setiap perulangan,
 *            thread-1 mencetak > sebanyak i=1 sampai i=5  kali, dengan mencetak i kali > setiap perulangan. 
*/