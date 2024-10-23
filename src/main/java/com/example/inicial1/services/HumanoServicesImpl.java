package com.example.inicial1.services;

import com.example.inicial1.entities.Humano;
import com.example.inicial1.repositories.BaseRepository;
import com.example.inicial1.repositories.HumanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HumanoServicesImpl extends BaseServiceImpl<Humano,Long> implements HumanoService{

    @Autowired//

    private HumanoRepository humanoRepository;

    public HumanoServicesImpl(BaseRepository<Humano,Long> baseRepository){
        super(baseRepository);

    }

}
/*@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{


}*/