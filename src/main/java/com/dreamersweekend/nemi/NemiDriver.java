package com.dreamersweekend.nemi;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.Response;

import com.dreamersweekend.with.FindsWithClassName;
import com.dreamersweekend.with.FindsWithCssSelector;
import com.dreamersweekend.with.FindsWithId;
import com.dreamersweekend.with.FindsWithLinkText;
import com.dreamersweekend.with.FindsWithName;
import com.dreamersweekend.with.FindsWithTagName;
import com.dreamersweekend.with.FindsWithXPath;
import com.dreamersweekend.with.With;
import com.google.common.collect.ImmutableMap;

public class NemiDriver extends RemoteWebDriver implements WebDriverReloded, FindsWithClassName, FindsWithCssSelector,
FindsWithId, FindsWithLinkText, FindsWithName, FindsWithTagName, 
FindsWithXPath{

	public NemiDriver(Browser browser) {
		this(Nemi.getRemoteAddress(browser), Nemi.getDesiredCapabilities(browser),null);
	}

	public NemiDriver(Browser browser, DesiredCapabilities capabilities) {
		this(Nemi.getRemoteAddress(browser), capabilities, null);
	}


	private NemiDriver(URL remoteAddress, DesiredCapabilities desiredCapabilities, DesiredCapabilities requiredCapabilities) {
		super(remoteAddress,desiredCapabilities, requiredCapabilities);
	}


	public void quit() {
		try {
			execute(DriverCommand.QUIT);
		} finally {
			setSessionId(null);
			stopClient();
		}
		NemiFactory.stopService();
	}

	public NemiElement findElement(With with) {
		return with.findElement(this);
	}

	public List<NemiElement> findElements(With with) {
		return with.findElements(this);
	}

	public Collection<?> getAllLinks() {
		Collection<?> allLinks = (Collection<?>) Executor.execute(JSCommander.GET_ALL_LINKS);
		return allLinks.size()==0?new ArrayList<>():allLinks;
	}

	public Object scrollElementIntoView(NemiElement element) {
		return Executor.execute(JSCommander.SCROLL_ELEMENT_INTO_VIEW);
	}

	public Object scrollElementIntoViewIfNeeded(NemiElement element) {
		return Executor.execute(JSCommander.SCROLL_ELEMENT_INTO_VIEW_IF_NEEDED);
	}

	public long getAbsoluteHeight() {
		Long height = (Long) Executor.execute(JSCommander.GET_ABS_HEIGHT);
		return height;
	}

	@Override
	public NemiElement findElementWithXPath(String using) {
		return findElement("xpath", using);
	}

	@Override
	public List<NemiElement> findElementsWithXPath(String using) {
		return findNemiElements("xpath", using);
	}

	@Override
	public NemiElement findElementWithTagName(String using) {
		if (getW3CStandardComplianceLevel() == 0) {
			return findElement("tag name", using);
		} else {
			return findElementWithCssSelector(using);
		}
	}

	@Override
	public List<NemiElement> findElementsWithTagName(String using) {
		if (getW3CStandardComplianceLevel() == 0) {
			return findNemiElements("tag name", using);
		} else {
			return findElementsWithCssSelector(using);
		}
	}

	@Override
	public NemiElement findElementWithName(String using) {
		if (getW3CStandardComplianceLevel() == 0) {
			return findElement("name", using);
		} else {
			return findElementWithCssSelector("*[name='" + using + "']");
		}
	}

	@Override
	public List<NemiElement> findElementsWithName(String using) {
		if (getW3CStandardComplianceLevel() == 0) {
			return findNemiElements("name", using);
		} else {
			return findElementsWithCssSelector("*[name='" + using + "']");
		}
	}

	@Override
	public NemiElement findElementWithLinkText(String using) {
		return findElement("link text", using);
	}

	@Override
	public List<NemiElement> findElementsWithLinkText(String using) {
		return findNemiElements("link text", using);
	}

	@Override
	public NemiElement findElementWithPartialLinkText(String using) {
		return findElement("partial link text", using);
	}

	@Override
	public List<NemiElement> findElementsWithPartialLinkText(String using) {
		return findNemiElements("partial link text", using);
	}

	@Override
	public NemiElement findElementWithId(String using) {
		if (getW3CStandardComplianceLevel() == 0) {
			return findElement("id", using);
		} else {
			return findElementWithCssSelector("#" + cssEscape(using));
		}
	}

	@Override
	public List<NemiElement> findElementsWithId(String using) {
		if (getW3CStandardComplianceLevel() == 0) {
			return findNemiElements("id", using);
		} else {
			return findElementsWithCssSelector("#" + cssEscape(using));
		}
	}

	@Override
	public NemiElement findElementWithCssSelector(String using) {
		return findElement("css selector", using);
	}

	@Override
	public List<NemiElement> findElementsWithCssSelector(String using) {
		return findNemiElements("css selector", using);
	}

	@Override
	public NemiElement findElementWithClassName(String using) {
		if (getW3CStandardComplianceLevel() == 0) {
			return findElement("class name", using);
		} else {
			return findElementWithCssSelector("." + cssEscape(using));
		}
	}

	@Override
	public List<NemiElement> findElementsWithClassName(String using) {
		if (getW3CStandardComplianceLevel() == 0) {
			return findNemiElements("class name", using);
		} else {
			return findElementsWithCssSelector("." + cssEscape(using));
		}
	}

	static String cssEscape(String using) {
		using = using.replaceAll("(['\"\\\\#.:;,!?+<>=~*^$|%&@`{}\\-\\/\\[\\]\\(\\)])", "\\\\$1");
		if (using.length() > 0 && Character.isDigit(using.charAt(0))) {
			using = "\\" + Integer.toString(30 + Integer.parseInt(using.substring(0,1))) + " " + using.substring(1);
		}
		return using;
	}
	protected NemiElement findElement(String by, String using) {
		if (using == null) {
			throw new IllegalArgumentException("Cannot find elements when the selector is null.");
		}

		Response response = execute(DriverCommand.FIND_ELEMENT,
				ImmutableMap.of("using", by, "value", using));
		Object value = response.getValue();
		NemiElement element;
		try {
			element = (NemiElement) value;
		} catch (ClassCastException ex) {
			throw new WebDriverException("Returned value cannot be converted to NemiElement: " + value, ex);
		}
		setFoundBy(this, element, by, using);
		return element;
	}
	
	

	protected void setFoundBy(SearchContext context, NemiElement element, String by, String using) {
		if (element instanceof NemiElement) {
			((NemiElement) element).setFoundBy(context, by, using);
		}
	}

	@SuppressWarnings("unchecked")
	protected List<NemiElement> findNemiElements(String by, String using) {
		if (using == null) {
			throw new IllegalArgumentException("Cannot find elements when the selector is null.");
		}

		Response response = execute(DriverCommand.FIND_ELEMENTS,
				ImmutableMap.of("using", by, "value", using));
		Object value = response.getValue();
		List<NemiElement> allElements;
		try {
			allElements = (List<NemiElement>) value;
		} catch (ClassCastException ex) {
			throw new WebDriverException("Returned value cannot be converted to List<NemiElement>: " + value, ex);
		}
		for (NemiElement element : allElements) {
			setFoundBy(this, element, by, using);
		}
		return allElements;
	}

	static class Nemi {

		static DesiredCapabilities getDesiredCapabilities(Browser browser) {
			DesiredCapabilities dCapabilities = browser.getBrowser();
			return dCapabilities;
		}

		static URL getRemoteAddress(Browser browser) {
			URL remoteAddressUrl = NemiFactory.initService(browser);
			return remoteAddressUrl;
		}

	}

}
