package com.ec.sgcm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.sgcm.model.Attentions;

@Repository
public interface AttentionRepo extends JpaRepository<Attentions, Long> {

}
