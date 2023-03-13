package Homework;

public class Bottle {
    private final int totalCapacity;
    private int availableLiquid;
    private boolean isOpen;

    public Bottle(int totalCapacity, int initialLiquid) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = initialLiquid;
        this.isOpen = false;
    }

    public boolean hasMoreLiquid() {
        return availableLiquid > 0;
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public int getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public String open() {
        if (isOpen) {
            return "Bottle is already open";
        } else {
            isOpen = true;
            return "Bottle is opened";
        }
    }

    public String close() {
        if (isOpen) {
            isOpen = false;
            return "Bottle is closed";
        } else {
            return "Bottle is already closed";
        }
    }

    public String drink(int amount) {
        if (!isOpen) {
            return "Bottle is closed";
        } else if (amount > availableLiquid) {
            return "Not enough liquid in the bottle";
        } else {
            availableLiquid -= amount;
            return "Drank " + amount + " ml from the bottle";
        }
    }
}

