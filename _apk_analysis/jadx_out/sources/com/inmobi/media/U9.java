package com.inmobi.media;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class U9 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V9 f26422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f26423c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U9(V9 v92, ArrayList arrayList, hn.c cVar) {
        super(2, cVar);
        this.f26422b = v92;
        this.f26423c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new U9(this.f26422b, this.f26423c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new U9(this.f26422b, this.f26423c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        W9 w92;
        Object objG = in.a.g();
        int i10 = this.f26421a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3856xb c3856xb = (C3856xb) AbstractC3881yb.f28577a.getValue();
            this.f26421a = 1;
            obj = c3856xb.b(this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        ArrayList arrayList = this.f26423c;
        for (C3682qb c3682qb : (Iterable) obj) {
            CopyOnWriteArrayList copyOnWriteArrayList = Mb.f25950a;
            if (!Lb.a(c3682qb.f27957a)) {
                String strB = Tb.b(c3682qb.f27957a);
                if (strB != null) {
                    JSONObject jSONObject = new JSONObject(strB);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("vitals");
                    JSONArray jSONArray = jSONObject.getJSONArray(CreativeInfo.f52469an);
                    tn.p.h(jSONObject2);
                    tn.p.h(jSONArray);
                    w92 = new W9(jSONObject2, jSONArray, c3682qb);
                } else {
                    w92 = null;
                }
                if (w92 != null) {
                    arrayList.add(w92);
                }
            }
        }
        return bn.r.f5635a;
    }
}
