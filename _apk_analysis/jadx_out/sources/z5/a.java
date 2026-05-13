package z5;

import com.google.android.exoplayer.upstream.cache.Cache;
import com.google.android.exoplayer.upstream.cache.CacheDataSink;
import y5.f;

/* JADX INFO: compiled from: CacheDataSinkFactory.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cache f98197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f98198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98199c;

    public a(Cache cache, long j10) {
        this(cache, j10, 20480);
    }

    public a(Cache cache, long j10, int i10) {
        this.f98197a = cache;
        this.f98198b = j10;
        this.f98199c = i10;
    }

    @Override // y5.f.a
    public y5.f createDataSink() {
        return new CacheDataSink(this.f98197a, this.f98198b, this.f98199c);
    }
}
