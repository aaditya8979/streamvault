package com.inmobi.media;

import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public class T4 extends Q9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StackTraceElement[] f26347g;

    /* JADX WARN: Illegal instructions before constructor call */
    public T4(String str) {
        String string = UUID.randomUUID().toString();
        tn.p.j(string, "toString(...)");
        tn.p.k("crashReporting", "component");
        tn.p.k("CatchEvent", "eventType");
        tn.p.k(string, "eventId");
        super(string, "crashReporting", "CatchEvent", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T4(Thread thread, Throwable th2) {
        super("crashReporting", "CrashEvent", AbstractC3492il.a(thread, th2));
        tn.p.k(thread, "thread");
        tn.p.k(th2, "error");
        this.f26347g = th2.getStackTrace();
    }
}
