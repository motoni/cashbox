package com.cashless.hackathon.cashbox.cashBoxUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CashBoxUserRepository extends JpaRepository<CashBoxUser,Long> {

}
