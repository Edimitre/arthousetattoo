package com.edikorce.arthousetattoo.dao;

import com.edikorce.arthousetattoo.model.Painting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PainitingsDao extends JpaRepository<Painting, Integer> {



}
