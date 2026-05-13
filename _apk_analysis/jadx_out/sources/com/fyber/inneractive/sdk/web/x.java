package com.fyber.inneractive.sdk.web;

import android.media.MediaScannerConnection;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements com.fyber.inneractive.sdk.network.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f19744a;

    public x(i0 i0Var) {
        this.f19744a = i0Var;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String str = (String) obj;
        if (exc != null || TextUtils.isEmpty(str)) {
            com.fyber.inneractive.sdk.util.r.f19556b.post(new w(this));
            return;
        }
        i0 i0Var = this.f19744a;
        if (com.fyber.inneractive.sdk.util.o.a(i0Var.f19631b) != null) {
            a0 a0Var = new a0(str);
            MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(com.fyber.inneractive.sdk.util.o.a(i0Var.f19631b).getApplicationContext(), a0Var);
            a0Var.f19588b = mediaScannerConnection;
            mediaScannerConnection.connect();
        }
    }
}
