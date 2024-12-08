package com.example.shoponline.Service.implementation;

import com.example.shoponline.Service.IInscriptionService;
import com.example.shoponline.model.Inscription;
import com.example.shoponline.repository.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InscriptionImplementation implements IInscriptionService {
    @Autowired
    private InscriptionRepository inscriptionRepo;


    @Override
    public List<Inscription> getAllInscriptions() {
        return (List<Inscription>) inscriptionRepo.findAll();
    }

    @Override
    public Inscription getInscriptionById(Long id) {
        Optional<Inscription> op = inscriptionRepo.findById(id);
        if(op.isPresent())
        {
            return op.get();
        }
        else
        {
            throw new NullPointerException("Inscription avec l'Id "+ id +"n'existe pas");
        }
    }

    @Override
    public Inscription createInscription(Inscription inscription) {
        return inscriptionRepo.save(inscription);
    }

    @Override
    public void updateInscription(Inscription inscription) {
        inscriptionRepo.save(inscription);
    }

    @Override
    public void deleteInscription(Inscription inscription) {
        inscriptionRepo.delete(inscription);
    }
}
