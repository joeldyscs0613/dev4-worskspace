package com.demoapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demoapp.model.EventModel;
import com.demoapp.model.LocationModel;

@RestController
@RequestMapping("data/event/")
public class EventController {

	@RequestMapping(value= "1", method = RequestMethod.GET)
	public EventModel getEvent() {
		//return ShipwreckStub.list();
		return new EventModel( "Test Event", "01-01-13", "10 AM", new LocationModel("Test Address", "Test City", "NY"), "/img/angularjs-logo.png");
	}
	
	
	/*@RequestMapping(value= "shipwrecks", method = RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck shipwreck) {
		//return ShipwreckStub.create(shipwreck);
		return shipwreckRepository.saveAndFlush(shipwreck);
	}
	
	@RequestMapping(value= "shipwrecks/{id}", method = RequestMethod.GET)
	public Shipwreck get(@PathVariable Long id) {
		//return ShipwreckStub.get(id);
		return shipwreckRepository.findOne(id);
	}
	
	@RequestMapping(value= "shipwrecks/{id}", method = RequestMethod.PUT)
	public Shipwreck update(@PathVariable long id, @RequestBody Shipwreck shipwreck) {
		//return ShipwreckStub.update(id, shipwreck);
		Shipwreck existingShipwreck = shipwreckRepository.findOne(id);
		if(existingShipwreck != null) {
			BeanUtils.copyProperties(shipwreck, existingShipwreck);
			return shipwreckRepository.saveAndFlush(existingShipwreck);
		}	
		return shipwreckRepository.saveAndFlush(shipwreck);
	}
	
	@RequestMapping(value= "shipwrecks/{id}", method = RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable long id) {
		//return ShipwreckStub.delete(id);
		
		Shipwreck existingShipwreck = shipwreckRepository.findOne(id);
		shipwreckRepository.delete(existingShipwreck);
		return existingShipwreck;
	}*/
}
