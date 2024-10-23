package com.example.inicial1.controllers;

import com.example.inicial1.entities.Humano;
import com.example.inicial1.entities.Persona;
import com.example.inicial1.services.HumanoServicesImpl;
import com.example.inicial1.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
//@RequestMapping("/personas")
@RequestMapping(path = "api/v1/Humano")
public class HumanoController extends BaseControlerImpl<Humano, HumanoServicesImpl>{



}