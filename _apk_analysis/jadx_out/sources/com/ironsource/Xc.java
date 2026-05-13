package com.ironsource;

import com.ironsource.InterfaceC4265t7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class Xc implements InterfaceC4265t7, InterfaceC4265t7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4262t4 f30671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final M7 f30672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, Wc> f30673c;

    public Xc(@NotNull InterfaceC4262t4 interfaceC4262t4, @NotNull M7 m72) {
        tn.p.k(interfaceC4262t4, "currentTimeProvider");
        tn.p.k(m72, "repository");
        this.f30671a = interfaceC4262t4;
        this.f30672b = m72;
        this.f30673c = new LinkedHashMap();
    }

    private final boolean a(Wc wc2, String str) {
        Long lA = this.f30672b.a(str);
        return lA != null && this.f30671a.a() - lA.longValue() < wc2.a();
    }

    @Override // com.ironsource.InterfaceC4265t7
    @NotNull
    public M3 a(@NotNull String str) {
        tn.p.k(str, "identifier");
        Wc wc2 = this.f30673c.get(str);
        if (wc2 != null && a(wc2, str)) {
            return new M3(true, O3.Pacing);
        }
        return new M3(false, null, 2, null);
    }

    @Override // com.ironsource.InterfaceC4265t7.a
    @NotNull
    public Object a(@NotNull String str, @NotNull O3 o32, @NotNull InterfaceC4231r7 interfaceC4231r7) {
        tn.p.k(str, "identifier");
        tn.p.k(o32, "cappingType");
        tn.p.k(interfaceC4231r7, "cappingConfig");
        Object objB = interfaceC4231r7.b();
        if (!Result.m7540isSuccessimpl(objB)) {
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objB);
            return thM7537exceptionOrNullimpl != null ? Result.m7534constructorimpl(kotlin.c.a(thM7537exceptionOrNullimpl)) : Result.m7534constructorimpl(bn.r.f5635a);
        }
        Wc wc2 = (Wc) objB;
        if (wc2 != null) {
            this.f30673c.put(str, wc2);
        }
        return Result.m7534constructorimpl(bn.r.f5635a);
    }

    @NotNull
    public final Map<String, Wc> a() {
        return this.f30673c;
    }

    @Override // com.ironsource.InterfaceC4265t7.a
    public void b(@NotNull String str) {
        tn.p.k(str, "identifier");
        if (this.f30673c.get(str) == null) {
            return;
        }
        this.f30672b.a(this.f30671a.a(), str);
    }
}
