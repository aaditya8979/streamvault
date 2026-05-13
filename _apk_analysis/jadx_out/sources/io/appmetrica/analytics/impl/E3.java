package io.appmetrica.analytics.impl;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class E3 implements Jm {
    @NotNull
    public final C5126t3 a(@NotNull C5101s3 c5101s3, @NotNull List<C5101s3> list) {
        return new C5126t3(c5101s3, list);
    }

    @Override // io.appmetrica.analytics.impl.Jm, sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C5126t3((C5101s3) obj, (List) obj2);
    }
}
