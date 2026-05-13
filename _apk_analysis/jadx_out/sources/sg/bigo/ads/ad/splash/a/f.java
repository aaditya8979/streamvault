package sg.bigo.ads.ad.splash.a;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.m;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f81657l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f81658m;

    public f(int i10, @NonNull sg.bigo.ads.api.core.f fVar, @NonNull m mVar, @Nullable m mVar2, @NonNull sg.bigo.ads.ad.splash.b bVar) {
        super(fVar, mVar, mVar2, bVar);
        this.f81657l = i10;
    }

    @Override // sg.bigo.ads.ad.splash.a.b
    public final void a(ViewGroup viewGroup, int i10) {
        this.f81658m = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    @Override // sg.bigo.ads.ad.splash.a.b, sg.bigo.ads.ad.splash.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r21, @androidx.annotation.NonNull final android.view.ViewGroup r22, int r23) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.splash.a.f.a(boolean, android.view.ViewGroup, int):void");
    }

    @Override // sg.bigo.ads.ad.splash.a.b
    public final int e() {
        return 5 == this.f81657l ? R.layout.bigo_ad_splash_style_5_card_widget : R.layout.bigo_ad_splash_style_4_cta_widget;
    }
}
