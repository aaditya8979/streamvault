package com.inmobi.media;

import java.util.TimerTask;

/* JADX INFO: renamed from: com.inmobi.media.nk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3616nk extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3641ok f27705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte f27706b;

    public C3616nk(C3641ok c3641ok, byte b10) {
        this.f27705a = c3641ok;
        this.f27706b = b10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f27705a.b(this.f27706b);
    }
}
