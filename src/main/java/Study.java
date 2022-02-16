import com.lhzh.study.AddDraftParam;
import com.lhzh.study.Article;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Study {
    public static void main(String[]args){
//        AddDraftParam addDraftParam = new AddDraftParam();
//        addDraftParam.setAppid("123");
//        List<Article> articles = new ArrayList<>();
//        Article article = new Article();
//        article.setTitle("title");
//        article.setThumb_media_id("345");
////            article.setAuthor("公司名");
//        article.setDigest("sumary");
//        article.setShow_cover_pic(1);
//        article.setContent("");
////                    article.setContent_source_url();
//        article.setNeed_open_comment(0);
//        article.setOnly_fans_can_comment(0);
//        articles.add(article);
//        addDraftParam.setArticles(articles);
//        String toJson = JsonUtil.toJson(addDraftParam);
//        System.out.println(toJson);
//        AddDraftParam addDraftParam = new AddDraftParam();
//        AddDraftParam addDraftParam1 = new AddDraftParam();
//        addDraftParam1.setAppid("122");
//        BeanUtils.copyProperties(addDraftParam1,addDraftParam);
//        System.out.println(addDraftParam);

        List<AddDraftParam>sList = new ArrayList<>();
        AddDraftParam addDraftParam = new AddDraftParam();
        addDraftParam.setAppid("005");
        sList.add(addDraftParam);
        AddDraftParam addDraftParam1 = new AddDraftParam();
        addDraftParam.setAppid("004");
        sList.add(addDraftParam1);
        AddDraftParam addDraftParam2 = new AddDraftParam();
        addDraftParam.setAppid("008");
        sList.add(addDraftParam2);
        AddDraftParam addDraftParam3 = new AddDraftParam();
        addDraftParam.setAppid("001");
        sList.add(addDraftParam3);
        AddDraftParam addDraftParam4 = new AddDraftParam();
        addDraftParam.setAppid("003");
        sList.add(addDraftParam4);
        List<AddDraftParam> collect = sList.stream().sorted(Comparator.comparing(AddDraftParam::getAppid)).collect(Collectors.toList());
        System.out.println(sList);

    }

}
