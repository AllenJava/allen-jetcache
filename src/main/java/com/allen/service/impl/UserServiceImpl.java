package com.allen.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CreateCache;
import com.allen.dao.UserInfoMapper;
import com.allen.dao.entity.UserInfo;
import com.allen.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
    
    @Resource
    private UserInfoMapper userInfoMapper;
    
    @CreateCache(name="userCache",expire=200)
    private Cache<Integer, UserInfo> userCache;

    @Override
    public UserInfo findByUserId(Integer userId) {
        // TODO Auto-generated method stub
        System.out.println("走DB,用户id:"+userId);
        UserInfo userInfo=userInfoMapper.selectByPrimaryKey(userId);
        if(userInfo!=null){
            userCache.put(userId, userInfo);
        }
        return userInfo;
    }

    @Override
    public UserInfo findByUserIdFromCache(Integer userId) {
        // TODO Auto-generated method stub
        return userCache.get(userId);
    }

//    @Override
//    public int updateUser(UserInfo user) {
//        // TODO Auto-generated method stub
//        System.out.println("走DB,用户id:"+user.getId());
//        return userInfoMapper.updateByPrimaryKeySelective(user);
//    }

//    @Override
//    public int deleteUser(Integer userId) {
//        // TODO Auto-generated method stub
//        return userInfoMapper.deleteByPrimaryKey(userId);
//    }

}
