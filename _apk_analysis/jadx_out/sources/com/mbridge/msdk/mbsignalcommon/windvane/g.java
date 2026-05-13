package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* JADX INFO: compiled from: WindVanePlugin.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f38936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f38937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindVaneWebView f38938c;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f38936a = context;
        this.f38938c = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f38937b = obj;
        this.f38938c = windVaneWebView;
    }
}
