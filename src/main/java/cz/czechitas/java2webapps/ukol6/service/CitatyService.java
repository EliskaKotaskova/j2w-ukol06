package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CitatyService {

    private final CitatyRepository repository;
    private final NahodneCisloService nahCisService;

    public String nahodnyCitat() {
        int pocet = repository.pocet();
        int cislo = nahCisService.dejNahodnecislo(pocet);
        String text = repository.citat(cislo);
        return text;
    }

    @Autowired
    public CitatyService(CitatyRepository repository, NahodneCisloService nahCisService) {
        this.repository = repository;
        this.nahCisService = nahCisService;
    }
}

