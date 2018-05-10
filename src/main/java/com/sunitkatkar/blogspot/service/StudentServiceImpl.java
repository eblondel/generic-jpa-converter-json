/**
 * Copyright 2018 onwards - Sunit Katkar - 
 * URL: https://sunitkatkar.blogspot.com  
 * Email: sunitkatkar@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sunitkatkar.blogspot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunitkatkar.blogspot.model.Student;
import com.sunitkatkar.blogspot.repository.StudentRepository;

/**
 * The actual implementation of the {@link StudentService}
 * 
 * @author Sunit Katkar, sunitkatkar@gmail.com
 *         (https://sunitkatkar.blogspot.com/)
 * @since ver 1.0 (May 2018)
 * @version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepo;

    @Override
    public Student save(Student s) {
        return studentRepo.save(s);
    }

    @Override
    public List<Student> findAll() {

        return studentRepo.findAll();
    }

}
