package az.edu.itbrains.freshshop.service;

import az.edu.itbrains.freshshop.dto.RegisterDto;

public interface UserService {

    boolean registerUser(RegisterDto registerDto);
}
