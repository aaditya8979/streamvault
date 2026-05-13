package com.ironsource;

import com.ironsource.C3978d4;
import com.ironsource.Y5;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3955c implements InterfaceC4104k5<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3944b6 f31081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f31082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7 f31083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final sn.l<Result<? extends JSONObject>, bn.r> f31084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private C8 f31085e;

    /* JADX WARN: Multi-variable type inference failed */
    public C3955c(@NotNull InterfaceC3944b6 interfaceC3944b6, @NotNull String str, @NotNull C7 c72, @NotNull sn.l<? super Result<? extends JSONObject>, bn.r> lVar) {
        tn.p.k(interfaceC3944b6, Y5.c.f30723a);
        tn.p.k(str, "destinationPath");
        tn.p.k(c72, "downloadManager");
        tn.p.k(lVar, "onFinish");
        this.f31081a = interfaceC3944b6;
        this.f31082b = str;
        this.f31083c = c72;
        this.f31084d = lVar;
        this.f31085e = new C8(c(), C3978d4.f31188i);
    }

    private final JSONObject c(C8 c82) {
        return IronSourceVideoBridge.jsonObjectInit(IronSourceStorageUtils.readFile(c82));
    }

    @Override // com.ironsource.Oc
    public void a(@NotNull C8 c82) {
        tn.p.k(c82, C3978d4.i.f31327b);
        if (tn.p.f(c82.getName(), C3978d4.f31188i)) {
            try {
                i().invoke(Result.m7533boximpl(Result.m7534constructorimpl(c(c82))));
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                sn.l<Result<? extends JSONObject>, bn.r> lVarI = i();
                Result.a aVar = Result.Companion;
                lVarI.invoke(Result.m7533boximpl(Result.m7534constructorimpl(kotlin.c.a(e10))));
            }
        }
    }

    @Override // com.ironsource.Oc
    public void a(@Nullable C8 c82, @NotNull C4283u8 c4283u8) {
        tn.p.k(c4283u8, "error");
        sn.l<Result<? extends JSONObject>, bn.r> lVarI = i();
        Result.a aVar = Result.Companion;
        lVarI.invoke(Result.m7533boximpl(Result.m7534constructorimpl(kotlin.c.a(new Exception("Unable to download abTestMap.json: " + c4283u8.b())))));
    }

    @Override // com.ironsource.InterfaceC4104k5
    public void b(@NotNull C8 c82) {
        tn.p.k(c82, "<set-?>");
        this.f31085e = c82;
    }

    @Override // com.ironsource.InterfaceC4104k5
    @NotNull
    public String c() {
        return this.f31082b;
    }

    @Override // com.ironsource.InterfaceC4104k5
    @NotNull
    public InterfaceC3944b6 d() {
        return this.f31081a;
    }

    @Override // com.ironsource.InterfaceC4104k5
    @NotNull
    public sn.l<Result<? extends JSONObject>, bn.r> i() {
        return this.f31084d;
    }

    @Override // com.ironsource.InterfaceC4104k5
    @NotNull
    public C8 k() {
        return this.f31085e;
    }

    @Override // com.ironsource.InterfaceC4104k5
    @NotNull
    public C7 l() {
        return this.f31083c;
    }
}
