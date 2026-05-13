package com.ironsource;

import android.os.Handler;
import com.ironsource.InterfaceC4307vf;
import com.ironsource.W6;
import com.ironsource.X6;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class X6 {

    public static final class a implements W6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Handler f30664a;

        public a(Handler handler) {
            this.f30664a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Handler handler, Runnable runnable) {
            tn.p.k(handler, "$this_asScheduler");
            tn.p.k(runnable, "$runnable");
            handler.removeCallbacks(runnable);
        }

        @Override // com.ironsource.W6.a
        @NotNull
        public W6.a.InterfaceC0367a a(@NotNull final Runnable runnable, long j10) {
            tn.p.k(runnable, "runnable");
            this.f30664a.postDelayed(runnable, j10);
            final Handler handler = this.f30664a;
            return new W6.a.InterfaceC0367a() { // from class: com.ironsource.vj
                @Override // com.ironsource.W6.a.InterfaceC0367a
                public final void cancel() {
                    X6.a.a(handler, runnable);
                }
            };
        }
    }

    @NotNull
    public static final W6.a a(@NotNull Handler handler) {
        tn.p.k(handler, "<this>");
        return new a(handler);
    }

    @NotNull
    public static final <T> InterfaceC4307vf.b a(T t10, @NotNull sn.l<? super T, bn.r> lVar) {
        tn.p.k(lVar, "block");
        return InterfaceC4307vf.b.f34282b.a(t10, lVar);
    }
}
