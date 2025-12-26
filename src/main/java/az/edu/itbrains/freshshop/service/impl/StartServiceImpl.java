package az.edu.itbrains.freshshop.service.impl;

import az.edu.itbrains.freshshop.dto.StartDto;
import az.edu.itbrains.freshshop.repository.StartRepository;
import az.edu.itbrains.freshshop.service.StartService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StartServiceImpl implements StartService {

    private final StartRepository startRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StartDto> getAllStarts() {
        List<StartDto> startDtoList = startRepository.findAll()
                .stream()
                .map(start -> modelMapper.map(start, StartDto.class)).collect(Collectors.toList());
        return startDtoList;
    }
}
