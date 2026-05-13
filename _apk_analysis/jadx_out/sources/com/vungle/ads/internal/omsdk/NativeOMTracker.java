package com.vungle.ads.internal.omsdk;

import android.util.Base64;
import android.view.View;
import bn.r;
import bo.c;
import cn.v;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.adsession.AdEvents;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import com.iab.omid.library.vungle.adsession.Partner;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.model.OmSdkData;
import com.vungle.ads.internal.util.Logger;
import java.net.URL;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import so.t;
import tn.p;
import xo.d;
import xo.u;

/* JADX INFO: compiled from: NativeOMTracker.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/vungle/ads/internal/omsdk/NativeOMTracker;", "", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lbn/r;", "start", "stop", "impressionOccurred", "Lxo/a;", "json", "Lxo/a;", "Lcom/iab/omid/library/vungle/adsession/AdSession;", "adSession", "Lcom/iab/omid/library/vungle/adsession/AdSession;", "Lcom/iab/omid/library/vungle/adsession/AdEvents;", "adEvents", "Lcom/iab/omid/library/vungle/adsession/AdEvents;", "", "omSdkData", "omSdkJS", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class NativeOMTracker {

    @Nullable
    private AdEvents adEvents;

    @Nullable
    private AdSession adSession;

    @NotNull
    private final xo.a json;

    public NativeOMTracker(@NotNull String str, @NotNull String str2) {
        OmSdkData omSdkData;
        p.k(str, "omSdkData");
        p.k(str2, "omSdkJS");
        xo.a aVarB = u.b(null, new l<d, r>() { // from class: com.vungle.ads.internal.omsdk.NativeOMTracker$json$1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(d dVar) {
                invoke2(dVar);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull d dVar) {
                p.k(dVar, "$this$Json");
                dVar.f(true);
                dVar.d(true);
                dVar.e(false);
            }
        }, 1, null);
        this.json = aVarB;
        try {
            AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
            Partner partnerCreatePartner = Partner.createPartner(BuildConfig.OMSDK_PARTNER_NAME, BuildConfig.VERSION_NAME);
            byte[] bArrDecode = Base64.decode(str, 0);
            if (bArrDecode != null) {
                String str3 = new String(bArrDecode, c.f5639b);
                KSerializer<Object> kSerializerB = t.b(aVarB.a(), tn.t.m(OmSdkData.class));
                p.i(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                omSdkData = (OmSdkData) aVarB.c(kSerializerB, str3);
            } else {
                omSdkData = null;
            }
            VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(omSdkData != null ? omSdkData.getVendorKey() : null, new URL(omSdkData != null ? omSdkData.getVendorURL() : null), omSdkData != null ? omSdkData.getParams() : null);
            p.j(verificationScriptResourceCreateVerificationScriptResourceWithParameters, "verificationScriptResource");
            this.adSession = AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, AdSessionContext.createNativeAdSessionContext(partnerCreatePartner, str2, v.e(verificationScriptResourceCreateVerificationScriptResourceWithParameters), null, null));
        } catch (Exception e10) {
            Logger.INSTANCE.e("NativeOMTracker", "error occured when create omsdk adSession:", e10);
        }
    }

    public final void impressionOccurred() {
        AdEvents adEvents = this.adEvents;
        if (adEvents != null) {
            adEvents.impressionOccurred();
        }
    }

    public final void start(@NotNull View view) {
        AdSession adSession;
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (!Omid.isActive() || (adSession = this.adSession) == null) {
            return;
        }
        adSession.registerAdView(view);
        adSession.start();
        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
        this.adEvents = adEventsCreateAdEvents;
        if (adEventsCreateAdEvents != null) {
            adEventsCreateAdEvents.loaded();
        }
    }

    public final void stop() {
        AdSession adSession = this.adSession;
        if (adSession != null) {
            adSession.finish();
        }
        this.adSession = null;
    }
}
