
class ThreadRun extends Thread {
    private int baseSalary;

    public ThreadRun(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    public int getSalary() {
        return baseSalary;
    }
    public int getBonus() {
        return baseSalary + (baseSalary * 5) / 100;
    }
    public void run() {
        int count = 0;
        while (count < 5) {
            count++;
            try {
                System.out.println("Get Salary: " + getSalary());
                System.out.println("Get Bonus: " + getBonus());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Thread thread1 = new ThreadRun(500000);
        thread1.start();
    }
}
