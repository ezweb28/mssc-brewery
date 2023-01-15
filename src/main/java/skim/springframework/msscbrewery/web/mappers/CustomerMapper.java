package skim.springframework.msscbrewery.web.mappers;

import org.mapstruct.Mapper;
import skim.springframework.msscbrewery.domain.Customer;
import skim.springframework.msscbrewery.web.model.CustomerDto;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
