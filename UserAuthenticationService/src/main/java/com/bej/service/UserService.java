package com.bej.service;

import com.bej.domain.User;
import com.bej.exception.UserAlreadyExistsException;
import com.bej.exception.UserNotFoundException;

public interface UserService {
    User saveUser(User user) throws UserAlreadyExistsException;
    User findByUserIdAndPassword(int userId,String password) throws UserNotFoundException;
}
