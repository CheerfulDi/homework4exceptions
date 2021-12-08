package pro.sky.java.course2.homework4exceptions.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeBookOverFlowException;
import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<String> employeeList = new ArrayList<>(4);

    @Override
    public boolean addToEmployeeList(String employee) {
//        for (int i = 0; i < employeeList.size(); i++) {
//            if (employeeList.get(i) == null) {
        return employeeList.add(employee);
//            }
//        }
//        throw new EmployeeBookOverFlowException();
//         ЕСЛИ РАСКОММЕНТИРОВАТЬ СТРОКИ - МЕТОД НЕ РАБОТАЕТ,
//         КАК ВЫЗЫВАТЬ ОШИБКУ?
    }


        @Override
        public boolean removeFromEmployeeList (String employee){
            return employeeList.remove(employee);
        }

//        НЕ РАБОТАЕТ КОРРЕКТНО((
//        @Override
//        public String findEmployeeInList (String employee){
//            for (String s : employeeList) {
//                if (s.equals(employee)) {
//                    return employee;
//                }
//            }
//            throw new EmployeeNotFoundException();
//        }


        @Override
        public List<String> getEmployeeList () {
            return employeeList;
        }


}




