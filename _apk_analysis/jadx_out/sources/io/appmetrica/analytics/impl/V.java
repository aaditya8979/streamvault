package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5246xn f66016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f66017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66018c;

    public V(C5246xn c5246xn, ArrayList arrayList, String str) {
        this.f66016a = c5246xn;
        this.f66017b = arrayList == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(arrayList);
        this.f66018c = str;
    }
}
