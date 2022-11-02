package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("Get your sensors right.");
        } else {
            int sum = 0;
            for (Sensor sensor : sensors) {
                sum += sensor.read();
            }
            
            int avg = sum / (this.sensors.size());
            readings.add(avg);

            return avg;
        }
    }
    
    public List<Integer> readings() {
        return readings;
    }
}
