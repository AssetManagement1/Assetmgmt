package com.cg.DAO;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.cg.entity.Asset;

@Repository("assDao")
public interface AssetDAO extends JpaRepository<Asset, Integer> {
	
}
