public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    // simulates the actual display
    private String meridian;         // AM or PM

    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 12:00 AM.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {
            hours.increment();
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and minute.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM AM/PM.
     */
    public String getTime()
    {
        return displayString;
    }

    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        int hourValue = hours.getValue();
        int displayHour;

        if (hourValue == 0) {
            displayHour = 12;
            meridian = "AM";
        } else if (hourValue < 12) {
            displayHour = hourValue;
            meridian = "AM";
        } else if (hourValue == 12) {
            displayHour = 12;
            meridian = "PM";
        } else {
            displayHour = hourValue - 12;
            meridian = "PM";
        }

        String hourString = (displayHour < 10) ? "0" + displayHour : "" + displayHour;
        displayString = hourString + ":" + minutes.getDisplayValue() + " " + meridian;
    }
}