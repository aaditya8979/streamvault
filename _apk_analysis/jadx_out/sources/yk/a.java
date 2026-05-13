package yk;

import bn.r;
import com.ironsource.C3978d4;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.android.AndroidClientEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;
import xk.g;

/* JADX INFO: compiled from: Android.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements g<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f97886a = new a();

    @Override // xk.g
    @NotNull
    public HttpClientEngine a(@NotNull l<? super e, r> lVar) {
        p.k(lVar, "block");
        e eVar = new e();
        lVar.invoke(eVar);
        return new AndroidClientEngine(eVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 885084173;
    }

    @NotNull
    public String toString() {
        return C3978d4.f31183d;
    }
}
