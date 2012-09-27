/*
  Copyright 2012 Jerome Leleu

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.scribe.up.profile.facebook;

import java.util.List;

import org.codehaus.jackson.JsonNode;
import org.scribe.up.profile.JsonObject;
import org.scribe.up.profile.converter.Converters;

/**
 * This class represents an education object for Facebook.
 * 
 * @author Jerome Leleu
 * @since 1.0.0
 */
public final class FacebookEducation extends JsonObject {
    
    private static final long serialVersionUID = -4519046820724537979L;
    
    private FacebookObject school;
    
    private FacebookObject degree;
    
    private FacebookObject year;
    
    private List<FacebookObject> concentration;
    
    private String type;
    
    @SuppressWarnings("unchecked")
    @Override
    protected void buildFromJson(final JsonNode json) {
        this.school = (FacebookObject) FacebookConverters.objectConverter.convertFromJson(json, "school");
        this.degree = (FacebookObject) FacebookConverters.objectConverter.convertFromJson(json, "degree");
        this.year = (FacebookObject) FacebookConverters.objectConverter.convertFromJson(json, "year");
        this.concentration = FacebookConverters.listObjectConverter.convertFromJson(json, "concentration");
        this.type = Converters.stringConverter.convertFromJson(json, "type");
    }
    
    public FacebookObject getSchool() {
        return this.school;
    }
    
    public FacebookObject getDegree() {
        return this.degree;
    }
    
    public FacebookObject getYear() {
        return this.year;
    }
    
    public List<FacebookObject> getConcentration() {
        return this.concentration;
    }
    
    public String getType() {
        return this.type;
    }
}
