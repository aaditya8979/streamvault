package com.inmobi.ads;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.C3771u1;
import com.inmobi.media.C3796v1;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final Animation a(InMobiBanner.AnimationType animationType, float f10, float f11) {
        p.k(animationType, "animationType");
        int i10 = a.f25107a[animationType.ordinal()];
        if (i10 == 1) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.5f);
            alphaAnimation.setDuration(1000L);
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            return alphaAnimation;
        }
        if (i10 == 2) {
            C3771u1 c3771u1 = new C3771u1(f10 / 2.0f, f11 / 2.0f);
            c3771u1.setDuration(500L);
            c3771u1.setFillAfter(false);
            c3771u1.setInterpolator(new AccelerateInterpolator());
            return c3771u1;
        }
        if (i10 != 3) {
            return null;
        }
        C3796v1 c3796v1 = new C3796v1(f10 / 2.0f, f11 / 2.0f);
        c3796v1.setDuration(500L);
        c3796v1.setFillAfter(false);
        c3796v1.setInterpolator(new AccelerateInterpolator());
        return c3796v1;
    }
}
