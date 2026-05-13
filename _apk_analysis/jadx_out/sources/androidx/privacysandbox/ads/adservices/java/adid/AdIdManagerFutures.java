package androidx.privacysandbox.ads.adservices.java.adid;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.adid.AdId;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import c8.i;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.w0;
import tn.p;

/* JADX INFO: compiled from: AdIdManagerFutures.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AdIdManagerFutures {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: AdIdManagerFutures.kt */
    public static final class Api33Ext4JavaImpl extends AdIdManagerFutures {

        @NotNull
        private final AdIdManager mAdIdManager;

        public Api33Ext4JavaImpl(@NotNull AdIdManager adIdManager) {
            p.k(adIdManager, "mAdIdManager");
            this.mAdIdManager = adIdManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
        @DoNotInline
        @NotNull
        public i<AdId> getAdIdAsync() {
            return CoroutineAdapterKt.asListenableFuture$default(p000do.i.b(d.a(w0.a()), null, null, new AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1(this, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: AdIdManagerFutures.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(tn.i iVar) {
            this();
        }

        @Nullable
        public final AdIdManagerFutures from(@NotNull Context context) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            AdIdManager adIdManagerObtain = AdIdManager.Companion.obtain(context);
            if (adIdManagerObtain != null) {
                return new Api33Ext4JavaImpl(adIdManagerObtain);
            }
            return null;
        }
    }

    @Nullable
    public static final AdIdManagerFutures from(@NotNull Context context) {
        return Companion.from(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
    @NotNull
    public abstract i<AdId> getAdIdAsync();
}
