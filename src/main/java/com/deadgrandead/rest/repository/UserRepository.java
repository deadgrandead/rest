package com.deadgrandead.rest.repository;

import com.deadgrandead.rest.entity.Authorities;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if ("admin".equals(user) && "secret".equals(password)) {
            return Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        }
        return Collections.emptyList();
    }
}
