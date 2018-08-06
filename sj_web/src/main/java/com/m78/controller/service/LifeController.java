package com.m78.controller.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.service.service.LifeOptionService;
import com.m78.service.service.LifeService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 生活导航
 */

@Controller
@RequestMapping("life")
public class LifeController {

     @Reference
     private LifeService lifeService;
     @Reference
     private LifeOptionService lifeOptionService;

    /**
     * 跳转到生活导航
     * @return
     */
     @RequestMapping("doLifeList")
     public  String doLifeList(){
      return  "service/life/lifeList";
     }

    /**
     * 跳转添加导航
     * @return
     */
    @RequestMapping("doAddLife")
     public  String doAddLife(){
        return  "service/life/addLife";
    }

    /**
     * 获取所有生活导航
     * @return
     */
    @RequestMapping("getAllLift.json")
    @ResponseBody
     public  Object getAllLife(@RequestParam("name") String name,@RequestParam("page") int page,
                               @RequestParam("limit") int limit){
            return DataTable.bindTableUtil(0,lifeService.getLifeCount(name),lifeService.getAllLife(name,
                                            page,limit));
     }

    /**
     * 根据id删除导航
     * @return
     */
    @RequestMapping("deleteLifeById.json")
    @ResponseBody
     public  Object deleteLifeById(@RequestParam("lifeId") Long lifeId){
        return  lifeService.deleteLifeById(lifeId);
    }

    /**
     *
     * 获取所有标签
     * @return
     */
    @RequestMapping("getAllOption.json")
    @ResponseBody
    public  Object getAllOption(){
       return  lifeOptionService.getAllOption();
    }


}
