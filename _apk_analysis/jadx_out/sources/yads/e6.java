package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import yads.xq;

/* JADX INFO: loaded from: classes3.dex */
public final class e6 implements xq {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e6 f89106h = new e6(null, new d6[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d6 f89107i = new d6(0, -1, new int[0], new Uri[0], new long[0], 0, false).a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final wq f89108j = new wq() { // from class: bt.e1
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return yads.e6.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f89109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f89110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f89111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f89112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f89113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d6[] f89114g;

    public e6(Object obj, d6[] d6VarArr, long j10, long j11, int i10) {
        this.f89109b = obj;
        this.f89111d = j10;
        this.f89112e = j11;
        this.f89110c = d6VarArr.length + i10;
        this.f89114g = d6VarArr;
        this.f89113f = i10;
    }

    public static e6 a(Bundle bundle) {
        d6[] d6VarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
        if (parcelableArrayList == null) {
            d6VarArr = new d6[0];
        } else {
            d6[] d6VarArr2 = new d6[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                d6VarArr2[i10] = (d6) d6.f88760i.fromBundle((Bundle) parcelableArrayList.get(i10));
            }
            d6VarArr = d6VarArr2;
        }
        return new e6(null, d6VarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
    }

    public final d6 a(int i10) {
        int i11 = this.f89113f;
        return i10 < i11 ? f89107i : this.f89114g[i10 - i11];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e6.class != obj.getClass()) {
            return false;
        }
        e6 e6Var = (e6) obj;
        return ib3.a(this.f89109b, e6Var.f89109b) && this.f89110c == e6Var.f89110c && this.f89111d == e6Var.f89111d && this.f89112e == e6Var.f89112e && this.f89113f == e6Var.f89113f && Arrays.equals(this.f89114g, e6Var.f89114g);
    }

    public final int hashCode() {
        int i10 = this.f89110c * 31;
        Object obj = this.f89109b;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f89111d)) * 31) + ((int) this.f89112e)) * 31) + this.f89113f) * 31) + Arrays.hashCode(this.f89114g);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f89109b);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f89111d);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f89114g.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f89114g[i10].f88761b);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f89114g[i10].f88764e.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f89114g[i10].f88764e[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f89114g[i10].f88765f[i11]);
                sb2.append(')');
                if (i11 < this.f89114g[i10].f88764e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f89114g.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
