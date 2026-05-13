package com.fyber.inneractive.sdk.util;

import com.ironsource.Q6;

/* JADX INFO: loaded from: classes7.dex */
public final class q1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f19553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f19554b;

    public q1(s1 s1Var, String str) {
        this.f19554b = s1Var;
        this.f19553a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19554b.f19565c.getSharedPreferences("fyber.ua", 0).edit().putString(Q6.f30218d0, this.f19553a).apply();
    }
}
