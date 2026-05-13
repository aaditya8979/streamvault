package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.b;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: DefaultLoadErrorHandlingPolicy.java */
/* JADX INFO: loaded from: classes3.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22891a;

    public a() {
        this(-1);
    }

    public a(int i10) {
        this.f22891a = i10;
    }

    @Override // com.google.android.exoplayer2.upstream.b
    public long a(b.a aVar) {
        IOException iOException = aVar.f22894c;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException) || DataSourceException.isCausedByPositionOutOfRange(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((aVar.f22895d - 1) * 1000, 5000);
    }

    @Override // com.google.android.exoplayer2.upstream.b
    public int getMinimumLoadableRetryCount(int i10) {
        int i11 = this.f22891a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }
}
