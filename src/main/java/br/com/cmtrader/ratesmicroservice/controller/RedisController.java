package br.com.cmtrader.ratesmicroservice.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cmtrader.ratesmicroservice.model.Rates;

/**
 * RedisDemoController
 */
@RestController
public class RedisController {

    private static final String REDIS_INDEX_KEY = "RATES";

    @Autowired
    RedisTemplate<String,Object> redisTemplate;

    @RequestMapping(value="/api/rates", method=RequestMethod.POST)
    public String createRates(@RequestBody Rates rates) {
        redisTemplate.opsForHash().put(REDIS_INDEX_KEY, rates.getTime(), rates.toString());
        return "Rates is saved successfully";
    }
    
    @RequestMapping(value="/api/rates", method=RequestMethod.GET)
    public ResponseEntity<Object> getRates() {
        Logger.getAnonymousLogger().log(Level.INFO, "get retas");
        return new ResponseEntity<>(redisTemplate.opsForHash().entries(REDIS_INDEX_KEY),HttpStatus.OK);
    }
}