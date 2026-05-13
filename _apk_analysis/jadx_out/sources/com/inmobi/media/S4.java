package com.inmobi.media;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.Thread;

/* JADX INFO: loaded from: classes9.dex */
public final class S4 extends AbstractC3750t5 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f26283b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C3775u5 c3775u5) {
        super(c3775u5);
        tn.p.k(c3775u5, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f26283b = uncaughtExceptionHandler;
    }

    @Override // com.inmobi.media.AbstractC3750t5
    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // com.inmobi.media.AbstractC3750t5
    public final void b() {
        Thread.setDefaultUncaughtExceptionHandler(this.f26283b);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        tn.p.k(thread, "t");
        tn.p.k(th2, "e");
        this.f28165a.a(new T4(thread, th2));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f26283b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }
}
