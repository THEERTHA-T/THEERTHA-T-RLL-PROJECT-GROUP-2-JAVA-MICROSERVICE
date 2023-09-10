package com.ipm.admin.reply.services;

import java.util.List;

import com.ipm.admin.reply.entity.AdminReply;

public interface AdminReplyService {

    void saveAdminReply(AdminReply adminReply);

    List<AdminReply> getAllAdminReplies();

    AdminReply getAdminReplyById(Long answerId);
}
