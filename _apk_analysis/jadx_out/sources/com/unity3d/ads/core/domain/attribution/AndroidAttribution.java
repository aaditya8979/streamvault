package com.unity3d.ads.core.domain.attribution;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import bn.g;
import bn.r;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import go.u;
import hn.c;
import hn.f;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l1;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: AndroidAttribution.kt */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi", "MissingPermission"})
public final class AndroidAttribution {

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final g measurementManager$delegate;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidAttribution(@NotNull final Context context, @NotNull ISDKDispatchers iSDKDispatchers, @NotNull SessionRepository sessionRepository) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(iSDKDispatchers, "dispatchers");
        p.k(sessionRepository, "sessionRepository");
        this.dispatchers = iSDKDispatchers;
        this.sessionRepository = sessionRepository;
        this.measurementManager$delegate = b.b(new a<MeasurementManager>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$measurementManager$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @Nullable
            public final MeasurementManager invoke() {
                return this.this$0.getMeasurementManager(context);
            }
        });
    }

    private final MeasurementManager getMeasurementManager() {
        return (MeasurementManager) this.measurementManager$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return (MeasurementManager) context.getSystemService(MeasurementManager.class);
        }
        return null;
    }

    private final Uri getUri(String str, AdObject adObject) {
        Uri uri = Uri.parse(str);
        p.j(uri, "parse(this)");
        Uri uriBuild = uri.buildUpon().appendQueryParameter("sessionToken", ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
        p.j(uriBuild, "baseUrl.toUri()\n        …4())\n            .build()");
        return uriBuild;
    }

    @Nullable
    public final Object isAvailable(@NotNull c<? super Boolean> cVar) throws Throwable {
        r rVar;
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4 && getMeasurementManager() != null && AdServicesState.isAdServicesStateEnabled()) {
            final f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
            MeasurementManager measurementManager = getMeasurementManager();
            if (measurementManager != null) {
                measurementManager.getMeasurementApiStatus(l1.a(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$isAvailable$2$1
                    public void onError(@NotNull Exception exc) {
                        p.k(exc, "error");
                        c<Boolean> cVar2 = fVar;
                        Result.a aVar = Result.Companion;
                        cVar2.resumeWith(Result.m7534constructorimpl(Boolean.FALSE));
                    }

                    public void onResult(int i10) {
                        c<Boolean> cVar2 = fVar;
                        Result.a aVar = Result.Companion;
                        cVar2.resumeWith(Result.m7534constructorimpl(Boolean.valueOf(i10 == 1)));
                    }

                    public /* bridge */ /* synthetic */ void onResult(Object obj) {
                        onResult(((Number) obj).intValue());
                    }
                });
                rVar = r.f5635a;
            } else {
                rVar = null;
            }
            if (rVar == null) {
                Result.a aVar = Result.Companion;
                fVar.resumeWith(Result.m7534constructorimpl(jn.a.a(false)));
            }
            Object objB = fVar.b();
            if (objB == in.a.g()) {
                jn.f.c(cVar);
            }
            return objB;
        }
        return jn.a.a(false);
    }

    @Nullable
    public final Object registerClick(@NotNull String str, @NotNull AdObject adObject, @NotNull c<? super Boolean> cVar) throws Throwable {
        WebViewContainer webViewContainer;
        u<InputEvent> lastInputEvent;
        InputEvent value;
        r rVar;
        if (getMeasurementManager() == null) {
            return jn.a.a(false);
        }
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (webViewContainer = adPlayer.getWebViewContainer()) == null || (lastInputEvent = webViewContainer.getLastInputEvent()) == null || (value = lastInputEvent.getValue()) == null) {
            return jn.a.a(false);
        }
        final f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), value, l1.a(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerClick$2$1
                public void onError(@NotNull Exception exc) {
                    p.k(exc, "error");
                    c<Boolean> cVar2 = fVar;
                    Result.a aVar = Result.Companion;
                    cVar2.resumeWith(Result.m7534constructorimpl(Boolean.FALSE));
                }

                public void onResult(@NotNull Object obj) {
                    p.k(obj, "p0");
                    c<Boolean> cVar2 = fVar;
                    Result.a aVar = Result.Companion;
                    cVar2.resumeWith(Result.m7534constructorimpl(Boolean.TRUE));
                }
            });
            rVar = r.f5635a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            Result.a aVar = Result.Companion;
            fVar.resumeWith(Result.m7534constructorimpl(jn.a.a(false)));
        }
        Object objB = fVar.b();
        if (objB == in.a.g()) {
            jn.f.c(cVar);
        }
        return objB;
    }

    @Nullable
    public final Object registerView(@NotNull String str, @NotNull AdObject adObject, @NotNull c<? super Boolean> cVar) throws Throwable {
        if (getMeasurementManager() == null) {
            return jn.a.a(false);
        }
        final f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
        MeasurementManager measurementManager = getMeasurementManager();
        r rVar = null;
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), null, l1.a(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerView$2$1
                public void onError(@NotNull Exception exc) {
                    p.k(exc, "error");
                    c<Boolean> cVar2 = fVar;
                    Result.a aVar = Result.Companion;
                    cVar2.resumeWith(Result.m7534constructorimpl(Boolean.FALSE));
                }

                public void onResult(@NotNull Object obj) {
                    p.k(obj, "p0");
                    c<Boolean> cVar2 = fVar;
                    Result.a aVar = Result.Companion;
                    cVar2.resumeWith(Result.m7534constructorimpl(Boolean.TRUE));
                }
            });
            rVar = r.f5635a;
        }
        if (rVar == null) {
            Result.a aVar = Result.Companion;
            fVar.resumeWith(Result.m7534constructorimpl(jn.a.a(false)));
        }
        Object objB = fVar.b();
        if (objB == in.a.g()) {
            jn.f.c(cVar);
        }
        return objB;
    }
}
