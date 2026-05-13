package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class C2 implements ExternalAttribution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B9 f65087a;

    public C2(@NotNull B9 b92) {
        this.f65087a = b92;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    @NotNull
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f65087a);
    }

    @NotNull
    public final String toString() {
        return "ExternalAttribution(type=`" + L9.a(this.f65087a.f65028a) + "`value=`" + new String(this.f65087a.f65029b, bo.c.f5639b) + "`)";
    }
}
