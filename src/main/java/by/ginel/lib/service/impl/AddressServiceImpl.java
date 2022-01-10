package by.ginel.lib.service.impl;

import by.ginel.lib.dao.api.AddressDao;
import by.ginel.lib.dao.entity.Address;
import by.ginel.lib.service.api.AddressService;
import by.ginel.lib.service.dto.AddressCreateDto;
import by.ginel.lib.service.dto.AddressGetDto;
import by.ginel.lib.service.dto.AddressUpdateDto;
import by.ginel.lib.service.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressDao addressDao;

    @Autowired
    AddressMapper addressMapper;

    @Transactional
    @Override
    public void save(AddressCreateDto addressCreateDto) {
        addressDao.save(addressMapper.addressCreateDtoToAddress(addressCreateDto));
    }

    @Transactional
    @Override
    public void delete(Long id) {
        addressDao.delete(id);
    }

    @Transactional
    @Override
    public void update(AddressUpdateDto addressUpdateDto) {
        addressDao.update(addressMapper.addressUpdateDtoToAddress(addressUpdateDto));
    }

    @Override
    public AddressGetDto getById(Long id) {
        Address address = addressDao.getById(id);
        return  addressMapper.addressToAddressGetDto(address);
    }

    @Override
    public List<AddressGetDto> getAll() {
        List<Address> addresses = addressDao.getAll();
        return addresses
                .stream()
                .map(address ->addressMapper.addressToAddressGetDto(address))
                .collect(Collectors.toList());
    }
}
