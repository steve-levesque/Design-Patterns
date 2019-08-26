/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Observer;

import java.util.HashMap;

class Notifier {
	private HashMap<String, Event> listeners;
	
	Notifier() {
		listeners = new HashMap<String, Event>();
	}
	
	public void active(String eventInfo, Event event) {
		listeners.put(eventInfo, event);
	}
	
	public void inactive(String eventInfo, Event event) {
		listeners.remove(eventInfo, event);
	}
	
	public void notifyBoard(String eventInfo, String eventMessage) {
		int counter = 0;
		for (HashMap.Entry<String, Event> listener : listeners.entrySet()) {
			counter++;
			String key = listener.getKey();
			Event value = listener.getValue();
			if (listener.getKey() == key) {
				value.update(eventMessage);
			}
		}
	}
}
