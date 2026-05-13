package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.f;

/* JADX INFO: compiled from: StarRating.java */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f.a<z> f23013e = new f.a() { // from class: d6.y1
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return com.google.android.exoplayer2.z.e(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @IntRange(from = 1)
    public final int f23014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23015d;

    public z(@IntRange(from = 1) int i10) {
        s7.a.b(i10 > 0, "maxStars must be a positive integer");
        this.f23014c = i10;
        this.f23015d = -1.0f;
    }

    public z(@IntRange(from = 1) int i10, @FloatRange(from = 0.0d) float f10) {
        s7.a.b(i10 > 0, "maxStars must be a positive integer");
        s7.a.b(f10 >= 0.0f && f10 <= ((float) i10), "starRating is out of range [0, maxStars]");
        this.f23014c = i10;
        this.f23015d = f10;
    }

    public static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static z e(Bundle bundle) {
        s7.a.a(bundle.getInt(c(0), -1) == 2);
        int i10 = bundle.getInt(c(1), 5);
        float f10 = bundle.getFloat(c(2), -1.0f);
        return f10 == -1.0f ? new z(i10) : new z(i10, f10);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f23014c == zVar.f23014c && this.f23015d == zVar.f23015d;
    }

    public int hashCode() {
        return y7.i.b(Integer.valueOf(this.f23014c), Float.valueOf(this.f23015d));
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(c(0), 2);
        bundle.putInt(c(1), this.f23014c);
        bundle.putFloat(c(2), this.f23015d);
        return bundle;
    }
}
