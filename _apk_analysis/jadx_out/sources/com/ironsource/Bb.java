package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Bb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f28853c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f28854d = "revenue";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f28855e = "precision";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f28856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f28857b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final Bb a(@NotNull JSONObject jSONObject) {
            tn.p.k(jSONObject, "json");
            try {
                double d10 = jSONObject.getDouble("revenue");
                String string = jSONObject.getString("precision");
                tn.p.j(string, "precision");
                return new Bb(d10, string);
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                C4324wf.a(e10);
                return null;
            }
        }
    }

    public Bb(double d10, @NotNull String str) {
        tn.p.k(str, "precision");
        this.f28856a = d10;
        this.f28857b = str;
    }

    public static /* synthetic */ Bb a(Bb bb2, double d10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = bb2.f28856a;
        }
        if ((i10 & 2) != 0) {
            str = bb2.f28857b;
        }
        return bb2.a(d10, str);
    }

    @Nullable
    public static final Bb a(@NotNull JSONObject jSONObject) {
        return f28853c.a(jSONObject);
    }

    public final double a() {
        return this.f28856a;
    }

    @NotNull
    public final Bb a(double d10, @NotNull String str) {
        tn.p.k(str, "precision");
        return new Bb(d10, str);
    }

    @NotNull
    public final String b() {
        return this.f28857b;
    }

    @NotNull
    public final String c() {
        return this.f28857b;
    }

    public final double d() {
        return this.f28856a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bb)) {
            return false;
        }
        Bb bb2 = (Bb) obj;
        return Double.compare(this.f28856a, bb2.f28856a) == 0 && tn.p.f(this.f28857b, bb2.f28857b);
    }

    public int hashCode() {
        return (Double.hashCode(this.f28856a) * 31) + this.f28857b.hashCode();
    }

    @NotNull
    public String toString() {
        return "LoadArmData(revenue=" + this.f28856a + ", precision=" + this.f28857b + ")";
    }
}
