package com.gersion.library.inter;

/**
 * Created by gersy on 2017/7/24.
 */

public interface Filter {

    //专为标题而生，因为系统默认给的是0，这样title Bean类里面都不用做过多的修改了
    int TITLE_NO_CHOICE = 0;

    //默认不选中，可以选中
    int NORMAL = 1;

    //默认选中,不可以取消选中
    int SELECTED_NOCANCEL = 2;

    //默认不选中,不能被选中
    int NO_CHOICE = 3;

    //不显示在列表
    int NOT_SHOW = 4;

    //本地图片地址
    int getImageResource();

    //网络图片url
    String getImageUrl();

    //返回当前条目的状态，就是上面定义的那些个常量，返回值会在BaseViewHolder里面用到
    int filter();

    //是否是选中状态
    boolean isSelected();

    void setSelected(boolean isSelected);

    //是否匹配搜索关键字，用来处理搜索的，如果不要搜索功能，可以不用处理
    boolean isMatch(String condition);
}
