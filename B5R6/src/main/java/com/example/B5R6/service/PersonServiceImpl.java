package com.example.B5R6.service;

import com.example.B5R6.dto.*;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

  @Override
  public boolean isValid(PersonDTO personDTO) {
    return personDTO != null
        && personDTO.getProfession() != null
        && personDTO.getProfession().equals("Software Developer");
  }
}