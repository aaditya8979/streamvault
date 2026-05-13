package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import hn.c;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: TopicsManager.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TopicsManager {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: TopicsManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @Nullable
        public final TopicsManager obtain(@NotNull Context context) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
            if (adServicesInfo.version() >= 5) {
                return new TopicsManagerApi33Ext5Impl(context);
            }
            if (adServicesInfo.version() == 4) {
                return new TopicsManagerApi33Ext4Impl(context);
            }
            return null;
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @Nullable
    public static final TopicsManager obtain(@NotNull Context context) {
        return Companion.obtain(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @Nullable
    public abstract Object getTopics(@NotNull GetTopicsRequest getTopicsRequest, @NotNull c<? super GetTopicsResponse> cVar);
}
