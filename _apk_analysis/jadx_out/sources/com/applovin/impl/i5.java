package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.sdk.k f8505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.applovin.impl.sdk.o f8507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f8508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f8509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8510f;

    public i5(String str, com.applovin.impl.sdk.k kVar) {
        this(str, kVar, false, null);
    }

    public i5(String str, com.applovin.impl.sdk.k kVar, String str2) {
        this(str, kVar, false, str2);
    }

    public i5(String str, com.applovin.impl.sdk.k kVar, boolean z10) {
        this(str, kVar, z10, null);
    }

    public i5(String str, com.applovin.impl.sdk.k kVar, boolean z10, String str2) {
        this.f8506b = str;
        this.f8505a = kVar;
        this.f8507c = kVar.O();
        this.f8508d = com.applovin.impl.sdk.k.o();
        this.f8510f = z10;
        this.f8509e = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Thread thread, long j10) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.f8509e)) {
            mapHashMap.put("details", this.f8509e);
        }
        this.f8505a.D().a(d2.Y0, this.f8506b, mapHashMap);
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.k(this.f8506b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds");
        }
    }

    public Context a() {
        return this.f8508d;
    }

    public void a(String str) {
        this.f8509e = str;
    }

    public void a(Throwable th2) {
        Map map = CollectionUtils.map("source", this.f8506b);
        map.put("top_main_method", th2.toString());
        map.put("details", StringUtils.emptyIfNull(this.f8509e));
        this.f8505a.D().d(d2.X0, map);
    }

    public void a(boolean z10) {
        this.f8510f = z10;
    }

    public com.applovin.impl.sdk.k b() {
        return this.f8505a;
    }

    public ScheduledFuture b(final Thread thread, final long j10) {
        if (j10 <= 0) {
            return null;
        }
        return this.f8505a.q0().b(new r6(this.f8505a, "timeout:" + this.f8506b, new Runnable() { // from class: com.applovin.impl.bb
            @Override // java.lang.Runnable
            public final void run() {
                this.f7886b.a(thread, j10);
            }
        }), d6.b.TIMEOUT, j10);
    }

    public String c() {
        return this.f8506b;
    }

    public boolean d() {
        return this.f8510f;
    }
}
