package mddemo.library.com.demo;

import java.io.Serializable;
import java.util.List;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月1日10:45:36
 * Description: 使用gsonformat工具生成的javabean
 */
public class JavaBean implements Serializable {

    /**
     * ds : [{"id":"71","title":"","shijian":"2015-05-19 23:12:04","shangpinid":"1881314987120150519231204","miaoshu":"","jiage":"","image":"http://www.17yxb.cn/image/1881314987120150519231204.jpg","dealid":"18813149871","buyid":"0","zhuangtai":"0         ","lianxi":"","qufu":"","jiaoyifangshi":""},{"id":"70","title":"","shijian":"2015-05-19 18:30:21","shangpinid":"1881314987120150519183021","miaoshu":"","jiage":"","image":"http://www.17yxb.cn/image/1881314987120150519183021.jpg","dealid":"18813149871","buyid":"0","zhuangtai":"0         ","lianxi":"","qufu":"","jiaoyifangshi":""},{"id":"69","title":"家","shijian":"2015-04-28 10:49:40","shangpinid":"1881314987120150428104940","miaoshu":"","jiage":"啦啦啦","image":"http://www.17yxb.cn/image/1881314987120150428104940.jpg","dealid":"18813149871","buyid":"0","zhuangtai":"0         ","lianxi":"哈哈","qufu":"啦啦啦嗯嗯","jiaoyifangshi":"接了"},{"id":"67","title":"商人水乡","shijian":"2015-03-28 22:40:13","shangpinid":"1881314987120150328224013","miaoshu":"和你一起的话便宜处理","jiage":"123547","image":"http://www.17yxb.cn/image/1881314987120150328224013.jpg","dealid":"18813149871","buyid":"0","zhuangtai":"0         ","lianxi":"123544","qufu":"山东二区","jiaoyifangshi":"寄售"},{"id":"66","title":"商人法师","shijian":"2015-03-28 22:39:00","shangpinid":"1881314987120150328223900","miaoshu":"很好的武器","jiage":"123","image":"http://www.17yxb.cn/image/1881314987120150328223900.jpg","dealid":"18813149871","buyid":"0","zhuangtai":"0         ","lianxi":"123555","qufu":"山东二区","jiaoyifangshi":"寄售"},{"id":"65","title":"信誉商人辰星的！","shijian":"2015-03-28 22:37:38","shangpinid":"1881314987120150328223738","miaoshu":"我是信誉商家！","jiage":"1233","image":"http://www.17yxb.cn/image/1881314987120150328223738.jpg","dealid":"18813149871","buyid":"0","zhuangtai":"0         ","lianxi":"126874","qufu":"山东二区","jiaoyifangshi":"寄售"},{"id":"64","title":"安图恩武器","shijian":"2015-03-28 22:35:59","shangpinid":"1881314987120150328223559","miaoshu":"和你一起，发财了！","jiage":"1255","image":"http://www.17yxb.cn/image/1881314987120150328223559.jpg","dealid":"18813149871","buyid":"0","zhuangtai":"0         ","lianxi":"123655","qufu":"山东二区","jiaoyifangshi":"寄售"},{"id":"63","title":"+13释魂","shijian":"2015-03-28 22:34:34","shangpinid":"1881314987120150328223434","miaoshu":"描述一下就是好！","jiage":"1233","image":"http://www.17yxb.cn/image/1881314987120150328223434.jpg","dealid":"18813149871","buyid":"0","zhuangtai":"0         ","lianxi":"12687455","qufu":"山东二区","jiaoyifangshi":"寄售"},{"id":"62","title":"释魂武器","shijian":"2015-03-28 22:33:17","shangpinid":"1881314987120150328223317","miaoshu":"好的武器小城出售！","jiage":"1233","image":"http://www.17yxb.cn/image/1881314987120150328223317.jpg","dealid":"18813149871","buyid":"0","zhuangtai":"0         ","lianxi":"13368","qufu":"山东二区","jiaoyifangshi":"寄售"},{"id":"61","title":"释魂武器便宜卖了","shijian":"2015-03-28 22:30:55","shangpinid":"1881314987120150328223055","miaoshu":"就是这么便宜！","jiage":"1233","image":"http://www.17yxb.cn/image/1881314987120150328223055.jpg","dealid":"18813149871","buyid":"0","zhuangtai":"0         ","lianxi":"1236556","qufu":"山东二区","jiaoyifangshi":"寄售"}]
     */

    private List<DsEntity> ds;

    public void setDs(List<DsEntity> ds) {
        this.ds = ds;
    }

    public List<DsEntity> getDs() {
        return ds;
    }

    public static class DsEntity {

        private String id;
        private String title;
        private String shijian;
        private String shangpinid;
        private String miaoshu;
        private String jiage;
        private String image;
        private String dealid;
        private String buyid;
        private String zhuangtai;
        private String lianxi;
        private String qufu;
        private String jiaoyifangshi;

        public void setId(String id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setShijian(String shijian) {
            this.shijian = shijian;
        }

        public void setShangpinid(String shangpinid) {
            this.shangpinid = shangpinid;
        }

        public void setMiaoshu(String miaoshu) {
            this.miaoshu = miaoshu;
        }

        public void setJiage(String jiage) {
            this.jiage = jiage;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public void setDealid(String dealid) {
            this.dealid = dealid;
        }

        public void setBuyid(String buyid) {
            this.buyid = buyid;
        }

        public void setZhuangtai(String zhuangtai) {
            this.zhuangtai = zhuangtai;
        }

        public void setLianxi(String lianxi) {
            this.lianxi = lianxi;
        }

        public void setQufu(String qufu) {
            this.qufu = qufu;
        }

        public void setJiaoyifangshi(String jiaoyifangshi) {
            this.jiaoyifangshi = jiaoyifangshi;
        }

        public String getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getShijian() {
            return shijian;
        }

        public String getShangpinid() {
            return shangpinid;
        }

        public String getMiaoshu() {
            return miaoshu;
        }

        public String getJiage() {
            return jiage;
        }

        public String getImage() {
            return image;
        }

        public String getDealid() {
            return dealid;
        }

        public String getBuyid() {
            return buyid;
        }

        public String getZhuangtai() {
            return zhuangtai;
        }

        public String getLianxi() {
            return lianxi;
        }

        public String getQufu() {
            return qufu;
        }

        public String getJiaoyifangshi() {
            return jiaoyifangshi;
        }
    }

}
