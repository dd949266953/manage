package com.m78.controller.datacenter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.entity.Community;
import com.m78.service.dataCenter.CommunityService;
import com.m78.util.DataTable;
import com.m78.util.upload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * 小区
 */
@RequestMapping("Community")
@Controller
public class CommunityController {

    @Reference(version="1.0.0")
    private CommunityService communityService;

    /**
     * 查询界面
     * @return
     */

    @RequestMapping("communityList.html")
    public String CommunityList(){
        return "dataCenter/community/community";
    }

    /**
     * 添加界面
     * @return
     */
    @RequestMapping(value = "addCommunity.html")
    public String addCommunity(){
        return "dataCenter/community/addCommunity";
    }

    /**
     * 查询界面数据
     * @return
     */
    @RequestMapping(value = "/communityData")
    @ResponseBody
    public  Object  findAllCommunity(@RequestParam("page") int page, @RequestParam("limit") int limit,@RequestParam("communityName") String communityName){
        return  DataTable.bindTableUtil(0,100,communityService.findAll(page,limit,communityName));
    }

    /**
     * 添加小区
     */
    @RequestMapping("addCommunity")
    @ResponseBody
    public int insertCommunity(Community record){
        System.out.println(record.toString());
        return  communityService.insert(record);
    }

    /**
     * 删除小区
     */
    @RequestMapping(value = "deleteCommunity",method = RequestMethod.GET)
    @ResponseBody
    public int delCommunity(long id){
        return  communityService.deleteByPrimaryKey((long)id);
    }

    /**
     * 查询小区 id 名称
     */
    @RequestMapping("getCommunityIdAndName")
    @ResponseBody
    public List<Community> getCommunityIdAndName(){
        return communityService.getCommunityIdAndName();
    }

    /**
     * 根据小区名称查询小区id
     * @return
     */
    @RequestMapping("getCommunityIdByName")
    @ResponseBody
    public Long getCommunityIdByName(@RequestParam("communityName")String communityName){
        return communityService.getCommunityIdByName(communityName);
    }

    @RequestMapping("upload")
    @ResponseBody
    public Object uploadimg(@RequestParam("file") MultipartFile file,HttpServletRequest request){
        try {
            //获取文件上传的路径
            //String path=request.getServletContext().getRealPath("files");
            //String basePath= ResourceUtils.getURL("spoons/static/").getPath();
            String fileName = file.getOriginalFilename();//获取file图片名称
            String filePath ="D:/files1/";  //地址
            upload.upload(file, filePath, fileName);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
        return 1;
    }
}
