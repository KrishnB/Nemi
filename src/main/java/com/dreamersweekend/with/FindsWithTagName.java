package com.dreamersweekend.with;

import java.util.List;

import com.dreamersweekend.nemi.NemiElement;

public interface FindsWithTagName {
	NemiElement findElementWithTagName(String using);

	List<NemiElement> findElementsWithTagName(String using);
}
