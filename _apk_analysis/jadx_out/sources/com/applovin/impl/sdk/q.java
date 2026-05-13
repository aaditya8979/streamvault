package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes7.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f10341a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10342b = new Object();

    public AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f10342b) {
            appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f10341a.poll() : null;
        }
        return appLovinAdImpl;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f10342b) {
            if (b() <= 25) {
                this.f10341a.offer(appLovinAdImpl);
            } else {
                o.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    public int b() {
        int size;
        synchronized (this.f10342b) {
            size = this.f10341a.size();
        }
        return size;
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f10342b) {
            this.f10341a.remove(appLovinAdImpl);
        }
    }

    public boolean c() {
        boolean z10;
        synchronized (this.f10342b) {
            z10 = b() == 0;
        }
        return z10;
    }

    public AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f10342b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f10341a.peek();
        }
        return appLovinAdImpl;
    }
}
