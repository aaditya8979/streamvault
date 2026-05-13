package io.ktor.http;

import bn.r;
import java.util.List;
import kl.t;
import org.jetbrains.annotations.NotNull;
import sn.p;

/* JADX INFO: compiled from: Parameters.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface b extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f71179b = a.f71180a;

    /* JADX INFO: compiled from: Parameters.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f71180a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f71181b = io.ktor.http.a.f71178c;

        @NotNull
        public final b a() {
            return f71181b;
        }
    }

    /* JADX INFO: renamed from: io.ktor.http.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Parameters.kt */
    public static final class C0843b {
        public static void a(@NotNull b bVar, @NotNull p<? super String, ? super List<String>, r> pVar) {
            tn.p.k(pVar, "body");
            t.a.a(bVar, pVar);
        }
    }
}
