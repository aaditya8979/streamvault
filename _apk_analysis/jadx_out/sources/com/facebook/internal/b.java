package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AttributionIdentifiers.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0003\u0003\u0007\u000bB\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR(\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\rR(\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\rR$\u0010\u0017\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/facebook/internal/b;", "", "", "a", "Ljava/lang/String;", "androidAdvertiserIdValue", "", "b", "J", "fetchTime", "<set-?>", "c", "j", "()Ljava/lang/String;", "attributionId", "d", "i", "androidInstallerPackage", "", "e", "Z", CampaignEx.JSON_KEY_AD_K, "()Z", "isTrackingLimited", "h", "androidAdvertiserId", "<init>", "()V", InneractiveMediationDefs.GENDER_FEMALE, "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f15308g = b.class.getCanonicalName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static b f15309h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String androidAdvertiserIdValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public long fetchTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String attributionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String androidInstallerPackage;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isTrackingLimited;

    /* JADX INFO: renamed from: com.facebook.internal.b$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AttributionIdentifiers.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u001c\u0010\u001f\u001a\n \u001e*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u001e\u0010 \u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010\u0015¨\u0006$"}, d2 = {"Lcom/facebook/internal/b$a;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "h", "Lcom/facebook/internal/b;", "e", "b", "c", "g", "d", "identifiers", "a", "", InneractiveMediationDefs.GENDER_FEMALE, "ANDROID_ID_COLUMN_NAME", "Ljava/lang/String;", "ATTRIBUTION_ID_COLUMN_NAME", "ATTRIBUTION_ID_CONTENT_PROVIDER", "getATTRIBUTION_ID_CONTENT_PROVIDER$facebook_core_release$annotations", "()V", "ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI", "", "CONNECTION_RESULT_SUCCESS", "I", "", "IDENTIFIER_REFRESH_INTERVAL_MILLIS", "J", "LIMIT_TRACKING_COLUMN_NAME", "kotlin.jvm.PlatformType", "TAG", "cachedIdentifiers", "Lcom/facebook/internal/b;", "getCachedIdentifiers$facebook_core_release$annotations", "<init>", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(tn.i iVar) {
            this();
        }

        public final b a(b identifiers) {
            identifiers.fetchTime = System.currentTimeMillis();
            b.f15309h = identifiers;
            return identifiers;
        }

        public final b b(Context context) {
            b bVarC = c(context);
            if (bVarC != null) {
                return bVarC;
            }
            b bVarD = d(context);
            return bVarD == null ? new b() : bVarD;
        }

        public final b c(Context context) {
            Object objO;
            try {
                if (!g(context)) {
                    return null;
                }
                j0 j0Var = j0.f15387a;
                boolean zBooleanValue = false;
                Method methodH = j0.H("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                if (methodH == null || (objO = j0.O(null, methodH, context)) == null) {
                    return null;
                }
                Method methodG = j0.G(objO.getClass(), "getId", new Class[0]);
                Method methodG2 = j0.G(objO.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (methodG != null && methodG2 != null) {
                    b bVar = new b();
                    bVar.androidAdvertiserIdValue = (String) j0.O(objO, methodG, new Object[0]);
                    Boolean bool = (Boolean) j0.O(objO, methodG2, new Object[0]);
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                    bVar.isTrackingLimited = zBooleanValue;
                    return bVar;
                }
                return null;
            } catch (Exception e10) {
                j0.d0("android_id", e10);
                return null;
            }
        }

        public final b d(Context context) {
            c cVar = new c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, cVar, 1)) {
                    try {
                        C0276b c0276b = new C0276b(cVar.m());
                        b bVar = new b();
                        bVar.androidAdvertiserIdValue = c0276b.c();
                        bVar.isTrackingLimited = c0276b.d();
                        return bVar;
                    } catch (Exception e10) {
                        j0.d0("android_id", e10);
                        return null;
                    } finally {
                        context.unbindService(cVar);
                    }
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[Catch: all -> 0x00f5, Exception -> 0x00f7, TryCatch #4 {Exception -> 0x00f7, all -> 0x00f5, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x004e, B:14:0x005d, B:21:0x007e, B:23:0x0084, B:25:0x0089, B:27:0x008e, B:17:0x0067, B:19:0x0076, B:49:0x00ed, B:50:0x00f4), top: B:69:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[Catch: all -> 0x00f5, Exception -> 0x00f7, TryCatch #4 {Exception -> 0x00f7, all -> 0x00f5, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x004e, B:14:0x005d, B:21:0x007e, B:23:0x0084, B:25:0x0089, B:27:0x008e, B:17:0x0067, B:19:0x0076, B:49:0x00ed, B:50:0x00f4), top: B:69:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x00f5, Exception -> 0x00f7, TRY_LEAVE, TryCatch #4 {Exception -> 0x00f7, all -> 0x00f5, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x004e, B:14:0x005d, B:21:0x007e, B:23:0x0084, B:25:0x0089, B:27:0x008e, B:17:0x0067, B:19:0x0076, B:49:0x00ed, B:50:0x00f4), top: B:69:0x0010 }] */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.internal.b e(@org.jetbrains.annotations.NotNull android.content.Context r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 280
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.b.Companion.e(android.content.Context):com.facebook.internal.b");
        }

        public final String f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getInstallerPackageName(context.getPackageName());
        }

        public final boolean g(Context context) {
            j0 j0Var = j0.f15387a;
            Method methodH = j0.H("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (methodH == null) {
                return false;
            }
            Object objO = j0.O(null, methodH, context);
            return (objO instanceof Integer) && tn.p.f(objO, 0);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean h(@NotNull Context context) throws Throwable {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            b bVarE = e(context);
            return bVarE != null && bVarE.getIsTrackingLimited();
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AttributionIdentifiers.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0013\u0010\n\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/b$b;", "Landroid/os/IInterface;", "Landroid/os/IBinder;", "asBinder", "b", "Landroid/os/IBinder;", "binder", "", "c", "()Ljava/lang/String;", "advertiserId", "", "d", "()Z", "isTrackingLimited", "<init>", "(Landroid/os/IBinder;)V", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class C0276b implements IInterface {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final IBinder binder;

        public C0276b(@NotNull IBinder iBinder) {
            tn.p.k(iBinder, "binder");
            this.binder = iBinder;
        }

        @Override // android.os.IInterface
        @NotNull
        public IBinder asBinder() {
            return this.binder;
        }

        @Nullable
        public final String c() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            tn.p.j(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            tn.p.j(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.binder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final boolean d() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            tn.p.j(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            tn.p.j(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.binder.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    /* JADX INFO: compiled from: AttributionIdentifiers.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/facebook/internal/b$c;", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "Lbn/r;", "onServiceConnected", "onServiceDisconnected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "consumed", "Ljava/util/concurrent/BlockingQueue;", "c", "Ljava/util/concurrent/BlockingQueue;", "queue", InneractiveMediationDefs.GENDER_MALE, "()Landroid/os/IBinder;", "binder", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class c implements ServiceConnection {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final AtomicBoolean consumed = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final BlockingQueue<IBinder> queue = new LinkedBlockingDeque();

        @NotNull
        public final IBinder m() throws InterruptedException {
            if (!(!this.consumed.compareAndSet(true, true))) {
                throw new IllegalStateException("Binder already consumed".toString());
            }
            IBinder iBinderTake = this.queue.take();
            tn.p.j(iBinderTake, "queue.take()");
            return iBinderTake;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@Nullable ComponentName componentName, @Nullable IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.queue.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@Nullable ComponentName componentName) {
        }
    }

    @Nullable
    public final String h() {
        if (k2.t.F() && k2.t.k()) {
            return this.androidAdvertiserIdValue;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getAndroidInstallerPackage() {
        return this.androidInstallerPackage;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getAttributionId() {
        return this.attributionId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsTrackingLimited() {
        return this.isTrackingLimited;
    }
}
