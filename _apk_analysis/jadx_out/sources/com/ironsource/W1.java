package com.ironsource;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class W1 implements X1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4182o9 f30616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.ironsource.mediationsdk.d f30617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final C3976d2 f30618c;

    public W1(@NotNull C4182o9 c4182o9, @NotNull com.ironsource.mediationsdk.d dVar, @Nullable C3976d2 c3976d2) {
        tn.p.k(c4182o9, "instanceInfo");
        tn.p.k(dVar, "auctionDataUtils");
        this.f30616a = c4182o9;
        this.f30617b = dVar;
        this.f30618c = c3976d2;
    }

    private final void a(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f30617b.a(str, this.f30616a.e(), com.ironsource.mediationsdk.d.b().a(it.next(), this.f30616a.e(), this.f30616a.f(), this.f30616a.d(), "", "", "", ""));
        }
    }

    @Override // com.ironsource.X1
    public void a(@NotNull String str) {
        List<String> listM;
        tn.p.k(str, "methodName");
        C3976d2 c3976d2 = this.f30618c;
        if (c3976d2 == null || (listM = c3976d2.b()) == null) {
            listM = cn.w.m();
        }
        a(listM, str);
    }

    @Override // com.ironsource.X1
    public void b(@NotNull String str) {
        List<String> listM;
        tn.p.k(str, "methodName");
        C3976d2 c3976d2 = this.f30618c;
        if (c3976d2 == null || (listM = c3976d2.a()) == null) {
            listM = cn.w.m();
        }
        a(listM, str);
    }

    @Override // com.ironsource.X1
    public void c(@NotNull String str) {
        List<String> listM;
        tn.p.k(str, "methodName");
        C3976d2 c3976d2 = this.f30618c;
        if (c3976d2 == null || (listM = c3976d2.c()) == null) {
            listM = cn.w.m();
        }
        a(listM, str);
    }
}
