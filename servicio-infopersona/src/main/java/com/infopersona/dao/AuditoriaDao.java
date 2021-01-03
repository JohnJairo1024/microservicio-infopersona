package com.infopersona.dao;

import com.infopersona.entity.Auditoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriaDao extends CrudRepository<Auditoria, Long> {

}
