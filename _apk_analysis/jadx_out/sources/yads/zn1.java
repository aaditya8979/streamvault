package yads;

import android.view.ViewTreeObserver;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes3.dex */
public final class zn1 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao1 f97725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomizableMediaView f97726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rn1 f97727c;

    public zn1(ao1 ao1Var, CustomizableMediaView customizableMediaView, rn1 rn1Var) {
        this.f97725a = ao1Var;
        this.f97726b = customizableMediaView;
        this.f97727c = rn1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f97725a.f87763b.a(this.f97726b, this.f97727c.f94528b);
        return false;
    }
}
