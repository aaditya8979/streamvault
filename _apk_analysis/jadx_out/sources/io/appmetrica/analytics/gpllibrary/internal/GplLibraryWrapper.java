package io.appmetrica.analytics.gpllibrary.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FusedLocationProviderClient f64829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationListener f64830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LocationCallback f64831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Looper f64832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f64833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f64834f;

    /* JADX INFO: renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64835a;

        static {
            int[] iArr = new int[Priority.values().length];
            f64835a = iArr;
            try {
                iArr[Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64835a[Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64835a[Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class ClientProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f64836a;

        public ClientProvider(Context context) {
            this.f64836a = context;
        }

        public final FusedLocationProviderClient a() {
            return LocationServices.getFusedLocationProviderClient(this.f64836a);
        }
    }

    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(@NonNull Context context, @NonNull LocationListener locationListener, @NonNull Looper looper, @NonNull Executor executor, long j10) throws Throwable {
        this(new ClientProvider(context), locationListener, looper, executor, j10);
    }

    public GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j10) {
        this.f64829a = clientProvider.a();
        this.f64830b = locationListener;
        this.f64832d = looper;
        this.f64833e = executor;
        this.f64834f = j10;
        this.f64831c = new GplLocationCallback(locationListener);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void startLocationUpdates(@NonNull Priority priority) throws Throwable {
        FusedLocationProviderClient fusedLocationProviderClient = this.f64829a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f64834f);
        int i10 = AnonymousClass1.f64835a[priority.ordinal()];
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(i10 != 1 ? i10 != 2 ? i10 != 3 ? 105 : 100 : 102 : 104), this.f64831c, this.f64832d);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() throws Throwable {
        this.f64829a.removeLocationUpdates(this.f64831c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void updateLastKnownLocation() throws Throwable {
        this.f64829a.getLastLocation().addOnSuccessListener(this.f64833e, new GplOnSuccessListener(this.f64830b));
    }
}
