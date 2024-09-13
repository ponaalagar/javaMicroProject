package com.miniProject.miniProject.Repository;

import com.miniProject.miniProject.Model.Modal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonorRepository extends JpaRepository<Modal, Long> {
}