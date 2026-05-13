package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class t30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f95053a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f95056d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f95058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f95059g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95054b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f95055c = Collections.emptyMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f95057e = -1;

    public final t30 a(int i10) {
        this.f95059g = i10;
        return this;
    }

    public final t30 a(Uri uri) {
        this.f95053a = uri;
        return this;
    }

    public final t30 a(String str) {
        this.f95058f = str;
        return this;
    }

    public final u30 a() {
        ni.a(this.f95053a, "The uri must be set.");
        return new u30(this.f95053a, 0L, this.f95054b, null, this.f95055c, this.f95056d, this.f95057e, this.f95058f, this.f95059g, null);
    }
}
