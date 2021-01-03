package com.infopersona.dao;

import com.infopersona.entity.InfoBasica;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoBasicaDao extends CrudRepository<InfoBasica, Long> {

}
