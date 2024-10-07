package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.model.Role;

public interface RoleService {
    Role getById(long id);
}