package com.google.android.exoplayer.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.upstream.FileDataSource;
import com.google.android.exoplayer.upstream.a;
import com.google.android.exoplayer.upstream.cache.a;
import y5.f;

/* JADX INFO: compiled from: CacheDataSourceFactory.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b implements a.InterfaceC0296a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cache f21101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.InterfaceC0296a f21102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.InterfaceC0296a f21103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final f.a f21105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final a.InterfaceC0297a f21106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final z5.d f21107g;

    public b(Cache cache, a.InterfaceC0296a interfaceC0296a, int i10) {
        this(cache, interfaceC0296a, new FileDataSource.a(), new z5.a(cache, 5242880L), i10, null);
    }

    public b(Cache cache, a.InterfaceC0296a interfaceC0296a, a.InterfaceC0296a interfaceC0296a2, @Nullable f.a aVar, int i10, @Nullable a.InterfaceC0297a interfaceC0297a) {
        this(cache, interfaceC0296a, interfaceC0296a2, aVar, i10, interfaceC0297a, null);
    }

    public b(Cache cache, a.InterfaceC0296a interfaceC0296a, a.InterfaceC0296a interfaceC0296a2, @Nullable f.a aVar, int i10, @Nullable a.InterfaceC0297a interfaceC0297a, @Nullable z5.d dVar) {
        this.f21101a = cache;
        this.f21102b = interfaceC0296a;
        this.f21103c = interfaceC0296a2;
        this.f21105e = aVar;
        this.f21104d = i10;
        this.f21106f = interfaceC0297a;
        this.f21107g = dVar;
    }

    @Override // com.google.android.exoplayer.upstream.a.InterfaceC0296a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a createDataSource() {
        Cache cache = this.f21101a;
        com.google.android.exoplayer.upstream.a aVarCreateDataSource = this.f21102b.createDataSource();
        com.google.android.exoplayer.upstream.a aVarCreateDataSource2 = this.f21103c.createDataSource();
        f.a aVar = this.f21105e;
        return new a(cache, aVarCreateDataSource, aVarCreateDataSource2, aVar == null ? null : aVar.createDataSink(), this.f21104d, this.f21106f, this.f21107g);
    }
}
