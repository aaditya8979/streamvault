package com.moloco.sdk.internal.services.init;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.ironsource.G5;
import com.moloco.sdk.MetricsRequest$SDKInitFailureTrackingRequest;
import com.moloco.sdk.i1;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.init.i;
import com.moloco.sdk.k1;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f;
import gl.f;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
public final class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f47526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f f47527b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47528a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f47441f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f47436a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f47437b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f47438c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.f47439d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.f47440e.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f47528a = iArr;
        }
    }

    public n(@NotNull String str, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f fVar) {
        p.k(str, G5.f29403r);
        p.k(fVar, "httpRequestClient");
        this.f47526a = str;
        this.f47527b = fVar;
    }

    @Override // com.moloco.sdk.internal.services.init.m
    @Nullable
    public Object a(long j10, @NotNull hn.c<? super r> cVar) {
        MolocoLogger molocoLogger;
        try {
            molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.debug$default(molocoLogger, "InitTrackingApi", "Reporting InitTracking success", false, 4, null);
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Failed to send notifySuccess post request", e10, false, 8, null);
        }
        if (this.f47526a.length() == 0) {
            MolocoLogger.debug$default(molocoLogger, "InitTrackingApi", "SDK InitTracking disabled", false, 4, null);
            return r.f5635a;
        }
        Uri uriBuild = Uri.parse(this.f47526a).buildUpon().build();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f fVar = this.f47527b;
        String string = uriBuild.toString();
        p.j(string, "toString(...)");
        f.a.a(fVar, string, d(j10), f.a.f62501a.b(), null, 8, null);
        return r.f5635a;
    }

    @Override // com.moloco.sdk.internal.services.init.m
    @Nullable
    public Object b(@NotNull i iVar, long j10, @NotNull hn.c<? super r> cVar) {
        try {
            if (iVar instanceof i.a) {
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Reporting InitTracking client failure: " + ((i.a) iVar).a(), false, 4, null);
            } else {
                if (!(iVar instanceof i.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Reporting InitTracking server failure: " + ((i.b) iVar).a(), false, 4, null);
            }
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Failed to send notifyFailure post request", e10, false, 8, null);
        }
        if (this.f47526a.length() == 0) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InitTrackingApi", "SDK InitTracking disabled", false, 4, null);
            return r.f5635a;
        }
        Uri uriBuild = Uri.parse(this.f47526a).buildUpon().build();
        byte[] bArrE = e(iVar, j10);
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f fVar = this.f47527b;
        String string = uriBuild.toString();
        p.j(string, "toString(...)");
        f.a.a(fVar, string, bArrE, f.a.f62501a.b(), null, 8, null);
        return r.f5635a;
    }

    public final MetricsRequest$SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes c(b bVar) {
        switch (a.f47528a[bVar.ordinal()]) {
            case 1:
                return MetricsRequest$SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.UNKNOWN;
            case 2:
                return MetricsRequest$SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.HTTP_REQUEST_TIMEOUT;
            case 3:
                return MetricsRequest$SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.HTTP_UKNOWN_HOST;
            case 4:
                return MetricsRequest$SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.HTTP_SOCKET;
            case 5:
                return MetricsRequest$SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.HTTP_SSL_ERROR;
            case 6:
                return MetricsRequest$SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.ANDROID_WORK_MANAGER_ISSUE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final byte[] d(long j10) {
        k1.a aVarE = k1.e();
        aVarE.b(j10);
        aVarE.c(i1.b().build());
        byte[] byteArray = aVarE.build().toByteArray();
        p.j(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final byte[] e(i iVar, long j10) {
        k1.a aVarE = k1.e();
        MetricsRequest$SDKInitFailureTrackingRequest.a aVarD = MetricsRequest$SDKInitFailureTrackingRequest.d();
        if (iVar instanceof i.a) {
            MetricsRequest$SDKInitFailureTrackingRequest.ClientError.a aVarC = MetricsRequest$SDKInitFailureTrackingRequest.ClientError.c();
            aVarC.a(c(((i.a) iVar).a()));
            aVarD.a(aVarC.build());
        } else {
            if (!(iVar instanceof i.b)) {
                throw new NoWhenBranchMatchedException();
            }
            MetricsRequest$SDKInitFailureTrackingRequest.b.a aVarC2 = MetricsRequest$SDKInitFailureTrackingRequest.b.c();
            aVarC2.a(((i.b) iVar).a());
            aVarD.b(aVarC2.build());
        }
        aVarE.a(aVarD.build());
        aVarE.b(j10);
        byte[] byteArray = aVarE.build().toByteArray();
        p.j(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
