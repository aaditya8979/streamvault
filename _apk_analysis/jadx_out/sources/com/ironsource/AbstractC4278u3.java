package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC4278u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f34189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final C4059hd f34191d;

    public AbstractC4278u3(int i10, @NotNull String str, boolean z10, @Nullable C4059hd c4059hd) {
        tn.p.k(str, "placementName");
        this.f34188a = i10;
        this.f34189b = str;
        this.f34190c = z10;
        this.f34191d = c4059hd;
    }

    public /* synthetic */ AbstractC4278u3(int i10, String str, boolean z10, C4059hd c4059hd, int i11, tn.i iVar) {
        this((i11 & 1) != 0 ? 0 : i10, str, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? null : c4059hd);
    }

    @Nullable
    public final C4059hd a() {
        return this.f34191d;
    }

    public final boolean a(int i10) {
        return this.f34188a == i10;
    }

    public final int b() {
        return this.f34188a;
    }

    @NotNull
    public final String c() {
        return this.f34189b;
    }

    public final boolean d() {
        return this.f34190c;
    }

    @NotNull
    public String toString() {
        return "placement name: " + this.f34189b;
    }
}
