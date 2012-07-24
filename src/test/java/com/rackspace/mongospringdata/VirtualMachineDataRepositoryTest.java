package com.rackspace.mongospringdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
     @Autowired
     VirtualMachineDataRepository repository;

    @Test
    public void save_savesTheVirtualMachineDataName(){
        VirtualMachineData virtualMachineData = new VirtualMachineData();
        virtualMachineData.setName("Bubba");
        repository.save(virtualMachineData);
        List<VirtualMachineData> retrievedVirtualMachineData = repository.findByName("Bubba");
        assertThat("size is 1", retrievedVirtualMachineData.size(), equalTo(1));

    }



    @Test
     public void readsFirstPageCorrectly() {

     //  Page<Person> persons = repository.findAll(new PageRequest(0, 10));
     //  assertThat(persons.isFirstPage(), is(true));
     }
}
