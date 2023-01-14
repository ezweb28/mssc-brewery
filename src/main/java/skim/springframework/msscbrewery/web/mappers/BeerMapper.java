package skim.springframework.msscbrewery.web.mappers;

import org.mapstruct.Mapper;
import skim.springframework.msscbrewery.domain.Beer;
import skim.springframework.msscbrewery.web.model.BeerDto;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
