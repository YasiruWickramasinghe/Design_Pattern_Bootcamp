package _3_Behavioral_Design_Patterns._5_Observer_Pattern.Pattern_Code;

public class ObserverApplication {

	public static void main(String[] args) {
		NewsAgency observable = new NewsAgency();
		NewsChannel observer = new NewsChannel();

		observable.addObserver(observer);
		observable.setNews("news");
		System.out.println(observer.getNews());
	}

}
