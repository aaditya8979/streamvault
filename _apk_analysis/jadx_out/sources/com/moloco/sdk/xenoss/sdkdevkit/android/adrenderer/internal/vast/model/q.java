package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final f f49913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f49914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f49915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f49916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final u f49917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<p> f49918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<String> f49919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final List<j> f49920h;

    public q(@Nullable f fVar, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable u uVar, @NotNull List<p> list, @NotNull List<String> list2, @NotNull List<j> list3) {
        tn.p.k(list, "impressions");
        tn.p.k(list2, "errorUrls");
        tn.p.k(list3, "creatives");
        this.f49913a = fVar;
        this.f49914b = str;
        this.f49915c = str2;
        this.f49916d = str3;
        this.f49917e = uVar;
        this.f49918f = list;
        this.f49919g = list2;
        this.f49920h = list3;
    }

    @NotNull
    public final List<j> a() {
        return this.f49920h;
    }

    @NotNull
    public final List<String> b() {
        return this.f49919g;
    }

    @NotNull
    public final List<p> c() {
        return this.f49918f;
    }
}
