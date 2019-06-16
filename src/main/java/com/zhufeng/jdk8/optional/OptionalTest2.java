package com.zhufeng.jdk8.optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalTest2 {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("zhangsan");

        Employee employee2 = new Employee();
        employee2.setName("lisi");

        Company company = new Company();
        company.setName("IBM");

        List<Employee> employees = Arrays.asList(employee, employee2);
        company.setEmployeeList(employees);

//        List<Employee> employees1 = company.getEmployeeList();

        // 以前的做法
//        if (null != employees1) {
//            return employees1;
//        } else {
//            return new ArrayList<Employee>();
//        }

        Optional<Company> optional = Optional.ofNullable(company);

        System.out.println(optional.map(theCompany -> theCompany.getEmployeeList()).orElse(Collections.emptyList()));
    }
}
