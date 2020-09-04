package com.zc.study.reposity;

import com.zc.study.entity.BOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BOrderRespository extends JpaRepository<BOrder, Long> {
}
