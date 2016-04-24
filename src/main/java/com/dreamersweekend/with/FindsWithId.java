package com.dreamersweekend.with;

import java.util.List;

import com.dreamersweekend.nemi.NemiElement;

public interface FindsWithId {
	 NemiElement findElementWithId(String using);

	  List<NemiElement> findElementsWithId(String using);
}
