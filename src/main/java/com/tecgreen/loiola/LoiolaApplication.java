package com.tecgreen.loiola;

import com.tecgreen.loiola.entities.Usuario;
import com.tecgreen.loiola.enums.Perfil;
import com.tecgreen.loiola.services.UsuarioService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class LoiolaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoiolaApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UsuarioService usuarioService, BCryptPasswordEncoder passwordEncoder) {
		return args -> initUsers(usuarioService, passwordEncoder);
	}

    private void initUsers(UsuarioService usuarioService, BCryptPasswordEncoder passwordEncoder) {
        if (usuarioService.buscarPorCpf("12345678910") == null) {
            Usuario admin = new Usuario();

            admin.setNome("Maria");
            admin.setCpf("12345678910");
            admin.setSenha(passwordEncoder.encode("maria123"));
            admin.setPerfil(Perfil.ADMIN);

            usuarioService.salvar(admin);
        }
    }
}
