package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class M implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f68395a;

    /* JADX WARN: Multi-variable type inference failed */
    public M() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public M(@NotNull Y y10) {
        this.f68395a = y10;
    }

    public /* synthetic */ M(Y y10, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? new Y(null, null, null, 7, null) : y10);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(@NotNull S s10) {
        return new J(s10.f68410a, this.f68395a.toModel(s10.f68411b));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S fromModel(@NotNull J j10) {
        S s10 = new S();
        s10.f68410a = j10.f68390a;
        W w10 = j10.f68391b;
        s10.f68411b = w10 != null ? this.f68395a.fromModel(w10) : null;
        return s10;
    }
}
