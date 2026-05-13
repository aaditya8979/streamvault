package com.vungle.ads.internal.network;

import androidx.annotation.VisibleForTesting;
import bn.r;
import cn.f0;
import com.ironsource.G5;
import com.ironsource.Q6;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.converters.EmptyResponseConverter;
import com.vungle.ads.internal.network.converters.JsonConverter;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import so.t;
import tn.p;
import xo.d;
import xo.u;

/* JADX INFO: compiled from: VungleApiImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J<\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0019H\u0002JF\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001e2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J(\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0016J&\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0016J&\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006&"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiImpl;", "Lcom/vungle/ads/internal/network/VungleApi;", "okHttpClient", "Lokhttp3/Call$Factory;", "(Lokhttp3/Call$Factory;)V", "emptyResponseConverter", "Lcom/vungle/ads/internal/network/converters/EmptyResponseConverter;", "getOkHttpClient$vungle_ads_release", "()Lokhttp3/Call$Factory;", com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "Lcom/vungle/ads/internal/network/Call;", "Lcom/vungle/ads/internal/model/AdPayload;", Q6.f30218d0, "", "path", "body", "Lcom/vungle/ads/internal/model/CommonRequestBody;", "config", "Lcom/vungle/ads/internal/model/ConfigPayload;", "defaultBuilder", "Lokhttp3/Request$Builder;", "placementReferenceId", "headers", "", "defaultProtoBufBuilder", "Lokhttp3/HttpUrl;", "pingTPAT", "Ljava/lang/Void;", "url", "requestType", "Lcom/vungle/ads/internal/network/HttpMethod;", "requestBody", "Lokhttp3/RequestBody;", "ri", "sendAdMarkup", "sendErrors", "sendMetrics", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VungleApiImpl implements VungleApi {

    @NotNull
    private static final String VUNGLE_VERSION = "7.1.0";

    @NotNull
    private final EmptyResponseConverter emptyResponseConverter;

    @NotNull
    private final Call.Factory okHttpClient;

    @NotNull
    private static final xo.a json = u.b(null, new l<d, r>() { // from class: com.vungle.ads.internal.network.VungleApiImpl$Companion$json$1
        @Override // sn.l
        public /* bridge */ /* synthetic */ r invoke(d dVar) {
            invoke2(dVar);
            return r.f5635a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull d dVar) {
            p.k(dVar, "$this$Json");
            dVar.f(true);
            dVar.d(true);
            dVar.e(false);
            dVar.c(true);
        }
    }, 1, null);

    /* JADX INFO: compiled from: VungleApiImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            iArr[HttpMethod.GET.ordinal()] = 1;
            iArr[HttpMethod.POST.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VungleApiImpl(@NotNull Call.Factory factory) {
        p.k(factory, "okHttpClient");
        this.okHttpClient = factory;
        this.emptyResponseConverter = new EmptyResponseConverter();
    }

    private final Request.Builder defaultBuilder(String ua2, String path, String placementReferenceId, Map<String, String> headers) {
        Request.Builder builderAddHeader = new Request.Builder().url(path).addHeader("User-Agent", ua2).addHeader("Vungle-Version", VUNGLE_VERSION).addHeader("Content-Type", G5.L);
        if (headers != null) {
            builderAddHeader.headers(Headers.Companion.of(headers));
        }
        if (placementReferenceId != null) {
            builderAddHeader.addHeader("X-Vungle-Placement-Ref-Id", placementReferenceId);
        }
        VungleHeader vungleHeader = VungleHeader.INSTANCE;
        String appVersion = vungleHeader.getAppVersion();
        if (appVersion != null) {
            builderAddHeader.addHeader("X-VUNGLE-APP-VERSION", appVersion);
        }
        String appId = vungleHeader.getAppId();
        if (appId != null) {
            builderAddHeader.addHeader("X-Vungle-App-Id", appId);
        }
        return builderAddHeader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Request.Builder defaultBuilder$default(VungleApiImpl vungleApiImpl, String str, String str2, String str3, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            map = null;
        }
        return vungleApiImpl.defaultBuilder(str, str2, str3, map);
    }

    private final Request.Builder defaultProtoBufBuilder(String ua2, HttpUrl path) {
        Request.Builder builderAddHeader = new Request.Builder().url(path).addHeader("User-Agent", ua2).addHeader("Vungle-Version", VUNGLE_VERSION).addHeader("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        VungleHeader vungleHeader = VungleHeader.INSTANCE;
        String appId = vungleHeader.getAppId();
        if (appId != null) {
            builderAddHeader.addHeader("X-Vungle-App-Id", appId);
        }
        String appVersion = vungleHeader.getAppVersion();
        if (appVersion != null) {
            builderAddHeader.addHeader("X-VUNGLE-APP-VERSION", appVersion);
        }
        return builderAddHeader;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @Nullable
    public Call<AdPayload> ads(@NotNull String ua2, @NotNull String path, @NotNull CommonRequestBody body) {
        List<String> placements;
        p.k(ua2, Q6.f30218d0);
        p.k(path, "path");
        p.k(body, "body");
        try {
            xo.a aVar = json;
            KSerializer<Object> kSerializerB = t.b(aVar.a(), tn.t.m(CommonRequestBody.class));
            p.i(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            String strB = aVar.b(kSerializerB, body);
            CommonRequestBody.RequestParam request = body.getRequest();
            return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder$default(this, ua2, path, (request == null || (placements = request.getPlacements()) == null) ? null : (String) f0.v0(placements), null, 8, null).post(RequestBody.Companion.create(strB, (MediaType) null)).build()), new JsonConverter(tn.t.m(AdPayload.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @Nullable
    public Call<ConfigPayload> config(@NotNull String ua2, @NotNull String path, @NotNull CommonRequestBody body) {
        p.k(ua2, Q6.f30218d0);
        p.k(path, "path");
        p.k(body, "body");
        try {
            xo.a aVar = json;
            KSerializer<Object> kSerializerB = t.b(aVar.a(), tn.t.m(CommonRequestBody.class));
            p.i(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder$default(this, ua2, path, null, null, 12, null).post(RequestBody.Companion.create(aVar.b(kSerializerB, body), (MediaType) null)).build()), new JsonConverter(tn.t.m(ConfigPayload.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: getOkHttpClient$vungle_ads_release, reason: from getter */
    public final Call.Factory getOkHttpClient() {
        return this.okHttpClient;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @NotNull
    public Call<Void> pingTPAT(@NotNull String ua2, @NotNull String url, @NotNull HttpMethod requestType, @Nullable Map<String, String> headers, @Nullable RequestBody requestBody) {
        Request requestBuild;
        p.k(ua2, Q6.f30218d0);
        p.k(url, "url");
        p.k(requestType, "requestType");
        Request.Builder builderDefaultBuilder$default = defaultBuilder$default(this, ua2, url, null, headers, 4, null);
        int i10 = WhenMappings.$EnumSwitchMapping$0[requestType.ordinal()];
        if (i10 == 1) {
            requestBuild = builderDefaultBuilder$default.get().build();
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (requestBody == null) {
                requestBody = RequestBody.Companion.create$default(RequestBody.Companion, new byte[0], (MediaType) null, 0, 0, 6, (Object) null);
            }
            requestBuild = builderDefaultBuilder$default.post(requestBody).build();
        }
        return new OkHttpCall(this.okHttpClient.newCall(requestBuild), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @Nullable
    public Call<Void> ri(@NotNull String ua2, @NotNull String path, @NotNull CommonRequestBody body) {
        p.k(ua2, Q6.f30218d0);
        p.k(path, "path");
        p.k(body, "body");
        try {
            xo.a aVar = json;
            KSerializer<Object> kSerializerB = t.b(aVar.a(), tn.t.m(CommonRequestBody.class));
            p.i(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder$default(this, ua2, path, null, null, 12, null).post(RequestBody.Companion.create(aVar.b(kSerializerB, body), (MediaType) null)).build()), this.emptyResponseConverter);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @NotNull
    public Call<Void> sendAdMarkup(@NotNull String path, @NotNull RequestBody requestBody) {
        p.k(path, "path");
        p.k(requestBody, "requestBody");
        return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder$default(this, "debug", HttpUrl.Companion.get(path).newBuilder().build().toString(), null, null, 12, null).post(requestBody).build()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @NotNull
    public Call<Void> sendErrors(@NotNull String ua2, @NotNull String path, @NotNull RequestBody requestBody) {
        p.k(ua2, Q6.f30218d0);
        p.k(path, "path");
        p.k(requestBody, "requestBody");
        return new OkHttpCall(this.okHttpClient.newCall(defaultProtoBufBuilder(ua2, HttpUrl.Companion.get(path).newBuilder().build()).post(requestBody).build()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @NotNull
    public Call<Void> sendMetrics(@NotNull String ua2, @NotNull String path, @NotNull RequestBody requestBody) {
        p.k(ua2, Q6.f30218d0);
        p.k(path, "path");
        p.k(requestBody, "requestBody");
        return new OkHttpCall(this.okHttpClient.newCall(defaultProtoBufBuilder(ua2, HttpUrl.Companion.get(path).newBuilder().build()).post(requestBody).build()), this.emptyResponseConverter);
    }
}
