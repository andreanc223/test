package Model;

/**
 * Created by acuro on 4/7/16.
 */
public class Properties {

    private boolean DEBUG;

    private String logLevel;

    public Properties(boolean DEBUG, String logLevel) {
        this.DEBUG = DEBUG;
        this.logLevel = logLevel;
    }

    public boolean isDEBUG() {
        return DEBUG;
    }

    public void setDEBUG(boolean DEBUG) {
        this.DEBUG = DEBUG;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

}
