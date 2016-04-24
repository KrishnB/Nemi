package com.dreamersweekend.with;

import java.util.List;

import com.dreamersweekend.nemi.NemiElement;

public interface FindsWithXPath {
	NemiElement findElementWithXPath(String using);

	List<NemiElement> findElementsWithXPath(String using);
}
