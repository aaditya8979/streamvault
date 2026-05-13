package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.t8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3753t8 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3803v8 f28170b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3753t8(C3803v8 c3803v8, hn.c cVar) {
        super(2, cVar);
        this.f28170b = c3803v8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3753t8 c3753t8 = new C3753t8(this.f28170b, cVar);
        c3753t8.f28169a = obj;
        return c3753t8;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        C3753t8 c3753t8 = new C3753t8(this.f28170b, (hn.c) obj2);
        c3753t8.f28169a = (Rl) obj;
        return c3753t8.invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        in.a.g();
        kotlin.c.b(obj);
        Rl rl2 = (Rl) this.f28169a;
        this.f28170b.a(rl2);
        C3589mi c3589mi = this.f28170b.f28336b;
        if (c3589mi != null) {
            tn.p.k(rl2, "mediaEvent");
            if (rl2 instanceof C3353d8) {
                HtmlVideoPlayerRequest htmlVideoPlayerRequest = ((C3353d8) rl2).f27021a;
                Map mapA = c3589mi.a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("videoUrls", htmlVideoPlayerRequest.getVideoFiles());
                jSONObject.put("autoplay", htmlVideoPlayerRequest.getConfig().getAutoplay());
                jSONObject.put("muted", htmlVideoPlayerRequest.getConfig().getMuted());
                mapA.put("payload", jSONObject.toString());
                Wj wj2 = Wj.f26549a;
                Wj.b("VideoLoadStarted", mapA, EnumC3287ak.f26805a);
            } else if (rl2 instanceof C3430g8) {
                C3430g8 c3430g8 = (C3430g8) rl2;
                Map mapA2 = c3589mi.a();
                Long latency = c3430g8.f27210a.getLatency();
                mapA2.put("latency", Long.valueOf(latency != null ? latency.longValue() : -1L));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(UnifiedMediationParams.KEY_VIDEO_URL, c3430g8.f27210a.getVideoUrl());
                jSONObject2.put("cacheProgress", c3430g8.f27211b);
                mapA2.put("payload", jSONObject2.toString());
                Wj wj3 = Wj.f26549a;
                Wj.b("VideoLoadSuccess", mapA2, EnumC3287ak.f26805a);
            } else if (rl2 instanceof C3544kn) {
                Map mapA3 = c3589mi.a();
                Wj wj4 = Wj.f26549a;
                Wj.b("VideoStart", mapA3, EnumC3287ak.f26805a);
            } else if (rl2 instanceof C3867xm) {
                Map mapA4 = c3589mi.a();
                Wj wj5 = Wj.f26549a;
                Wj.b("VideoFirstQuartile", mapA4, EnumC3287ak.f26805a);
            } else if (rl2 instanceof C3494in) {
                Map mapA5 = c3589mi.a();
                Wj wj6 = Wj.f26549a;
                Wj.b("VideoSecondQuartile", mapA5, EnumC3287ak.f26805a);
            } else if (rl2 instanceof C3718rn) {
                Map mapA6 = c3589mi.a();
                Wj wj7 = Wj.f26549a;
                Wj.b("VideoThirdQuartile", mapA6, EnumC3287ak.f26805a);
            } else if (rl2 instanceof Pl) {
                Map mapA7 = c3589mi.a();
                Wj wj8 = Wj.f26549a;
                Wj.b("VideoComplete", mapA7, EnumC3287ak.f26805a);
            } else if (rl2 instanceof C3301b8) {
                C3301b8 c3301b8 = (C3301b8) rl2;
                Map mapA8 = c3589mi.a();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("videoUrls", c3301b8.f26842a.getVideoFiles());
                mapA8.put("payload", jSONObject3.toString());
                mapA8.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(c3301b8.f26843b));
                Wj wj9 = Wj.f26549a;
                Wj.b("VideoLoadFailure", mapA8, EnumC3287ak.f26805a);
            }
        }
        return bn.r.f5635a;
    }
}
