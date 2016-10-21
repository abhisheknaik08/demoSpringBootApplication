package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {

    @Id
    @GeneratedValue
    private Integer accountId;

    private String name;

    private String accType;

    public Integer getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public String getAccType() {
        return accType;
    }

    public Account(Integer accountId, String name, String accType) {
        super();
        this.accountId = accountId;
        this.name = name;
        this.accType = accType;
    }

    public Account(String name, String accType) {
        super();
        this.name = name;
        this.accType = accType;
    }
    @Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name
				+ ", accType=" + accType + "]";
	}

	public Account() {

    }
}