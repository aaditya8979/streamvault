package com.unity3d.ads.core.domain;

import android.content.Context;
import android.content.Intent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import hn.c;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AndroidHandleOpenUrl.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidHandleOpenUrl implements HandleOpenUrl {

    @NotNull
    private final Context context;

    @NotNull
    private final IntentCreation intentCreation;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleOpenUrl.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl", f = "AndroidHandleOpenUrl.kt", l = {52}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleOpenUrl.this.invoke(null, null, null, null, null, false, this);
        }
    }

    public AndroidHandleOpenUrl(@NotNull Context context, @NotNull IntentCreation intentCreation) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(intentCreation, "intentCreation");
        this.context = context;
        this.intentCreation = intentCreation;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, "com.unity3d.ads");
        context.startActivity(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.HandleOpenUrl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull final com.unity3d.ads.core.data.model.AdObject r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.Nullable java.lang.String r7, @org.jetbrains.annotations.Nullable java.lang.String r8, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r9, boolean r10, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.Boolean> r11) {
        /*
            r4 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.AndroidHandleOpenUrl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidHandleOpenUrl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r11)
            goto L83
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.c.b(r11)
            com.unity3d.ads.core.domain.IntentCreation r11 = r4.intentCreation
            android.content.Intent r6 = r11.invoke(r6, r7, r8, r9)
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType r7 = r5.getAdType()
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType r8 = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER
            if (r7 != r8) goto L65
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r6.setFlags(r5)
            kotlin.Result$a r5 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L55
            android.content.Context r5 = r4.context     // Catch: java.lang.Throwable -> L55
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(r5, r6)     // Catch: java.lang.Throwable -> L55
            bn.r r5 = bn.r.f5635a     // Catch: java.lang.Throwable -> L55
            java.lang.Object r5 = kotlin.Result.m7534constructorimpl(r5)     // Catch: java.lang.Throwable -> L55
            goto L60
        L55:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.c.a(r5)
            java.lang.Object r5 = kotlin.Result.m7534constructorimpl(r5)
        L60:
            boolean r5 = kotlin.Result.m7540isSuccessimpl(r5)
            goto L8e
        L65:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$Companion r7 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.Companion
            go.k r7 = r7.getDisplayMessages()
            com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1 r8 = new com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1
            r9 = 0
            r8.<init>(r5, r6, r10, r9)
            go.p r6 = go.f.I(r7, r8)
            com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1 r7 = new com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1
            r7.<init>()
            r0.label = r3
            java.lang.Object r11 = go.f.v(r7, r0)
            if (r11 != r1) goto L83
            return r1
        L83:
            java.lang.String r5 = "null cannot be cast to non-null type com.unity3d.ads.adplayer.DisplayMessage.OpenUrlResult"
            tn.p.i(r11, r5)
            com.unity3d.ads.adplayer.DisplayMessage$OpenUrlResult r11 = (com.unity3d.ads.adplayer.DisplayMessage.OpenUrlResult) r11
            boolean r5 = r11.getSuccess()
        L8e:
            java.lang.Boolean r5 = jn.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleOpenUrl.invoke(com.unity3d.ads.core.data.model.AdObject, java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean, hn.c):java.lang.Object");
    }
}
