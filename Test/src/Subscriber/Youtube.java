package Subscriber;

public class Youtube {

	public static void main(String[] args) {

		Channel suneel=new Channel(); 
		
		Subscriber s1=new Subscriber("Suneel");
		Subscriber s2= new Subscriber("akshy");
		Subscriber s3=new Subscriber("shirish");
		
		System.out.println("suneel ");
		suneel.subscriber(s1);
		suneel.subscriber(s2);
		suneel.subscriber(s3);
		
		s1.subscribeChannel(suneel);
		s2.subscribeChannel(suneel);
		s3.subscribeChannel(suneel);
		
		
	}
}
