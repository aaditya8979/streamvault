package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class z30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f97366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fo2 f97367b;

    public z30(at1 at1Var, fo2 fo2Var) {
        this.f97366a = at1Var;
        this.f97367b = fo2Var;
    }

    public final void a(y30 y30Var) {
        this.f97367b.b(y30Var.f96985b, "log_type");
        co2 co2Var = co2.f88533c;
        fo2 fo2Var = this.f97367b;
        Map map = fo2Var.f89652a;
        this.f97366a.a(new eo2(CreativeInfo.f52469an, kotlin.collections.a.C(map), fo2Var.f89653b));
    }
}
