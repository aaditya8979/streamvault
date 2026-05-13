package com.yk.e.callBack;

import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface MainInterstitialAdCallBack extends MainAdCallBack {
    void onAdClose();

    void onAdLoaded();

    void onAdShow(AdInfo adInfo);

    void onAdVideoComplete();

    void onAdVideoStart();
}
