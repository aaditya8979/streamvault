package com.google.android.exoplayer.upstream;

import a6.k0;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.upstream.Loader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import y5.h;
import y5.o;

/* JADX INFO: compiled from: ParsingLoadable.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g<T> implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f21150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f21152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a<? extends T> f21153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public volatile T f21154e;

    /* JADX INFO: compiled from: ParsingLoadable.java */
    public interface a<T> {
        T parse(Uri uri, InputStream inputStream) throws IOException;
    }

    public g(com.google.android.exoplayer.upstream.a aVar, Uri uri, int i10, a<? extends T> aVar2) {
        this(aVar, new h(uri, 1), i10, aVar2);
    }

    public g(com.google.android.exoplayer.upstream.a aVar, h hVar, int i10, a<? extends T> aVar2) {
        this.f21152c = new o(aVar);
        this.f21150a = hVar;
        this.f21151b = i10;
        this.f21153d = aVar2;
    }

    public long a() {
        return this.f21152c.c();
    }

    public Map<String, List<String>> b() {
        return this.f21152c.e();
    }

    @Nullable
    public final T c() {
        return this.f21154e;
    }

    @Override // com.google.android.exoplayer.upstream.Loader.e
    public final void cancelLoad() {
    }

    public Uri d() {
        return this.f21152c.d();
    }

    @Override // com.google.android.exoplayer.upstream.Loader.e
    public final void load() throws IOException {
        this.f21152c.f();
        y5.g gVar = new y5.g(this.f21152c, this.f21150a);
        try {
            gVar.h();
            this.f21154e = this.f21153d.parse((Uri) a6.a.e(this.f21152c.getUri()), gVar);
        } finally {
            k0.n(gVar);
        }
    }
}
