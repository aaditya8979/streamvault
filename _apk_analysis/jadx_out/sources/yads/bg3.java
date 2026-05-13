package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f87996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final at1 f87997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zf3 f87998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s71 f87999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ag3 f88000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f88001f;

    public bg3(Context context, lu2 lu2Var, v9 v9Var, w5 w5Var) {
        this.f87996a = v9Var;
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f93787a;
        this.f87997b = cf.a(context, iu3Var.b());
        this.f87998c = new zf3(w5Var);
    }

    public final void a(Map map) {
        Map mapJ = this.f88001f;
        if (mapJ == null) {
            mapJ = kotlin.collections.a.j();
        }
        map.putAll(mapJ);
        if (this.f87999d != null) {
            Map mapJ2 = kotlin.collections.a.j();
            if (!tn.y.m(mapJ2)) {
                mapJ2 = null;
            }
            if (mapJ2 == null) {
                mapJ2 = new LinkedHashMap();
            }
            d00 d00Var = e00.f89039c;
            mapJ2.put("ad_type", "instream");
            throw null;
        }
        map.putAll(kotlin.collections.a.j());
        ag3 ag3Var = this.f88000e;
        Map mapJ3 = ag3Var != null ? ag3Var.a().f89652a : null;
        if (mapJ3 == null) {
            mapJ3 = kotlin.collections.a.j();
        }
        map.putAll(mapJ3);
        co2 co2Var = co2.f88533c;
        v9 v9Var = this.f87996a;
        this.f87997b.a(new eo2("video_ad_rendering_result", kotlin.collections.a.C(map), v9Var != null ? v9Var.f95998i : null));
    }
}
