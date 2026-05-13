package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;
import yads.ee2;
import yads.xq;

/* JADX INFO: loaded from: classes8.dex */
public final class ee2 implements xq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ee2 f89220e = new ee2(1.0f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f89221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f89222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89223d;

    static {
        new wq() { // from class: bt.i1
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return ee2.a(bundle);
            }
        };
    }

    public ee2(float f10, float f11) {
        ni.a(f10 > 0.0f);
        ni.a(f11 > 0.0f);
        this.f89221b = f10;
        this.f89222c = f11;
        this.f89223d = Math.round(f10 * 1000.0f);
    }

    public static ee2 a(Bundle bundle) {
        return new ee2(bundle.getFloat(Integer.toString(0, 36), 1.0f), bundle.getFloat(Integer.toString(1, 36), 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ee2.class != obj.getClass()) {
            return false;
        }
        ee2 ee2Var = (ee2) obj;
        return this.f89221b == ee2Var.f89221b && this.f89222c == ee2Var.f89222c;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f89222c) + ((Float.floatToRawIntBits(this.f89221b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f89221b), Float.valueOf(this.f89222c)};
        int i10 = ib3.f90737a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
