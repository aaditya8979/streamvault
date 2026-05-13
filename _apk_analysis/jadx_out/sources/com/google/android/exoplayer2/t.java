package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import com.google.android.exoplayer2.f;

/* JADX INFO: compiled from: PercentageRating.java */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f.a<t> f22482d = new f.a() { // from class: d6.m1
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return com.google.android.exoplayer2.t.e(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22483c;

    public t() {
        this.f22483c = -1.0f;
    }

    public t(@FloatRange(from = 0.0d, to = TextSelectionMouseDetectorKt.ClicksSlop) float f10) {
        s7.a.b(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f22483c = f10;
    }

    public static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static t e(Bundle bundle) {
        s7.a.a(bundle.getInt(c(0), -1) == 1);
        float f10 = bundle.getFloat(c(1), -1.0f);
        return f10 == -1.0f ? new t() : new t(f10);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof t) && this.f22483c == ((t) obj).f22483c;
    }

    public int hashCode() {
        return y7.i.b(Float.valueOf(this.f22483c));
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(c(0), 1);
        bundle.putFloat(c(1), this.f22483c);
        return bundle;
    }
}
