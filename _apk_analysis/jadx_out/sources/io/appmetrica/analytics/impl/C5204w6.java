package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5204w6 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fg f67877a;

    public C5204w6() {
        this(new Fg());
    }

    public C5204w6(Fg fg2) {
        this.f67877a = fg2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 fromModel(@NonNull C5179v6 c5179v6) {
        Y5 y5FromModel = this.f67877a.fromModel(c5179v6.f67810a);
        y5FromModel.f66247g = 1;
        X5 x52 = new X5();
        y5FromModel.f66248h = x52;
        x52.f66149a = StringUtils.correctIllFormedString(c5179v6.f67811b);
        return y5FromModel;
    }

    @NonNull
    public final C5179v6 a(@NonNull Y5 y52) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
