/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.30 at 02:11:34 오후 KST 
//


package org.openflamingo.model.workflow;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="fs.default.name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mapred.job.tracker" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.openflamingo.org/schema/workflow}properties" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fsDefaultName",
    "mapredJobTracker",
    "properties"
})
@XmlRootElement(name = "cluster")
public class Cluster {

    @XmlElement(name = "fs.default.name", required = true)
    protected String fsDefaultName;
    @XmlElement(name = "mapred.job.tracker", required = true)
    protected String mapredJobTracker;
    protected Properties properties;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "description")
    protected String description;

    /**
     * Gets the value of the fsDefaultName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsDefaultName() {
        return fsDefaultName;
    }

    /**
     * Sets the value of the fsDefaultName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsDefaultName(String value) {
        this.fsDefaultName = value;
    }

    /**
     * Gets the value of the mapredJobTracker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapredJobTracker() {
        return mapredJobTracker;
    }

    /**
     * Sets the value of the mapredJobTracker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapredJobTracker(String value) {
        this.mapredJobTracker = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setProperties(Properties value) {
        this.properties = value;
    }

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
