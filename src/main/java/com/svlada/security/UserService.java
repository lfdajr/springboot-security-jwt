package com.svlada.security;

import java.util.Optional;

import com.svlada.entity.User;

public interface UserService {

    public Optional<User> getByUsername(String username);
}
