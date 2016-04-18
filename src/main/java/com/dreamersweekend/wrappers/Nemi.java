package com.dreamersweekend.wrappers;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Nemi provides you with handy functions to be used in automation.
 * @author 12Petals
 *
 */
public class Nemi {
	
	public Collection<?> getAllLinks() {
		Collection<?> allLinks = (Collection<?>) Executor.execute(JSCommand.GET_ALL_LINKS);
		return allLinks.size()==0?new ArrayList<>():allLinks;
	}
	
	
	
	
}
