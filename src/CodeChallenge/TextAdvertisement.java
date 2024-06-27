package CodeChallenge;

public class TextAdvertisement extends Advertisement
{
    private int noOfCharacters;
	public int getNoOfCharacters() {
		return noOfCharacters;
	}
 
	public void setNoOfCharacters(int noOfCharacters) {
		this.noOfCharacters = noOfCharacters;
	}
 
	public TextAdvertisement(int advertisementId, String priority, int noOfDays, String clientName,
			int noOfCharacters) {
		super(advertisementId, priority, noOfDays, clientName);
		this.noOfCharacters = noOfCharacters;
	}
    public float calculateAdvertisementCharge(float baseCost){
        return baseCost * (float)noOfCharacters * (float)noOfDays;
    }


}