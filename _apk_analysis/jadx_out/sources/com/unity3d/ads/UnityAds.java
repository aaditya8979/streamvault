package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import bn.r;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.utils.i;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.core.misc.Utilities;
import kotlin.Result;
import kotlin.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: UnityAds.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class UnityAds {

    @NotNull
    public static final UnityAds INSTANCE = new UnityAds();

    /* JADX INFO: compiled from: UnityAds.kt */
    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    /* JADX INFO: compiled from: UnityAds.kt */
    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    /* JADX INFO: compiled from: UnityAds.kt */
    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    /* JADX INFO: compiled from: UnityAds.kt */
    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT
    }

    private UnityAds() {
    }

    public static final boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    public static /* synthetic */ void getDebugMode$annotations() {
    }

    @Nullable
    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    public static final void getToken(@Nullable final IUnityAdsTokenListener iUnityAdsTokenListener) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().getToken(iUnityAdsTokenListener);
            objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) == null || iUnityAdsTokenListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: we.e
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.getToken$lambda$30$lambda$29$lambda$28(iUnityAdsTokenListener);
            }
        });
    }

    public static final void getToken(@NotNull TokenConfiguration tokenConfiguration, @NotNull final IUnityAdsTokenListener iUnityAdsTokenListener) {
        Object objM7534constructorimpl;
        p.k(tokenConfiguration, i.f53156c);
        p.k(iUnityAdsTokenListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().getToken(tokenConfiguration, iUnityAdsTokenListener);
            objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
            Utilities.wrapCustomerListener(new Runnable() { // from class: we.a
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAds.getToken$lambda$33$lambda$32(iUnityAdsTokenListener);
                }
            });
        }
    }

    public static /* synthetic */ void getToken$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$30$lambda$29$lambda$28(IUnityAdsTokenListener iUnityAdsTokenListener) {
        p.k(iUnityAdsTokenListener, "$tokenListener");
        iUnityAdsTokenListener.onUnityAdsTokenReady(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$33$lambda$32(IUnityAdsTokenListener iUnityAdsTokenListener) {
        p.k(iUnityAdsTokenListener, "$listener");
        iUnityAdsTokenListener.onUnityAdsTokenReady(null);
    }

    @NotNull
    public static final String getVersion() {
        String version = UnityAdsImplementation.getInstance().getVersion();
        p.j(version, "getInstance().version");
        return version;
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final void initialize(@Nullable Context context, @Nullable String str) {
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().initialize(context, str, false, null);
            Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m7534constructorimpl(c.a(th2));
        }
    }

    public static final void initialize(@Nullable Context context, @Nullable String str, @Nullable final IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().initialize(context, str, false, iUnityAdsInitializationListener);
            objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        final Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl == null || iUnityAdsInitializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: we.g
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.initialize$lambda$4$lambda$3$lambda$2(iUnityAdsInitializationListener, thM7537exceptionOrNullimpl);
            }
        });
    }

    public static final void initialize(@Nullable Context context, @Nullable String str, boolean z10) {
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().initialize(context, str, z10, null);
            Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m7534constructorimpl(c.a(th2));
        }
    }

    public static final void initialize(@Nullable Context context, @Nullable String str, boolean z10, @Nullable final IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().initialize(context, str, z10, iUnityAdsInitializationListener);
            objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        final Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl == null || iUnityAdsInitializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: we.f
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.initialize$lambda$9$lambda$8$lambda$7(iUnityAdsInitializationListener, thM7537exceptionOrNullimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$4$lambda$3$lambda$2(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th2) {
        p.k(iUnityAdsInitializationListener, "$listener");
        p.k(th2, "$exception");
        iUnityAdsInitializationListener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + th2.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$9$lambda$8$lambda$7(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th2) {
        p.k(iUnityAdsInitializationListener, "$listener");
        p.k(th2, "$exception");
        iUnityAdsInitializationListener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + th2.getMessage());
    }

    public static final boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static final boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    public static /* synthetic */ void isSupported$annotations() {
    }

    public static final void load(@Nullable String str) {
        try {
            Result.a aVar = Result.Companion;
            load(str, new IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds$load$1$1
                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsAdLoaded(@NotNull String str2) {
                    p.k(str2, "placementId");
                }

                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsFailedToLoad(@NotNull String str2, @NotNull UnityAds.UnityAdsLoadError unityAdsLoadError, @NotNull String str3) {
                    p.k(str2, "placementId");
                    p.k(unityAdsLoadError, "error");
                    p.k(str3, "message");
                }
            });
            Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m7534constructorimpl(c.a(th2));
        }
    }

    public static final void load(@Nullable final String str, @Nullable final IUnityAdsLoadListener iUnityAdsLoadListener) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().load(str, new UnityAdsLoadOptions(), iUnityAdsLoadListener);
            objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        final Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl == null || iUnityAdsLoadListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: we.d
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.load$lambda$22$lambda$21$lambda$20(iUnityAdsLoadListener, str, thM7537exceptionOrNullimpl);
            }
        });
    }

    public static final void load(@Nullable final String str, @Nullable UnityAdsLoadOptions unityAdsLoadOptions, @Nullable final IUnityAdsLoadListener iUnityAdsLoadListener) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            IUnityAds unityAdsImplementation = UnityAdsImplementation.getInstance();
            if (unityAdsLoadOptions == null) {
                unityAdsLoadOptions = new UnityAdsLoadOptions();
            }
            unityAdsImplementation.load(str, unityAdsLoadOptions, iUnityAdsLoadListener);
            objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        final Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl == null || iUnityAdsLoadListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: we.c
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.load$lambda$26$lambda$25$lambda$24(iUnityAdsLoadListener, str, thM7537exceptionOrNullimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$22$lambda$21$lambda$20(IUnityAdsLoadListener iUnityAdsLoadListener, String str, Throwable th2) {
        p.k(iUnityAdsLoadListener, "$loadListener");
        p.k(th2, "$exception");
        if (str == null) {
            str = "unknown";
        }
        iUnityAdsLoadListener.onUnityAdsFailedToLoad(str, UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + th2.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$26$lambda$25$lambda$24(IUnityAdsLoadListener iUnityAdsLoadListener, String str, Throwable th2) {
        p.k(iUnityAdsLoadListener, "$loadListener");
        p.k(th2, "$exception");
        if (str == null) {
            str = "unknown";
        }
        iUnityAdsLoadListener.onUnityAdsFailedToLoad(str, UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + th2.getMessage());
    }

    public static final void setDebugMode(boolean z10) {
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().setDebugMode(z10);
            Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m7534constructorimpl(c.a(th2));
        }
    }

    public static final void show(@Nullable Activity activity, @Nullable String str) {
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), null);
            Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m7534constructorimpl(c.a(th2));
        }
    }

    public static final void show(@Nullable Activity activity, @Nullable String str, @Nullable IUnityAdsShowListener iUnityAdsShowListener) {
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
            Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m7534constructorimpl(c.a(th2));
        }
    }

    public static final void show(@Nullable Activity activity, @Nullable String str, @Nullable UnityAdsShowOptions unityAdsShowOptions) {
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, null);
            Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m7534constructorimpl(c.a(th2));
        }
    }

    public static final void show(@Nullable Activity activity, @Nullable final String str, @Nullable UnityAdsShowOptions unityAdsShowOptions, @Nullable final IUnityAdsShowListener iUnityAdsShowListener) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
            objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        final Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl == null || iUnityAdsShowListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: we.b
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.show$lambda$16$lambda$15$lambda$14(iUnityAdsShowListener, str, thM7537exceptionOrNullimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$16$lambda$15$lambda$14(IUnityAdsShowListener iUnityAdsShowListener, String str, Throwable th2) {
        p.k(iUnityAdsShowListener, "$listener");
        p.k(th2, "$exception");
        if (str == null) {
            str = "unknown";
        }
        iUnityAdsShowListener.onUnityAdsShowFailure(str, UnityAdsShowError.INTERNAL_ERROR, "Unity Ads SDK show failed due to unexpected error: " + th2.getMessage());
    }
}
