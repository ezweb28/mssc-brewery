package skim.springframework.msscbrewery.services.v2;

import org.springframework.stereotype.Service;
import skim.springframework.msscbrewery.web.model.BeerDto;
import skim.springframework.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
