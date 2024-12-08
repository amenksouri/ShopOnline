package com.example.shoponline.Service;

import com.example.shoponline.model.Gouvernoat;

import java.util.List;

public interface IGouvernoratService {
    public List<Gouvernoat> getAllGouvernorats();
    public Gouvernoat getGouvernoratById(Long id);
    public Gouvernoat saveGouvernorat(Gouvernoat g);
    public void deleteGouvernorat(Long id);
    public void updateGouvernorat(Gouvernoat g);
}
