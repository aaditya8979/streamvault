package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5177v4 implements InterfaceC4799g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f67804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5252y4 f67805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResultReceiver f67806c;

    public C5177v4(@NonNull Context context, @NonNull C5252y4 c5252y4, @NonNull C5053q4 c5053q4) {
        this.f67804a = context;
        this.f67805b = c5252y4;
        this.f67806c = c5053q4.f67561c;
        c5252y4.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4799g4
    public final void a() {
        this.f67805b.b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4799g4
    public final void a(@NonNull Q5 q52, @NonNull C5053q4 c5053q4) {
        this.f67805b.a(c5053q4.f67560b);
        this.f67805b.a(q52, this);
    }

    public final void a(@NonNull T3 t32) {
        C6.a(this.f67806c, t32);
    }

    @NonNull
    public final C5252y4 b() {
        return this.f67805b;
    }

    @NonNull
    public final Context c() {
        return this.f67804a;
    }

    @NonNull
    @VisibleForTesting
    public final ResultReceiver d() {
        return this.f67806c;
    }
}
