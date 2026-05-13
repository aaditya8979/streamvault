package i0;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import i0.c;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import o0.g;
import o0.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¨\u0006\b"}, d2 = {"Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Li0/c$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lo0/q;", "logger", "Li0/c;", "a", "coil-base_release"}, k = 2, mv = {1, 7, 1})
public final class d {
    @NotNull
    public static final c a(@NotNull Context context, @NotNull c.a aVar, @Nullable q qVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager == null || !o0.d.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (qVar != null && qVar.getLevel() <= 5) {
                qVar.a("NetworkObserver", 5, "Unable to register network observer.", null);
            }
            return new b();
        }
        try {
            return new e(connectivityManager, aVar);
        } catch (Exception e10) {
            if (qVar != null) {
                g.a(qVar, "NetworkObserver", new RuntimeException("Failed to register network observer.", e10));
            }
            return new b();
        }
    }
}
