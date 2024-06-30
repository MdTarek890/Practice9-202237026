
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AdvertisementBoard board=new AdvertisementBoard();
		board.show();
		board.setAdvertisement(new BlackLandCorp());
		board.show();
		board.setAdvertisement(new WhiteCloudCorp());
		board.show();
	}

}
