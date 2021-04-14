package com.cg.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Asset;
import com.cg.Services.AssetServices;

@RestController
@RequestMapping("/asset")
public class AssetController {

	
	@Autowired
	AssetServices asser;
	
	
	
	@PostMapping("/addAss")
	public List<Asset> addAsset(Asset e){
		System.out.println("in ass controller add Asset");
		return asser.addAsset(e);
	}
		
	
	@PostMapping("/updateAss")
	public List<Asset> updateAsset(Asset e){
		System.out.println("in ass controller update Asset");
		return asser.updateAsset(e);
	}
	
	
	@GetMapping("/getAssById/{Assid}")
	public Asset getAssetById(@PathVariable Integer empid) {
		System.out.println("in ass controller get Asset by id");
		return asser.getEmployeeById(empid);
	}
	
	
	@DeleteMapping("/deleteEmp/{empid}")
	public List<Asset> deleteAsset(@PathVariable Integer assid){
		System.out.println("in ass controller delete Asset");
		return asser.deleteAsset(assid);
	}
	
	
	@GetMapping("/findAll")
	public List<Asset> getAllAsset(){
		System.out.println("in ass controller get all Asset");
		return asser.getAllAsset();
	}
	
	
	
}
