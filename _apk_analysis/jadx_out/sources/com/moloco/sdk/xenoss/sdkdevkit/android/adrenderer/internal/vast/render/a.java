package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f49985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final c f49986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<String> f49987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<String> f49988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final o0 f49989e;

    public a(@NotNull f fVar, @Nullable c cVar, @NotNull List<String> list, @NotNull List<String> list2, @Nullable o0 o0Var) {
        tn.p.k(fVar, "linear");
        tn.p.k(list, "impressionTracking");
        tn.p.k(list2, "errorTracking");
        this.f49985a = fVar;
        this.f49986b = cVar;
        this.f49987c = list;
        this.f49988d = list2;
        this.f49989e = o0Var;
    }

    public /* synthetic */ a(f fVar, c cVar, List list, List list2, o0 o0Var, int i10, tn.i iVar) {
        this(fVar, cVar, list, list2, (i10 & 16) != 0 ? null : o0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a a(a aVar, f fVar, c cVar, List list, List list2, o0 o0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = aVar.f49985a;
        }
        if ((i10 & 2) != 0) {
            cVar = aVar.f49986b;
        }
        c cVar2 = cVar;
        if ((i10 & 4) != 0) {
            list = aVar.f49987c;
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = aVar.f49988d;
        }
        List list4 = list2;
        if ((i10 & 16) != 0) {
            o0Var = aVar.f49989e;
        }
        return aVar.b(fVar, cVar2, list3, list4, o0Var);
    }

    @NotNull
    public final a b(@NotNull f fVar, @Nullable c cVar, @NotNull List<String> list, @NotNull List<String> list2, @Nullable o0 o0Var) {
        tn.p.k(fVar, "linear");
        tn.p.k(list, "impressionTracking");
        tn.p.k(list2, "errorTracking");
        return new a(fVar, cVar, list, list2, o0Var);
    }

    @Nullable
    public final c c() {
        return this.f49986b;
    }

    @Nullable
    public final o0 d() {
        return this.f49989e;
    }

    @NotNull
    public final List<String> e() {
        return this.f49988d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return tn.p.f(this.f49985a, aVar.f49985a) && tn.p.f(this.f49986b, aVar.f49986b) && tn.p.f(this.f49987c, aVar.f49987c) && tn.p.f(this.f49988d, aVar.f49988d) && tn.p.f(this.f49989e, aVar.f49989e);
    }

    @NotNull
    public final List<String> f() {
        return this.f49987c;
    }

    @NotNull
    public final f g() {
        return this.f49985a;
    }

    public int hashCode() {
        int iHashCode = this.f49985a.hashCode() * 31;
        c cVar = this.f49986b;
        int iHashCode2 = (((((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f49987c.hashCode()) * 31) + this.f49988d.hashCode()) * 31;
        o0 o0Var = this.f49989e;
        return iHashCode2 + (o0Var != null ? o0Var.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Ad(linear=" + this.f49985a + ", companion=" + this.f49986b + ", impressionTracking=" + this.f49987c + ", errorTracking=" + this.f49988d + ", dec=" + this.f49989e + ')';
    }
}
