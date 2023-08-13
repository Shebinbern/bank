package com.bank.bank.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.bank.bank.entity.BankDetails;

@Repository

public interface BankDetailsRepository extends JpaRepository<BankDetails, Long>{

}
