package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Hh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f65325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f65326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4839hi f65327c;

    public Hh(C4839hi c4839hi, String str, List list) {
        this.f65327c = c4839hi;
        this.f65325a = str;
        this.f65326b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f65327c;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).reportEvent(this.f65325a, CollectionUtils.getMapFromList(this.f65326b));
    }
}
