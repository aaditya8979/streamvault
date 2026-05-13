package g6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.m;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: DecoderReuseEvaluation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f62111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f62112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f62113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f62114e;

    public g(String str, m mVar, m mVar2, int i10, int i11) {
        s7.a.a(i10 == 0 || i11 == 0);
        this.f62110a = s7.a.d(str);
        this.f62111b = (m) s7.a.e(mVar);
        this.f62112c = (m) s7.a.e(mVar2);
        this.f62113d = i10;
        this.f62114e = i11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f62113d == gVar.f62113d && this.f62114e == gVar.f62114e && this.f62110a.equals(gVar.f62110a) && this.f62111b.equals(gVar.f62111b) && this.f62112c.equals(gVar.f62112c);
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f62113d) * 31) + this.f62114e) * 31) + this.f62110a.hashCode()) * 31) + this.f62111b.hashCode()) * 31) + this.f62112c.hashCode();
    }
}
