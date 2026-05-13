package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.MainThread;
import cn.x;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.common.VideoController;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.aq3;
import yads.c00;
import yads.d4;
import yads.e00;
import yads.er3;
import yads.g9;
import yads.gc;
import yads.gp2;
import yads.i00;
import yads.i12;
import yads.ip2;
import yads.iu3;
import yads.jm;
import yads.km;
import yads.lc1;
import yads.lh3;
import yads.lm;
import yads.mm;
import yads.ri0;
import yads.sm;
import yads.tc1;
import yads.tm;
import yads.tq3;
import yads.w5;
import yads.xp3;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public final class BannerAdView extends tc1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final aq3 f59104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final tm f59105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final xp3 f59106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f59107n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final VideoController f59108o;

    public BannerAdView(@NotNull Context context) {
        this(context, null);
    }

    public BannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, new d4(e00.f89040d), new iu3(context));
        this.f59104k = new aq3();
        this.f59105l = new tm();
        this.f59106m = new xp3();
        this.f59108o = new VideoController(e());
    }

    @Override // yads.tc1
    public final km a(Context context, d4 d4Var, jm jmVar, w5 w5Var) {
        return new km(context, this, jmVar, w5Var, new lh3(), new mm(), new lm(getSdkEnvironmentModule$mobileads_externalRelease()), new i12(d4Var), new ri0());
    }

    @Override // yads.tc1
    public void destroy() {
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53151y, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @NotNull
    public final List<Object> getAdAttributes() {
        List<gc> listB = b();
        ArrayList arrayList = new ArrayList(x.x(listB, 10));
        for (gc gcVar : listB) {
            this.f59105l.getClass();
            arrayList.add(new sm(gcVar));
        }
        return arrayList;
    }

    @NotNull
    public final AdInfo getAdInfo() {
        String str = this.f59107n;
        if (str == null) {
            str = "";
        }
        c00 c00VarA = a(str);
        this.f59106m.getClass();
        return xp3.a(c00VarA);
    }

    @Nullable
    public final BannerAdSize getAdSize() {
        i00 i00VarC = c();
        if (i00VarC != null) {
            return new BannerAdSize(i00VarC.f87760a);
        }
        return null;
    }

    @Nullable
    public final String getInfo() {
        return d();
    }

    @NotNull
    public final VideoController getVideoController() {
        return this.f59108o;
    }

    public final void loadAd(@NotNull AdRequest adRequest) {
        gp2 gp2VarA;
        String str = this.f59107n;
        if (str == null || str.length() <= 0) {
            lc1.a("Failed to load ad with empty ad unit id", new Object[0]);
            return;
        }
        aq3 aq3Var = this.f59104k;
        aq3Var.getClass();
        AdTheme preferredTheme = adRequest.getPreferredTheme();
        if (preferredTheme != null) {
            aq3Var.f87777a.getClass();
            gp2VarA = ip2.a(preferredTheme);
        } else {
            gp2VarA = null;
        }
        String age = adRequest.getAge();
        String biddingData = adRequest.getBiddingData();
        a(new g9(str, age, adRequest.getGender(), adRequest.getContextQuery(), adRequest.getContextTags(), adRequest.getLocation(), adRequest.getParameters(), biddingData, null, gp2VarA, false, null));
    }

    public final void setAdSize(@NotNull BannerAdSize bannerAdSize) {
        a(a.a(bannerAdSize));
    }

    @Override // yads.tc1
    public void setAdUnitId(@Nullable String str) {
        this.f59107n = str;
        super.setAdUnitId(str);
    }

    public final void setBannerAdEventListener(@Nullable BannerAdEventListener bannerAdEventListener) {
        a(bannerAdEventListener instanceof ClosableBannerAdEventListener ? new er3((ClosableBannerAdEventListener) bannerAdEventListener) : bannerAdEventListener != null ? new tq3(bannerAdEventListener) : null);
    }
}
