package island.Tile;

import java.awt.Color;

public class River {
    
    private final Color color = new Color(1, 64, 98);
    private int discharge;
    private int humidity;

    public River(int dischargeLevel) {
        discharge = dischargeLevel;
    }

    public String getColor(){
        return String.valueOf(this.color.getRed()) + "," + String.valueOf(this.color.getGreen()) + "," + String.valueOf(this.color.getBlue());
    }

    public int getHumidity(){
        return this.humidity;
    }

    public void setHumidity(int val){
        this.humidity = val;
    }

    public int getDischarge(){
        return this.discharge;
    }

    public void setDischarge(int val){
        this.discharge = val;
    }

}
