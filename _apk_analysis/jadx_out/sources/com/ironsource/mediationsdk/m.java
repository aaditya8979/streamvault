package com.ironsource.mediationsdk;

import com.ironsource.Bb;
import com.ironsource.C4002ea;
import com.ironsource.C4157n2;
import com.ironsource.Z8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet<ImpressionDataListener> f32668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.ironsource.r f32669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4002ea f32670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdInfo f32671d;

    public m(HashSet<ImpressionDataListener> hashSet, C4002ea c4002ea) {
        new HashSet();
        this.f32668a = hashSet;
        this.f32669b = new com.ironsource.r();
        this.f32670c = c4002ea;
    }

    public void a(Z8 z82, Bb bb2) {
        if (z82 != null) {
            this.f32671d = new AdInfo(z82, bb2);
        }
    }

    public void a(C4002ea c4002ea) {
        this.f32670c = c4002ea;
    }

    public void a(IronSource.a aVar) {
        this.f32669b.a(aVar, false);
    }

    public void a(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f32668a.remove(impressionDataListener);
        }
    }

    public void a(C4157n2 c4157n2, String str) {
        HashSet<ImpressionDataListener> hashSet;
        if (c4157n2 == null) {
            IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
            return;
        }
        Z8 z8A = c4157n2.a(str);
        if (z8A != null) {
            synchronized (this) {
                hashSet = (HashSet) this.f32668a.clone();
            }
            for (ImpressionDataListener impressionDataListener : hashSet) {
                IronLog.CALLBACK.info("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + z8A);
                impressionDataListener.onImpressionSuccess(z8A);
            }
        }
    }

    public void a(JSONObject jSONObject, IronSource.a aVar) {
        this.f32669b.a(aVar, jSONObject != null ? jSONObject.optBoolean(d.f32391f, false) : false);
    }

    public void b(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f32668a.add(impressionDataListener);
        }
    }

    public void c() {
        synchronized (this) {
            this.f32668a.clear();
        }
    }

    public String e() {
        return "fallback_" + System.currentTimeMillis();
    }

    public void f() {
        this.f32671d = null;
    }
}
