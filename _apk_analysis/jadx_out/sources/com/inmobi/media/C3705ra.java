package com.inmobi.media;

import androidx.core.graphics.drawable.IconCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3705ra extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3805va f28049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pm f28050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f28051c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3705ra(C3805va c3805va, Pm pm2, JSONObject jSONObject, hn.c cVar) {
        super(2, cVar);
        this.f28049a = c3805va;
        this.f28050b = pm2;
        this.f28051c = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3705ra(this.f28049a, this.f28050b, this.f28051c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3705ra) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        in.a.g();
        kotlin.c.b(obj);
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28049a.f28354a;
        Pm pm2 = this.f28050b;
        JSONObject jSONObject = this.f28051c;
        gestureDetectorOnGestureListenerC3337ci.getClass();
        tn.p.k(pm2, "action");
        C3803v8 c3803v8 = gestureDetectorOnGestureListenerC3337ci.Y0;
        if (c3803v8 != null) {
            tn.p.k(pm2, "action");
            switch (pm2.ordinal()) {
                case 0:
                    c3803v8.b(true);
                    break;
                case 1:
                    c3803v8.b(false);
                    break;
                case 2:
                    if (!c3803v8.f28341g.get()) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("action", "play");
                        EnumC3728s8 enumC3728s8 = EnumC3728s8.f28101e;
                        EnumC3728s8[] enumC3728s8Arr = {EnumC3728s8.f28099c, EnumC3728s8.f28102f, EnumC3728s8.f28103g, enumC3728s8};
                        EnumC3275a8[] enumC3275a8Arr = EnumC3275a8.f26763a;
                        if (c3803v8.a(enumC3728s8Arr, "executeVideoPlayerActions", jSONObject2.toString(), enumC3728s8)) {
                            c3803v8.f28345k.d();
                        }
                    }
                    break;
                case 3:
                    if (!c3803v8.f28341g.get()) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("action", CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
                        EnumC3728s8 enumC3728s82 = EnumC3728s8.f28102f;
                        EnumC3728s8[] enumC3728s8Arr2 = {EnumC3728s8.f28099c, enumC3728s82, EnumC3728s8.f28103g, EnumC3728s8.f28101e};
                        EnumC3275a8[] enumC3275a8Arr2 = EnumC3275a8.f26763a;
                        if (c3803v8.a(enumC3728s8Arr2, "executeVideoPlayerActions", jSONObject3.toString(), enumC3728s82)) {
                            c3803v8.f28345k.c();
                        }
                    }
                    break;
                case 4:
                    c3803v8.a(true);
                    break;
                case 5:
                    c3803v8.a(false);
                    break;
                case 6:
                    if (!c3803v8.f28341g.get()) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("action", CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
                        EnumC3728s8 enumC3728s83 = EnumC3728s8.f28102f;
                        EnumC3728s8[] enumC3728s8Arr3 = {EnumC3728s8.f28099c, enumC3728s83, EnumC3728s8.f28103g, EnumC3728s8.f28101e};
                        EnumC3275a8[] enumC3275a8Arr3 = EnumC3275a8.f26763a;
                        if (c3803v8.a(enumC3728s8Arr3, "executeVideoPlayerActions", jSONObject4.toString(), enumC3728s83)) {
                            c3803v8.f28345k.c();
                        }
                    }
                    C3885yf c3885yf = c3803v8.f28350p;
                    if (c3885yf != null) {
                        C3519jn c3519jn = new C3519jn((long) c3803v8.f28345k.a().getTime());
                        tn.p.k(c3519jn, "videoEvent");
                        Ae ae2 = c3885yf.f28591e;
                        if (ae2 != null) {
                            ae2.a(c3519jn);
                        }
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            gestureDetectorOnGestureListenerC3337ci.a(EnumC3654p8.f27851l, jSONObject);
        } else {
            EnumC3654p8 enumC3654p8 = EnumC3654p8.f27844e;
            EnumC3275a8[] enumC3275a8Arr4 = EnumC3275a8.f26763a;
            X7 x72 = new X7(jSONObject);
            tn.p.k(x72, IconCompat.EXTRA_OBJ);
            gestureDetectorOnGestureListenerC3337ci.a(enumC3654p8, AbstractC3581ma.a(x72, X7.class));
        }
        return bn.r.f5635a;
    }
}
