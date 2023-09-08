package com.ipm.admin.reply.adminreply.repository;

import com.ipm.admin.reply.adminreply.entity.AdminReply;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AdminReplyRepository extends JpaRepository<AdminReply, Long> {
	
	Optional<AdminReply>  findByQid(Long qid);
	
    // You can add custom query methods here if needed
}
