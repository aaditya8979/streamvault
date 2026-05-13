package yads;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;

/* JADX INFO: loaded from: classes5.dex */
public final class et3 implements NativeAdAssets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f89372a;

    public et3(y00 y00Var) {
        this.f89372a = y00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof et3) && tn.p.f(this.f89372a, ((et3) obj).f89372a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getBody() {
        return this.f89372a.f96953g;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getCallToAction() {
        return this.f89372a.f96954h;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getDomain() {
        return this.f89372a.f96955i;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdImage getIcon() {
        a10 a10Var = this.f89372a.f96949c;
        if (a10Var != null) {
            return new kt3(a10Var);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final Float getRating() {
        return this.f89372a.f96957k;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getTitle() {
        return this.f89372a.f96960n;
    }

    public final int hashCode() {
        return this.f89372a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdAssetsAdapter(assets=" + this.f89372a + ")";
    }
}
