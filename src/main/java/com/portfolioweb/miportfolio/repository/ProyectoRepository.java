/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioweb.miportfolio.repository;

import com.portfolioweb.miportfolio.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elcap
 */
@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long> {
    
}
