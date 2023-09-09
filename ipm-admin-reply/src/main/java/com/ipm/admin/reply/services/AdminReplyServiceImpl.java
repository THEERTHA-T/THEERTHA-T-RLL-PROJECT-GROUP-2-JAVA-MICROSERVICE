package com.ipm.admin.reply.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipm.admin.reply.entity.AdminReply;
import com.ipm.admin.reply.repository.AdminReplyRepository;

@Service
public class AdminReplyServiceImpl implements AdminReplyService {

    private final AdminReplyRepository adminReplyRepository;

    @Autowired
    public AdminReplyServiceImpl(AdminReplyRepository adminReplyRepository) {
        this.adminReplyRepository = adminReplyRepository;
    }

    @Override
    public void saveAdminReply(AdminReply adminReply) {
        adminReplyRepository.save(adminReply);
    }

    @Override
    public List<AdminReply> getAllAdminReplies() {
        return adminReplyRepository.findAll();
    }

    @Override
    public AdminReply getAdminReplyById(Long answerId) {
        Optional<AdminReply> adminReplyOptional = adminReplyRepository.findByQid(answerId);
        return adminReplyOptional.orElse(null);
    }
}
