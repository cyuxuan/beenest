package club.beenest.search.controller;

import club.beenest.search.BeeSearchService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BeeSearchController {
    @Resource
    private BeeSearchService beeSearchService;

    /**
     * 搜索主接口
     *
     * @return 返回搜索结果
     */
    @PostMapping("/search")
    @ResponseBody
    public String doSearch() {
        return String.valueOf(beeSearchService.doSearch());
    }
}
