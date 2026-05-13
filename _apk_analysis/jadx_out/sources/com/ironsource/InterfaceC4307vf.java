package com.ironsource;

import com.ironsource.W6;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC4307vf {

    /* JADX INFO: renamed from: com.ironsource.vf$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final W6.a.InterfaceC0367a f34280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f34281b;

        public a(@NotNull W6.a.InterfaceC0367a interfaceC0367a) {
            tn.p.k(interfaceC0367a, "onCancel");
            this.f34280a = interfaceC0367a;
        }

        public final void a() {
            this.f34280a.cancel();
            this.f34281b = true;
        }

        public final boolean b() {
            return this.f34281b;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.vf$b */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f34282b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final AbstractRunnableC4078ie f34283a;

        /* JADX INFO: renamed from: com.ironsource.vf$b$a */
        public static final class a {

            /* JADX INFO: renamed from: com.ironsource.vf$b$a$a, reason: collision with other inner class name */
            public static final class C0409a extends AbstractRunnableC4078ie {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WeakReference<T> f34284b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ sn.l<T, bn.r> f34285c;

                /* JADX WARN: Multi-variable type inference failed */
                public C0409a(WeakReference<T> weakReference, sn.l<? super T, bn.r> lVar) {
                    this.f34284b = weakReference;
                    this.f34285c = lVar;
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // com.ironsource.AbstractRunnableC4078ie
                public void a() {
                    Object obj = this.f34284b.get();
                    if (obj != null) {
                        this.f34285c.invoke((T) obj);
                    }
                }
            }

            private a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final <T> b a(T t10, @NotNull sn.l<? super T, bn.r> lVar) {
                tn.p.k(lVar, "block");
                return new b(new C0409a(new WeakReference(t10), lVar), null);
            }
        }

        private b(AbstractRunnableC4078ie abstractRunnableC4078ie) {
            this.f34283a = abstractRunnableC4078ie;
        }

        public /* synthetic */ b(AbstractRunnableC4078ie abstractRunnableC4078ie, tn.i iVar) {
            this(abstractRunnableC4078ie);
        }

        @NotNull
        public final AbstractRunnableC4078ie a() {
            return this.f34283a;
        }
    }

    @NotNull
    a a(@NotNull b bVar, long j10);

    @NotNull
    a a(@NotNull Runnable runnable, long j10);
}
