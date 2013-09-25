package br.com.uol.test.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly=true)
public class HomeRepositoryImpl implements HomeRepository {

	@PersistenceContext
	private EntityManager em;
	
	public String getMerchantName(){
		Query query = em.createNativeQuery("SELECT DES_MERCHANT  FROM MERCHANT where IDT_MERCHANT = 1;");
		String name = query.getSingleResult().toString();
		return name;
	}
}
