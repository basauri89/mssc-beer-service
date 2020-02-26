package com.jbasauri.msscbeerservice.web.mappers;

import com.jbasauri.msscbeerservice.domain.Beer;
import com.jbasauri.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
