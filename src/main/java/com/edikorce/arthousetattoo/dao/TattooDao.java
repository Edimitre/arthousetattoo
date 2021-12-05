package com.edikorce.arthousetattoo.dao;


import com.edikorce.arthousetattoo.model.Tattoo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TattooDao extends JpaRepository<Tattoo, Integer> {
}
