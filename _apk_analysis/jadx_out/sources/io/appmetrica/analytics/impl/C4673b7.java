package io.appmetrica.analytics.impl;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4673b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J6 f66430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f66431b;

    public C4673b7(File file) {
        ArrayList arrayList = new ArrayList();
        this.f66431b = arrayList;
        if (file != null) {
            this.f66430a = new C5087re(file, new O6());
            arrayList.add(new C5087re(file, new C4912ke()));
        } else {
            this.f66430a = new K6(new O6());
        }
        arrayList.add(new K6(new C4912ke()));
    }
}
