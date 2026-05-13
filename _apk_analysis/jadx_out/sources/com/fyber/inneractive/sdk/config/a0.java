package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.iab.omid.library.fyber.Omid;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f15981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f15982b;

    public a0(IAConfigManager iAConfigManager, Context context) {
        this.f15981a = iAConfigManager;
        this.f15982b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = Omid.f24252a;
            com.fyber.inneractive.sdk.util.r.f19556b.post(new z(this));
        } catch (Throwable unused) {
        }
    }
}
