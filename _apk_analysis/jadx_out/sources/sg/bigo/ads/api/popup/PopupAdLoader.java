package sg.bigo.ads.api.popup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.d.a;
import sg.bigo.ads.ad.interstitial.k;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* JADX INFO: loaded from: classes2.dex */
public class PopupAdLoader extends AbstractAdLoader<PopupAd, PopupAdRequest> {

    public static class Builder implements AdLoader.Builder<PopupAd, Builder, PopupAdLoader> {
        private AdLoadListener<PopupAd> mAdLoadListener;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public PopupAdLoader build() {
            return new PopupAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public /* bridge */ /* synthetic */ AdLoader.Builder withAdLoadListener(@Nullable AdLoadListener adLoadListener) {
            return withAdLoadListener((AdLoadListener<PopupAd>) adLoadListener);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public Builder withAdLoadListener(@Nullable AdLoadListener<PopupAd> adLoadListener) {
            this.mAdLoadListener = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public Builder withExt(String str) {
            this.mExt = str;
            return this;
        }
    }

    public PopupAdLoader(Builder builder) {
        super(builder.mAdLoadListener, builder.mExt);
    }

    @Override // sg.bigo.ads.controller.loader.AbstractAdLoader
    @Nullable
    public final /* synthetic */ Ad a(f fVar) {
        Ad adInstance;
        if (fVar.f81860a.x() != 20) {
            return (PopupAd) super.a(fVar);
        }
        if (fVar.f81860a.x() != 20) {
            return null;
        }
        int iW = fVar.f81860a.w();
        if (iW == 1 || iW == 2) {
            if (a.f80139a == null) {
                a.f80139a = (k.a) sg.bigo.ads.common.r.a.a("sg.bigo.ads.api.INAdCreator", k.a.class);
            }
            k.a<?> aVar = a.f80139a;
            if (aVar == null) {
                return null;
            }
            adInstance = aVar.getAdInstance(fVar);
            if (!(adInstance instanceof PopupAd)) {
                return null;
            }
        } else {
            if (iW != 3) {
                return null;
            }
            if (a.f80140b == null) {
                a.f80140b = (k.a) sg.bigo.ads.common.r.a.a("sg.bigo.ads.api.IBAdCreator", k.a.class);
            }
            k.a<?> aVar2 = a.f80140b;
            if (aVar2 == null) {
                return null;
            }
            adInstance = aVar2.getAdInstance(fVar);
            if (!(adInstance instanceof PopupAd)) {
                return null;
            }
        }
        return (PopupAd) adInstance;
    }
}
