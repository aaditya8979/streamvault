package e4;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: PlaybackParameters.java */
/* JADX INFO: loaded from: classes11.dex */
public final class l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l0 f60186e = new l0(1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f60187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f60188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f60189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f60190d;

    public l0(float f10) {
        this(f10, 1.0f, false);
    }

    public l0(float f10, float f11) {
        this(f10, f11, false);
    }

    public l0(float f10, float f11, boolean z10) {
        a6.a.a(f10 > 0.0f);
        a6.a.a(f11 > 0.0f);
        this.f60187a = f10;
        this.f60188b = f11;
        this.f60189c = z10;
        this.f60190d = Math.round(f10 * 1000.0f);
    }

    public long a(long j10) {
        return j10 * ((long) this.f60190d);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f60187a == l0Var.f60187a && this.f60188b == l0Var.f60188b && this.f60189c == l0Var.f60189c;
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Float.floatToRawIntBits(this.f60187a)) * 31) + Float.floatToRawIntBits(this.f60188b)) * 31) + (this.f60189c ? 1 : 0);
    }
}
