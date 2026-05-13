package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public final class W3 extends Kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final We f66077a;

    public W3(@NonNull Context context) {
        this(new We(C4696c4.l().c(context).b(context)));
    }

    public W3(We we2) {
        this.f66077a = we2;
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final void a(int i10) {
        this.f66077a.c(i10);
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final int b() {
        return (int) this.f66077a.a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final SparseArray<Jc> c() {
        return new SparseArray<>();
    }
}
