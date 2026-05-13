package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f49876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Integer f49877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Integer f49878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f49879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f49880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final h f49881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final e f49882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final List<y> f49883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final List<a0> f49884i;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable String str3, @Nullable h hVar, @Nullable e eVar, @NotNull List<y> list, @NotNull List<? extends a0> list2) {
        tn.p.k(list, "creativeViewTrackingList");
        tn.p.k(list2, "resources");
        this.f49876a = str;
        this.f49877b = num;
        this.f49878c = num2;
        this.f49879d = str2;
        this.f49880e = str3;
        this.f49881f = hVar;
        this.f49882g = eVar;
        this.f49883h = list;
        this.f49884i = list2;
    }

    @Nullable
    public final String a() {
        return this.f49880e;
    }

    @Nullable
    public final h b() {
        return this.f49881f;
    }

    @NotNull
    public final List<y> c() {
        return this.f49883h;
    }

    @Nullable
    public final Integer d() {
        return this.f49878c;
    }

    @NotNull
    public final List<a0> e() {
        return this.f49884i;
    }

    @Nullable
    public final Integer f() {
        return this.f49877b;
    }
}
