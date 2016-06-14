package com.dreamersweekend.nemi;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.remote.FileDetector;
import org.openqa.selenium.remote.RemoteMouse;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import com.dreamersweekend.with.FindsWithClassName;
import com.dreamersweekend.with.FindsWithCssSelector;
import com.dreamersweekend.with.FindsWithId;
import com.dreamersweekend.with.FindsWithLinkText;
import com.dreamersweekend.with.FindsWithName;
import com.dreamersweekend.with.FindsWithTagName;
import com.dreamersweekend.with.FindsWithXPath;

public class NemiElement extends RemoteWebElement implements WebElementReloaded, FindsWithId,
FindsWithCssSelector, FindsWithClassName, FindsWithLinkText,
FindsWithName, FindsWithTagName, FindsWithXPath{

	private String foundBy;
	protected String id;
	protected RemoteWebDriver parent;
	protected RemoteMouse mouse;
	protected FileDetector fileDetector;

	protected void setFoundBy(SearchContext foundFrom, String locator, String term) {
		this.foundBy = String.format("[%s] -> %s: %s", foundFrom, locator, term);
	}

	@Override
	public NemiElement findElementWithXPath(String using) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NemiElement> findElementsWithXPath(String using) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NemiElement findElementWithTagName(String using) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NemiElement> findElementsWithTagName(String using) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NemiElement findElementWithName(String using) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NemiElement> findElementsWithName(String using) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NemiElement findElementWithLinkText(String using) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NemiElement> findElementsWithLinkText(String using) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NemiElement findElementWithPartialLinkText(String using) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NemiElement> findElementsWithPartialLinkText(String using) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NemiElement findElementWithClassName(String using) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NemiElement> findElementsWithClassName(String using) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NemiElement findElementWithCssSelector(String using) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NemiElement> findElementsWithCssSelector(String using) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NemiElement findElementWithId(String using) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NemiElement> findElementsWithId(String using) {
		// TODO Auto-generated method stub
		return null;
	}


}
