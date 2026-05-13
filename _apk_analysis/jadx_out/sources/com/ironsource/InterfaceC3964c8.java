package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.c8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3964c8<T> {

    /* JADX INFO: renamed from: com.ironsource.c8$a */
    public static class a<ListenerType> implements InterfaceC3964c8<ListenerType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private ListenerType f31132a;

        /* JADX INFO: renamed from: com.ironsource.c8$a$a, reason: collision with other inner class name */
        public static final class C0384a extends AbstractRunnableC4078ie {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Runnable f31133b;

            public C0384a(Runnable runnable) {
                this.f31133b = runnable;
            }

            @Override // com.ironsource.AbstractRunnableC4078ie
            public void a() {
                this.f31133b.run();
            }
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            aVar.a(runnable, z10);
        }

        @Nullable
        public final ListenerType a() {
            return this.f31132a;
        }

        @Override // com.ironsource.InterfaceC3964c8
        public void a(ListenerType listenertype) {
            this.f31132a = listenertype;
        }

        public final void a(@NotNull Runnable runnable, boolean z10) {
            tn.p.k(runnable, "runnable");
            if (z10) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C0384a(runnable), 0L, 2, null);
            }
        }

        public final void a(@NotNull String str, @NotNull String str2) {
            tn.p.k(str, "instanceId");
            tn.p.k(str2, "message");
            IronLog.CALLBACK.info(str2 + " instanceId=" + str);
        }

        public final void b(@Nullable ListenerType listenertype) {
            this.f31132a = listenertype;
        }
    }

    void a(T t10);
}
