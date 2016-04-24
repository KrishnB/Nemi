package com.dreamersweekend.with;

import java.util.List;

import com.dreamersweekend.nemi.NemiElement;

public interface FindsWithLinkText {
	NemiElement findElementWithLinkText(String using);

	List<NemiElement> findElementsWithLinkText(String using);

	NemiElement findElementWithPartialLinkText(String using);

	List<NemiElement> findElementsWithPartialLinkText(String using);
}
