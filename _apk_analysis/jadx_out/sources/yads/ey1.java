package yads;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes12.dex */
public final class ey1 implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f89405b = "YandexAds.UrlTracker";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f89406c = "YandexAds.BaseController";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89407a;

    public ey1(String str) {
        this.f89407a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f89407a);
    }
}
