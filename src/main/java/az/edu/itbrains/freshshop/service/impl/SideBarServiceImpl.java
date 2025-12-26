package az.edu.itbrains.freshshop.service.impl;

import az.edu.itbrains.freshshop.dto.SideBarDto;
import az.edu.itbrains.freshshop.repository.SideBarRepository;
import az.edu.itbrains.freshshop.service.SideBarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SideBarServiceImpl implements SideBarService {

    private final SideBarRepository sideBarRepository;

    @Override
    public List<SideBarDto> getAllSideBars() {
        List<SideBarDto>sideBarDtoList=sideBarRepository.
        return List.of();
    }
}
