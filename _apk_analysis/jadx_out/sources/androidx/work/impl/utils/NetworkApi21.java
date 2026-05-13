package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: NetworkApi21.kt */
/* JADX INFO: loaded from: classes12.dex */
@RequiresApi(21)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u0018\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0001¨\u0006\r"}, d2 = {"Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "Lbn/r;", "unregisterNetworkCallbackCompat", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "getNetworkCapabilitiesCompat", "", "capability", "", "hasCapabilityCompat", "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class NetworkApi21 {
    @DoNotInline
    @Nullable
    public static final NetworkCapabilities getNetworkCapabilitiesCompat(@NotNull ConnectivityManager connectivityManager, @Nullable Network network) {
        p.k(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    @DoNotInline
    public static final boolean hasCapabilityCompat(@NotNull NetworkCapabilities networkCapabilities, int i10) {
        p.k(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i10);
    }

    @DoNotInline
    public static final void unregisterNetworkCallbackCompat(@NotNull ConnectivityManager connectivityManager, @NotNull ConnectivityManager.NetworkCallback networkCallback) {
        p.k(connectivityManager, "<this>");
        p.k(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
