class Battery {
    double currentCapacity;
    double upperLimit;
    double lowerLimit;

    public Battery(double currentCapacity, double lowerLimit, double upperLimit) {
        this.currentCapacity = currentCapacity;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    void charge(double amount) {
        if (currentCapacity + amount <= upperLimit) {
            currentCapacity += amount;
        } else {
            currentCapacity = upperLimit;
        }
    }

    void discharge(double amount) {
        if (currentCapacity - amount >= lowerLimit) {
            currentCapacity -= amount;
        } else {
            currentCapacity = lowerLimit;
        }
    }

    void viewBatteryLevel() {
        System.out.println("Current charge: " + currentCapacity + "%");
    }
}

public class Mainclass5 {
    public static void main(String[] args) {
        System.out.println("Main method started ==============================");
        Battery b1 = new Battery(20.5, 56.8, 85.84);
        b1.charge(20.5);
        b1.discharge(80.5);
        b1.viewBatteryLevel();

        System.out.println("Main method ended ==================================");
    }
}
