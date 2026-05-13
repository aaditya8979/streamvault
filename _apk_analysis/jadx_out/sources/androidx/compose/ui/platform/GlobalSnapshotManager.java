package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import com.ironsource.C3978d4;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: compiled from: GlobalSnapshotManager.android.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "Lbn/r;", "ensureStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", C3978d4.i.f31332d0, "Ljava/util/concurrent/atomic/AtomicBoolean;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class GlobalSnapshotManager {

    @NotNull
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();

    @NotNull
    private static final AtomicBoolean started = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1, reason: invalid class name */
    /* JADX INFO: compiled from: GlobalSnapshotManager.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @jn.d(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {63}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {
        public final /* synthetic */ fo.d<bn.r> $channel;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fo.d<bn.r> dVar, hn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$channel = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<bn.r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            return new AnonymousClass1(this.$channel, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super bn.r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:17:0x0042, B:19:0x004a), top: B:30:0x0042 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003b -> B:16:0x0041). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = in.a.g()
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.L$1
                fo.f r1 = (fo.f) r1
                java.lang.Object r3 = r7.L$0
                fo.o r3 = (fo.o) r3
                kotlin.c.b(r8)     // Catch: java.lang.Throwable -> L63
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r7
                goto L41
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                kotlin.c.b(r8)
                fo.d<bn.r> r3 = r7.$channel
                fo.f r8 = r3.iterator()     // Catch: java.lang.Throwable -> L63
                r1 = r8
                r8 = r7
            L2e:
                r8.L$0 = r3     // Catch: java.lang.Throwable -> L63
                r8.L$1 = r1     // Catch: java.lang.Throwable -> L63
                r8.label = r2     // Catch: java.lang.Throwable -> L63
                java.lang.Object r4 = r1.a(r8)     // Catch: java.lang.Throwable -> L63
                if (r4 != r0) goto L3b
                return r0
            L3b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r3
                r3 = r1
                r1 = r6
            L41:
                r5 = 0
                java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L60
                boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L60
                if (r8 == 0) goto L5a
                java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> L60
                bn.r r8 = (bn.r) r8     // Catch: java.lang.Throwable -> L60
                androidx.compose.runtime.snapshots.Snapshot$Companion r8 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE     // Catch: java.lang.Throwable -> L60
                r8.sendApplyNotifications()     // Catch: java.lang.Throwable -> L60
                r8 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L2e
            L5a:
                fo.i.a(r4, r5)
                bn.r r8 = bn.r.f5635a
                return r8
            L60:
                r8 = move-exception
                r3 = r4
                goto L64
            L63:
                r8 = move-exception
            L64:
                throw r8     // Catch: java.lang.Throwable -> L65
            L65:
                r0 = move-exception
                fo.i.a(r3, r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            final fo.d dVarB = fo.g.b(-1, null, null, 6, null);
            p000do.i.d(kotlinx.coroutines.d.a(AndroidUiDispatcher.INSTANCE.getMain()), null, null, new AnonymousClass1(dVarB, null), 3, null);
            Snapshot.INSTANCE.registerGlobalWriteObserver(new sn.l<Object, bn.r>() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager.ensureStarted.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ bn.r invoke(Object obj) {
                    invoke2(obj);
                    return bn.r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Object obj) {
                    tn.p.k(obj, "it");
                    dVarB.i(bn.r.f5635a);
                }
            });
        }
    }
}
