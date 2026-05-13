package com.mbridge.msdk.tracker.network.toolbox;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: HttpResponse.java */
/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.mbridge.msdk.tracker.network.g> f41062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InputStream f41064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f41065e;

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list) {
        this(i10, list, -1, null);
    }

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list, int i11, InputStream inputStream) {
        this.f41061a = i10;
        this.f41062b = list;
        this.f41063c = i11;
        this.f41064d = inputStream;
        this.f41065e = null;
    }

    public final InputStream a() {
        InputStream inputStream = this.f41064d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f41065e != null) {
            return new ByteArrayInputStream(this.f41065e);
        }
        return null;
    }

    public final int b() {
        return this.f41063c;
    }

    public final List<com.mbridge.msdk.tracker.network.g> c() {
        return Collections.unmodifiableList(this.f41062b);
    }

    public final int d() {
        return this.f41061a;
    }
}
