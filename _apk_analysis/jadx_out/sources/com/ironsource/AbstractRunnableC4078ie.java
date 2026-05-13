package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractRunnableC4078ie implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f31961a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.ie$a */
    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.ie$a$a, reason: collision with other inner class name */
        public static final class C0388a extends AbstractRunnableC4078ie {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sn.a<bn.r> f31962b;

            public C0388a(sn.a<bn.r> aVar) {
                this.f31962b = aVar;
            }

            @Override // com.ironsource.AbstractRunnableC4078ie
            public void a() {
                this.f31962b.invoke();
            }
        }

        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final AbstractRunnableC4078ie a(@NotNull sn.a<bn.r> aVar) {
            tn.p.k(aVar, "block");
            return new C0388a(aVar);
        }
    }

    public abstract void a() throws Exception;

    public void a(@NotNull Throwable th2) {
        tn.p.k(th2, "t");
        C4324wf.a(th2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            try {
                a(th2);
            } catch (Throwable th3) {
                C4228r4.d().a(th3);
            }
        }
    }
}
