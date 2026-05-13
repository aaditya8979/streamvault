package yads;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f88261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f88262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f88263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sx f88264d;

    public /* synthetic */ c1(at1 at1Var, d4 d4Var, v9 v9Var) {
        this(at1Var, d4Var, v9Var, new sx());
    }

    public c1(at1 at1Var, d4 d4Var, v9 v9Var, sx sxVar) {
        this.f88261a = at1Var;
        this.f88262b = d4Var;
        this.f88263c = v9Var;
        this.f88264d = sxVar;
    }

    public final void a() {
        a("on_pause");
    }

    public final void a(String str) {
        Object obj;
        fo2 fo2VarA = this.f88264d.a(this.f88263c, this.f88262b);
        yf2 yf2Var = (yf2) ag2.f87694a.getValue();
        if (yf2Var != null) {
            int iOrdinal = yf2Var.ordinal();
            if (iOrdinal == 0) {
                obj = PluginErrorDetails.Platform.FLUTTER;
            } else if (iOrdinal == 1) {
                obj = "react-native";
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = "unity";
            }
        } else {
            obj = fo2VarA.f89652a.get("plugin_type");
        }
        co2 co2Var = co2.f88533c;
        this.f88261a.a(new eo2("activity_action", kotlin.collections.a.C(kotlin.collections.a.q(fo2VarA.f89652a, kotlin.collections.a.m(bn.h.a("activity_event", str), bn.h.a("plugin_type", obj)))), fo2VarA.f89653b));
    }

    public final void b() {
        a("on_resume");
    }
}
