package okhttp3;

import androidx.core.app.NotificationCompat;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: EventListener.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class EventListener {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    /* JADX INFO: compiled from: EventListener.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: EventListener.kt */
    public interface Factory {
        @NotNull
        EventListener create(@NotNull Call call);
    }

    public void cacheConditionalHit(@NotNull Call call, @NotNull Response response) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
        p.k(response, "cachedResponse");
    }

    public void cacheHit(@NotNull Call call, @NotNull Response response) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
        p.k(response, "response");
    }

    public void cacheMiss(@NotNull Call call) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
    }

    public void callEnd(@NotNull Call call) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
    }

    public void callFailed(@NotNull Call call, @NotNull IOException iOException) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
        p.k(iOException, "ioe");
    }

    public void callStart(@NotNull Call call) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
    }

    public void canceled(@NotNull Call call) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
    }

    public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
        p.k(inetSocketAddress, "inetSocketAddress");
        p.k(proxy, "proxy");
    }

    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException iOException) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
        p.k(inetSocketAddress, "inetSocketAddress");
        p.k(proxy, "proxy");
        p.k(iOException, "ioe");
    }

    public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
        p.k(inetSocketAddress, "inetSocketAddress");
        p.k(proxy, "proxy");
    }

    public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
        p.k(connection, "connection");
    }

    public void connectionReleased(@NotNull Call call, @NotNull Connection connection) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
        p.k(connection, "connection");
    }

    public void dnsEnd(@NotNull Call call, @NotNull String str, @NotNull List<InetAddress> list) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
        p.k(str, "domainName");
        p.k(list, "inetAddressList");
    }

    public void dnsStart(@NotNull Call call, @NotNull String str) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
        p.k(str, "domainName");
    }

    public void proxySelectEnd(@NotNull Call call, @NotNull HttpUrl httpUrl, @NotNull List<Proxy> list) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
        p.k(httpUrl, "url");
        p.k(list, "proxies");
    }

    public void proxySelectStart(@NotNull Call call, @NotNull HttpUrl httpUrl) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
        p.k(httpUrl, "url");
    }

    public void requestBodyEnd(@NotNull Call call, long j10) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
    }

    public void requestBodyStart(@NotNull Call call) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
    }

    public void requestFailed(@NotNull Call call, @NotNull IOException iOException) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
        p.k(iOException, "ioe");
    }

    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
        p.k(request, AdActivity.REQUEST_KEY_EXTRA);
    }

    public void requestHeadersStart(@NotNull Call call) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
    }

    public void responseBodyEnd(@NotNull Call call, long j10) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
    }

    public void responseBodyStart(@NotNull Call call) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
    }

    public void responseFailed(@NotNull Call call, @NotNull IOException iOException) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
        p.k(iOException, "ioe");
    }

    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
        p.k(response, "response");
    }

    public void responseHeadersStart(@NotNull Call call) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
    }

    public void satisfactionFailure(@NotNull Call call, @NotNull Response response) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
        p.k(response, "response");
    }

    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
    }

    public void secureConnectStart(@NotNull Call call) {
        p.k(call, NotificationCompat.CATEGORY_CALL);
    }
}
