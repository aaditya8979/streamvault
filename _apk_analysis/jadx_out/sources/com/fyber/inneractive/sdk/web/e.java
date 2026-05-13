package com.fyber.inneractive.sdk.web;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.e f19608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.d f19609d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f19612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f19613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f19614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f19615j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f19616k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f19617l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f19607b = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f19610e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19611f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f19606a = Executors.newSingleThreadExecutor(new com.fyber.inneractive.sdk.util.b());

    public e(i1 i1Var, String str, boolean z10, String str2, String str3, String str4) {
        this.f19617l = i1Var;
        this.f19612g = str;
        this.f19613h = z10;
        this.f19614i = str2;
        this.f19615j = str3;
        this.f19616k = str4;
    }

    public final Handler a() {
        if (this.f19607b == null) {
            synchronized (this.f19610e) {
                this.f19607b = new Handler(Looper.getMainLooper());
            }
        }
        return this.f19607b;
    }
}
