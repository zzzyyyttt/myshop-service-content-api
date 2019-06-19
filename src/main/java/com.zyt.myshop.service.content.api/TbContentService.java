package com.zyt.myshop.service.content.api;

import com.github.pagehelper.PageInfo;
import com.zyt.myshop.commons.domain.TbContent;

public interface TbContentService {

    /**
     * 分页查询
     * @param start
     * @param length
     * @param tbContent
     * @return
     */
    PageInfo<TbContent> page(int start, int length, TbContent tbContent);
}
