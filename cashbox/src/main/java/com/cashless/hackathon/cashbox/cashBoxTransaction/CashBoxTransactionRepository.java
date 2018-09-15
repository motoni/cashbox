package com.cashless.hackathon.cashbox.cashBoxTransaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CashBoxTransactionRepository extends JpaRepository<CashBoxTransaction,Long> {

}
