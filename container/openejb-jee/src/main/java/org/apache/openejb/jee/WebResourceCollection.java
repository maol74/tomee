/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.openejb.jee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "web-resource-collectionType", propOrder = {
        "webResourceName",
        "description",
        "urlPattern",
        "httpMethod",
        "httpMethodOmission"
})
public class WebResourceCollection {

    @XmlElement(name = "web-resource-name", required = true)
    protected String webResourceName;
    protected List<Text> description;
    @XmlElement(name = "url-pattern", required = true)
    protected List<String> urlPattern;
    @XmlElement(name = "http-method")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> httpMethod;
    @XmlElement(name = "http-method-omission")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> httpMethodOmission;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    public String getWebResourceName() {
        return webResourceName;
    }

    public void setWebResourceName(String value) {
        this.webResourceName = value;
    }

    public List<Text> getDescription() {
        if (description == null) {
            description = new ArrayList<Text>();
        }
        return this.description;
    }

    public List<String> getUrlPattern() {
        if (urlPattern == null) {
            urlPattern = new ArrayList<String>();
        }
        return this.urlPattern;
    }

    public List<String> getHttpMethod() {
        if (httpMethod == null) {
            httpMethod = new ArrayList<String>();
        }
        return this.httpMethod;
    }

    public List<String> getHttpMethodOmission() {
        if (httpMethodOmission == null) {
            httpMethodOmission = new ArrayList<String>();
        }
        return this.httpMethodOmission;
    }

    public java.lang.String getId() {
        return id;
    }

    public void setId(java.lang.String value) {
        this.id = value;
    }

}

