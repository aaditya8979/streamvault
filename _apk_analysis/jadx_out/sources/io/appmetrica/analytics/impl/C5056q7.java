package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5056q7 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4963me f67567a;

    /* JADX WARN: Multi-variable type inference failed */
    public C5056q7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C5056q7(@NotNull C4963me c4963me) {
        this.f67567a = c4963me;
    }

    public /* synthetic */ C5056q7(C4963me c4963me, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? new C4963me() : c4963me);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5031p7 fromModel(@NotNull C5105s7 c5105s7) {
        C5031p7 c5031p7 = new C5031p7();
        Long l10 = c5105s7.f67666a;
        if (l10 != null) {
            c5031p7.f67509a = l10.longValue();
        }
        Long l11 = c5105s7.f67667b;
        if (l11 != null) {
            c5031p7.f67510b = l11.longValue();
        }
        Boolean bool = c5105s7.f67668c;
        if (bool != null) {
            c5031p7.f67511c = this.f67567a.fromModel(Boolean.valueOf(bool.booleanValue())).intValue();
        }
        return c5031p7;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5105s7 toModel(@NotNull C5031p7 c5031p7) {
        C5031p7 c5031p72 = new C5031p7();
        Long lValueOf = Long.valueOf(c5031p7.f67509a);
        if (lValueOf.longValue() == c5031p72.f67509a) {
            lValueOf = null;
        }
        Long lValueOf2 = Long.valueOf(c5031p7.f67510b);
        return new C5105s7(lValueOf, lValueOf2.longValue() != c5031p72.f67510b ? lValueOf2 : null, this.f67567a.a(c5031p7.f67511c));
    }
}
