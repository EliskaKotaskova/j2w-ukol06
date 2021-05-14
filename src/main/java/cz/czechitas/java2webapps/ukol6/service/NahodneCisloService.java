package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class NahodneCisloService {
    int dejNahodnecislo(int horniMez){
            Random random = new Random();
            int index = random.nextInt(horniMez);
            return index;
    }

}
