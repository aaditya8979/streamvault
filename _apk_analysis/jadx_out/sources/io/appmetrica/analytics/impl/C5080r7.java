package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5080r7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5056q7 f67607a;

    /* JADX WARN: Multi-variable type inference failed */
    public C5080r7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C5080r7(@NotNull C5056q7 c5056q7) {
        this.f67607a = c5056q7;
    }

    public /* synthetic */ C5080r7(C5056q7 c5056q7, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? new C5056q7(null, 1, null) : c5056q7);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f A[Catch: InvalidProtocolBufferNanoException -> 0x0015, TRY_LEAVE, TryCatch #0 {InvalidProtocolBufferNanoException -> 0x0015, blocks: (B:3:0x0002, B:5:0x000f), top: B:10:0x0002 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.appmetrica.analytics.impl.C5105s7 toModel(@org.jetbrains.annotations.Nullable byte[] r2) {
        /*
            r1 = this;
            if (r2 == 0) goto Lf
            io.appmetrica.analytics.impl.p7 r0 = new io.appmetrica.analytics.impl.p7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r0.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.protobuf.nano.MessageNano r2 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r0, r2)     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.impl.p7 r2 = (io.appmetrica.analytics.impl.C5031p7) r2     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            if (r2 != 0) goto L1a
        Lf:
            io.appmetrica.analytics.impl.p7 r2 = new io.appmetrica.analytics.impl.p7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r2.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            goto L1a
        L15:
            io.appmetrica.analytics.impl.p7 r2 = new io.appmetrica.analytics.impl.p7
            r2.<init>()
        L1a:
            io.appmetrica.analytics.impl.q7 r0 = r1.f67607a
            io.appmetrica.analytics.impl.s7 r2 = r0.toModel(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5080r7.toModel(byte[]):io.appmetrica.analytics.impl.s7");
    }

    @NotNull
    public final byte[] a(@NotNull C5105s7 c5105s7) {
        return MessageNano.toByteArray(this.f67607a.fromModel(c5105s7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f67607a.fromModel((C5105s7) obj));
    }
}
