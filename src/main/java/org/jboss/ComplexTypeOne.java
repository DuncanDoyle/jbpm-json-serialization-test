//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.01 at 02:43:35 PM CET 
//

package org.jboss;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for complexTypeOne complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexTypeOne">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="complexTypeTwo" type="{http://jboss.org}complexTypeTwo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexTypeOne", propOrder = { "name", "complexTypeTwo" })
public class ComplexTypeOne implements Serializable {

	/**
	 * SerialVersionUID
	 */
	private static final long serialVersionUID = -9211477794388858125L;

	@XmlElement(required = true)
	protected String name;
	@XmlElement(required = true)
	protected ComplexTypeTwo complexTypeTwo;

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the complexTypeTwo property.
	 * 
	 * @return possible object is {@link ComplexTypeTwo }
	 * 
	 */
	public ComplexTypeTwo getComplexTypeTwo() {
		return complexTypeTwo;
	}

	/**
	 * Sets the value of the complexTypeTwo property.
	 * 
	 * @param value
	 *            allowed object is {@link ComplexTypeTwo }
	 * 
	 */
	public void setComplexTypeTwo(ComplexTypeTwo value) {
		this.complexTypeTwo = value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("ComplexTypeOne: ");
		builder.append("name: ").append(name).append(", complexTypeTwo: ").append(complexTypeTwo);
		return builder.toString();
	}

}
