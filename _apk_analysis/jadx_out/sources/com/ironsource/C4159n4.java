package com.ironsource;

import com.ironsource.C3978d4;
import com.ironsource.Y5;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4159n4 implements InterfaceC4104k5<C8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3944b6 f33074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f33075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7 f33076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final sn.l<Result<? extends C8>, bn.r> f33077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private C8 f33078e;

    /* JADX WARN: Multi-variable type inference failed */
    public C4159n4(@NotNull InterfaceC3944b6 interfaceC3944b6, @NotNull String str, @NotNull C7 c72, @NotNull sn.l<? super Result<? extends C8>, bn.r> lVar) {
        tn.p.k(interfaceC3944b6, Y5.c.f30723a);
        tn.p.k(str, "destinationPath");
        tn.p.k(c72, "downloadManager");
        tn.p.k(lVar, "onFinish");
        this.f33074a = interfaceC3944b6;
        this.f33075b = str;
        this.f33076c = c72;
        this.f33077d = lVar;
        this.f33078e = new C8(c());
    }

    @Override // com.ironsource.Oc
    public void a(@NotNull C8 c82) {
        tn.p.k(c82, C3978d4.i.f31327b);
        i().invoke(Result.m7533boximpl(Result.m7534constructorimpl(c82)));
    }

    @Override // com.ironsource.Oc
    public void a(@Nullable C8 c82, @NotNull C4283u8 c4283u8) {
        tn.p.k(c4283u8, "error");
        sn.l<Result<? extends C8>, bn.r> lVarI = i();
        Result.a aVar = Result.Companion;
        lVarI.invoke(Result.m7533boximpl(Result.m7534constructorimpl(kotlin.c.a(new Exception("Unable to download mobileController.html: " + c4283u8.b())))));
    }

    @Override // com.ironsource.InterfaceC4104k5
    public void b(@NotNull C8 c82) {
        tn.p.k(c82, "<set-?>");
        this.f33078e = c82;
    }

    @Override // com.ironsource.InterfaceC4104k5
    @NotNull
    public String c() {
        return this.f33075b;
    }

    @Override // com.ironsource.InterfaceC4104k5
    @NotNull
    public InterfaceC3944b6 d() {
        return this.f33074a;
    }

    @Override // com.ironsource.InterfaceC4104k5
    @NotNull
    public sn.l<Result<? extends C8>, bn.r> i() {
        return this.f33077d;
    }

    @Override // com.ironsource.InterfaceC4104k5
    @NotNull
    public C8 k() {
        return this.f33078e;
    }

    @Override // com.ironsource.InterfaceC4104k5
    @NotNull
    public C7 l() {
        return this.f33076c;
    }
}
