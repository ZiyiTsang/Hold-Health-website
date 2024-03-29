package com.mapper;

import com.JDBC.VideoDAO;
import com.POJO.VideoBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideoMapper {
    int addVideo(@Param("title") String title, @Param("link")String link, @Param("author")String author, @Param("tag") String tag, @Param("abstract_") String abstract_, @Param("authorIMG") String authorIMG, @Param("absIMG") String absIMG);
    List<VideoBean> selectByTag(String Tag);
    List<VideoBean> selectAll();

    List<VideoBean> selectByAuthor(String author);
    List<VideoBean> selectByTitle(String Title);

}
