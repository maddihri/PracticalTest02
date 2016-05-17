package ro.pub.cs.systems.pdsd.practicaltest02;

public class CustomValue {

    private String value;
    private int time;

    public CustomValue() {
        this.value = null;
        this.time = 0;
    }

    public CustomValue(String value, int time) {
        this.value = value;
        this.time = time;
    }

    public void setValue(String value) {
        this.value =value;
    }

    public String getValue() {
        return value;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }
}

