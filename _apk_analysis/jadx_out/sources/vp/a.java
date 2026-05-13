package vp;

import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: CookieJarImpl.java */
/* JADX INFO: loaded from: classes8.dex */
public class a implements CookieJar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wp.a f86127a;

    public a(wp.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("cookieStore can not be null!");
        }
        this.f86127a = aVar;
    }

    @Override // okhttp3.CookieJar
    public synchronized List<Cookie> loadForRequest(HttpUrl httpUrl) {
        return this.f86127a.a(httpUrl);
    }

    @Override // okhttp3.CookieJar
    public synchronized void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        this.f86127a.b(httpUrl, list);
    }
}
