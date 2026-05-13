package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4791fm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f66797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xo f66798b;

    public C4791fm(Context context) {
        this(((Sm) Qm.a(C4920km.class)).create(context), C5009oa.k().D().a());
    }

    public C4791fm(ProtobufStateStorage protobufStateStorage, xo xoVar) {
        this.f66797a = protobufStateStorage;
        this.f66798b = xoVar;
    }
}
