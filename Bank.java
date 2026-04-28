public class Bank {
    private final int baseSalary;

    public Bank(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getSalary() {
        return baseSalary;
    }

    public int getBonus() {
        return baseSalary + (baseSalary * 5) / 100;
    }
    public static void main(String[] args) {
        Bank bank1 = new Bank(500000);
        Thread thread1 = new Thread(() -> {
            int count = 1;
            while (count < 6) {
                count++;
                try {
                    System.out.println("Salary: " + bank1.getSalary());
                    System.out.println("Bonus: " + bank1.getBonus());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });
        thread1.start();
    }
}
