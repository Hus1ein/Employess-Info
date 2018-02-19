package com.hussainabdelilah.employees_information;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiPathParam;
import org.jsondoc.core.pojo.ApiStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")
@Api(name = "Employees Information API",
        description = "Provides a list of methods that manage employees information",
        stage = ApiStage.RC)
public class InfoController {

    private InfoRepository infoRepository;

    @Autowired
    public InfoController(InfoRepository pInfoRepository)
    {
        this.infoRepository = pInfoRepository;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ApiMethod(description = "Get all employees information from the database")
    public List<EmployeesInfo> getAll()
    {
        return infoRepository.findAll();
    }

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    @ApiMethod(description = "Get all employees information where the ID is equal to the provided value")
    public List<EmployeesInfo> findById(@ApiPathParam(name = "id") @PathVariable long id)
    {
        return infoRepository.findByIdIs(id);
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ApiMethod(description = "Add a new employee and save it to the database")
    public List<EmployeesInfo> add(@RequestBody EmployeesInfo employee)
    {
        infoRepository.save(employee);
        return infoRepository.findAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ApiMethod(description = "Remove the employee information with the provided ID from the database")
    public List<EmployeesInfo> remove(@ApiPathParam(name = "id") @PathVariable long id)
    {
        infoRepository.delete(id);
        return infoRepository.findAll();
    }
}
