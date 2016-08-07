package com.romasdev.beercatalog;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romasdev.beercatalog.model.Cerveja;

public interface CervejaRepository extends JpaRepository<Cerveja, Long> {

}
