package com.sap.tomjpa.repository;
import com.sap.tomjpa.model.UserRecord;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserRecord,String> {
}
