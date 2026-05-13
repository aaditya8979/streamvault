package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4725d7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4699c7 f66588a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4725d7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C4725d7(@NotNull C4699c7 c4699c7) {
        this.f66588a = c4699c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C4725d7(C4699c7 c4699c7, int i10, tn.i iVar) {
        if ((i10 & 1) != 0) {
            c4699c7 = new C4699c7(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        this(c4699c7);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f A[Catch: InvalidProtocolBufferNanoException -> 0x0015, TRY_LEAVE, TryCatch #0 {InvalidProtocolBufferNanoException -> 0x0015, blocks: (B:3:0x0002, B:5:0x000f), top: B:10:0x0002 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.appmetrica.analytics.impl.C4750e7 toModel(@org.jetbrains.annotations.Nullable byte[] r2) {
        /*
            r1 = this;
            if (r2 == 0) goto Lf
            io.appmetrica.analytics.impl.n7 r0 = new io.appmetrica.analytics.impl.n7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r0.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.protobuf.nano.MessageNano r2 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r0, r2)     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.impl.n7 r2 = (io.appmetrica.analytics.impl.C4981n7) r2     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            if (r2 != 0) goto L1a
        Lf:
            io.appmetrica.analytics.impl.n7 r2 = new io.appmetrica.analytics.impl.n7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r2.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            goto L1a
        L15:
            io.appmetrica.analytics.impl.n7 r2 = new io.appmetrica.analytics.impl.n7
            r2.<init>()
        L1a:
            io.appmetrica.analytics.impl.c7 r0 = r1.f66588a
            io.appmetrica.analytics.impl.e7 r2 = r0.toModel(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4725d7.toModel(byte[]):io.appmetrica.analytics.impl.e7");
    }

    @NotNull
    public final byte[] a(@NotNull C4750e7 c4750e7) {
        return MessageNano.toByteArray(this.f66588a.fromModel(c4750e7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f66588a.fromModel((C4750e7) obj));
    }
}
