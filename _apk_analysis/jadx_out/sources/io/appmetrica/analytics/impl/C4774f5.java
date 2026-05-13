package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4774f5 extends Lambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4774f5 f66726a = new C4774f5();

    public C4774f5() {
        super(1);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return ((IExecutionPolicy) obj).description();
    }
}
