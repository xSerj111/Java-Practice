public class CarsAssemble {
    private static final int CARS_P_H = 221;

    public double productionRatePerHour(int speed) {
        if (speed < 5) {
            return CARS_P_H * speed;
        } else if (speed < 9) {
            return CARS_P_H * speed * 0.9;
        } else if (speed == 9) {
            return CARS_P_H * speed * 0.8;
        }
        else return CARS_P_H * speed * 0.77;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }
}
