package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	@GetMapping("filterring")	//field1 , field2
	public MappingJacksonValue filtering() {
		SomeBean someBean = new SomeBean("value1", "value2", "value3");
		MappingJacksonValue jacksonValue = new MappingJacksonValue(someBean);
		addDynamicFilter(jacksonValue, "field1", "field2");
		return jacksonValue;
	}
	
	@GetMapping("filterring-list")	// field2 , field3
	public MappingJacksonValue filteringList() {
		List<SomeBean> list = List.of(new SomeBean("value1", "value2", "value3"),
				new SomeBean("value4", "value5", "value6"),
				new SomeBean("value7", "value8", "value9"));
		MappingJacksonValue jacksonValue = new MappingJacksonValue(list);
		addDynamicFilter(jacksonValue, "field2", "field3");
		return jacksonValue;
	}
	
	private void addDynamicFilter(MappingJacksonValue mappingJacksonValue, String... args ) {
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(args);
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		mappingJacksonValue.setFilters(filters );
	}
}
