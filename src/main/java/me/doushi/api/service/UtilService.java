package me.doushi.api.service;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;

/**
 * Created by songlijun on 15/11/13.
 */
public interface UtilService {
    /**
     * 获取七牛 上传token
     * @param httpServletRequest
     * @return
     */
    Response getQiNiuUpToken(HttpServletRequest httpServletRequest);
}
