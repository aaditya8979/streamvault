package com.inmobi.media;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.provider.Settings;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.inmobi.media.C3582mb;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3582mb implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3582mb f27616a = new C3582mb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LocationManager f27617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HandlerThread f27618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static GoogleApiClient f27619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f27620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f27621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mo.a f27622g;

    static {
        HandlerThread handlerThread = new HandlerThread("LThread");
        f27618c = handlerThread;
        f27620e = C3582mb.class.getSimpleName();
        f27622g = mo.g.b(false, 1, null);
        H6.a(handlerThread, "LThread");
        Context context = Ji.f25747a;
        if (context != null) {
            Object systemService = context.getSystemService("location");
            f27617b = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        }
    }

    public static Location a() {
        Location location;
        Location locationC;
        Location locationA;
        try {
        } catch (Exception e10) {
            e = e10;
            location = null;
        }
        if (e() && d()) {
            locationC = f27621f ? c() : null;
            try {
            } catch (Exception e11) {
                location = locationC;
                e = e11;
                tn.p.j(f27620e, "TAG");
                e.getMessage();
                locationC = location;
            }
            locationA = (f27617b == null || !Kf.a(Ji.f25747a, "android.permission.ACCESS_COARSE_LOCATION")) ? null : a(2, 2);
        } else {
            locationC = null;
            locationA = null;
        }
        if (locationC != null || locationA != null) {
            return a(locationC, locationA);
        }
        tn.p.j(f27620e, "TAG");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[PHI: r1
      0x0056: PHI (r1v4 android.location.Location) = 
      (r1v3 android.location.Location)
      (r1v3 android.location.Location)
      (r1v3 android.location.Location)
      (r1v6 android.location.Location)
     binds: [B:30:0x0056, B:17:0x0047, B:19:0x004d, B:21:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.location.Location a(int r5, int r6) {
        /*
            android.location.Criteria r0 = new android.location.Criteria
            r0.<init>()
            r0.setAccuracy(r5)
            r0.setPowerRequirement(r6)
            r6 = 0
            r0.setCostAllowed(r6)
            android.location.LocationManager r6 = com.inmobi.media.C3582mb.f27617b
            r1 = 0
            if (r6 == 0) goto L5c
            r2 = 1
            java.lang.String r0 = r6.getBestProvider(r0, r2)
            if (r0 == 0) goto L5c
            android.location.Location r6 = r6.getLastKnownLocation(r0)     // Catch: java.lang.Exception -> L20
            goto L21
        L20:
            r6 = r1
        L21:
            if (r6 != 0) goto L5b
            if (r5 == r2) goto L5b
            android.location.LocationManager r5 = com.inmobi.media.C3582mb.f27617b
            if (r5 == 0) goto L5c
            tn.p.h(r5)
            java.util.List r5 = r5.getProviders(r2)
            java.lang.String r6 = "getProviders(...)"
            tn.p.j(r5, r6)
            int r6 = r5.size()
            int r6 = r6 + (-1)
            if (r6 < 0) goto L5c
        L3d:
            int r0 = r6 + (-1)
            java.lang.Object r6 = r5.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            android.location.LocationManager r3 = com.inmobi.media.C3582mb.f27617b     // Catch: java.lang.Exception -> L56
            if (r3 == 0) goto L56
            boolean r4 = r3.isProviderEnabled(r6)     // Catch: java.lang.Exception -> L56
            if (r4 != r2) goto L56
            android.location.Location r1 = r3.getLastKnownLocation(r6)     // Catch: java.lang.SecurityException -> L53 java.lang.Exception -> L56
        L53:
            if (r1 == 0) goto L56
            goto L5c
        L56:
            if (r0 >= 0) goto L59
            goto L5c
        L59:
            r6 = r0
            goto L3d
        L5b:
            r1 = r6
        L5c:
            java.lang.String r5 = com.inmobi.media.C3582mb.f27620e
            java.lang.String r6 = "TAG"
            tn.p.j(r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3582mb.a(int, int):android.location.Location");
    }

    public static Location a(Location location, Location location2) {
        if (location == null) {
            tn.p.j(f27620e, "TAG");
            if (location2 != null) {
                location2.getTime();
            }
            Objects.toString(location2);
            return location2;
        }
        if (location2 == null) {
            tn.p.j(f27620e, "TAG");
            location.getTime();
            location.toString();
            return location;
        }
        long time = location.getTime() - location2.getTime();
        boolean z10 = time > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        boolean z11 = time < -120000;
        boolean z12 = time > 0;
        if (z10) {
            tn.p.j(f27620e, "TAG");
            location.getTime();
            location.toString();
            return location;
        }
        if (z11) {
            tn.p.j(f27620e, "TAG");
            location2.getTime();
            location2.toString();
            return location2;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z13 = accuracy > 0;
        boolean z14 = accuracy < 0;
        boolean z15 = accuracy > 200;
        if (z14 || (z12 && !(z13 && z15))) {
            tn.p.j(f27620e, "TAG");
            location.getTime();
            location.toString();
            return location;
        }
        tn.p.j(f27620e, "TAG");
        location2.getTime();
        location2.toString();
        return location2;
    }

    public static String a(Location location) {
        return location.getLatitude() + StringUtils.COMMA + location.getLongitude() + StringUtils.COMMA + ((int) location.getAccuracy());
    }

    public static HashMap a(Location location, boolean z10, Location location2) {
        HashMap map = new HashMap();
        Context context = Ji.f25747a;
        if (context != null) {
            if (location != null) {
                if (location.getTime() > 0) {
                    map.put("u-ll-ts", Long.valueOf(location.getTime()));
                }
                map.put("u-latlong-accu", a(location));
                map.put("sdk-collected", Integer.valueOf(z10 ? 1 : 0));
            }
            C3688qh c3688qh = Yi.f26652a;
            if (Ji.b() == null || Yi.a().isLocationEnabled()) {
                map.put("loc-allowed", Integer.valueOf(e() ? 1 : 0));
            }
            if (location2 != null) {
                map.put("u-latlong-accu-fine", a(location2));
                map.put("u-ll-ts-fine", Long.valueOf(location2.getTime()));
            }
            if (!e() || !d()) {
                map.put("loc-granularity", "none");
                return map;
            }
            if (Kf.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                map.put("loc-granularity", "coarse");
            }
        }
        return map;
    }

    public static void a(Context context) {
        try {
            GoogleApiClient googleApiClient = f27619d;
            if (googleApiClient != null) {
                googleApiClient.connect();
                return;
            }
            tn.p.j(f27620e, "TAG");
            tn.p.h(context);
            GoogleApiClient googleApiClientBuild = new GoogleApiClient.Builder(context).addConnectionCallbacks(new C3532kb()).addOnConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener() { // from class: n9.n9
                @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
                public final void onConnectionFailed(ConnectionResult connectionResult) {
                    C3582mb.a(connectionResult);
                }
            }).addApi(LocationServices.API).build();
            f27619d = googleApiClientBuild;
            if (googleApiClientBuild != null) {
                googleApiClientBuild.connect();
            }
        } catch (Exception e10) {
            tn.p.j(f27620e, "TAG");
            e10.getMessage();
        }
    }

    public static final void a(ConnectionResult connectionResult) {
        tn.p.k(connectionResult, "it");
        f27621f = false;
    }

    public static Location c() {
        try {
            Context context = Ji.f25747a;
            tn.p.h(context);
            FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
            tn.p.j(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
            Task lastLocation = fusedLocationProviderClient.getLastLocation();
            tn.p.j(lastLocation, "getLastLocation(...)");
            return (Location) lastLocation.getResult();
        } catch (Exception unused) {
            return null;
        } catch (IncompatibleClassChangeError e10) {
            tn.p.j(f27620e, "TAG");
            e10.toString();
            return null;
        }
    }

    public static boolean d() {
        try {
            if (Kf.a(Ji.f25747a, "android.permission.ACCESS_FINE_LOCATION")) {
                return true;
            }
            return Kf.a(Ji.f25747a, "android.permission.ACCESS_COARSE_LOCATION");
        } catch (Exception unused) {
            tn.p.j(f27620e, "TAG");
            return false;
        }
    }

    public static boolean e() {
        int i10;
        Context context = Ji.f25747a;
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            LocationManager locationManager = f27617b;
            return locationManager != null && locationManager.isLocationEnabled();
        }
        try {
            i10 = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException unused) {
            i10 = 0;
        }
        return i10 != 0;
    }

    public static boolean f() {
        try {
            tn.t.b(GoogleApiClient.class).getSimpleName();
            tn.t.b(FusedLocationProviderClient.class).getSimpleName();
            tn.t.b(LocationServices.class).getSimpleName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.inmobi.media.C3557lb
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.lb r0 = (com.inmobi.media.C3557lb) r0
            int r1 = r0.f27559d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27559d = r1
            goto L18
        L13:
            com.inmobi.media.lb r0 = new com.inmobi.media.lb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f27557b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27559d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mo.a r0 = r0.f27556a
            kotlin.c.b(r6)
            goto L45
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.c.b(r6)
            mo.a r6 = com.inmobi.media.C3582mb.f27622g
            r0.f27556a = r6
            r0.f27559d = r3
            java.lang.Object r0 = r6.c(r4, r0)
            if (r0 != r1) goto L44
            return r1
        L44:
            r0 = r6
        L45:
            com.inmobi.media.mb r6 = com.inmobi.media.C3582mb.f27616a     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            boolean r1 = d()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            if (r1 == 0) goto L6f
            boolean r1 = e()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            if (r1 == 0) goto L6f
            r6.b()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            boolean r6 = f()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            if (r6 != 0) goto L6f
            android.content.Context r6 = com.inmobi.media.Ji.f25747a     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            a(r6)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            goto L6f
        L62:
            r6 = move-exception
            goto L75
        L64:
            r6 = move-exception
            java.lang.String r1 = com.inmobi.media.C3582mb.f27620e     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = "TAG"
            tn.p.j(r1, r2)     // Catch: java.lang.Throwable -> L62
            r6.getMessage()     // Catch: java.lang.Throwable -> L62
        L6f:
            bn.r r6 = bn.r.f5635a     // Catch: java.lang.Throwable -> L62
            r0.d(r4)
            return r6
        L75:
            r0.d(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3582mb.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b() {
        LocationManager locationManager = f27617b;
        if (locationManager != null) {
            Criteria criteria = new Criteria();
            criteria.setBearingAccuracy(2);
            criteria.setPowerRequirement(2);
            criteria.setCostAllowed(false);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider != null) {
                tn.p.j(f27620e, "TAG");
                locationManager.requestSingleUpdate(bestProvider, this, f27618c.getLooper());
            } else {
                String str = f27620e;
                tn.p.j(str, "TAG");
                tn.p.j(str, "TAG");
            }
        }
        bn.r rVar = bn.r.f5635a;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        LocationManager locationManager;
        tn.p.k(location, "location");
        try {
            tn.p.j(f27620e, "TAG");
            location.getTime();
            location.getLatitude();
            location.getLongitude();
            location.getAccuracy();
            if (!d() || (locationManager = f27617b) == null) {
                return;
            }
            locationManager.removeUpdates(this);
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        tn.p.k(str, IronSourceConstants.EVENTS_PROVIDER);
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        tn.p.k(str, IronSourceConstants.EVENTS_PROVIDER);
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
