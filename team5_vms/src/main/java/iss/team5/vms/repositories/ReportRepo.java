package iss.team5.vms.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import iss.team5.vms.model.Report;


public interface ReportRepo extends JpaRepository<Report,String>{
	


}
