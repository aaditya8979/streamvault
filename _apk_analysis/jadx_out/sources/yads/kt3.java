package yads;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.nativeads.NativeAdImage;

/* JADX INFO: loaded from: classes2.dex */
public final class kt3 implements NativeAdImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a10 f91750a;

    public kt3(a10 a10Var) {
        this.f91750a = a10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kt3) && tn.p.f(this.f91750a, ((kt3) obj).f91750a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final Bitmap getBitmap() {
        return (Bitmap) this.f91750a.f87539a.invoke();
    }

    public final int hashCode() {
        return this.f91750a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdImageAdapter(image=" + this.f91750a + ")";
    }
}
