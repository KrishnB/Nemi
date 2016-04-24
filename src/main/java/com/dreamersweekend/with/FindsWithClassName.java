package com.dreamersweekend.with;

import java.util.List;

import com.dreamersweekend.nemi.NemiElement;

public interface FindsWithClassName {
	 NemiElement findElementWithClassName(String using);

	  List<NemiElement> findElementsWithClassName(String using);
}
