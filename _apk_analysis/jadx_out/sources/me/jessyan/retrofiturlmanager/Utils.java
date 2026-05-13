package me.jessyan.retrofiturlmanager;

import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
class Utils {
    private Utils() {
        throw new IllegalStateException("do not instantiation me");
    }

    public static <T> T checkNotNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static HttpUrl checkUrl(String str) {
        HttpUrl httpUrl = HttpUrl.parse(str);
        if (httpUrl != null) {
            return httpUrl;
        }
        throw new InvalidUrlException(str);
    }
}
