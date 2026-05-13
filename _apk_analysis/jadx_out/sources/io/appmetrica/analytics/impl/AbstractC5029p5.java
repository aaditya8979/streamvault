package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC5029p5 implements InterfaceC4762ej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BaseRequestConfig f67505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseRequestConfig.RequestConfigLoader f67506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public M5 f67507c;

    public AbstractC5029p5(@NonNull BaseRequestConfig.RequestConfigLoader<Object, M5> requestConfigLoader, @NonNull C4817gm c4817gm, @NonNull ArgumentsMerger<Object, Object> argumentsMerger) {
        this.f67506b = requestConfigLoader;
        C5009oa.k().v().a(this);
        a(new M5(c4817gm, C5009oa.k().v(), C5009oa.k().s(), argumentsMerger));
    }

    @NonNull
    public final synchronized BaseRequestConfig a() {
        if (this.f67505a == null) {
            this.f67505a = this.f67506b.load(this.f67507c);
        }
        return this.f67505a;
    }

    public final synchronized void a(@NonNull M5 m52) {
        this.f67507c = m52;
    }

    public final synchronized void a(@NonNull C4817gm c4817gm) {
        a(new M5(c4817gm, C5009oa.I.v(), C5009oa.I.s(), b()));
        e();
    }

    public synchronized void a(@NonNull Object obj) {
        if (!((ArgumentsMerger) this.f67507c.componentArguments).compareWithOtherArguments(obj)) {
            a(new M5(c(), C5009oa.I.v(), C5009oa.I.s(), (ArgumentsMerger) ((ArgumentsMerger) this.f67507c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    @NonNull
    @VisibleForTesting(otherwise = 4)
    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.f67507c.componentArguments;
    }

    @NonNull
    public final synchronized C4817gm c() {
        return this.f67507c.f65562a;
    }

    public final void d() {
        synchronized (this) {
            this.f67505a = null;
        }
    }

    public final synchronized void e() {
        this.f67505a = null;
    }
}
