package club.beenest.search.impl;

import club.beenest.search.dao.BeeSearchDao;
import club.beenest.search.BeeSearchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BeeSearchServiceImpl implements BeeSearchService {

    @Resource
    private BeeSearchDao beeSearchDao;

    @Override
    public Long doSearch() {
        return beeSearchDao.doSearch();
    }
}
