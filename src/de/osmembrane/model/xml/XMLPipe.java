/*
 * This file is part of the OSMembrane project.
 * More informations under www.osmembrane.de
 * 
 * The project is licensed under the GNU GENERAL PUBLIC LICENSE 3.0.
 * for more details about the license see http://www.osmembrane.de/license/
 * 
 * Source: $HeadURL$ ($Revision$)
 * Last changed: $Date$
 */


//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.04 at 11:28:46 AM MEZ 
//
package de.osmembrane.model.xml;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes an input or output pipe of a task.
 * 
 * <p>
 * Java class for XMLPipe complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="XMLPipe">
 *   &lt;complexContent>
 *     &lt;extension base="{http://osmembrane.de/model/xml}XMLHasDescription">
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="entity"/>
 *             &lt;enumeration value="change"/>
 *             &lt;enumeration value="dataset"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="count" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="single"/>
 *             &lt;enumeration value="variable"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="specifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMLPipe")
@SuppressWarnings(value = "all")
public class XMLPipe extends XMLHasDescription {

	@XmlAttribute(required = true)
	protected String type;
	@XmlAttribute(required = true)
	protected String count;
	@XmlAttribute
	@XmlSchemaType(name = "nonNegativeInteger")
	protected BigInteger index;
	@XmlAttribute
	protected String specifiedBy;

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}

	public boolean isSetType() {
		return (this.type != null);
	}

	/**
	 * Gets the value of the count property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCount() {
		return count;
	}

	/**
	 * Sets the value of the count property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCount(String value) {
		this.count = value;
	}

	public boolean isSetCount() {
		return (this.count != null);
	}

	/**
	 * Gets the value of the index property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getIndex() {
		return index;
	}

	/**
	 * Sets the value of the index property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setIndex(BigInteger value) {
		this.index = value;
	}

	public boolean isSetIndex() {
		return (this.index != null);
	}

	/**
	 * Gets the value of the specifiedBy property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSpecifiedBy() {
		return specifiedBy;
	}

	/**
	 * Sets the value of the specifiedBy property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSpecifiedBy(String value) {
		this.specifiedBy = value;
	}

	public boolean isSetSpecifiedBy() {
		return (this.specifiedBy != null);
	}

}
