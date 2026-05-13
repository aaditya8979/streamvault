package com.inmobi.media;

import android.util.SparseArray;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.inmobi.media.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC3273a6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y5 f26742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f26743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC3273a6 f26744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC3273a6 f26745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC3273a6 f26746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC3273a6 f26747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC3273a6 f26748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC3273a6 f26749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC3273a6 f26750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC3273a6 f26751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC3273a6 f26752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC3273a6 f26753m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC3273a6 f26754n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC3273a6 f26755o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC3273a6 f26756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC3273a6 f26757q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ EnumC3273a6[] f26758r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26759a;

    static {
        EnumC3273a6 enumC3273a6 = new EnumC3273a6(0, 0, "NETWORK_UNAVAILABLE_ERROR");
        EnumC3273a6 enumC3273a62 = new EnumC3273a6(1, 199, "UNKNOWN_ERROR");
        f26744d = enumC3273a62;
        EnumC3273a6 enumC3273a63 = new EnumC3273a6(2, 198, "NETWORK_IO_ERROR");
        f26745e = enumC3273a63;
        EnumC3273a6 enumC3273a64 = new EnumC3273a6(3, 197, "OUT_OF_MEMORY_ERROR");
        EnumC3273a6 enumC3273a65 = new EnumC3273a6(4, 196, "INVALID_ENCRYPTED_RESPONSE_RECEIVED");
        EnumC3273a6 enumC3273a66 = new EnumC3273a6(5, 195, "RESPONSE_EXCEEDS_SPECIFIED_SIZE_LIMIT");
        EnumC3273a6 enumC3273a67 = new EnumC3273a6(6, 194, "GZIP_DECOMPRESSION_FAILED");
        EnumC3273a6 enumC3273a68 = new EnumC3273a6(7, 193, "BAD_REQUEST");
        f26746f = enumC3273a68;
        EnumC3273a6 enumC3273a69 = new EnumC3273a6(8, 192, "GDPR_COMPLIANCE_ENFORCED");
        EnumC3273a6 enumC3273a610 = new EnumC3273a6(9, 191, "GENERIC_HTTP_2XX");
        f26747g = enumC3273a610;
        EnumC3273a6 enumC3273a611 = new EnumC3273a6(10, 190, "RESPONSE_PARSING_ERROR");
        EnumC3273a6 enumC3273a612 = new EnumC3273a6(11, 189, "RETRY_ATTEMPTED");
        EnumC3273a6 enumC3273a613 = new EnumC3273a6(12, 188, "NETWORK_UNAVAILABLE_CONTEXT_LOSS");
        f26748h = enumC3273a613;
        EnumC3273a6 enumC3273a614 = new EnumC3273a6(13, 187, "NETWORK_UNAVAILABLE_IDLE_MODE");
        f26749i = enumC3273a614;
        EnumC3273a6 enumC3273a615 = new EnumC3273a6(14, 186, "NETWORK_UNAVAILABLE_NO_CONNECTION_M_OR_ABOVE");
        f26750j = enumC3273a615;
        EnumC3273a6 enumC3273a616 = new EnumC3273a6(15, 185, "NETWORK_UNAVAILABLE_NO_CONNECTION_BELOW_M");
        f26751k = enumC3273a616;
        EnumC3273a6 enumC3273a617 = new EnumC3273a6(16, 184, "NETWORK_UNAVAILABLE_EXCEPTION");
        f26752l = enumC3273a617;
        EnumC3273a6 enumC3273a618 = new EnumC3273a6(17, 183, "NETWORK_PREPARE_FAIL");
        f26753m = enumC3273a618;
        EnumC3273a6 enumC3273a619 = new EnumC3273a6(18, 181, "NETWORK_REQUEST_GENERIC_DROPPED_BY_INTERCEPTOR");
        EnumC3273a6 enumC3273a620 = new EnumC3273a6(19, BaseTransientBottomBar.ANIMATION_FADE_DURATION, "NETWORK_REQUEST_CANCELLED");
        f26754n = enumC3273a620;
        EnumC3273a6 enumC3273a621 = new EnumC3273a6(20, 179, "NETWORK_REQUEST_EXCEPTION");
        EnumC3273a6 enumC3273a622 = new EnumC3273a6(21, 182, "NETWORK_UNAVAILABLE_CUSTOM_VALIDATOR");
        f26755o = enumC3273a622;
        EnumC3273a6 enumC3273a623 = new EnumC3273a6(22, 178, "NETWORK_REDIRECT_MALFORMED");
        f26756p = enumC3273a623;
        EnumC3273a6 enumC3273a624 = new EnumC3273a6(23, 204, "HTTP_NO_CONTENT");
        EnumC3273a6 enumC3273a625 = new EnumC3273a6(24, 304, "HTTP_NOT_MODIFIED");
        EnumC3273a6 enumC3273a626 = new EnumC3273a6(25, 303, "HTTP_SEE_OTHER");
        EnumC3273a6 enumC3273a627 = new EnumC3273a6(26, 404, "HTTP_SERVER_NOT_FOUND");
        EnumC3273a6 enumC3273a628 = new EnumC3273a6(27, 302, "HTTP_MOVED_TEMP");
        EnumC3273a6 enumC3273a629 = new EnumC3273a6(28, 500, "HTTP_INTERNAL_SERVER_ERROR");
        EnumC3273a6 enumC3273a630 = new EnumC3273a6(29, 501, "HTTP_NOT_IMPLEMENTED");
        EnumC3273a6 enumC3273a631 = new EnumC3273a6(30, 502, "HTTP_BAD_GATEWAY");
        EnumC3273a6 enumC3273a632 = new EnumC3273a6(31, 503, "HTTP_SERVER_NOT_AVAILABLE");
        EnumC3273a6 enumC3273a633 = new EnumC3273a6(32, 504, "HTTP_GATEWAY_TIMEOUT");
        f26757q = enumC3273a633;
        EnumC3273a6[] enumC3273a6Arr = {enumC3273a6, enumC3273a62, enumC3273a63, enumC3273a64, enumC3273a65, enumC3273a66, enumC3273a67, enumC3273a68, enumC3273a69, enumC3273a610, enumC3273a611, enumC3273a612, enumC3273a613, enumC3273a614, enumC3273a615, enumC3273a616, enumC3273a617, enumC3273a618, enumC3273a619, enumC3273a620, enumC3273a621, enumC3273a622, enumC3273a623, enumC3273a624, enumC3273a625, enumC3273a626, enumC3273a627, enumC3273a628, enumC3273a629, enumC3273a630, enumC3273a631, enumC3273a632, enumC3273a633, new EnumC3273a6(33, 505, "HTTP_VERSION_NOT_SUPPORTED"), new EnumC3273a6(34, 401, "HTTP_UNAUTHORISED"), new EnumC3273a6(35, CommonGatewayClient.CODE_599, "SERVER_ERROR_END_CODE")};
        f26758r = enumC3273a6Arr;
        kn.a<EnumC3273a6> aVarA = kotlin.enums.a.a(enumC3273a6Arr);
        f26742b = new Y5();
        f26743c = new SparseArray();
        for (EnumC3273a6 enumC3273a634 : aVarA) {
            f26743c.put(enumC3273a634.f26759a, enumC3273a634);
        }
    }

    public EnumC3273a6(int i10, int i11, String str) {
        this.f26759a = i11;
    }

    public static EnumC3273a6 valueOf(String str) {
        return (EnumC3273a6) Enum.valueOf(EnumC3273a6.class, str);
    }

    public static EnumC3273a6[] values() {
        return (EnumC3273a6[]) f26758r.clone();
    }
}
