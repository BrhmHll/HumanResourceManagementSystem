package io.kodlama.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import io.kodlama.hrms.entities.concretes.SystemUser;

public interface SystemUserDao extends JpaRepository<SystemUser, Integer> {

}
