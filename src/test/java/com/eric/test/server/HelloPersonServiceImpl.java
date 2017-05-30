package com.eric.test.server;

import com.eric.server.RpcService;
import com.eric.test.client.HelloPersonService;
import com.eric.test.client.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  wangfeng
 */
@RpcService(HelloPersonService.class)
public class HelloPersonServiceImpl implements HelloPersonService {

    @Override
    public List<Person> GetTestPerson(String name, int num) {
        List<Person> persons = new ArrayList<>(num);
        for (int i = 0; i < num; ++i) {
            persons.add(new Person(Integer.toString(i), name));
        }
        return persons;
    }
}
