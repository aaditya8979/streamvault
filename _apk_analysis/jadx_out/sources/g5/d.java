package g5;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.upstream.Loader;
import java.util.List;
import java.util.Map;
import y5.o;

/* JADX INFO: compiled from: Chunk.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y5.h f62010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Format f62012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f62013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Object f62014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f62015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f62016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f62017h;

    public d(com.google.android.exoplayer.upstream.a aVar, y5.h hVar, int i10, Format format, int i11, @Nullable Object obj, long j10, long j11) {
        this.f62017h = new o(aVar);
        this.f62010a = (y5.h) a6.a.e(hVar);
        this.f62011b = i10;
        this.f62012c = format;
        this.f62013d = i11;
        this.f62014e = obj;
        this.f62015f = j10;
        this.f62016g = j11;
    }

    public final long a() {
        return this.f62017h.c();
    }

    public final long b() {
        return this.f62016g - this.f62015f;
    }

    public final Map<String, List<String>> c() {
        return this.f62017h.e();
    }

    public final Uri d() {
        return this.f62017h.d();
    }
}
