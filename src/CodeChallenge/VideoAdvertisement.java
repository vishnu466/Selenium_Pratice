package CodeChallenge;

public class VideoAdvertisement extends Advertisement
{
    private int duration;  
    public VideoAdvertisement(int advertisementId, String priority, int no_of_days, String clientName, int duration) {
		super(advertisementId, priority, no_of_days,clientName);
		this.duration = duration;
	}
    public int getDuration() {
		return duration;
	}
 
    public void setDuration(int duration) {
		this.duration = duration;
	}
 
    public float calculateAdvertisementCharge(float baseCost){
        return baseCost * (float)duration * (float)noOfDays;
    }
    

}