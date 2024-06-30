
public class AdvertisementBoard {

	
	
	Advertisement adver;
	public void setAdvertisement (Advertisement adver) {
	this.adver = adver;
	}
	public void show () {
	if(adver == null) 
	System.out. println("In the process of advertising investt prtion");
	
	else	adver. showAdvertisement();

}
}