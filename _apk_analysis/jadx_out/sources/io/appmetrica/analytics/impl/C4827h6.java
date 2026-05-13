package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4827h6 implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f66892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vg f66893b;

    public C4827h6(@NotNull Context context, @NotNull InterfaceC4749e6 interfaceC4749e6, @NotNull EnumC4703cb enumC4703cb, @NotNull InterfaceC4687bl interfaceC4687bl, @NotNull Executor executor, @NotNull String str) {
        this.f66892a = executor;
        this.f66893b = new Vg(context, interfaceC4749e6, enumC4703cb, interfaceC4687bl);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(@Nullable File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.f66892a;
        Vg vg2 = this.f66893b;
        C5010ob c5010ob = vg2.f66045c;
        Consumer consumer = vg2.f66047e;
        Context context = vg2.f66043a;
        if (C4650aa.f66359c == null) {
            synchronized (tn.t.b(C4650aa.class)) {
                if (C4650aa.f66359c == null) {
                    C4650aa.f66359c = new C4650aa(context);
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
        C4650aa c4650aa = C4650aa.f66359c;
        if (c4650aa == null) {
            tn.p.C("INSTANCE");
            c4650aa = null;
        }
        executor.execute(new Uf(file, c5010ob, c5010ob, consumer, c4650aa, vg2.f66044b));
    }
}
