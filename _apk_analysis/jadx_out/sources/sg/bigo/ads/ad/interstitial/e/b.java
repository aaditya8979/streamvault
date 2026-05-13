package sg.bigo.ads.ad.interstitial.e;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.interstitial.e.a.b;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends sg.bigo.ads.common.view.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Drawable f80823c;

    public b(float f10, float f11, float f12, float f13, @Nullable Rect rect, float f14, @Nullable boolean[] zArr, @NonNull b.a aVar) {
        super(f10, f11, f12, f13, rect, aVar.f80809b, aVar.f80810c, f14, zArr);
        int i10 = aVar.f80809b;
        this.f80821a = i10;
        boolean z10 = aVar.f80808a;
        this.f80822b = z10;
        if (z10) {
            this.f80823c = null;
        } else {
            Drawable drawableA = sg.bigo.ads.common.utils.d.a(f10, f11, f12, f13, rect, i10);
            this.f80823c = this.f82713n != null ? new LayerDrawable(new Drawable[]{drawableA, this.f82713n}) : drawableA;
        }
    }

    public b(float f10, float f11, @NonNull b.a aVar) {
        this(f10, f10, f10, f10, null, f11, null, aVar);
    }

    @Nullable
    public final Drawable a() {
        return this.f80823c;
    }
}
