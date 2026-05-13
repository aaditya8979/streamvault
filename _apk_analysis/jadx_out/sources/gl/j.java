package gl;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpHeaderValueParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f62549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f62550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f62551c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(@NotNull String str, @NotNull String str2) {
        this(str, str2, false);
        tn.p.k(str, "name");
        tn.p.k(str2, "value");
    }

    public j(@NotNull String str, @NotNull String str2, boolean z10) {
        tn.p.k(str, "name");
        tn.p.k(str2, "value");
        this.f62549a = str;
        this.f62550b = str2;
        this.f62551c = z10;
    }

    @NotNull
    public final String a() {
        return this.f62549a;
    }

    @NotNull
    public final String b() {
        return this.f62550b;
    }

    @NotNull
    public final String c() {
        return this.f62549a;
    }

    @NotNull
    public final String d() {
        return this.f62550b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (bo.a0.J(jVar.f62549a, this.f62549a, true) && bo.a0.J(jVar.f62550b, this.f62550b, true)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f62549a;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        tn.p.j(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f62550b.toLowerCase(locale);
        tn.p.j(lowerCase2, "toLowerCase(...)");
        return iHashCode + (iHashCode * 31) + lowerCase2.hashCode();
    }

    @NotNull
    public String toString() {
        return "HeaderValueParam(name=" + this.f62549a + ", value=" + this.f62550b + ", escapeValue=" + this.f62551c + ')';
    }
}
