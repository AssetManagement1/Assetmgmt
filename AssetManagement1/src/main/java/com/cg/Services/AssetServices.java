package com.cg.Services;



import java.util.List;
import org.springframework.stereotype.Service;

import com.cg.entity.Asset;

@Service
public interface AssetServices {

	public List<Asset> addAsset(Asset e);
	public List<Asset> updateAsset(Asset e);
	public Asset getEmployeeById(Integer empid);
	public List<Asset> deleteAsset(Integer empid);
	public List<Asset> getAllAsset();
	Asset getAssetById(Integer assid);
	
}
