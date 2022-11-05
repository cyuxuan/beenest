package club.beenest.search.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BeeSearchDao {
    Long doSearch();
}
