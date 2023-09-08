package com.ipm.admin.reply.adminreply.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.ipm.admin.reply.adminreply.entity.AdminReply;
import com.ipm.admin.reply.adminreply.services.AdminReplyService;

import java.util.List;

@RestController
@RequestMapping("/admin-replies")
public class AdminReplyController {

    private final AdminReplyService adminReplyService;

    @Autowired
    public AdminReplyController(AdminReplyService adminReplyService) {
        this.adminReplyService = adminReplyService;
    }

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAdminReply(@RequestBody AdminReply adminReply) {
        adminReplyService.saveAdminReply(adminReply);
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AdminReply> getAllAdminReplies() {
        return adminReplyService.getAllAdminReplies();
    }

    @GetMapping(value = "/{answerId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public AdminReply getAdminReplyById(@PathVariable("answerId") Long answerId) {
        return adminReplyService.getAdminReplyById(answerId);
    }
    
}
