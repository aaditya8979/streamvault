package com.moloco.sdk.internal.services.bidtoken;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f47191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f47192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f47193c;

    public n(@NotNull String str, @NotNull String str2, @NotNull h hVar) {
        tn.p.k(str, "bidToken");
        tn.p.k(str2, "publicKey");
        tn.p.k(hVar, "bidTokenConfig");
        this.f47191a = str;
        this.f47192b = str2;
        this.f47193c = hVar;
    }

    @NotNull
    public final String a() {
        return this.f47191a;
    }

    @NotNull
    public final h b() {
        return this.f47193c;
    }

    @NotNull
    public final String c() {
        return this.f47192b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return tn.p.f(this.f47191a, nVar.f47191a) && tn.p.f(this.f47192b, nVar.f47192b) && tn.p.f(this.f47193c, nVar.f47193c);
    }

    public int hashCode() {
        return (((this.f47191a.hashCode() * 31) + this.f47192b.hashCode()) * 31) + this.f47193c.hashCode();
    }

    @NotNull
    public String toString() {
        return "BidTokenResponseComponents(bidToken=" + this.f47191a + ", publicKey=" + this.f47192b + ", bidTokenConfig=" + this.f47193c + ')';
    }
}
