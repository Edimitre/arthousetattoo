package com.edikorce.arthousetattoo.service;


import com.edikorce.arthousetattoo.dao.TattooDao;
import com.edikorce.arthousetattoo.model.Painting;
import com.edikorce.arthousetattoo.model.Tattoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edikorce.arthousetattoo.dao.PainitingsDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DatabaseService {


    // PAINTINGS
    @Autowired
    private PainitingsDao painitingsDao;

    public Painting addPainting(Painting painting){
        painitingsDao.save(painting);
        return painting;
    }

    public Painting getPaintingById(int id) throws PaintingNotFoundExeption {
        Optional<Painting> selectedPainting = painitingsDao.findById(id);

        if (selectedPainting.isPresent()){
            return selectedPainting.get();
        }else{
            throw new PaintingNotFoundExeption("piktura nuk u gjet");
        }

    }

    public List<Painting> getAllPaintings(){

        List<Painting> paintingList = new ArrayList<>();

        Iterable<Painting> paintingIterable = painitingsDao.findAll();
        for (Painting painting:paintingIterable){

            paintingList.add(painting);
        }

        return paintingList;

    }

    public void deletePaintingById(int id){

        painitingsDao.deleteById(id);

    }

    public void deleteAllPaintings(){

        painitingsDao.deleteAll();


    }


    // TATTOO'S
    @Autowired
    private TattooDao tattooDao;

    public Tattoo addTattoo(Tattoo tattoo){
        tattooDao.save(tattoo);
        return tattoo;
    }

    public Tattoo getTattooById(int id) throws PaintingNotFoundExeption {

        Optional<Tattoo> selectedTattoo = tattooDao.findById(id);

        if (selectedTattoo.isPresent()){
            return selectedTattoo.get();
        }else{
            throw new PaintingNotFoundExeption("Tattoo nuk u gjet");
        }

    }

    public List<Tattoo> getAllTattoos(){

        List<Tattoo> tattooList = new ArrayList<>();

        Iterable<Tattoo> tattooIterable = tattooDao.findAll();
        for (Tattoo tattoo:tattooIterable){

            tattooList.add(tattoo);
        }

        return tattooList;

    }

    public void deleteTattooById(int id){

        tattooDao.deleteById(id);

    }

    public void deleteAllTattoos(){

        tattooDao.deleteAll();


    }

}
