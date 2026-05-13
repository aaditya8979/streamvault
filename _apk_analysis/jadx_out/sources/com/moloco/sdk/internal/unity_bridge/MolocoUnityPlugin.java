package com.moloco.sdk.internal.unity_bridge;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.g;
import bo.d0;
import com.ironsource.C3978d4;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.MolocoInitializationListener;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import go.l;
import go.v;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class MolocoUnityPlugin {

    @NotNull
    private static final String TAG = "MolocoUnityPlugin";

    @NotNull
    public static final MolocoUnityPlugin INSTANCE = new MolocoUnityPlugin();

    @NotNull
    private static final l<Boolean> initState = v.a(Boolean.FALSE);

    @NotNull
    private static final g context$delegate = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.unity_bridge.a
        @Override // sn.a
        public final Object invoke() {
            return MolocoUnityPlugin.context_delegate$lambda$0();
        }
    });

    @NotNull
    private static final g adManager$delegate = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.unity_bridge.b
        @Override // sn.a
        public final Object invoke() {
            return MolocoUnityPlugin.adManager_delegate$lambda$1();
        }
    });
    public static final int $stable = 8;

    private MolocoUnityPlugin() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.moloco.sdk.internal.unity_bridge.internal.g adManager_delegate$lambda$1() {
        return new com.moloco.sdk.internal.unity_bridge.internal.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context context_delegate$lambda$0() {
        return com.moloco.sdk.internal.android_context.b.b(null, 1, null);
    }

    private final com.moloco.sdk.internal.unity_bridge.internal.g getAdManager() {
        return (com.moloco.sdk.internal.unity_bridge.internal.g) adManager$delegate.getValue();
    }

    private final Context getContext() {
        return (Context) context$delegate.getValue();
    }

    public static final void initializeSdk(@NotNull final String str, @NotNull final String str2, @NotNull final MolocoUnityInitCallback molocoUnityInitCallback) {
        p.k(str, "appKey");
        p.k(str2, "mediationName");
        p.k(molocoUnityInitCallback, "callback");
        Moloco.initialize(new MolocoInitParams(INSTANCE.getContext(), str, new MediationInfo(str2)), new MolocoInitializationListener() { // from class: com.moloco.sdk.internal.unity_bridge.c
            @Override // com.moloco.sdk.publisher.MolocoInitializationListener
            public final void onMolocoInitializationStatus(MolocoInitStatus molocoInitStatus) {
                MolocoUnityPlugin.initializeSdk$lambda$3(str, str2, molocoUnityInitCallback, molocoInitStatus);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeSdk$lambda$3(String str, String str2, MolocoUnityInitCallback molocoUnityInitCallback, MolocoInitStatus molocoInitStatus) {
        p.k(molocoInitStatus, "initStatus");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, TAG, "initialized " + str + ' ' + str2 + ' ' + molocoInitStatus.getInitialization(), null, false, 12, null);
        boolean z10 = molocoInitStatus.getInitialization() == Initialization.SUCCESS;
        initState.setValue(Boolean.valueOf(z10));
        molocoUnityInitCallback.onInitialized(z10);
    }

    public static final void loadInterstitial(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull MolocoUnityLoadCallback molocoUnityLoadCallback) {
        p.k(str, "mediation");
        p.k(str2, "adUnitId");
        p.k(str3, "bidResponse");
        p.k(molocoUnityLoadCallback, "callback");
        if (initState.getValue().booleanValue()) {
            INSTANCE.getAdManager().i(d0.s1(str).toString(), d0.s1(str2).toString(), str3, molocoUnityLoadCallback);
        } else {
            INSTANCE.logUninitializedAccessError(C3978d4.h.E);
        }
    }

    private final void logUninitializedAccessError(String str) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, TAG, "ERROR: Failed to execute " + str + "() - please ensure the Moloco Unity Plugin has been initialized by calling 'MolocoSdk.InitializeSdk();'!", null, false, 12, null);
    }

    public static final void showInterstitial(@NotNull String str, @NotNull MolocoUnityShowCallback molocoUnityShowCallback) {
        p.k(str, "adUnitId");
        p.k(molocoUnityShowCallback, "callback");
        if (initState.getValue().booleanValue()) {
            INSTANCE.getAdManager().h(d0.s1(str).toString(), molocoUnityShowCallback);
        } else {
            INSTANCE.logUninitializedAccessError(C3978d4.h.H);
        }
    }
}
