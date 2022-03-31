package model.computer;

public class PC extends Computer {

    private boolean isPowerSupply;

    public PC(String name, String type, Hdd hdd, Ram ram) {
        super(name, type, hdd, ram);
        isPowerSupply = false;
    }

    public boolean isPowerSupply() {
        return isPowerSupply;
    }

    public void setPowerSupply(boolean powerSupply) {
        isPowerSupply = powerSupply;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    public int volumeUp() {
        return volumeLevel += 1;
    }

    @Override
    public int volumeUp(int newVolumeLevel) {
        volumeLevel = volumeLevel + newVolumeLevel;
        if (volumeLevel >= 100) {
            volumeLevel = 100;
        }
        return volumeLevel;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int newVolumeLevel) {
        volumeLevel = volumeLevel - newVolumeLevel;
        if (volumeLevel <= 0) {
            volumeLevel = 0;
        }
        return volumeLevel;
    }


    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isPowerSupply) {
            super.switchOn();
        } else {
            System.out.println("Power supply missing!");
        }
    }

//    @Override
//    public void switchOff() {
//        System.out.println("Wyłączam PC: " + name);
//        state = false;
//    }
}
