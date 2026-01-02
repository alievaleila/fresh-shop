package az.edu.itbrains.freshshop.service.impl;

import az.edu.itbrains.freshshop.dto.RegisterDto;
import az.edu.itbrains.freshshop.model.User;
import az.edu.itbrains.freshshop.repository.UserRepository;
import az.edu.itbrains.freshshop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    @Override
    public boolean registerUser(RegisterDto registerDto) {
        User findUser=userRepository.findByUsername(registerDto.getUsername());
        if(findUser!=null){
            return false;
        }

        User user=new User();
        user.setEmail(registerDto.getEmail());
        user.setUsername(registerDto.getUsername());

        String password=passwordEncoder.encode(registerDto.getPassword());
        user.setPassword(password);

        userRepository.save(user);

        return true;
    }
}
