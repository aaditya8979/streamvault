package com.ironsource;

import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4119l2 implements InterfaceC4137m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f32187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4305vd f32188b;

    public C4119l2(@NotNull String str, @NotNull InterfaceC4305vd interfaceC4305vd) {
        tn.p.k(str, "encryptedAuctionResponse");
        tn.p.k(interfaceC4305vd, "providerName");
        this.f32187a = str;
        this.f32188b = interfaceC4305vd;
    }

    @Override // com.ironsource.InterfaceC4137m2
    @NotNull
    public Object a() {
        Object objM7534constructorimpl;
        String strC = C4196p5.b().c();
        tn.p.j(strC, "getInstance().mediationKey");
        C4268ta c4268ta = new C4268ta(new J4(this.f32187a, strC));
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c4268ta.a());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl == null) {
            return C4083j2.f32014h.a((JSONObject) objM7534constructorimpl, this.f32188b.value());
        }
        C4228r4.d().a(thM7537exceptionOrNullimpl);
        return thM7537exceptionOrNullimpl instanceof IllegalArgumentException ? Result.m7534constructorimpl(kotlin.c.a(new C4018f8(C4365z5.f34494a.d()))) : Result.m7534constructorimpl(kotlin.c.a(new C4018f8(C4365z5.f34494a.h())));
    }
}
