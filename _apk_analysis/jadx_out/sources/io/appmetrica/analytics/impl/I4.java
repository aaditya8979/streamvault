package io.appmetrica.analytics.impl;

import com.ironsource.C3978d4;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class I4 implements Y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65352b;

    public I4(@NotNull R4 r42) {
        Object[] objArr = new Object[1];
        objArr[0] = r42.d() ? C3978d4.i.Z : r42.b();
        this.f65351a = String.format("component_%s.db", Arrays.copyOf(objArr, 1));
        this.f65352b = "db_metrica_" + r42;
    }

    @Override // io.appmetrica.analytics.impl.Y6
    @NotNull
    public final String a() {
        return this.f65352b;
    }

    @Override // io.appmetrica.analytics.impl.Y6
    @NotNull
    public final String b() {
        return this.f65351a;
    }
}
