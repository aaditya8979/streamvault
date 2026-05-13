package com.moloco.sdk.internal.publisher.nativead.model;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.g;
import com.moloco.sdk.internal.publisher.nativead.model.a;
import com.moloco.sdk.internal.publisher.nativead.model.b;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<Integer, b.a> f46864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<Integer, b.C0576b> f46865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<Integer, b.c> f46866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<Integer, b.d> f46867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<Pair<a.AbstractC0574a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> f46868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final g f46869f;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull Map<Integer, b.a> map, @NotNull Map<Integer, b.C0576b> map2, @NotNull Map<Integer, b.c> map3, @NotNull Map<Integer, b.d> map4, @NotNull List<? extends Pair<? extends a.AbstractC0574a, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> list) {
        p.k(map, "data");
        p.k(map2, "images");
        p.k(map3, "titles");
        p.k(map4, "videos");
        p.k(list, "failedAssets");
        this.f46864a = map;
        this.f46865b = map2;
        this.f46866c = map3;
        this.f46867d = map4;
        this.f46868e = list;
        this.f46869f = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.publisher.nativead.model.c
            @Override // sn.a
            public final Object invoke() {
                return d.b(this.f46863b);
            }
        });
    }

    public static final Map b(d dVar) {
        return kotlin.collections.a.q(kotlin.collections.a.q(kotlin.collections.a.q(dVar.f46864a, dVar.f46865b), dVar.f46866c), dVar.f46867d);
    }

    @Nullable
    public final String a(int i10) {
        b.a aVar = this.f46864a.get(Integer.valueOf(i10));
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    @Nullable
    public final Uri c(int i10) {
        b.C0576b c0576b = this.f46865b.get(Integer.valueOf(i10));
        if (c0576b != null) {
            return c0576b.b();
        }
        return null;
    }

    @Nullable
    public final String d(int i10) {
        b.c cVar = this.f46866c.get(Integer.valueOf(i10));
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a e(int i10) {
        b.d dVar = this.f46867d.get(Integer.valueOf(i10));
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p.f(this.f46864a, dVar.f46864a) && p.f(this.f46865b, dVar.f46865b) && p.f(this.f46866c, dVar.f46866c) && p.f(this.f46867d, dVar.f46867d) && p.f(this.f46868e, dVar.f46868e);
    }

    public int hashCode() {
        return (((((((this.f46864a.hashCode() * 31) + this.f46865b.hashCode()) * 31) + this.f46866c.hashCode()) * 31) + this.f46867d.hashCode()) * 31) + this.f46868e.hashCode();
    }

    @NotNull
    public String toString() {
        return "PreparedNativeAssets(data=" + this.f46864a + ", images=" + this.f46865b + ", titles=" + this.f46866c + ", videos=" + this.f46867d + ", failedAssets=" + this.f46868e + ')';
    }
}
