package androidx.privacysandbox.ads.adservices.java.measurement;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.measurement.DeletionRequest;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManager;
import androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest;
import androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest;
import bn.r;
import c8.i;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.w0;
import tn.p;

/* JADX INFO: compiled from: MeasurementManagerFutures.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class MeasurementManagerFutures {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: MeasurementManagerFutures.kt */
    public static final class Api33Ext5JavaImpl extends MeasurementManagerFutures {

        @NotNull
        private final MeasurementManager mMeasurementManager;

        public Api33Ext5JavaImpl(@NotNull MeasurementManager measurementManager) {
            p.k(measurementManager, "mMeasurementManager");
            this.mMeasurementManager = measurementManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public i<r> deleteRegistrationsAsync(@NotNull DeletionRequest deletionRequest) {
            p.k(deletionRequest, "deletionRequest");
            return CoroutineAdapterKt.asListenableFuture$default(p000do.i.b(d.a(w0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1(this, deletionRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public i<Integer> getMeasurementApiStatusAsync() {
            return CoroutineAdapterKt.asListenableFuture$default(p000do.i.b(d.a(w0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1(this, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public i<r> registerSourceAsync(@NotNull Uri uri, @Nullable InputEvent inputEvent) {
            p.k(uri, "attributionSource");
            return CoroutineAdapterKt.asListenableFuture$default(p000do.i.b(d.a(w0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1(this, uri, inputEvent, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public i<r> registerTriggerAsync(@NotNull Uri uri) {
            p.k(uri, "trigger");
            return CoroutineAdapterKt.asListenableFuture$default(p000do.i.b(d.a(w0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1(this, uri, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public i<r> registerWebSourceAsync(@NotNull WebSourceRegistrationRequest webSourceRegistrationRequest) {
            p.k(webSourceRegistrationRequest, AdActivity.REQUEST_KEY_EXTRA);
            return CoroutineAdapterKt.asListenableFuture$default(p000do.i.b(d.a(w0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1(this, webSourceRegistrationRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public i<r> registerWebTriggerAsync(@NotNull WebTriggerRegistrationRequest webTriggerRegistrationRequest) {
            p.k(webTriggerRegistrationRequest, AdActivity.REQUEST_KEY_EXTRA);
            return CoroutineAdapterKt.asListenableFuture$default(p000do.i.b(d.a(w0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1(this, webTriggerRegistrationRequest, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: MeasurementManagerFutures.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(tn.i iVar) {
            this();
        }

        @Nullable
        public final MeasurementManagerFutures from(@NotNull Context context) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            MeasurementManager measurementManagerObtain = MeasurementManager.Companion.obtain(context);
            if (measurementManagerObtain != null) {
                return new Api33Ext5JavaImpl(measurementManagerObtain);
            }
            return null;
        }
    }

    @Nullable
    public static final MeasurementManagerFutures from(@NotNull Context context) {
        return Companion.from(context);
    }

    @NotNull
    public abstract i<r> deleteRegistrationsAsync(@NotNull DeletionRequest deletionRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    public abstract i<Integer> getMeasurementApiStatusAsync();

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    public abstract i<r> registerSourceAsync(@NotNull Uri uri, @Nullable InputEvent inputEvent);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    public abstract i<r> registerTriggerAsync(@NotNull Uri uri);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    public abstract i<r> registerWebSourceAsync(@NotNull WebSourceRegistrationRequest webSourceRegistrationRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    public abstract i<r> registerWebTriggerAsync(@NotNull WebTriggerRegistrationRequest webTriggerRegistrationRequest);
}
