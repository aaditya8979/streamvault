package i5;

import a6.i0;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: RangedUri.java */
/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f63777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63780d;

    public h(@Nullable String str, long j10, long j11) {
        this.f63779c = str == null ? "" : str;
        this.f63777a = j10;
        this.f63778b = j11;
    }

    @Nullable
    public h a(@Nullable h hVar, String str) {
        String strC = c(str);
        if (hVar != null && strC.equals(hVar.c(str))) {
            long j10 = this.f63778b;
            if (j10 != -1) {
                long j11 = this.f63777a;
                if (j11 + j10 == hVar.f63777a) {
                    long j12 = hVar.f63778b;
                    return new h(strC, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = hVar.f63778b;
            if (j13 != -1) {
                long j14 = hVar.f63777a;
                if (j14 + j13 == this.f63777a) {
                    return new h(strC, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return i0.d(str, this.f63779c);
    }

    public String c(String str) {
        return i0.c(str, this.f63779c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f63777a == hVar.f63777a && this.f63778b == hVar.f63778b && this.f63779c.equals(hVar.f63779c);
    }

    public int hashCode() {
        if (this.f63780d == 0) {
            this.f63780d = ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) this.f63777a)) * 31) + ((int) this.f63778b)) * 31) + this.f63779c.hashCode();
        }
        return this.f63780d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f63779c + ", start=" + this.f63777a + ", length=" + this.f63778b + ")";
    }
}
