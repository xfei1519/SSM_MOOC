package com.fei.mapper;

import com.fei.domain.UserInfo;
import org.springframework.stereotype.Repository;


@Repository
public interface OperationDao {
    public UserInfo selectOperationsByUsername(String username) throws Exception;
}
