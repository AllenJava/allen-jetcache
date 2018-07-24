package com.allen.service;

import com.alicp.jetcache.anno.CacheInvalidate;
import com.alicp.jetcache.anno.CacheRefresh;
import com.alicp.jetcache.anno.CacheUpdate;
import com.alicp.jetcache.anno.Cached;
import com.allen.dao.entity.UserInfo;

public interface UserService {
   
   /**
    * jetcache缓存方法
    */
   @Cached(name="findByUserId",expire = 100)
   @CacheRefresh(refresh=60)
   UserInfo findByUserId(Integer userId);
   
   UserInfo findByUserIdFromCache(Integer userId);
   
//   @CacheUpdate(name="userCache.", key="#user.id", value="#user")
//   int updateUser(UserInfo user);
   
//   @CacheInvalidate(name="userCache", key="#userId")
//   int deleteUser(Integer userId);

}
