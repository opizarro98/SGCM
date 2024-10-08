package com.ec.sgcm.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.sgcm.model.Attentions;
import com.ec.sgcm.repository.AttentionRepo;
import com.ec.sgcm.services.AttentionService;

@Service
public class AttentionServiceImpl implements AttentionService {

    @Autowired
    AttentionRepo attentionRepo;

    @Override
    public Attentions createNewAttentio(Attentions attention) {
        return attentionRepo.save(attention);
    }

}
