package com.dreamersweekend.with;

import java.io.Serializable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByTagName;

import com.dreamersweekend.nemi.NemiElement;


public abstract class With {
	
	  public static With id(final String id) {
	    if (id == null)
	      throw new IllegalArgumentException(
	          "Cannot find elements with a null id attribute.");

	    return new WithId(id);
	  }

	  public static With linkText(final String linkText) {
	    if (linkText == null)
	      throw new IllegalArgumentException(
	          "Cannot find elements when link text is null.");

	    return new WithLinkText(linkText);
	  }

	  public static With partialLinkText(final String linkText) {
	    if (linkText == null)
	      throw new IllegalArgumentException(
	          "Cannot find elements when link text is null.");

	    return new WithPartialLinkText(linkText);
	  }

	  public static With name(final String name) {
	    if (name == null)
	      throw new IllegalArgumentException(
	          "Cannot find elements when name text is null.");

	    return new WithName(name);
	  }

	  public static With tagName(final String name) {
	    if (name == null)
	      throw new IllegalArgumentException(
	          "Cannot find elements when name tag name is null.");

	    return new WithTagName(name);
	  }

	  public static With xpath(final String xpathExpression) {
	    if (xpathExpression == null)
	      throw new IllegalArgumentException(
	          "Cannot find elements when the XPath expression is null.");

	    return new WithXPath(xpathExpression);
	  }

	  public static With className(final String className) {
	    if (className == null)
	      throw new IllegalArgumentException(
	          "Cannot find elements when the class name expression is null.");

	    return new WithClassName(className);
	  }

	  public static With cssSelector(final String selector) {
	    if (selector == null)
	      throw new IllegalArgumentException(
	          "Cannot find elements when the selector is null");

	    return new WithCssSelector(selector);

	  }

	  public NemiElement findElement(SearchContext context) {
	    List<NemiElement> allElements = findElements(context);
	    if (allElements == null || allElements.isEmpty())
	      throw new NoSuchElementException("Cannot locate an element using "
	          + toString());
	    return allElements.get(0);
	  }

	  /**
	   * Find many elements.
	   *
	   * @param context A context to use to find the element
	   * @return A list of WebElements matching the selector
	   */
	  public abstract List<NemiElement> findElements(SearchContext context);

	  @Override
	  public boolean equals(Object o) {
	    if (this == o)
	      return true;
	    if (o == null || getClass() != o.getClass())
	      return false;

	    By by = (By) o;

	    return toString().equals(by.toString());
	  }

	  @Override
	  public int hashCode() {
	    return toString().hashCode();
	  }

	  @Override
	  public String toString() {
	    // A stub to prevent endless recursion in hashCode()
	    return "[unknown locator]";
	  }

	  public static class WithId extends With implements Serializable {

	    private static final long serialVersionUID = 5341968046120372169L;

	    private final String id;

	    public WithId(String id) {
	      this.id = id;
	    }

	    @Override
	    public List<NemiElement> findElements(SearchContext context) {
	      if (context instanceof FindsWithId)
	        return ((FindsWithId) context).findElementsWithId(id);
	      return ((FindsWithXPath) context).findElementsWithXPath(".//*[@id = '" + id
	          + "']");
	    }

	    @Override
	    public NemiElement findElement(SearchContext context) {
	      if (context instanceof FindsWithId)
	        return ((FindsWithId) context).findElementWithId(id);
	      return ((FindsWithXPath) context).findElementWithXPath(".//*[@id = '" + id
	          + "']");
	    }

	    @Override
	    public String toString() {
	      return "With.id: " + id;
	    }
	  }

	  public static class WithLinkText extends With implements Serializable {

	    private static final long serialVersionUID = 1967414585359739708L;

	    private final String linkText;

	    public WithLinkText(String linkText) {
	      this.linkText = linkText;
	    }

	    @Override
	    public List<NemiElement> findElements(SearchContext context) {
	      return ((FindsWithLinkText) context).findElementsWithLinkText(linkText);
	    }

	    @Override
	    public NemiElement findElement(SearchContext context) {
	      return ((FindsWithLinkText) context).findElementWithLinkText(linkText);
	    }

	    @Override
	    public String toString() {
	      return "With.linkText: " + linkText;
	    }
	  }

	  public static class WithPartialLinkText extends With implements Serializable {

	    private static final long serialVersionUID = 1163955344140679054L;

	    private final String linkText;

	    public WithPartialLinkText(String linkText) {
	      this.linkText = linkText;
	    }

	    @Override
	    public List<NemiElement> findElements(SearchContext context) {
	      return ((FindsWithLinkText) context)
	          .findElementsWithPartialLinkText(linkText);
	    }

	    @Override
	    public NemiElement findElement(SearchContext context) {
	      return ((FindsWithLinkText) context).findElementWithPartialLinkText(linkText);
	    }

	    @Override
	    public String toString() {
	      return "With.partialLinkText: " + linkText;
	    }
	  }

