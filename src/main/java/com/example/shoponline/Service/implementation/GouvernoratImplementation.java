package com.example.shoponline.Service.implementation;

import com.example.shoponline.Service.IGouvernoratService;
import com.example.shoponline.model.Gouvernoat;
import com.example.shoponline.repository.GouvernoratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GouvernoratImplementation implements IGouvernoratService {
    @Autowired
    private GouvernoratRepository gouvernoratRepo;

    @Override
    public List<Gouvernoat> getAllGouvernorats() {
        return (List<Gouvernoat>) gouvernoratRepo.findAll();
    }

    @Override
    public Gouvernoat getGouvernoratById(Long id) {
        Optional<Gouvernoat> op = gouvernoratRepo.findById(id);
        if(op.isPresent())
        {
            return op.get();
        }
        else
        {
            throw new NullPointerException("Gouvernorat avec l'Id "+ id +"n'existe pas");
        }
    }

    @Override
    public Gouvernoat saveGouvernorat(Gouvernoat g) {
        return gouvernoratRepo.save(g);
    }

    @Override
    public void deleteGouvernorat(Long id) {
        gouvernoratRepo.deleteById(id);
    }

    @Override
    public void updateGouvernorat(Gouvernoat g) {
        gouvernoratRepo.save(g);
    }

}
