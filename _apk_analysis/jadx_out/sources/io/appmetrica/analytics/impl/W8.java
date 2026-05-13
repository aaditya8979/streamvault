package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class W8 extends X8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f66094a;

    public W8(List<Object> list) {
        this.f66094a = CollectionUtils.unmodifiableListCopy(list);
    }

    public final List<Object> a() {
        return this.f66094a;
    }
}
