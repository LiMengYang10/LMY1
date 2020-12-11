package com.example.myapplication245.bean;

import com.example.myapplication245.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "鱼尾半身裙", "连帽短款羽绒服", "长袖T恤", "夏季T恤", "大衣", "百褶半裙","a字裙","连衣裙"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "韩都衣舍2020秋装新款女装韩版包臀针织潮鱼尾半身裙JW13228筱",
            "韩都衣舍2020冬装新款学院风女装清新蓝色宽松休闲连帽短款羽绒服",
            "假两件女上衣2020年新款女装薄款纯棉大码打底体恤秋装长袖T恤女",
            "纯棉短袖t恤女装2020年夏季新款ins潮网红宽松上衣服韩版T桖大码",
            "A1AAA4317太平鸟女装2020冬新品可脱卸领毛呢大衣",
            "A6GEA4313太平鸟女装2020冬百褶半裙",
            "复古港味秋冬2020年新款百搭半身裙女装高腰a字裙轻熟风气质长裙",
            "赫本风2020年新款夏天泡泡袖裙子女装气质收腰显瘦方领碎花连衣裙"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {89, 360, 55, 50,150, 129,69,99};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.bsq, R.drawable.yrf, R.drawable.ctx,
            R.drawable.dtx, R.drawable.dy, R.drawable.bzq,
            R.drawable.azq,R.drawable.lyq
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.bbsq, R.drawable.byrf, R.drawable.bctx,
            R.drawable.bdtx, R.drawable.bdy, R.drawable.bbzq,
            R.drawable.bazq,R.drawable.blyq
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
