package com.example.redi_swagger.service;

import com.example.redi_swagger.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    static HashMap<Integer, User> hm = new HashMap<>();

    public User addUser(User data) {
        if (!hm.containsKey(data.getId())) {
            hm.put(data.getId(), data);
        } else {
            throw new RuntimeException("User id already exist");
        }
        return data;
    }


    public List<User> getDatas() {
        return hm.values().stream().collect(Collectors.toList());
    }


    @Cacheable(value = "users", key = "#id")
    public User getData(int id) {
        System.out.println(id);
        System.out.println(hm.get(Integer.parseInt(String.valueOf(id))));
        return hm.get(Integer.parseInt(String.valueOf(id)));
    }


    @CacheEvict(value= "users", key = "#id")
    public String delete(int id) {
        return "DELETED..";
    }



}






/*


@Service
public class UserService {

    static HashMap<Integer, User> hm = new HashMap<>();

    @Autowired
    private RedisTemplate redisTemplate;


    public User addUser(User data) {
        redisTemplate.opsForHash().put("USER", Integer.toString(data.getId()), data);
        return data;
    }


    public List<User> getDatas() {
        return redisTemplate.opsForHash().values("USER");
    }

}


 */