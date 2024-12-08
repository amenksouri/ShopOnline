package com.example.shoponline.Service;

import com.example.shoponline.model.Inscription;

import java.util.List;

public interface IInscriptionService {
    public List<Inscription> getAllInscriptions();
    public Inscription getInscriptionById(Long id);
    public Inscription createInscription(Inscription inscription);
    public void updateInscription(Inscription inscription);
    public void deleteInscription(Inscription inscription);
}
