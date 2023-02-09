package org.generation.blog_pessoal.repository;

import java.util.List;
import java.util.Optional;

import org.generation.blog_pessoal.model.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {
	public Optional<Usuarios> findByUsuario(String usuario);
	public List <Usuarios> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
