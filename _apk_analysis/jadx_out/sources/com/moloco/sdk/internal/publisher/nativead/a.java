package com.moloco.sdk.internal.publisher.nativead;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import bo.y;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.nativead.ui.g;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
public final class a implements NativeAd.Assets {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final C0571a f46716k = new C0571a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f46717l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f46718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c0 f46719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.a f46720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final e0 f46721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a> f46722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public sn.a<r> f46723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public com.moloco.sdk.internal.publisher.nativead.model.d f46724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Uri f46725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ViewGroup f46726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public g f46727j;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.a$a, reason: collision with other inner class name */
    public static final class C0571a {
        public C0571a() {
        }

        public /* synthetic */ C0571a(i iVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Context context, @NotNull c0 c0Var, @NotNull com.moloco.sdk.internal.a aVar, @NotNull e0 e0Var, @NotNull l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a> lVar) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(c0Var, "viewVisibilityTracker");
        p.k(aVar, "viewLifecycleOwner");
        p.k(e0Var, "watermark");
        p.k(lVar, "vastAdPlaylistController");
        this.f46718a = context;
        this.f46719b = c0Var;
        this.f46720c = aVar;
        this.f46721d = e0Var;
        this.f46722e = lVar;
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.f46724g;
        this.f46725h = dVar != null ? dVar.c(1) : null;
    }

    public final ViewGroup a(Uri uri) {
        return new com.moloco.sdk.internal.publisher.nativead.ui.f(this.f46718a, uri, this.f46721d, this.f46723f, null, null, 48, null);
    }

    public final g b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVarInvoke = this.f46722e.invoke(aVar);
        aVarInvoke.d();
        return new g(this.f46718a, aVarInvoke, this.f46719b, this.f46720c, this.f46721d, this.f46723f);
    }

    public final void c() {
        g gVar = this.f46727j;
        if (gVar != null) {
            gVar.b();
        }
        this.f46727j = null;
    }

    public final void d(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Detaching view " + viewGroup.getClass().getSimpleName() + " from parent " + viewGroup2.getClass().getSimpleName(), null, false, 12, null);
            viewGroup2.removeView(viewGroup);
        }
    }

    public final void e(@Nullable com.moloco.sdk.internal.publisher.nativead.model.d dVar) {
        this.f46724g = dVar;
    }

    public final void f(@Nullable sn.a<r> aVar) {
        this.f46723f = aVar;
    }

    @Nullable
    public final com.moloco.sdk.internal.publisher.nativead.model.d g() {
        return this.f46724g;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    @Nullable
    public String getCallToActionText() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.f46724g;
        if (dVar != null) {
            return dVar.a(7);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    @Nullable
    public String getDescription() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.f46724g;
        if (dVar != null) {
            return dVar.a(5);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    @Nullable
    public Uri getIconUri() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.f46724g;
        if (dVar != null) {
            return dVar.c(0);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    @Nullable
    public Uri getMainImageUri() {
        return this.f46725h;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    @Nullable
    public View getMediaView() {
        Uri uriC;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVarE;
        g gVar = this.f46727j;
        if (gVar != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Using cached video view", null, false, 12, null);
            d(gVar);
            return gVar;
        }
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.f46724g;
        if (dVar != null && (aVarE = dVar.e(2)) != null) {
            g gVarB = b(aVarE);
            this.f46727j = gVarB;
            return gVarB;
        }
        ViewGroup viewGroup = this.f46726i;
        if (viewGroup != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Using cached image view", null, false, 12, null);
            d(viewGroup);
            return viewGroup;
        }
        com.moloco.sdk.internal.publisher.nativead.model.d dVar2 = this.f46724g;
        if (dVar2 == null || (uriC = dVar2.c(1)) == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Missing video and image asset", new Exception(), false, 8, null);
            return null;
        }
        ViewGroup viewGroupA = a(uriC);
        this.f46726i = viewGroupA;
        return viewGroupA;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    @Nullable
    public Float getRating() {
        String strA;
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.f46724g;
        if (dVar == null || (strA = dVar.a(6)) == null) {
            return null;
        }
        return y.p(strA);
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    @Nullable
    public String getSponsorText() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.f46724g;
        if (dVar != null) {
            return dVar.a(4);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    @Nullable
    public String getTitle() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.f46724g;
        if (dVar != null) {
            return dVar.d(3);
        }
        return null;
    }
}
