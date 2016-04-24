package com.dreamersweekend.with;

import java.util.List;

import com.dreamersweekend.nemi.NemiElement;

public interface FindsWithName {
	NemiElement findElementWithName(String using);

	List<NemiElement> findElementsWithName(String using);
}
