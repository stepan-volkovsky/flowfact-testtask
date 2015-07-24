package com.flowfact.test.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.flowfact.test.model.Address;
import com.flowfact.test.model.PhoneNumber;

@Component
public class AddressDAO implements IAddressDAO {

	@PersistenceContext
	protected EntityManager entityManager;

	public Set<Address> search(Long id, String postalCode, String country,
			String countryArea, String city, String cityArea,
			String streetLine0, String streetLine1) {
		// TODO Auto-generated method stub

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Address> query = cb.createQuery(Address.class);
		Root<Address> r = query.from(Address.class);
		List<Predicate> predicates = new ArrayList<Predicate>();
		Set<Address> result = new HashSet<Address>();
		if (id != null) {
			result.add(getById(id));
		} else {
			if (postalCode != null && !postalCode.isEmpty()) {
				predicates.add(cb.equal(r.get("postcode"), postalCode));
			}
			if (country != null && !country.isEmpty()) {
				predicates.add(cb.equal(r.get("country"), country));
			}
			if (countryArea != null && !countryArea.isEmpty()) {
				predicates.add(cb.equal(r.get("countryArea"), countryArea));
			}
			if (city != null && !city.isEmpty()) {
				predicates.add(cb.equal(r.get("city"), city));
			}
			if (cityArea != null && !cityArea.isEmpty()) {
				predicates.add(cb.equal(r.get("cityArea"), cityArea));
			}
			if (streetLine0 != null && !streetLine0.isEmpty()) {
				predicates.add(cb.equal(r.get("streetLine0"), streetLine0));
			}
			if (streetLine1 != null && !streetLine1.isEmpty()) {
				predicates.add(cb.equal(r.get("streetLine1"), streetLine1));
			}
			if (!predicates.isEmpty()) {
				query.where(cb.and(predicates.toArray(new Predicate[predicates
						.size()])));
			}
			List<Address> addresses = entityManager.createQuery(query)
					.getResultList();
			result.addAll(addresses);
		}
		return result;
	}

	private Address getById(Long id) {
		return entityManager.find(Address.class, id);
	}

	@Transactional
	public void put(Address address) {
		entityManager.persist(address);
	}

	@Transactional
	public void update(Address address) {
		entityManager.merge(address);
	}

	@Transactional
	public void delete(Long addressId) {
		Address address = getById(addressId);
		if (address != null) {
			entityManager.remove(address);
		}
	}

	public Set<PhoneNumber> getPhoneNumbers(Long addressId) {
		Address address = getById(addressId);
		return address.getPhoneNumbers();
	}

}
