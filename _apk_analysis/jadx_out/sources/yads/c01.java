package yads;

import android.os.IBinder;
import android.os.IInterface;
import com.monetization.ads.core.identifiers.ad.gms.service.GmsServiceAdvertisingInfoReader;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class c01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud f88259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xz0 f88260b;

    public /* synthetic */ c01() {
        this(new ud(), new xz0());
    }

    public c01(ud udVar, xz0 xz0Var) {
        this.f88259a = udVar;
        this.f88260b = xz0Var;
    }

    public final td a(yz0 yz0Var) {
        try {
            IBinder iBinder = (IBinder) yz0Var.f97334a.poll(5L, TimeUnit.SECONDS);
            if (iBinder == null) {
                return null;
            }
            this.f88260b.getClass();
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            ce gmsServiceAdvertisingInfoReader = iInterfaceQueryLocalInterface instanceof ce ? (ce) iInterfaceQueryLocalInterface : null;
            if (gmsServiceAdvertisingInfoReader == null) {
                gmsServiceAdvertisingInfoReader = new GmsServiceAdvertisingInfoReader(iBinder);
            }
            String advertisingId = gmsServiceAdvertisingInfoReader.readAdvertisingId();
            Boolean adTrackingLimited = gmsServiceAdvertisingInfoReader.readAdTrackingLimited();
            this.f88259a.getClass();
            td tdVar = (adTrackingLimited == null || advertisingId == null) ? null : new td(advertisingId, adTrackingLimited.booleanValue());
            boolean z10 = ad1.f87661a;
            return tdVar;
        } catch (InterruptedException unused) {
            boolean z11 = ad1.f87661a;
            return null;
        }
    }
}
