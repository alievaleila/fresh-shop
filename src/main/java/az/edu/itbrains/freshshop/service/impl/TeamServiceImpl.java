package az.edu.itbrains.freshshop.service.impl;

import az.edu.itbrains.freshshop.dto.TeamDto;
import az.edu.itbrains.freshshop.repository.TeamRepository;
import az.edu.itbrains.freshshop.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<TeamDto> getAllTeams() {
        List<TeamDto> teamDtoList = teamRepository.findAll()
                .stream()
                .map(team -> modelMapper.map(team, TeamDto.class))
                .collect(Collectors.toList());
        return teamDtoList;
    }
}
