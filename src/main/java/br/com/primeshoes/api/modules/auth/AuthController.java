package br.com.primeshoes.api.modules.auth;

import br.com.primeshoes.api.common.services.JwtService;
import br.com.primeshoes.api.modules.auth.Login.Dto.LoginResponseDto;
import br.com.primeshoes.api.modules.auth.Login.Dto.LoginUserDto;
import br.com.primeshoes.api.modules.auth.Service.AuthenticationService;
import br.com.primeshoes.api.modules.auth.SingUp.Dto.SignUpDto;
import br.com.primeshoes.api.modules.user.Entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
public class AuthController {
    private final JwtService jwtService;

    private final AuthenticationService authenticationService;

    public AuthController(JwtService jwtService, AuthenticationService authenticationService) {
        this.jwtService = jwtService;
        this.authenticationService = authenticationService;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody SignUpDto registerUserDto) {
        User registeredUser = authenticationService.signup(registerUserDto);

        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> authenticate(@RequestBody LoginUserDto loginUserDto) {
        User authenticatedUser = authenticationService.authenticate(loginUserDto);
        String jwtToken = jwtService.generateToken((UserDetails) authenticatedUser);
        LoginResponseDto loginResponse = new LoginResponseDto(jwtToken, jwtService.getExpirationTime());
        return ResponseEntity.ok(loginResponse);
    }
}