package com.hussainabdelilah.employees_information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private InfoRepository infoRepository;

    @Autowired
    public DatabaseSeeder(InfoRepository pInfoRepository)
    {
        this.infoRepository = pInfoRepository;
    }

    @Override
    public void run(String... arg0) throws Exception {
        List<EmployeesInfo> infoList = new ArrayList<>();
        infoList.add(new EmployeesInfo("Employee1", 30, "Employee1@hotmail.com", "Sarajevo-1", 2000.9));
        infoList.add(new EmployeesInfo("Employee2", 25, "Employee2@hotmail.com", "Sarajevo-2", 1500));
        infoList.add(new EmployeesInfo("Employee3", 41, "Employee3@hotmail.com", "Sarajevo-3", 1000.32));
        infoList.add(new EmployeesInfo("Employee4", 54, "Employee4@hotmail.com", "Sarajevo-4", 1200));
        infoList.add(new EmployeesInfo("Employee5", 22, "Employee5@hotmail.com", "Sarajevo-5", 2500));
        infoList.add(new EmployeesInfo("Employee6", 31, "Employee6@hotmail.com", "Sarajevo-6", 1700));
        infoRepository.save(infoList);
    }
}
