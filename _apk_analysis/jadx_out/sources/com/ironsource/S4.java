package com.ironsource;

import com.ironsource.InterfaceC4265t7;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class S4 implements InterfaceC4265t7, InterfaceC4265t7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, P4> f30368a = new ConcurrentHashMap<>();

    @Override // com.ironsource.InterfaceC4265t7
    @NotNull
    public M3 a(@NotNull String str) {
        tn.p.k(str, "identifier");
        P4 p42 = this.f30368a.get(str);
        return (p42 == null || p42.a()) ? new M3(false, null, 2, null) : new M3(true, O3.Delivery);
    }

    @Override // com.ironsource.InterfaceC4265t7.a
    @NotNull
    public Object a(@NotNull String str, @NotNull O3 o32, @NotNull InterfaceC4231r7 interfaceC4231r7) {
        tn.p.k(str, "identifier");
        tn.p.k(o32, "cappingType");
        tn.p.k(interfaceC4231r7, "cappingConfig");
        Object objA = interfaceC4231r7.a();
        if (!Result.m7540isSuccessimpl(objA)) {
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objA);
            return thM7537exceptionOrNullimpl != null ? Result.m7534constructorimpl(kotlin.c.a(thM7537exceptionOrNullimpl)) : Result.m7534constructorimpl(bn.r.f5635a);
        }
        P4 p42 = (P4) objA;
        if (p42 != null) {
            this.f30368a.put(str, p42);
        }
        return Result.m7534constructorimpl(bn.r.f5635a);
    }

    @Override // com.ironsource.InterfaceC4265t7.a
    public void b(@NotNull String str) {
        tn.p.k(str, "identifier");
    }
}
