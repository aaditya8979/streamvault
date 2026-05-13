package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class Tg implements InterfaceC4749e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4670b4 f65940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f65941c = C5009oa.k().w().d();

    public Tg(@NotNull Context context, @NotNull C4670b4 c4670b4) {
        this.f65939a = context;
        this.f65940b = c4670b4;
    }

    public final void a(@NotNull Q3 q32, @NotNull Q5 q52, @NotNull C5053q4 c5053q4) {
        this.f65940b.a(q32, c5053q4).a(q52, c5053q4);
        this.f65940b.a(q32.f65784b, q32.f65785c, q32.f65786d);
    }

    public final void a(@NotNull Q5 q52, @Nullable Bundle bundle) {
        if (q52.m()) {
            return;
        }
        this.f65941c.execute(new RunnableC4966mh(this.f65939a, q52, bundle, this.f65940b));
    }
}
