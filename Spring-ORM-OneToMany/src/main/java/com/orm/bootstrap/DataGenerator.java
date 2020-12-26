package com.orm.bootstrap;

import com.orm.entity.Address;
import com.orm.entity.Person;
import com.orm.repository.AdressRepository;
import com.orm.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    AdressRepository adressRepository;

    @Override
    public void run(String... args) throws Exception {

        Person p1 = new Person("Mike","Smith");
        Person p2 = new Person("Ozzy","Kmith");
        Person p3 = new Person("Tedd","Bbith");

        Address a1 = new Address("King Street","22042");
        Address a2 = new Address("Elmt","22012");
        Address a3 = new Address("Java Street","25642");

//        p1.setAddresses(Arrays.asList(a1,a2)); // case-1
       personRepository.save(p1);
       personRepository.save(p2);

        a1.setPerson(p1);
        a2.setPerson(p1);
        a3.setPerson(p2);

        adressRepository.save(a1);
        adressRepository.save(a2);
        adressRepository.save(a3);


    }
}
