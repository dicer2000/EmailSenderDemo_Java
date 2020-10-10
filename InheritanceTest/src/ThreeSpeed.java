

class ThreeSpeed extends Bicycle {

    private boolean hasBasket;

    public int WHEEL_COUNT = 3;

    public ThreeSpeed(int gear, int speed, boolean hasBikeBasket) {
        super(gear, speed);
        hasBasket = hasBikeBasket;
    }

    @Override
    public String toString() {
        return(super.toString() + "\nHas basket: " + hasBasket);
    }

}