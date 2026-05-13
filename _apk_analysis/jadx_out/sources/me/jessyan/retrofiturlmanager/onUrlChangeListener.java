package me.jessyan.retrofiturlmanager;

import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes9.dex */
public interface onUrlChangeListener {
    void onUrlChangeBefore(HttpUrl httpUrl, String str);

    void onUrlChanged(HttpUrl httpUrl, HttpUrl httpUrl2);
}
