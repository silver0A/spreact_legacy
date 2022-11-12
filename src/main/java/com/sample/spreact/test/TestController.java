package com.sample.spreact.test;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/**/*.ajax")
public class TestController {
    
    @PostMapping(value="/**/test", produces="application/json; charset=utf-8")
    @ResponseBody
	public String test(@RequestBody Map<String, Object> map) {
        return "world " + map.get("param1");
	}
}
