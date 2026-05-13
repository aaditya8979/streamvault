package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import yads.mx;
import yads.xq;

/* JADX INFO: loaded from: classes12.dex */
public final class mx implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wq f92593g = new wq() { // from class: bt.q6
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return mx.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f92595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f92596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f92597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f92598f;

    public mx(int i10, int i11, int i12, byte[] bArr) {
        this.f92594b = i10;
        this.f92595c = i11;
        this.f92596d = i12;
        this.f92597e = bArr;
    }

    public static mx a(Bundle bundle) {
        return new mx(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mx.class != obj.getClass()) {
            return false;
        }
        mx mxVar = (mx) obj;
        return this.f92594b == mxVar.f92594b && this.f92595c == mxVar.f92595c && this.f92596d == mxVar.f92596d && Arrays.equals(this.f92597e, mxVar.f92597e);
    }

    public final int hashCode() {
        if (this.f92598f == 0) {
            this.f92598f = Arrays.hashCode(this.f92597e) + ((((((this.f92594b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f92595c) * 31) + this.f92596d) * 31);
        }
        return this.f92598f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f92594b);
        sb2.append(", ");
        sb2.append(this.f92595c);
        sb2.append(", ");
        sb2.append(this.f92596d);
        sb2.append(", ");
        sb2.append(this.f92597e != null);
        sb2.append(")");
        return sb2.toString();
    }
}
