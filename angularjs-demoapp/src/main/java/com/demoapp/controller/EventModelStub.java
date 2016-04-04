package com.demoapp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.demoapp.model.EventModel;
import com.demoapp.model.LocationModel;
import com.demoapp.model.SessionModel;

public class EventModelStub {
	private static Map<Long, EventModel> events = new HashMap<Long, EventModel>();
	private static Long idIndex = 3L;

	//populate initial wrecks
	private static List <SessionModel> sessions = new ArrayList<SessionModel>();
	
	static {
		sessions.add(new SessionModel(sessions.size(), "Directive Masterclass", "bob Smith", 1, "Advanced", "In this session you will learn about directives."));
		sessions.add(new SessionModel(sessions.size(), "Scopes for fun", "john Doe", 2, "Introductory", "In this session you will learn about scopes."));
		sessions.add(new SessionModel(sessions.size(), "A Well Behaved Controller","Jane Doe", 3, "Intermidiate", "In this session you will learn about controllers."));
		sessions.add(new SessionModel(sessions.size(), "Services","Papa Doe", 4, "Intermidiate", "In this session you will learn about services."));
		EventModel a = new EventModel( 1L, "Test Event", "01-01-13", "10 AM", 
				new LocationModel("Test Address", "Test City", "NY"), "/img/angularjs-logo.png", 149.99, sessions);
		events.put(1L, a);
		/*Shipwreck b = new Shipwreck(2L, "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 44.12, 138.44, 1994);
		events.put(2L, b);
		Shipwreck c = new Shipwreck(3L, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50, 44.12, 138.44, 1994);
		events.put(3L, c);*/
	}

	public static List<EventModel> list() {
		return new ArrayList<EventModel>(events.values());
	}

	public static EventModel create(EventModel event) {
		idIndex += idIndex;
		event.setId(idIndex);
		events.put(idIndex, event);
		return event;
	}

	public static EventModel get(Long id) {
		return events.get(id);
	}

	public static EventModel update(Long id, EventModel event) {
		events.put(id, event);
		return event;
	}

	public static EventModel delete(Long id) {
		return events.remove(id);
	}
	
	public static EventModel upSessionVote(Long id, int sessionId) {
		EventModel event = get(id);
		if(event != null) {
			event.getSessions().get(sessionId).upSessionVote();
		}
		return event;
	}
	public static EventModel downSessionVote(Long id, int sessionId) {
		EventModel event = get(id);
		if(event != null) {
			event.getSessions().get(sessionId).downSessionVote();
		}
		return event;
	}
}
