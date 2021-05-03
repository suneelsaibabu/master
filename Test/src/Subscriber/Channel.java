package Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Channel {

	List<Subscriber> subs = new ArrayList<Subscriber>();
	private String title;

	public void subscriber(Subscriber sub) {
		subs.add(sub);
	}

	public void unSubscriber(Subscriber sub) {
		subs.remove(sub);
	}

	public void notifySub() {
		for (Subscriber s : subs) {
			s.update();
		}
	}
	
	public void upload(String title)
	{
		this.title=title;
		notifySub();
	}
}
