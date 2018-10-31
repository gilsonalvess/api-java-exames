package ufg.api.exames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ufg.api.exames.models.Exame;

public interface ExameRepository extends JpaRepository<Exame, Long> {

}
