package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5069qk implements Jc {
    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(@NotNull Context context) {
        Sm sm2 = (Sm) Qm.a(C4920km.class);
        ProtobufStateStorage<Object> protobufStateStorageA = sm2.a(context, sm2.b(context));
        C4920km c4920km = (C4920km) protobufStateStorageA.read();
        C4894jm c4894jmA = c4920km.a(c4920km.f67158m);
        c4894jmA.f67059o = 0L;
        protobufStateStorageA.save(new C4920km(c4894jmA));
    }
}
