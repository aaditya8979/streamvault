package yads;

import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class hc extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f90354b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(JSONObject jSONObject) {
        super(0);
        this.f90354b = jSONObject;
    }

    @Override // sn.a
    public final Object invoke() {
        return he1.a("skuId", this.f90354b);
    }
}
