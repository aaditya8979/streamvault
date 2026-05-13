package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4658ai implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f66393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4839hi f66394b;

    public RunnableC4658ai(C4839hi c4839hi, List list) {
        this.f66394b = c4839hi;
        this.f66393a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f66394b;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).reportAnr(CollectionUtils.getMapFromList(this.f66393a));
    }
}
