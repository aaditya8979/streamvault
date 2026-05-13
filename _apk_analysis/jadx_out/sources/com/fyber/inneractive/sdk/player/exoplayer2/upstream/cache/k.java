package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f18657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f18658b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, ConditionVariable conditionVariable) {
        super("SimpleCache.initialize()");
        this.f18658b = lVar;
        this.f18657a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f18658b) {
            this.f18657a.open();
            try {
                l.a(this.f18658b);
            } catch (a e10) {
                this.f18658b.f18664f = e10;
            }
            this.f18658b.f18660b.getClass();
        }
    }
}
