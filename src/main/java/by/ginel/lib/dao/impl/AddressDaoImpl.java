package by.ginel.lib.dao.impl;

import by.ginel.lib.dao.api.AddressDao;
import by.ginel.lib.dao.entity.Address;
import org.springframework.stereotype.Repository;

@Repository
public class AddressDaoImpl extends AbstractDao<Address> implements AddressDao {
    @Override
    protected Class<Address> getEntityClass() { return Address.class; }
}
