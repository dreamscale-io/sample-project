package org.dreamscale.sample.core.service;

import lombok.extern.slf4j.Slf4j;
import org.dreamscale.sample.api.GreetingDto;
import org.dreamscale.sample.core.domain.GreetingEntity;
import org.dreamscale.sample.core.domain.GreetingRepository;
import org.dreamscale.sample.core.mapper.DtoEntityMapper;
import org.dreamscale.sample.core.mapper.MapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class CrudService {

    @Autowired
    GreetingRepository greetingRepository;

    @Autowired
    private MapperFactory mapperFactory;
    private DtoEntityMapper<GreetingDto, GreetingEntity> entityMapper;

    @PostConstruct
    private void init() {
        entityMapper = mapperFactory.createDtoEntityMapper(GreetingDto.class, GreetingEntity.class);
    }

    public List<GreetingDto> createGreetings(UUID userAccountId, String name) {
        List<GreetingDto> greetings = new ArrayList<>();

        for (GreetingEntity greetingEntity : greetingRepository.findAll()) {
            GreetingDto greetingDto = entityMapper.toApi(greetingEntity);
            greetingDto.setGreetingWithName(greetingEntity.getGreeting() + name + ", with user: "+userAccountId);

            greetings.add(greetingDto);
        }

        return greetings;
    }
}
