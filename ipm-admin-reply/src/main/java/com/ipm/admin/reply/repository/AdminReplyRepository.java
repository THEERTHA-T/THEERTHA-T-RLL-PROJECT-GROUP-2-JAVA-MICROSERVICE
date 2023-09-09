package com.ipm.admin.reply.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipm.admin.reply.entity.AdminReply;


@Repository
public interface AdminReplyRepository extends JpaRepository<AdminReply, Long> {
	
	Optional<AdminReply>  findByQid(Long qid);
	
    // You can add custom query methods here if needed
}
