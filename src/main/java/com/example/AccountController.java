package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@RequestMapping("/")
	public String list(ModelMap modelMap){
		List<Account> accounts = (List<Account>) accountRepository.findAll();
		modelMap.put("accounts", accounts);
		//return accountRepository.findAll();
		return "account";
	}
	
	/*@RequestMapping("/{id}")
	public Account findByAccountType(@PathVariable(value="id") Integer id){
		return accountRepository.findOne(id);
	}*/
	
	@RequestMapping("/acctype/{accType}")
	public String findByAccountType(@PathVariable(value="accType") String accType, ModelMap modelMap){
		//return accountRepository.findAllByAccTypeIgnoreCase(accType);
		List<Account> accounts = accountRepository.findAllByAccTypeIgnoreCase(accType);
		modelMap.put("accounts", accounts);
		return "account";
	}
	
	@RequestMapping("/name/{name}")
	public String findByName(@PathVariable(value="name") String name, ModelMap modelMap){
		//return accountRepository.findAllByNameLike('%' + name + '%');
		List<Account> accounts = accountRepository.findAllByNameLike('%' + name + '%');
		modelMap.put("accounts", accounts);
		return "account";
	}

}
