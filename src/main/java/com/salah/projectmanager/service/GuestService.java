package com.salah.projectmanager.service;

import com.salah.projectmanager.domain.Message;
import com.salah.projectmanager.domain.User;
import com.salah.projectmanager.domain.Project;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bnadem on 6/2/17.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public interface GuestService {
    void signUp(User user);
    User signIn(String usernameOrEmail);
    void sendMessage(Message msg);
    List<Project> search(String keyword);
}