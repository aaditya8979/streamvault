package com.ironsource;

import com.ironsource.C4240s;
import com.ironsource.N7;
import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4094jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4320wb f32078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<LevelPlay.AdFormat, C4240s> f32079b;

    public C4094jd(@NotNull C4320wb c4320wb, @NotNull Map<LevelPlay.AdFormat, C4240s> map) {
        tn.p.k(c4320wb, "tools");
        tn.p.k(map, "adFormatsConfigurations");
        this.f32078a = c4320wb;
        this.f32079b = map;
    }

    private final void a(N7.a aVar, String str, LevelPlay.AdFormat adFormat, C4240s.d dVar) throws JSONException {
        I3 i3B = dVar.b();
        if (i3B != null) {
            O3 o32 = O3.ShowCount;
            a(aVar.a(str, adFormat, o32, new F3(i3B.a(), i3B.b(), i3B.c())), str, adFormat, o32);
        }
    }

    private final void a(Object obj, String str, LevelPlay.AdFormat adFormat, O3 o32) throws JSONException {
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(obj);
        if (thM7537exceptionOrNullimpl != null) {
            this.f32078a.a(str, adFormat, new J3().a(o32), thM7537exceptionOrNullimpl.getMessage());
        }
    }

    private final void b(N7.a aVar, String str, LevelPlay.AdFormat adFormat, C4240s.d dVar) throws JSONException {
        O3 o32 = O3.Delivery;
        R4 r4C = dVar.c();
        a(aVar.a(str, adFormat, o32, new F3(r4C != null ? Boolean.valueOf(r4C.a()) : null, null, null, 6, null)), str, adFormat, o32);
    }

    private final void c(N7.a aVar, String str, LevelPlay.AdFormat adFormat, C4240s.d dVar) throws JSONException {
        C3933ad c3933adE = dVar.e();
        if (c3933adE != null) {
            O3 o32 = O3.Pacing;
            a(aVar.a(str, adFormat, o32, new F3(c3933adE.a(), c3933adE.b(), N3.Second)), str, adFormat, o32);
        }
    }

    public final void a(@NotNull N7.a aVar) {
        tn.p.k(aVar, "cappingService");
        for (Map.Entry<LevelPlay.AdFormat, C4240s> entry : this.f32079b.entrySet()) {
            LevelPlay.AdFormat key = entry.getKey();
            for (Map.Entry<String, C4240s.d> entry2 : entry.getValue().c().entrySet()) {
                String key2 = entry2.getKey();
                C4240s.d value = entry2.getValue();
                b(aVar, key2, key, value);
                a(aVar, key2, key, value);
                c(aVar, key2, key, value);
            }
        }
    }
}
