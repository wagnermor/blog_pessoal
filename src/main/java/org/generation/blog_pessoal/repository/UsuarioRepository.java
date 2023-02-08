package org.generation.blog_pessoal.repository;

import java.util.Optional;

import org.generation.blog_pessoal.model.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {
	public Optional<Usuarios> findByUsuario(String usuario);
	
}