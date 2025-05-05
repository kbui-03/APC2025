package Homework4;

public class Lamp implements Switchable, Dimmable {
    private boolean on;
    private int brightness;

    public Lamp() {
        this.on = false;
        this.brightness = 0;
    }
    @Override
    public void turnOn() {
        this.on = true;
        this.brightness = MAX_BRIGHTNESS; // Set to max brightness when turned on
    }
    @Override 
    public void turnOff() {
        this.on = false;
        this.brightness = 0; // Reset brightness when turned off
    }
    @Override
    public boolean isOn() {
        return this.on;
    }
    @Override
    public void setBrightness(int brightness) {
        if (on) this.brightness = brightness;
    }
    @Override
    public int getBrightness() {
        return this.brightness;
    }
    @Override
    public void dimToHalf() {
        if (on) this.brightness = MAX_BRIGHTNESS / 2;
    }
}
