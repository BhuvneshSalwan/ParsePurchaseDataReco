package com.parse.reconcilation.main;

import java.util.ArrayList;

import org.bson.Document;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.back4app.entities.ReconcilationData;
import com.back4app.mongo.MongoDAO;
import com.back4app.mongoOperation.MongoOp;
import com.hibernate.factory.BuildFactory;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class Common {

	public void getRecoData(){
		
		ArrayList<Document> recoDocumentData = MongoOp.getReconcilationData();
		
		System.out.println(recoDocumentData.size());
		
		if(recoDocumentData.size() > 0){
		
			SessionFactory factory = BuildFactory.getFactory();	
			
			System.out.println(factory);
			
			Session sessionTruncate = BuildFactory.getFactory().openSession();
			sessionTruncate.beginTransaction();
			sessionTruncate.createSQLQuery("TRUNCATE TABLE api_data.parse_sale_reconcilation_data;").executeUpdate();
			sessionTruncate.getTransaction().commit();
			sessionTruncate.close();
			
			for(Document recoDocument : recoDocumentData){
				
				ReconcilationData sqlRecoData = new ReconcilationData();
				
				System.out.println("The Recocilation Data ObjectId outside is : "+recoDocument.getString("_id"));
				
				if(recoDocument.containsKey("_id")){
					
					sqlRecoData.setObjectID(recoDocument.getString("_id"));
					
				}else{
					sqlRecoData.setObjectID(null);
				}
				
				if(recoDocument.containsKey("purchase_data_id")){
					
					sqlRecoData.setPurchase_data_id(recoDocument.getString("purchase_data_id"));
					
				}else{
					sqlRecoData.setPurchase_data_id(null);
				}
				
				if(recoDocument.containsKey("total_amount")){
					
					sqlRecoData.setTotal_amount(recoDocument.getString("total_amount"));
					
				}else{
					sqlRecoData.setTotal_amount(null);
				}
				
				if(recoDocument.containsKey("order_id")){
					
					sqlRecoData.setOrder_id(recoDocument.getString("order_id"));
					
				}else{
					sqlRecoData.setOrder_id(null);
				}
				
				if(recoDocument.containsKey("calc_total_amount")){
					
					sqlRecoData.setCalc_total_amount(recoDocument.getString("calc_total_amount"));
					
				}else{
					sqlRecoData.setCalc_total_amount(null);
				}
				
				if(recoDocument.containsKey("calc_order_id")){
					
					sqlRecoData.setCalc_order_id(recoDocument.getString("calc_order_id"));
					
				}else{
					sqlRecoData.setCalc_order_id(null);
				}
				
				if(recoDocument.containsKey("hostname")){
					
					sqlRecoData.setHostname(recoDocument.getString("hostname"));
					
				}else{
					sqlRecoData.setHostname(null);
				}
				
				if(recoDocument.containsKey("page_url")){
					
					sqlRecoData.setPage_url(recoDocument.getString("page_url"));
					
				}else{
					sqlRecoData.setPage_url(null);
				}
				
				if(recoDocument.containsKey("_created_at")){
					
					sqlRecoData.setCreatedAt(recoDocument.getDate("_created_at"));
					
				}else{
					sqlRecoData.setCreatedAt(null);
				}
				
				if(recoDocument.containsKey("_updated_at")){
					
					sqlRecoData.setUpdatedAt(recoDocument.getDate("_updated_at"));
					
				}else{
					sqlRecoData.setUpdatedAt(null);
				}
				
				if(recoDocument.containsKey("gtm_container_id")){
					
					sqlRecoData.setGtm_container_id(recoDocument.getString("gtm_container_id"));
					
				}else{
					sqlRecoData.setGtm_container_id(null);
				}
				
				Session session = BuildFactory.getFactory().openSession();
				session.beginTransaction();
		
				System.out.println("Session Value is : " + session);
				
				System.out.println(sqlRecoData.getString());
				
				int reco_data_id = (Integer) session.save(sqlRecoData);
				
				System.out.println("Reco Data ID created is : "+reco_data_id);
				
				session.getTransaction().commit();
				session.close();
							
			}
			
		}else{
			System.out.println("No Creation is requested in Parse.");
		}
			
	}
	
}