	  public static class WithName extends With implements Serializable {

	    private static final long serialVersionUID = 376317282960469555L;

	    private final String name;

	    public WithName(String name) {
	      this.name = name;
	    }

	    @Override
	    public List<NemiElement> findElements(SearchContext context) {
	      if (context instanceof FindsWithName)
	        return ((FindsWithName) context).findElementsWithName(name);
	      return ((FindsWithXPath) context).findElementsWithXPath(".//*[@name = '"
	          + name + "']");
	    }

	    @Override
	    public NemiElement findElement(SearchContext context) {
	      if (context instanceof FindsWithName)
	        return ((FindsWithName) context).findElementWithName(name);
	      return ((FindsWithXPath) context).findElementWithXPath(".//*[@name = '"
	          + name + "']");
	    }

	    @Override
	    public String toString() {
	      return "With.name: " + name;
	    }
	  }

	  public static class WithTagName extends With implements Serializable {

	    private static final long serialVersionUID = 4699295846984948351L;

	    private final String name;

	    public WithTagName(String name) {
	      this.name = name;
	    }

	    @Override
	    public List<NemiElement> findElements(SearchContext context) {
	      if (context instanceof FindsByTagName)
	        return ((FindsWithTagName) context).findElementsWithTagName(name);
	      return ((FindsWithXPath) context).findElementsWithXPath(".//" + name);
	    }

	    @Override
	    public NemiElement findElement(SearchContext context) {
	      if (context instanceof FindsWithTagName)
	        return ((FindsWithTagName) context).findElementWithTagName(name);
	      return ((FindsWithXPath) context).findElementWithXPath(".//" + name);
	    }

	    @Override
	    public String toString() {
	      return "By.tagName: " + name;
	    }
	  }

	  public static class WithXPath extends With implements Serializable {

	    private static final long serialVersionUID = -6727228887685051584L;

	    private final String xpathExpression;

	    public WithXPath(String xpathExpression) {
	      this.xpathExpression = xpathExpression;
	    }

	    @Override
	    public List<NemiElement> findElements(SearchContext context) {
	      return ((FindsWithXPath) context).findElementsWithXPath(xpathExpression);
	    }

	    @Override
	    public NemiElement findElement(SearchContext context) {
	      return ((FindsWithXPath) context).findElementWithXPath(xpathExpression);
	    }

	    @Override
	    public String toString() {
	      return "With.xpath: " + xpathExpression;
	    }
	  }

	  public static class WithClassName extends With implements Serializable {

	    private static final long serialVersionUID = -8737882849130394673L;

	    private final String className;

	    public WithClassName(String className) {
	      this.className = className;
	    }

	    @Override
	    public List<NemiElement> findElements(SearchContext context) {
	      if (context instanceof FindsWithClassName)
	        return ((FindsWithClassName) context).findElementsWithClassName(className);
	      return ((FindsWithXPath) context).findElementsWithXPath(".//*["
	          + containingWord("class", className) + "]");
	    }

	    @Override
	    public NemiElement findElement(SearchContext context) {
	      if (context instanceof FindsWithClassName)
	        return ((FindsWithClassName) context).findElementWithClassName(className);
	      return ((FindsWithXPath) context).findElementWithXPath(".//*["
	          + containingWord("class", className) + "]");
	    }

	    /**
	     * Generates a partial xpath expression that matches an element whose specified attribute
	     * contains the given CSS word. So to match &lt;div class='foo bar'&gt; you would say "//div[" +
	     * containingWord("class", "foo") + "]".
	     *
	     * @param attribute name
	     * @param word name
	     * @return XPath fragment
	     */
	    private String containingWord(String attribute, String word) {
	      return "contains(concat(' ',normalize-space(@" + attribute + "),' '),' "
	          + word + " ')";
	    }

	    @Override
	    public String toString() {
	      return "With.className: " + className;
	    }
	  }

	  public static class WithCssSelector extends With implements Serializable {

	    private static final long serialVersionUID = -3910258723099459239L;

	    private final String selector;

	    public WithCssSelector(String selector) {
	      this.selector = selector;
	    }

	    @Override
	    public NemiElement findElement(SearchContext context) {
	      if (context instanceof FindsWithCssSelector) {
	        return ((FindsWithCssSelector) context)
	            .findElementWithCssSelector(selector);
	      }

	      throw new WebDriverException(
	          "Driver does not support finding an element by selector: " + selector);
	    }

	    @Override
	    public List<NemiElement> findElements(SearchContext context) {
	      if (context instanceof FindsWithCssSelector) {
	        return ((FindsWithCssSelector) context)
	            .findElementsWithCssSelector(selector);
	      }

	      throw new WebDriverException(
	          "Driver does not support finding elements by selector: " + selector);
	    }

	    @Override
	    public String toString() {
	      return "With.cssSelector: " + selector;
	    }
	  }
}
