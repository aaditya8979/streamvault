package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class Th implements Ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3337ci f26374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f26375b;

    public Th(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, Context context) {
        this.f26374a = gestureDetectorOnGestureListenerC3337ci;
        this.f26375b = context;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53135i);
        context.startActivity(intent);
    }

    @Override // com.inmobi.media.Ma
    public final void a() {
        this.f26374a.getListener().a();
    }

    @Override // com.inmobi.media.Ma
    public final void a(Intent intent) {
        tn.p.k(intent, "intent");
        intent.putExtra("creativeId", this.f26374a.getCreativeId());
        intent.putExtra("impressionId", this.f26374a.getImpressionId());
        intent.putExtra("placementId", this.f26374a.getPlacementId());
        SparseArray sparseArray = InMobiAdActivity.f25113k;
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f26374a;
        InMobiAdActivity.f25114l = gestureDetectorOnGestureListenerC3337ci;
        if (gestureDetectorOnGestureListenerC3337ci.getPlacementType() != 0) {
            Context context = Ji.f25747a;
            Context containerContext = this.f26374a.getContainerContext();
            tn.p.k(containerContext, GAMConfig.KEY_CONTEXT);
            tn.p.k(intent, "intent");
            if (!(containerContext instanceof Activity)) {
                intent.setFlags(268435456);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(containerContext, intent);
            return;
        }
        Context context2 = Ji.f25747a;
        Activity activity = this.f26374a.getBannerHolderActivity().get();
        if (activity == null) {
            activity = this.f26375b;
        }
        tn.p.k(activity, GAMConfig.KEY_CONTEXT);
        tn.p.k(intent, "intent");
        if (!(activity instanceof Activity)) {
            intent.setFlags(268435456);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(activity, intent);
    }

    @Override // com.inmobi.media.Ma
    public final void a(String str, String str2, String str3) {
        tn.p.k(str2, "message");
        this.f26374a.a(str, str2, str3);
    }

    @Override // com.inmobi.media.Ma
    public final void a(String str, Map map) {
        tn.p.k(str, "trackerName");
        tn.p.k(map, "macros");
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f26374a;
        if (gestureDetectorOnGestureListenerC3337ci.f26950e) {
            return;
        }
        gestureDetectorOnGestureListenerC3337ci.b(str, map);
    }

    @Override // com.inmobi.media.Ma
    public final void b(String str, String str2, String str3) {
        this.f26374a.b(str, str2, str3);
    }
}
