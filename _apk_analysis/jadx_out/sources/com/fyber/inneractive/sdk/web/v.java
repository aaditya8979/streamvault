package com.fyber.inneractive.sdk.web;

import android.widget.Toast;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f19709a;

    public v(String str) {
        this.f19709a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(com.fyber.inneractive.sdk.util.o.f19548a, this.f19709a, 0).show();
    }
}
