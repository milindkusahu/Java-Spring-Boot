package com.milind.sahu.module2MvcRest.controllers;

import com.milind.sahu.module2MvcRest.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @GetMapping("/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId) {
        return new EmployeeDTO(employeeId, "Milind", "milindsahu2000@gmail.com", 26, LocalDate.of(2026, 6, 23), true);
    }

    @GetMapping
    public String getAllEmployee(@RequestParam(required = false) String age) {
        return "Hi "+age;
    }

    @PostMapping
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO inputEmployee) {
        inputEmployee.setId(100L);
        return  inputEmployee;
    }
}
