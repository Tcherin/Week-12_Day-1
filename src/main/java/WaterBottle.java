public class WaterBottle {
    private int volume;

    public WaterBottle(int volume) {
    this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume() {
        this.volume = volume;
    }

    public void takeDrink() {
        this.volume = volume - 10;
    }

    public void empty() {
        this.volume = 0;
    }

    public void fill() {
        this.volume = 100;
    }
}