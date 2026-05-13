package com.ironsource;

import com.ironsource.L8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4149me implements L8, L8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private C4131le f32307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32308b;

    @Override // com.ironsource.L8
    @Nullable
    public C3931ab a() {
        C4131le c4131le = this.f32307a;
        if (c4131le != null) {
            return new C3931ab(c4131le);
        }
        return null;
    }

    @Override // com.ironsource.L8.a
    public void a(@NotNull C4131le c4131le) {
        tn.p.k(c4131le, "sdkConfig");
        this.f32307a = c4131le;
    }

    @Override // com.ironsource.L8
    @Nullable
    public Q9 b() {
        C4131le c4131le = this.f32307a;
        if (c4131le != null) {
            return new Q9(c4131le);
        }
        return null;
    }

    @Override // com.ironsource.L8
    public boolean c() {
        return this.f32308b;
    }

    @Override // com.ironsource.L8.a
    public void d() {
        this.f32308b = true;
    }
}
