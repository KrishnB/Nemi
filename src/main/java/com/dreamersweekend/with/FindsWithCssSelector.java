package com.dreamersweekend.with;

import java.util.List;

import com.dreamersweekend.nemi.NemiElement;

public interface FindsWithCssSelector {
	NemiElement findElementWithCssSelector(String using);

	  List<NemiElement> findElementsWithCssSelector(String using);
}
