package com.ipm.admin.reply.adminreply.services;

import com.ipm.admin.reply.adminreply.entity.AdminReply;

import java.util.List;

public interface AdminReplyService {

    void saveAdminReply(AdminReply adminReply);

    List<AdminReply> getAllAdminReplies();

    AdminReply getAdminReplyById(Long answerId);
}
