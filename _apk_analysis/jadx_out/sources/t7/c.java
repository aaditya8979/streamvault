package t7;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.f;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: ColorInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements com.google.android.exoplayer2.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f85085g = new c(1, 2, 3, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f.a<c> f85086h = new f.a() { // from class: t7.b
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return c.e(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final byte[] f85090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85091f;

    public c(int i10, int i11, int i12, @Nullable byte[] bArr) {
        this.f85087b = i10;
        this.f85088c = i11;
        this.f85089d = i12;
        this.f85090e = bArr;
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ c e(Bundle bundle) {
        return new c(bundle.getInt(d(0), -1), bundle.getInt(d(1), -1), bundle.getInt(d(2), -1), bundle.getByteArray(d(3)));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f85087b == cVar.f85087b && this.f85088c == cVar.f85088c && this.f85089d == cVar.f85089d && Arrays.equals(this.f85090e, cVar.f85090e);
    }

    public int hashCode() {
        if (this.f85091f == 0) {
            this.f85091f = ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f85087b) * 31) + this.f85088c) * 31) + this.f85089d) * 31) + Arrays.hashCode(this.f85090e);
        }
        return this.f85091f;
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(d(0), this.f85087b);
        bundle.putInt(d(1), this.f85088c);
        bundle.putInt(d(2), this.f85089d);
        bundle.putByteArray(d(3), this.f85090e);
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(this.f85087b);
        sb2.append(", ");
        sb2.append(this.f85088c);
        sb2.append(", ");
        sb2.append(this.f85089d);
        sb2.append(", ");
        sb2.append(this.f85090e != null);
        sb2.append(")");
        return sb2.toString();
    }
}
