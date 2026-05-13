package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4805ga implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC4988ne f66821a;

    public C4805ga() {
        this(new Tl());
    }

    public C4805ga(Tl tl2) {
        this.f66821a = tl2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4953m4 toModel(@NonNull C5120sm c5120sm) {
        C4902k4 c4902k4 = new C4902k4();
        c4902k4.f67089d = c5120sm.f67706d;
        c4902k4.f67088c = c5120sm.f67705c;
        c4902k4.f67087b = c5120sm.f67704b;
        c4902k4.f67086a = c5120sm.f67703a;
        c4902k4.f67090e = c5120sm.f67707e;
        c4902k4.f67091f = this.f66821a.a(c5120sm.f67708f);
        return new C4953m4(c4902k4);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5120sm fromModel(@NonNull C4953m4 c4953m4) {
        C5120sm c5120sm = new C5120sm();
        c5120sm.f67704b = c4953m4.f67257b;
        c5120sm.f67703a = c4953m4.f67256a;
        c5120sm.f67705c = c4953m4.f67258c;
        c5120sm.f67706d = c4953m4.f67259d;
        c5120sm.f67707e = c4953m4.f67260e;
        c5120sm.f67708f = this.f66821a.a(c4953m4.f67261f);
        return c5120sm;
    }
}
