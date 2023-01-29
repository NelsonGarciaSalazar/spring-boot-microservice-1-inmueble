package com.vaxi.springbootmicroservice1inmueble.service;

import com.vaxi.springbootmicroservice1inmueble.model.Inmueble;

import java.util.List;

public interface InmuebleSevice {
    Inmueble saveInmueble(Inmueble inmueble);

    void deleteInmueble(Long inmuebleId);

    List<Inmueble> findAllInmueble();
}
