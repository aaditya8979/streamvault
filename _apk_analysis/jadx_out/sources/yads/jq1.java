package yads;

import java.util.NoSuchElementException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class jq1 {
    public static ih2 a() {
        zg2.f97570f.b();
        boolean z10 = ad1.f87661a;
        return jh2.a();
    }

    public static ih2 a(String str) {
        zg2 zg2Var = zg2.f97570f;
        boolean z10 = ad1.f87661a;
        return jh2.a(str, zg2Var.b(), Integer.valueOf(zg2Var.a()));
    }

    public static ih2 a(String str, Exception exc) {
        zg2 zg2Var = exc instanceof TimeoutCancellationException ? zg2.f97568d : exc instanceof IllegalArgumentException ? zg2.f97569e : exc instanceof NoSuchElementException ? zg2.f97570f : zg2.f97571g;
        boolean z10 = ad1.f87661a;
        return jh2.a(str, zg2Var.b(), Integer.valueOf(zg2Var.a()));
    }
}
