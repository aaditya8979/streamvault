package bp;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.yk.e.util.AdLog;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class f1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f5761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f5762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Handler f5763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Runnable f5764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w1 f5765f;

    public f1(w1 w1Var, Context context, j1 j1Var, Handler handler, k0 k0Var) {
        this.f5765f = w1Var;
        this.f5761b = context;
        this.f5762c = j1Var;
        this.f5763d = handler;
        this.f5764e = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                try {
                    try {
                        try {
                            this.f5765f.a(AdvertisingIdClient.getAdvertisingIdInfo(this.f5761b).getId(), this.f5762c);
                        } catch (GooglePlayServicesNotAvailableException e10) {
                            AdLog.e(e10.getMessage(), e10);
                            this.f5765f.a("", this.f5762c);
                        }
                    } catch (IllegalStateException e11) {
                        AdLog.e(e11.getMessage(), e11);
                        this.f5765f.a("", this.f5762c);
                    }
                } catch (Exception e12) {
                    AdLog.e(e12.getMessage(), e12);
                    this.f5765f.a("", this.f5762c);
                }
            } catch (GooglePlayServicesRepairableException e13) {
                AdLog.e(e13.getMessage(), e13);
                this.f5765f.a("", this.f5762c);
            } catch (IOException e14) {
                AdLog.e(e14.getMessage(), e14);
                this.f5765f.a("", this.f5762c);
            }
        } finally {
            this.f5763d.removeCallbacks(this.f5764e);
        }
    }
}
