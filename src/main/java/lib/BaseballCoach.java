package lib;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService=thefortuneService;
	}
	
	
	public String getDailyCoach() {
	
		return "Daily Coach";
	}
	public String getFortuneCoach() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyService();
	}
	

}
