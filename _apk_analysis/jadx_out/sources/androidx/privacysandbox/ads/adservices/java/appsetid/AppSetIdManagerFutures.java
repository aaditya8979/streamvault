package androidx.privacysandbox.ads.adservices.java.appsetid;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.privacysandbox.ads.adservices.appsetid.AppSetId;
import androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import c8.i;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.w0;
import tn.p;

/* JADX INFO: compiled from: AppSetIdManagerFutures.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AppSetIdManagerFutures {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: AppSetIdManagerFutures.kt */
    public static final class Api33Ext4JavaImpl extends AppSetIdManagerFutures {

        @NotNull
        private final AppSetIdManager mAppSetIdManager;

        public Api33Ext4JavaImpl(@NotNull AppSetIdManager appSetIdManager) {
            p.k(appSetIdManager, "mAppSetIdManager");
            this.mAppSetIdManager = appSetIdManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures
        @DoNotInline
        @NotNull
        public i<AppSetId> getAppSetIdAsync() {
            return CoroutineAdapterKt.asListenableFuture$default(p000do.i.b(d.a(w0.a()), null, null, new AppSetIdManagerFutures$Api33Ext4JavaImpl$getAppSetIdAsync$1(this, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: AppSetIdManagerFutures.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(tn.i iVar) {
            this();
        }

        @Nullable
        public final AppSetIdManagerFutures from(@NotNull Context context) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            AppSetIdManager appSetIdManagerObtain = AppSetIdManager.Companion.obtain(context);
            if (appSetIdManagerObtain != null) {
                return new Api33Ext4JavaImpl(appSetIdManagerObtain);
            }
            return null;
        }
    }

    @Nullable
    public static final AppSetIdManagerFutures from(@NotNull Context context) {
        return Companion.from(context);
    }

    @NotNull
    public abstract i<AppSetId> getAppSetIdAsync();
}
