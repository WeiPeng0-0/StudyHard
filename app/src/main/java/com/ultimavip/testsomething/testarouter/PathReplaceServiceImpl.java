package com.ultimavip.testsomething.testarouter;

import android.content.Context;
import android.net.Uri;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.PathReplaceService;

/**
 * Created by zhuxing on 2018/4/17.
 */

@Route(path = "/main/PathReplaceService") // 必须标明注解
public class PathReplaceServiceImpl implements PathReplaceService {

    @Override
    public void init (Context context) {

    }

    @Override
    public String forString (String path) {
        return path;
    }

    @Override
    public Uri forUri (Uri uri) {
        return uri;
    }
}