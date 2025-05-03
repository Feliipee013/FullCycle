package br.com.primeshoes.api.modules.auth.Service;

import br.com.primeshoes.api.modules.auth.Login.Dto.LoginUserDto;
import br.com.primeshoes.api.modules.auth.SingUp.Dto.SignUpDto;
import br.com.primeshoes.api.modules.user.Entity.User;
import br.com.primeshoes.api.modules.role.Enum.Role;
import br.com.primeshoes.api.modules.user.Repository.UserRepository;
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

    public User signup(SignUpDto input) {
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
