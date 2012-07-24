package com.rackspace.mongospringdata;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jonburgin
 * Date: 7/23/12
 * Time: 8:27 PM
 * To change this template use File | Settings | File Templates.
 */
public interface VirtualMachineDataRepository extends MongoRepository<VirtualMachineData, String> {

    List<VirtualMachineData> findByName(String name);

    //Interesting...Note that for version 1.0 we currently don't support referring to parameters that are mapped as DBRef in the domain class.

    List<VirtualMachineData> findByVirtualDataCenter(String tenantId);
}
