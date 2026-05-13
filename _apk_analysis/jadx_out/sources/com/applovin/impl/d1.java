package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class d1 extends s2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.k f7986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f7987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f7988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f7989h;

    public enum a {
        RECENT_ADS,
        COUNT
    }

    public d1(Context context) {
        super(context);
        this.f7988g = new AtomicBoolean();
        this.f7989h = new ArrayList();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new p1((q1) it.next(), this.f9806a));
        }
        return arrayList;
    }

    public void a(List list, com.applovin.impl.sdk.k kVar) {
        Activity activityU0;
        this.f7986e = kVar;
        this.f7987f = list;
        if (!(this.f9806a instanceof Activity) && (activityU0 = kVar.u0()) != null) {
            this.f9806a = activityU0;
        }
        if (list != null && this.f7988g.compareAndSet(false, true)) {
            this.f7989h = a(this.f7987f);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.l9
            @Override // java.lang.Runnable
            public final void run() {
                this.f8713b.notifyDataSetChanged();
            }
        });
    }

    @Override // com.applovin.impl.s2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    public List c(int i10) {
        return this.f7989h;
    }

    @Override // com.applovin.impl.s2
    public int d(int i10) {
        return this.f7989h.size();
    }

    public List d() {
        return this.f7987f;
    }

    @Override // com.applovin.impl.s2
    public r2 e(int i10) {
        return new v4("RECENT ADS");
    }

    public com.applovin.impl.sdk.k e() {
        return this.f7986e;
    }

    public boolean f() {
        return this.f7989h.size() == 0;
    }

    public void g() {
        this.f7988g.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f7988g.get() + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e;
    }
}
