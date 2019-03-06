package com.fei.serviceImpl;

import com.fei.domain.UserInfo;
import com.fei.mapper.OperationDao;
import com.fei.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {
    
    @Autowired
    private OperationDao operationDao;

    @Override
    public UserInfo getUserInfoByUsername(String username) throws Exception{
        UserInfo userInfo = operationDao.selectOperationsByUsername(username);
        return userInfo;
    }

}
