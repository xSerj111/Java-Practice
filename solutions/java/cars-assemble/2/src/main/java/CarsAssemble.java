public class CarsAssemble {
    private static final int CARS_PER_HOUR_SPEED_1= 221;

    public double productionRatePerHour(int speed) {

        double productionRate = CARS_PER_HOUR_SPEED_1 * speed;
        
        if (speed < 5) {
            return productionRate;
        } else if (speed < 9) {
            return productionRate * 0.9;
        } else if (speed == 9) {
            return productionRate * 0.8;
        }
        else return productionRate * 0.77;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }
}
