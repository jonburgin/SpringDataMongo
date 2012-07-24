package com.rackspace.mongospringdata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: jonburgin
 * Date: 7/23/12
 * Time: 9:43 PM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class VirtualMachineDataRepositoryTest {
    final static String NAME = "bubba";
    final static String DATACENTER = "datacenter";

     @Autowired
     VirtualMachineDataRepository repository;

     VirtualMachineData virtualMachineData;

    @Before
    public void createAVirtualMachineData(){
        virtualMachineData = new VirtualMachineData();
        virtualMachineData.setName(NAME);
        virtualMachineData.setVirtualDataCenter(DATACENTER);
    }

    @After
    public void cleanupDatabase(){
        List<VirtualMachineData> retrievedVirtualMachineData = repository.findByName(NAME);
        repository.delete(retrievedVirtualMachineData);
    }

    @Test
    public void save_savesName(){
        repository.save(virtualMachineData);
        List<VirtualMachineData> retrievedVirtualMachineData = repository.findByName(NAME);
        assertThat("size is 1", retrievedVirtualMachineData.size(), equalTo(1));
        assertThat("name is correct", retrievedVirtualMachineData.get(0).getName(), equalTo(NAME));
    }


    @Test
    public void save_saveTheDataCenterCorrectly(){
        repository.save(virtualMachineData);
        List<VirtualMachineData> retrievedVirtualMachineData = repository.findByName(NAME);
        assertThat("datacenter is correct", retrievedVirtualMachineData.get(0).getVirtualDataCenter(), equalTo(DATACENTER));
    }


//    @Test
//     public void readsFirstPageCorrectly() {
//
//      Page<Person> persons = repository.findAll(new PageRequest(0, 10));
//      assertThat(persons.isFirstPage(), is(true));
//     }
}
