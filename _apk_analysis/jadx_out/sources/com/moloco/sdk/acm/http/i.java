package com.moloco.sdk.acm.http;

import com.moloco.sdk.b1;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<b1.b> f45874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<b1.c> f45875b;

    public i(@NotNull List<b1.b> list, @NotNull List<b1.c> list2) {
        p.k(list, "counts");
        p.k(list2, "timers");
        this.f45874a = list;
        this.f45875b = list2;
    }

    @NotNull
    public final List<b1.b> a() {
        return this.f45874a;
    }

    @NotNull
    public final List<b1.c> b() {
        return this.f45875b;
    }
}
