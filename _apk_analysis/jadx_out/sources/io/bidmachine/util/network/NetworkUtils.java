package io.bidmachine.util.network;

import android.net.Uri;
import androidx.annotation.WorkerThread;
import java.net.HttpURLConnection;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: NetworkUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J$\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\fH\u0007R\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lio/bidmachine/util/network/NetworkUtils;", "", "Ljava/net/HttpURLConnection;", "httpURLConnection", "Lbn/r;", "disconnectSafely", "", "urlString", "", "timeOut", "findEndpoint", "url", "", "queryParameters", "appendQueryParameters", "HTTP_TEMPORARY_REDIRECT", "I", "HTTP_PERMANENT_REDIRECT", "HEADER_LOCATION", "Ljava/lang/String;", "PROTOCOL_HTTP", "PROTOCOL_HTTPS", "<init>", "()V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public final class NetworkUtils {

    @NotNull
    public static final String HEADER_LOCATION = "Location";
    public static final int HTTP_PERMANENT_REDIRECT = 308;
    public static final int HTTP_TEMPORARY_REDIRECT = 307;

    @NotNull
    public static final NetworkUtils INSTANCE = new NetworkUtils();

    @NotNull
    public static final String PROTOCOL_HTTP = "http";

    @NotNull
    public static final String PROTOCOL_HTTPS = "https";

    private NetworkUtils() {
    }

    @NotNull
    public static final String appendQueryParameters(@NotNull String url, @NotNull Map<String, String> queryParameters) {
        p.k(url, "url");
        p.k(queryParameters, "queryParameters");
        if (queryParameters.isEmpty()) {
            return url;
        }
        Uri.Builder builderBuildUpon = Uri.parse(url).buildUpon();
        for (Map.Entry<String, String> entry : queryParameters.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        p.j(string, "parse(url).buildUpon().a…     }.build().toString()");
        return string;
    }

    public static final void disconnectSafely(@Nullable HttpURLConnection httpURLConnection) {
        NetworkUtilsKt.disconnectSafely(httpURLConnection);
    }

    @WorkerThread
    @NotNull
    public static final String findEndpoint(@NotNull String str) {
        p.k(str, "urlString");
        return findEndpoint$default(str, 0, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1 A[Catch: Exception -> 0x00d3, all -> 0x00e8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d3, blocks: (B:26:0x0074, B:31:0x0090, B:38:0x00a5, B:41:0x00ab, B:42:0x00ae, B:47:0x00c1), top: B:69:0x0074, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8 A[Catch: all -> 0x00e8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e8, blocks: (B:4:0x0022, B:7:0x002b, B:59:0x00e1, B:8:0x0031, B:10:0x003a, B:16:0x0046, B:19:0x0051, B:21:0x005b, B:24:0x0069, B:26:0x0074, B:31:0x0090, B:38:0x00a5, B:41:0x00ab, B:42:0x00ae, B:47:0x00c1, B:50:0x00c8, B:56:0x00da, B:53:0x00d3), top: B:66:0x0022, inners: #2 }] */
    @androidx.annotation.WorkerThread
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String findEndpoint(@org.jetbrains.annotations.NotNull java.lang.String r12, int r13) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.util.network.NetworkUtils.findEndpoint(java.lang.String, int):java.lang.String");
    }

    public static /* synthetic */ String findEndpoint$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 500;
        }
        return findEndpoint(str, i10);
    }
}
