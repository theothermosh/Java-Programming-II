package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean on = false;
    private int number;

    public TemperatureSensor() {
    }
    
    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void setOn() {
        this.on = true;
    }

    @Override
    public void setOff() {
        this.on = false;
    }

    @Override
    public int read() {
        if (on) {
            Random rand = new Random();
            return rand.nextInt(60) - 30;
        } else {
            throw new IllegalStateException("Sensor is off.");
        }
    }
    
}
