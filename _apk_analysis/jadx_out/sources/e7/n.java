package e7;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: LoadEventInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicLong f60884h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f60885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7.k f60886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f60887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f60888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f60889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f60890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f60891g;

    public n(long j10, r7.k kVar, long j11) {
        this(j10, kVar, kVar.f78755a, Collections.emptyMap(), j11, 0L, 0L);
    }

    public n(long j10, r7.k kVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f60885a = j10;
        this.f60886b = kVar;
        this.f60887c = uri;
        this.f60888d = map;
        this.f60889e = j11;
        this.f60890f = j12;
        this.f60891g = j13;
    }

    public static long a() {
        return f60884h.getAndIncrement();
    }
}
