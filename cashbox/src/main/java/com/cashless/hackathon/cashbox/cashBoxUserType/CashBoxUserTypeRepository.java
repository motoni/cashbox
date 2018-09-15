package com.cashless.hackathon.cashbox.cashBoxUserType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CashBoxUserTypeRepository extends JpaRepository<CashBoxUserType,Long> {

}
