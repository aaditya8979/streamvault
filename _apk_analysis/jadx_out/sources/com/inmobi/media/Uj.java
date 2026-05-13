package com.inmobi.media;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Uj extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f26449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EnumC3287ak f26450d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uj(String str, Map map, EnumC3287ak enumC3287ak, hn.c cVar) {
        super(2, cVar);
        this.f26448b = str;
        this.f26449c = map;
        this.f26450d = enumC3287ak;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Uj(this.f26448b, this.f26449c, this.f26450d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((Uj) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int iA;
        String str;
        Object objG = in.a.g();
        int i10 = this.f26447a;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                Wj wj2 = Wj.f26549a;
                Map map = this.f26449c;
                EnumC3287ak enumC3287ak = this.f26450d;
                Objects.toString(map);
                Objects.toString(enumC3287ak);
                if (Wj.f26555g != null && !Wj.a(this.f26448b, this.f26449c, this.f26450d)) {
                    C3516jk c3516jk = Wj.f26555g;
                    if (c3516jk == null) {
                        tn.p.C("mTelemetryValidator");
                        c3516jk = null;
                    }
                    EnumC3287ak enumC3287ak2 = this.f26450d;
                    String str2 = this.f26448b;
                    c3516jk.getClass();
                    tn.p.k(enumC3287ak2, "telemetryEventType");
                    tn.p.k(str2, "eventType");
                    int iOrdinal = enumC3287ak2.ordinal();
                    if (iOrdinal == 0) {
                        iA = c3516jk.f27424b.a(str2);
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iA = c3516jk.f27425c.a(str2);
                    }
                    if (iA != 0) {
                        if (iA != 1) {
                            return bn.r.f5635a;
                        }
                        if (this.f26449c.get("samplingRate") == null) {
                            this.f26449c.put("samplingRate", jn.a.d(100));
                        }
                    } else if (this.f26449c.get("samplingRate") == null) {
                        this.f26449c.put("samplingRate", jn.a.d(vn.c.c((((double) 1) - Wj.b().getSamplingFactor()) * ((double) 100))));
                    }
                    String str3 = this.f26448b;
                    int iOrdinal2 = this.f26450d.ordinal();
                    if (iOrdinal2 == 0) {
                        str = "sdk";
                    } else {
                        if (iOrdinal2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "template";
                    }
                    C3390ek c3390ek = new C3390ek(str3, null, str);
                    this.f26449c.put("eventType", c3390ek.f27324a);
                    Map map2 = this.f26449c;
                    String string = UUID.randomUUID().toString();
                    tn.p.j(string, "toString(...)");
                    map2.put("eventId", string);
                    this.f26449c.put("isTemplateEvent", jn.a.a(this.f26450d == EnumC3287ak.f26806b));
                    Map map3 = this.f26449c;
                    tn.p.i(map3, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                    String string2 = new JSONObject(map3).toString();
                    tn.p.j(string2, "toString(...)");
                    tn.p.k(string2, "payload");
                    c3390ek.f27325b = string2;
                    this.f26447a = 1;
                    if (wj2.a(c3390ek, this) == objG) {
                        return objG;
                    }
                }
                return bn.r.f5635a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            Wj.f26549a.a();
        } catch (Exception e10) {
            Wj wj3 = Wj.f26549a;
            e10.getMessage();
        }
        return bn.r.f5635a;
    }
}
