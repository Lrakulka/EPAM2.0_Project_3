//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.08 at 03:18:29 PM EEST 
//


package gem_xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for JewelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JewelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Preciousness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Origin">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[a-zA-Z0-9]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Visual_Parameters">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Color">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Red"/>
 *                         &lt;enumeration value="Green"/>
 *                         &lt;enumeration value="Yelow"/>
 *                         &lt;enumeration value="White"/>
 *                         &lt;enumeration value="Blue"/>
 *                         &lt;enumeration value="Brown"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Transparency">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;maxInclusive value="100"/>
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Cut">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;maxInclusive value="15"/>
 *                         &lt;minInclusive value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Value">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minExclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JewelType", propOrder = {
    "name",
    "preciousness",
    "origin",
    "visualParameters",
    "value"
})
public class JewelType implements Comparable<JewelType> {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Preciousness")
    protected boolean preciousness;
    @XmlElement(name = "Origin", required = true)
    protected String origin;
    @XmlElement(name = "Visual_Parameters", required = true)
    protected JewelType.VisualParameters visualParameters;
    @XmlElement(name = "Value")
    protected double value;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the preciousness property.
     * 
     */
    public boolean isPreciousness() {
        return preciousness;
    }

    /**
     * Sets the value of the preciousness property.
     * 
     */
    public void setPreciousness(boolean value) {
        this.preciousness = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the visualParameters property.
     * 
     * @return
     *     possible object is
     *     {@link JewelType.VisualParameters }
     *     
     */
    public JewelType.VisualParameters getVisualParameters() {
        return visualParameters;
    }

    /**
     * Sets the value of the visualParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JewelType.VisualParameters }
     *     
     */
    public void setVisualParameters(JewelType.VisualParameters value) {
        this.visualParameters = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Color">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Red"/>
     *               &lt;enumeration value="Green"/>
     *               &lt;enumeration value="Yelow"/>
     *               &lt;enumeration value="White"/>
     *               &lt;enumeration value="Blue"/>
     *               &lt;enumeration value="Brown"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Transparency">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;maxInclusive value="100"/>
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Cut">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;maxInclusive value="15"/>
     *               &lt;minInclusive value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "color",
        "transparency",
        "cut"
    })
    public static class VisualParameters {

        @XmlElement(name = "Color", required = true)
        protected String color;
        @XmlElement(name = "Transparency")
        protected byte transparency;
        @XmlElement(name = "Cut")
        protected byte cut;

        /**
         * Gets the value of the color property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColor() {
            return color;
        }

        /**
         * Sets the value of the color property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColor(String value) {
            this.color = value;
        }

        /**
         * Gets the value of the transparency property.
         * 
         */
        public byte getTransparency() {
            return transparency;
        }

        /**
         * Sets the value of the transparency property.
         * 
         */
        public void setTransparency(byte value) {
            this.transparency = value;
        }

        /**
         * Gets the value of the cut property.
         * 
         */
        public byte getCut() {
            return cut;
        }

        /**
         * Sets the value of the cut property.
         * 
         */
        public void setCut(byte value) {
            this.cut = value;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("Color = ").append(color).
            append(" Transparency = ").append(transparency).
            append(" Cut = ").append(cut);
            return builder.toString();
        }
    }

    @Override
    public int compareTo(JewelType o) {
	return Double.compare(this.value, o.value);
    }
    
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("ID = ").append(id).append(" Name = ").
	append(preciousness).append(" Origin = ").append(origin).
	append(" Value = ").append(value).
	append(" VisualParameters: ").append(visualParameters.toString());
        return builder.toString();
    }
}
