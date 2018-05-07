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
    private String tickVolume;
    private String spread;
    private String realVolume;


	
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

    
	/**
	 * @return the tickVolume
	 */
	public String getTickVolume() {
		return tickVolume;
	}

	/**
	 * @param tickVolume the tickVolume to set
	 */
	public void setTickVolume(String tickVolume) {
		this.tickVolume = tickVolume;
	}

	/**
	 * @return the spread
	 */
	public String getSpread() {
		return spread;
	}

	/**
	 * @param spread the spread to set
	 */
	public void setSpread(String spread) {
		this.spread = spread;
	}
    
    @Override
    public String toString() {
        return "Rates [time=" + time + ", open=" + open + 
        ", high=" + high + ", low"+ low + "close=" + close + 
        "tick_volume" + tickVolume + "spread" + spread + "real_volume" + realVolume + "]";
    }
}