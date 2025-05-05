package Homework4;

public interface Dimmable {
    int MAX_BRIGHTNESS = 100;
    void setBrightness(int brightness);
    int getBrightness();
    void dimToHalf();
}
