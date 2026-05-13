package kl;

import bo.a0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Text.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f73158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73159b;

    public k(@NotNull String str) {
        tn.p.k(str, "content");
        this.f73158a = str;
        int length = str.length();
        int lowerCase = 0;
        for (int i10 = 0; i10 < length; i10++) {
            lowerCase = (lowerCase * 31) + Character.toLowerCase(str.charAt(i10));
        }
        this.f73159b = lowerCase;
    }

    @NotNull
    public final String a() {
        return this.f73158a;
    }

    public boolean equals(@Nullable Object obj) {
        String str;
        k kVar = obj instanceof k ? (k) obj : null;
        return (kVar == null || (str = kVar.f73158a) == null || !a0.J(str, this.f73158a, true)) ? false : true;
    }

    public int hashCode() {
        return this.f73159b;
    }

    @NotNull
    public String toString() {
        return this.f73158a;
    }
}
