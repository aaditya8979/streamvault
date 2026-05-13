package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4852i5 extends Lambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4852i5 f66959a = new C4852i5();

    public C4852i5() {
        super(1);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return ((ModuleAdRevenueProcessor) obj).getDescription();
    }
}
