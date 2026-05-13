package com.google.android.exoplayer.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.upstream.HttpDataSource;
import y5.q;

/* JADX INFO: compiled from: DefaultHttpDataSourceFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends HttpDataSource.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final q f21145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21148f;

    public e(String str, @Nullable q qVar) {
        this(str, qVar, 8000, 8000, false);
    }

    public e(String str, @Nullable q qVar, int i10, int i11, boolean z10) {
        this.f21144b = a6.a.d(str);
        this.f21145c = qVar;
        this.f21146d = i10;
        this.f21147e = i11;
        this.f21148f = z10;
    }

    @Override // com.google.android.exoplayer.upstream.HttpDataSource.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d b(HttpDataSource.c cVar) {
        d dVar = new d(this.f21144b, this.f21146d, this.f21147e, this.f21148f, cVar);
        q qVar = this.f21145c;
        if (qVar != null) {
            dVar.b(qVar);
        }
        return dVar;
    }
}
