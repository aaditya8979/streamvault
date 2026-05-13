package com.ironsource;

import com.ironsource.C4240s;
import com.ironsource.InterfaceC4265t7;
import com.unity3d.mediation.LevelPlay;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4275u0 implements L3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4320wb f34142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<LevelPlay.AdFormat, C4240s> f34143b;

    public C4275u0(@NotNull C4320wb c4320wb, @NotNull Map<LevelPlay.AdFormat, C4240s> map) {
        tn.p.k(c4320wb, "tools");
        tn.p.k(map, "adFormatsConfigurations");
        this.f34142a = c4320wb;
        this.f34143b = map;
    }

    private final void a(InterfaceC4265t7.a aVar, String str, C4240s.d dVar) throws JSONException {
        I3 i3B = dVar.b();
        if (i3B != null) {
            O3 o32 = O3.ShowCount;
            a(aVar.a(str, o32, new F3(i3B.a(), i3B.b(), i3B.c())), str, o32);
        }
    }

    private final void a(Object obj, String str, O3 o32) throws JSONException {
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(obj);
        if (thM7537exceptionOrNullimpl != null) {
            this.f34142a.a(str, new J3().a(o32), thM7537exceptionOrNullimpl.getMessage());
        }
    }

    private final void b(InterfaceC4265t7.a aVar, String str, C4240s.d dVar) throws JSONException {
        C3933ad c3933adE = dVar.e();
        if (c3933adE != null) {
            O3 o32 = O3.Pacing;
            a(aVar.a(str, o32, new F3(c3933adE.a(), c3933adE.b(), c3933adE.c())), str, o32);
        }
    }

    @Override // com.ironsource.L3
    public void a(@NotNull InterfaceC4265t7.a aVar) {
        tn.p.k(aVar, "cappingService");
        Iterator<Map.Entry<LevelPlay.AdFormat, C4240s>> it = this.f34143b.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, C4240s.d> entry : it.next().getValue().a().entrySet()) {
                String key = entry.getKey();
                C4240s.d value = entry.getValue();
                a(aVar, key, value);
                b(aVar, key, value);
            }
        }
    }
}
