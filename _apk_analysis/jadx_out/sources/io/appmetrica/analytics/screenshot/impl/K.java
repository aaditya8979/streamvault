package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class K implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f68392a;

    /* JADX WARN: Multi-variable type inference failed */
    public K() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public K(@NotNull M m10) {
        this.f68392a = m10;
    }

    public /* synthetic */ K(M m10, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? new M(null, 1, null) : m10);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(@NotNull byte[] bArr) {
        S s10;
        try {
            s10 = (S) MessageNano.mergeFrom(new S(), bArr);
        } catch (Throwable unused) {
            s10 = new S();
        }
        return this.f68392a.toModel(s10);
    }

    @NotNull
    public final byte[] a(@NotNull J j10) {
        return MessageNano.toByteArray(this.f68392a.fromModel(j10));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f68392a.fromModel((J) obj));
    }
}
