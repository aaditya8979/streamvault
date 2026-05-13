package androidx.privacysandbox.ads.adservices.java.customaudience;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager;
import androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import bn.r;
import c8.i;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.w0;
import tn.p;

/* JADX INFO: compiled from: CustomAudienceManagerFutures.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class CustomAudienceManagerFutures {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: CustomAudienceManagerFutures.kt */
    public static final class Api33Ext4JavaImpl extends CustomAudienceManagerFutures {

        @Nullable
        private final CustomAudienceManager mCustomAudienceManager;

        public Api33Ext4JavaImpl(@Nullable CustomAudienceManager customAudienceManager) {
            this.mCustomAudienceManager = customAudienceManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        @NotNull
        public i<r> joinCustomAudienceAsync(@NotNull JoinCustomAudienceRequest joinCustomAudienceRequest) {
            p.k(joinCustomAudienceRequest, AdActivity.REQUEST_KEY_EXTRA);
            return CoroutineAdapterKt.asListenableFuture$default(p000do.i.b(d.a(w0.a()), null, null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1(this, joinCustomAudienceRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        @NotNull
        public i<r> leaveCustomAudienceAsync(@NotNull LeaveCustomAudienceRequest leaveCustomAudienceRequest) {
            p.k(leaveCustomAudienceRequest, AdActivity.REQUEST_KEY_EXTRA);
            return CoroutineAdapterKt.asListenableFuture$default(p000do.i.b(d.a(w0.a()), null, null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1(this, leaveCustomAudienceRequest, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: CustomAudienceManagerFutures.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(tn.i iVar) {
            this();
        }

        @Nullable
        public final CustomAudienceManagerFutures from(@NotNull Context context) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            CustomAudienceManager customAudienceManagerObtain = CustomAudienceManager.Companion.obtain(context);
            if (customAudienceManagerObtain != null) {
                return new Api33Ext4JavaImpl(customAudienceManagerObtain);
            }
            return null;
        }
    }

    @Nullable
    public static final CustomAudienceManagerFutures from(@NotNull Context context) {
        return Companion.from(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @NotNull
    public abstract i<r> joinCustomAudienceAsync(@NotNull JoinCustomAudienceRequest joinCustomAudienceRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @NotNull
    public abstract i<r> leaveCustomAudienceAsync(@NotNull LeaveCustomAudienceRequest leaveCustomAudienceRequest);
}
