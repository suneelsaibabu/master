package spring1;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topicObjects  {
	
	@RequestMapping("/topics")
	public List<topic> getAllTopics() {
		return Arrays.asList(
				new topic(101, "suneel", "hero"),
				new topic(102, "sumanth", "hero"),
				new topic(103, "sudhakar", "hero2")
				) ;
	} 
	
	
}
