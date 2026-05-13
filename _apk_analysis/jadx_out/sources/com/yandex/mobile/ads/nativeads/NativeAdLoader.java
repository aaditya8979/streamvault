package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import androidx.annotation.MainThread;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import yads.d10;
import yads.g10;
import yads.g9;
import yads.iu3;
import yads.o02;
import yads.p02;
import yads.pt3;
import yads.v02;

/* JADX INFO: loaded from: classes4.dex */
public class NativeAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g10 f59192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f59193b = new e();

    public NativeAdLoader(@NotNull Context context) {
        this.f59192a = new g10(context, new iu3(context));
    }

    public final void loadAd(@NotNull NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        g9 g9VarA = this.f59193b.a(nativeAdRequestConfiguration);
        g10 g10Var = this.f59192a;
        i.d(g10Var.f89764c, null, null, new d10(g10Var, g9VarA, null), 3, null);
    }

    @MainThread
    public final void setNativeAdLoadListener(@Nullable NativeAdLoadListener nativeAdLoadListener) {
        pt3 pt3Var = nativeAdLoadListener != null ? new pt3(nativeAdLoadListener) : null;
        o02 o02Var = this.f59192a.f89765d;
        o02Var.f93066e.a();
        o02Var.f93067f = pt3Var;
        Iterator it = o02Var.f93065d.iterator();
        while (it.hasNext()) {
            v02 v02Var = ((p02) it.next()).f93377b.f92201x;
            v02Var.f95901d = pt3Var;
            v02Var.f95900c.a(pt3Var, null, null);
        }
    }
}
