package com.rackspace.mongospringdata;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: jonburgin
 * Date: 7/23/12
 * Time: 8:20 PM
 * To change this template use File | Settings | File Templates.
 */
@Document
public class VirtualMachineData {

    @Id
    private String id;  //From documentation "Currently we supportString, ObjectId and BigInteger as id-types."

    @Indexed(unique = true)
    private String name;

    private String VirtualDataCenter;

    private Collection<String> things = new ArrayList<String>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVirtualDataCenter() {
        return VirtualDataCenter;
    }

    public void setVirtualDataCenter(String virtualDataCenter) {
        VirtualDataCenter = virtualDataCenter;
    }

    public Collection<String> getThings() {
        return things;
    }

    public void setThings(Collection<String> things) {
        this.things = things;
    }
}
