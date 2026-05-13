package com.ironsource;

import com.ironsource.C4240s;
import com.ironsource.S7;
import java.util.Map;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
public final class Jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4320wb f29688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Map<String, C4240s.d> f29689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Map<String, C4240s.d> f29690c;

    public Jd(@NotNull C4320wb c4320wb, @Nullable Map<String, C4240s.d> map, @Nullable Map<String, C4240s.d> map2) {
        tn.p.k(c4320wb, "tools");
        this.f29688a = c4320wb;
        this.f29689b = map;
        this.f29690c = map2;
    }

    private final Object a(String str, Integer num) {
        if (str != null && num != null) {
            Result.a aVar = Result.Companion;
            return Result.m7534constructorimpl(bn.r.f5635a);
        }
        Result.a aVar2 = Result.Companion;
        return Result.m7534constructorimpl(kotlin.c.a(new Exception("name - " + str + " or amount - " + num + " is not provided or invalid")));
    }

    private final void a(S7.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objA = a(str2, num);
        if (Result.m7540isSuccessimpl(objA)) {
            tn.p.h(str2);
            tn.p.h(num);
            aVar.b(str, str2, num.intValue());
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objA);
        if (thM7537exceptionOrNullimpl != null) {
            this.f29688a.b(str, 3004, thM7537exceptionOrNullimpl.getMessage());
        }
    }

    private final void b(S7.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objA = a(str2, num);
        if (Result.m7540isSuccessimpl(objA)) {
            tn.p.h(str2);
            tn.p.h(num);
            aVar.a(str, str2, num.intValue());
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objA);
        if (thM7537exceptionOrNullimpl != null) {
            this.f29688a.b(str, 3004, thM7537exceptionOrNullimpl.getMessage());
        }
    }

    public final void a(@NotNull S7.a aVar) {
        tn.p.k(aVar, "rewardService");
        Map<String, C4240s.d> map = this.f29690c;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (Map.Entry<String, C4240s.d> entry : map.entrySet()) {
                String key = entry.getKey();
                Hd hdF = entry.getValue().f();
                if (hdF != null) {
                    b(aVar, key, hdF.b(), hdF.a());
                }
            }
        }
        Map<String, C4240s.d> map2 = this.f29689b;
        if (map2 == null || (r0 = map2.entrySet().iterator()) == null) {
            return;
        }
        for (Map.Entry<String, C4240s.d> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            Hd hdA = entry2.getValue().a();
            if (hdA != null) {
                a(aVar, key2, hdA.b(), hdA.a());
            }
        }
    }
}
