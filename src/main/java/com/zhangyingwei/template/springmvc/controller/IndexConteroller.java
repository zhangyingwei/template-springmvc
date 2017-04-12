package com.zhangyingwei.template.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: zhangyw
 * @date: 2017/4/12
 * @time: 下午8:23
 * @desc:
 */
@Controller
@RequestMapping(value = "/index")
public class IndexConteroller {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ModelAndView index(@PathVariable(value = "id") String id){
        ModelAndView result = new ModelAndView("index");
        Map map = new HashMap();
        map.put("id", id);
        result.addAllObjects(map);
        System.out.println("id:"+id);
        return result;
    }
}
