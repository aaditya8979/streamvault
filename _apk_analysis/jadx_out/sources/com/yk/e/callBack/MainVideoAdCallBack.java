package com.yk.e.callBack;

import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes4.dex */
public interface MainVideoAdCallBack extends MainAdCallBack {
    void onAdClose();

    void onAdShow(AdInfo adInfo);

    void onAdVideoCache();

    void onAdVideoComplete();
}
