package com.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {
	
	public List<Account> findAllByAccTypeIgnoreCase(String accType);
	
	public List<Account> findAllByNameIgnoreCase(String name);
	
	public List<Account> findAllByNameLike(String name);

}