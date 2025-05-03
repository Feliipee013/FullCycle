package br.com.primeshoes.api.service.Auth;

import br.com.primeshoes.api.dtos.Login.LoginUserDto;
import br.com.primeshoes.api.dtos.Login.RegisterUserDto;
import br.com.primeshoes.api.entities.User.User;
import br.com.primeshoes.api.enums.Role;
import br.com.primeshoes.api.repository.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;

    public AuthenticationService(
            UserRepository userRepository,
            AuthenticationManager authenticationManager,
            PasswordEncoder passwordEncoder
    ) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User signup(RegisterUserDto input) {
        User user = new User();
        user.setName(input.Name());
        user.setEmail(input.Email());
        user.setPassword(passwordEncoder.encode(input.Password()));
        user.setRole(Role.SELLER);
        return userRepository.save(user);
    }

    public User authenticate(LoginUserDto input) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.Email(),
                        input.Password()
                )
        );

        return userRepository.findByEmail(input.Email())
                .orElseThrow();
    }
}
