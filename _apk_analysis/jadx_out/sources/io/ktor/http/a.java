package io.ktor.http;

import bn.r;
import cn.w0;
import io.ktor.http.b;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Parameters.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f71178c = new a();

    @Override // kl.t
    @Nullable
    public List<String> a(@NotNull String str) {
        p.k(str, "name");
        return null;
    }

    @Override // kl.t
    public boolean b() {
        return true;
    }

    @Override // kl.t
    public void c(@NotNull sn.p<? super String, ? super List<String>, r> pVar) {
        b.C0843b.a(this, pVar);
    }

    @Override // kl.t
    @NotNull
    public Set<Map.Entry<String, List<String>>> entries() {
        return w0.f();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof b) && ((b) obj).isEmpty();
    }

    @Override // kl.t
    public boolean isEmpty() {
        return true;
    }

    @Override // kl.t
    @NotNull
    public Set<String> names() {
        return w0.f();
    }

    @NotNull
    public String toString() {
        return "Parameters " + entries();
    }
}
