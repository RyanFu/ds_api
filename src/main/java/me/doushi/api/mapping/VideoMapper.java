package me.doushi.api.mapping;

import me.doushi.api.domain.Video;

import java.util.List;
import java.util.Map;

/**
 * 视频资源 数据<->DB
 * Created by songlijun on 15/10/23.
 */
public interface VideoMapper {

    /**
     * 获取发现 Banner
     * @return
     */
    List<Video> getVideosByBanner();

    /**
     * 根据类型获取视频
     * @param parMap
     * @return
     */
    List<Video> getVideosByType(Map<String, Object> parMap);
}
