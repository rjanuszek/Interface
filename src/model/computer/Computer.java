package model.computer;

import java.util.Objects;

abstract public class Computer {

    //    1. Pola obiektu
    protected String name;
    protected String type;
    protected Hdd hdd;
    protected Ram ram;
    protected boolean state;
    protected int volumeLevel;

    //    2. Konstruktor
    public Computer(String name, String type, Hdd hdd, Ram ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.state = false;
        this.volumeLevel = 0;

    }

    //    3. Gettery i Settery
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void switchOn() {
        System.out.println("SUPER - ustawiam pole state na true");
        state = true;
    }

    public void switchOff() {
        System.out.println("Wyłączam komputer: " + name);
        state = false;
    }

    public boolean getSate() {
        return state;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public abstract int volumeUp();

    public abstract int volumeUp(int newVolumeLevel);

    public abstract int volumeDown();

    public abstract int volumeDown(int newVolumeLevel);

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", state=" + state +
                ", volumeLevel=" + volumeLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return state == computer.state && volumeLevel == computer.volumeLevel && Objects.equals(name, computer.name) && Objects.equals(type, computer.type) && Objects.equals(hdd, computer.hdd) && Objects.equals(ram, computer.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, hdd, ram, state, volumeLevel);
    }




}
