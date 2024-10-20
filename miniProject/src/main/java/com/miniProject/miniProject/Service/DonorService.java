package com.miniProject.miniProject.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniProject.miniProject.Model.Modal;
import com.miniProject.miniProject.Repository.DonorRepository;


@Service
public class DonorService {
    @Autowired
    private DonorRepository donorRepository;

    public List<Modal> getAllDonors() {
        return donorRepository.findAll();
    }

    public Modal getDonorById(Long id) {
        return donorRepository.findById(id).orElse(null);
    }

    public Modal saveDonor(Modal donor) {
        return donorRepository.save(donor);
    }

    public void deleteDonor(Long id) {
        donorRepository.deleteById(id);
    }
}
