package t7;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.f;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: VideoSize.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x implements com.google.android.exoplayer2.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x f85194f = new x(0, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f.a<x> f85195g = new f.a() { // from class: t7.w
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return x.c(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @IntRange(from = 0)
    public final int f85196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @IntRange(from = 0)
    public final int f85197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @IntRange(from = 0, to = 359)
    public final int f85198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @FloatRange(from = 0.0d, fromInclusive = false)
    public final float f85199e;

    public x(@IntRange(from = 0) int i10, @IntRange(from = 0) int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public x(@IntRange(from = 0) int i10, @IntRange(from = 0) int i11, @IntRange(from = 0, to = 359) int i12, @FloatRange(from = 0.0d, fromInclusive = false) float f10) {
        this.f85196b = i10;
        this.f85197c = i11;
        this.f85198d = i12;
        this.f85199e = f10;
    }

    public static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ x c(Bundle bundle) {
        return new x(bundle.getInt(b(0), 0), bundle.getInt(b(1), 0), bundle.getInt(b(2), 0), bundle.getFloat(b(3), 1.0f));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f85196b == xVar.f85196b && this.f85197c == xVar.f85197c && this.f85198d == xVar.f85198d && this.f85199e == xVar.f85199e;
    }

    public int hashCode() {
        return ((((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.f85196b) * 31) + this.f85197c) * 31) + this.f85198d) * 31) + Float.floatToRawIntBits(this.f85199e);
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(b(0), this.f85196b);
        bundle.putInt(b(1), this.f85197c);
        bundle.putInt(b(2), this.f85198d);
        bundle.putFloat(b(3), this.f85199e);
        return bundle;
    }
}
