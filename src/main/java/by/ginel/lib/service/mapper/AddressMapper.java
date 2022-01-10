package by.ginel.lib.service.mapper;

import by.ginel.lib.dao.entity.Address;
import by.ginel.lib.service.dto.AddressCreateDto;
import by.ginel.lib.service.dto.AddressGetDto;
import by.ginel.lib.service.dto.AddressUpdateDto;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {

    Address addressCreateDtoToAddress(AddressCreateDto addressCreateDto);
    Address addressUpdateDtoToAddress(AddressUpdateDto addressUpdateDto);
    AddressGetDto addressToAddressGetDto(Address address);
}
