package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ICrashTransformer;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC4904k6 implements Ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4878j6 f67093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICrashTransformer f67094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N9 f67095c;

    public AbstractC4904k6(InterfaceC4878j6 interfaceC4878j6, ICrashTransformer iCrashTransformer, N9 n92) {
        this.f67093a = interfaceC4878j6;
        this.f67094b = iCrashTransformer;
        this.f67095c = n92;
    }

    @Nullable
    @VisibleForTesting
    public final ICrashTransformer a() {
        return this.f67094b;
    }

    @Override // io.appmetrica.analytics.impl.Ga
    public final void a(@Nullable Throwable th2, @NonNull V v10) {
        if (this.f67093a.a(th2)) {
            ICrashTransformer iCrashTransformer = this.f67094b;
            if (iCrashTransformer == null || th2 == null || (th2 = iCrashTransformer.process(th2)) != null) {
                Rn rnA = Un.a(th2, v10, null, (String) this.f67095c.f65633b.a(), (Boolean) this.f67095c.f65634c.a());
                C4807gc c4807gc = (C4807gc) ((Ch) this).f65125d;
                c4807gc.f66205a.a().a(c4807gc.f66822b).a(rnA);
            }
        }
    }

    @VisibleForTesting
    public final InterfaceC4878j6 b() {
        return this.f67093a;
    }
}
