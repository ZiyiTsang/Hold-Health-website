package com.JDBC;

import com.POJO.ArticleBean;
import com.mapper.ArticleMapper;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ArticleDAO extends BaseDAO {
    private final ArticleMapper mapper;
    private final SqlSession sqlSession;
//    private final RedisOps redis;
    public ArticleDAO() throws IOException {
        sqlSession=getSqlSession();
        mapper= sqlSession.getMapper(ArticleMapper.class);
//        this.redis= new RedisOps();
    }
    public ArticleBean getArticleById(int id){
        return mapper.selectById(id);
    }
    public  List<ArticleBean> getArticleBetweenId(int idFirst, int idLast){
        return mapper.selectBetweenId(idFirst,idLast);
    }
    public  List<ArticleBean> getAllArticle(){
        return mapper.selectAll();
    }
    public  int addArticle(String title,String content,String img,String authorIMG){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return mapper.addArticle(title,content,sdf.format(date),img,authorIMG);
    }
    public  int addArticleComplete(ArticleBean article){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return mapper.addArticleComplete(sdf.format(date), article.getTitle(),article.getContent(), article.getTag(), article.getAuthor(), article.getAbstract(), article.getArtIMG(), article.getArtAuthorIMG());
    }
    public void deleteById(int id){
        mapper.deleteById(id);
    }
    public ArticleBean getTitleById(int id){
//        String redisRes=redis.getArticleTitleById(id);
//        if(redisRes==null){
//            System.out.printf("id:%d not in redis,find in Mysql\n",id);
//            ArticleBean ab=mapper.selectTitleById(id);
//            if(ab==null){
//                return "Not this article in DB";
//            }
//            String title=ab.getTitle();
//            redis.setArticleIdAndTitle(String.valueOf(id),ab.getTitle());
//            return title;
//        }
//        System.out.printf("id:%s in redis,return value directly\n",id);
//        return redisRes;
        return mapper.selectTitleById(id);
    }
    public void FlushTable(){
        mapper.deleteAll();
    }
//    public void FlushRedis(){
//        redis.flushAll();
//    }

    public List<ArticleBean> getArticleByAuthor(String author){
        return mapper.selectByAuthor("%"+author+"%");
    }
    public List<ArticleBean> getArticleByTag(String tag){
        return mapper.selectByTag("%"+tag+"%");
    }
    public List<ArticleBean> getArticleByTitle(String title){
        return mapper.selectByTitle("%"+title+"%");
    }

    public void moreViewByArticleID(int id) {
        mapper.moreView(id);
    }
}
