package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5246xn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f67989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f67990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f67991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f67992f;

    public C5246xn(String str, int i10, long j10, String str2, Integer num, List list) {
        this.f67987a = str;
        this.f67988b = i10;
        this.f67989c = j10;
        this.f67990d = str2;
        this.f67991e = num;
        this.f67992f = list == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(list);
    }
}
