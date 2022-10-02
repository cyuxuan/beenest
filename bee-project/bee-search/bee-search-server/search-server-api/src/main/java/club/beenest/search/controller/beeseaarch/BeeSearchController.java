package club.beenest.search.controller.beeseaarch;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeeSearchController {

    /**
     * 搜索主接口
     *
     * @return 返回搜索结果
     */
    @PostMapping("/search")
    @ResponseBody
    public String doSearch() {
        return "search";
    }
}
