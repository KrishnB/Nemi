package com.dreamersweekend.nemi;

public interface JSCommander {
	
	final String GET_ALL_LINKS = "return document.links";
	final String GET_ABS_HEIGHT = "return document.body.scrollHeight";
	final String GET_ABS_WIDTH = "return document.body.scrollWidth";
	final String SCROLL_ELEMENT_INTO_VIEW = "return arguments[0].scrollIntoView()";
	final String SCROLL_ELEMENT_INTO_VIEW_IF_NEEDED = "return arguments[0].scrollIntoViewIfNeeded()";
	

}
