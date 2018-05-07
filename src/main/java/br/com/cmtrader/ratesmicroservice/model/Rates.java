package br.com.cmtrader.ratesmicroservice.model;

/**
 * Product
 */
public class Rates{

    private String time;
    private String open;
	private String high;
	private String low;
	private String close;
	
	public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getOpen() {
        return open;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getHigh() {
        return high;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getLow() {
        return low;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getClose() {
        return close;
    }

    @Override
    public String toString() {
        return "Rates [time=" + time + ", open=" + open + ", high=" + high + ", low"+ low + "close=" + close + "]";
    }
       
}