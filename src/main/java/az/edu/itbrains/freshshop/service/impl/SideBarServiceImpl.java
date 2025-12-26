package az.edu.itbrains.freshshop.service.impl;

import az.edu.itbrains.freshshop.dto.SideBarDto;
import az.edu.itbrains.freshshop.repository.SideBarRepository;
import az.edu.itbrains.freshshop.service.SideBarService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SideBarServiceImpl implements SideBarService {

    private final SideBarRepository sideBarRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<SideBarDto> getAllSideBars() {
        List<SideBarDto>sideBarDtoList=sideBarRepository.findAll()
                .stream()
                .map(sideBar -> modelMapper.map(sideBar,SideBarDto.class)).collect(Collectors.toList());
        return sideBarDtoList;
    }
}
