package io.java.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<Topic>( Arrays.asList(
			new Topic(1, "topic1", "d1"),
			new Topic(2, "topic2", "d1"),
			new Topic(3, "topic3", "d1")				
			));

	public List<Topic> getAllTopics(){
		return topics;
	}
	public Topic getTopic(int id) {
		Topic t = null;
		for(int i = 0; i < topics.size(); i++) {
			Topic current = topics.get(i);
			if(current.getId() == id) {
				return current;
			}
		}
		return null;		
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	public void updateTopic(Topic topic, int id) {
		Topic t = null;
		for(int i = 0; i < topics.size(); i++) {
			Topic current = topics.get(i);
			if(current.getId() == id) {
				topics.set(i, topic);
				return;
			}
		}		
	}
	public void deleteTopic(int id) {
		int toRemove;
		for(int i = 0; i < topics.size(); i++) {
			Topic current = topics.get(i);
			if(current.getId() == id) {
				topics.remove(i);
				return;
			}
		}
	}
}
