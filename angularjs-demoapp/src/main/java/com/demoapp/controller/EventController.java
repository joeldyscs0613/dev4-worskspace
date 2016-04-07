package com.demoapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demoapp.model.EventModel;
import com.demoapp.model.SessionModel;

@RestController
@RequestMapping("data/event/")
public class EventController {

	/*@RequestMapping(value= "1", method = RequestMethod.GET)
	public EventModel getEvent() {
		//return ShipwreckStub.list();
		List <SessionModel> sessions = new ArrayList<SessionModel>();
		sessions.add(new SessionModel(1L,"Directive Masterclass", "Bob Smith", "1 hours", "Advanced", "In this session you will learn about directives."));
		sessions.add(new SessionModel(2L, "Scopes for fun", "John Doe", "2 hours", "Introductory", "In this session you will learn about scopes."));
		sessions.add(new SessionModel(3L, "Well Behaved Controller","Jane Doe", "3 hours", "Intermidiate", "In this session you will learn about controllers."));
		return new EventModel(1L, "Test Event", "01-01-13", "10 AM", 
				new LocationModel("Test Address", "Test City", "NY"), "/img/angularjs-logo.png", sessions);
	}*/
	
	
	/*@RequestMapping(value= "shipwrecks", method = RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck shipwreck) {
		//return ShipwreckStub.create(shipwreck);
		return shipwreckRepository.saveAndFlush(shipwreck);
	}
	
	@RequestMapping(value= "shipwrecks/{id}", method = RequestMethod.GET)
	public Shipwreck get(@PathVariable Long id) {
		//return ShipwreckStub.get(id);
		return shipwreckRepository.findOne(id);
	}*/
	

	@RequestMapping(value= "events", method = RequestMethod.GET)
	public List<EventModel> getAllEvents() {
		return EventModelStub.getAllEvents();
		//return shipwreckRepository.findOne(id);
	}
	
	@RequestMapping(value= "{id}", method = RequestMethod.GET)
	public EventModel get(@PathVariable Long id) {
		return EventModelStub.get(id);
		//return shipwreckRepository.findOne(id);
	}
	
	@RequestMapping(value= "createEvent", method = RequestMethod.POST)
	public EventModel create(@RequestBody EventModel event) {
		return EventModelStub.create(event);
		//return shipwreckRepository.saveAndFlush(shipwreck);
	}
	
	
	@RequestMapping(value= "createSession/{id}", method = RequestMethod.POST)
	public SessionModel createSession(@PathVariable Long id, @RequestBody SessionModel session) {
		return EventModelStub.addSession(id, session);
		//return shipwreckRepository.saveAndFlush(shipwreck);
	}
	
	@RequestMapping(value= "addVote/{sessionId}", method = RequestMethod.PUT)
	public EventModel addVote(@PathVariable int sessionId) {
		return EventModelStub.upSessionVote(1L, sessionId);
		//return shipwreckRepository.findOne(id);
	}
	
	@RequestMapping(value= "removeVote/{sessionId}", method = RequestMethod.PUT)
	public EventModel removeVote(@PathVariable int sessionId) {
		return EventModelStub.downSessionVote(1L, sessionId);
		//return shipwreckRepository.findOne(id);
	}
	
	@RequestMapping(value= "1", method = RequestMethod.PUT)
	public EventModel update(@PathVariable long id, @RequestBody EventModel event) {
		return EventModelStub.update(id, event);
		/*EventModel existingEvent = shipwreckRepository.findOne(id);
		if(existingShipwreck != null) {
			BeanUtils.copyProperties(shipwreck, existingShipwreck);
			return shipwreckRepository.saveAndFlush(existingShipwreck);
		}	
		return shipwreckRepository.saveAndFlush(shipwreck);*/
	}
	
	/*@RequestMapping(value= "shipwrecks/{id}", method = RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable long id) {
		//return ShipwreckStub.delete(id);
		
		Shipwreck existingShipwreck = shipwreckRepository.findOne(id);
		shipwreckRepository.delete(existingShipwreck);
		return existingShipwreck;
	}*/
}
