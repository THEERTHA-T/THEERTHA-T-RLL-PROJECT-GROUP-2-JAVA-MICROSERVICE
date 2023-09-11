package com.ipm.admin.reply.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ipm.admin.reply.entity.AdminReply;
import com.ipm.admin.reply.services.AdminReplyService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AdminReplyController {

    private final AdminReplyService adminReplyService;

    @Autowired
    public AdminReplyController(AdminReplyService adminReplyService) {
        this.adminReplyService = adminReplyService;
    }

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAdminReply(@RequestBody AdminReply adminReply) {
    	log.info("save admin reply request {}",adminReply);
        adminReplyService.saveAdminReply(adminReply);
        log.info("saved admin reply request successfully ");
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
