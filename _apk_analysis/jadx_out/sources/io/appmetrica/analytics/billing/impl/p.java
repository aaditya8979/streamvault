package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f64473a;

    /* JADX WARN: Multi-variable type inference failed */
    public p() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public p(@NotNull r rVar) {
        this.f64473a = rVar;
    }

    public /* synthetic */ p(r rVar, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? new r(null, 1, null) : rVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBillingConfig toModel(@NotNull byte[] bArr) {
        t tVar;
        try {
            tVar = (t) MessageNano.mergeFrom(new t(), bArr);
        } catch (Throwable unused) {
            tVar = new t();
        }
        return this.f64473a.toModel(tVar);
    }

    @NotNull
    public final byte[] a(@NotNull RemoteBillingConfig remoteBillingConfig) {
        return MessageNano.toByteArray(this.f64473a.fromModel(remoteBillingConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f64473a.fromModel((RemoteBillingConfig) obj));
    }
}
