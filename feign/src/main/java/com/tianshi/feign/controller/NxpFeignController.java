package com.tianshi.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tianshi.feign.service.NxpFeignService;

@RestController
public class NxpFeignController {
	
	@Autowired
	private NxpFeignService feignService;
	
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return feignService.add(10, 20);
    }

}
