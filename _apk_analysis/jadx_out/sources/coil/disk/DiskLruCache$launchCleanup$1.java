package coil.disk;

import bn.r;
import hn.c;
import in.a;
import java.io.IOException;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@d(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
public final class DiskLruCache$launchCleanup$1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public int label;
    public final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$launchCleanup$1(DiskLruCache diskLruCache, c<? super DiskLruCache$launchCleanup$1> cVar) {
        super(2, cVar);
        this.this$0 = diskLruCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new DiskLruCache$launchCleanup$1(this.this$0, cVar);
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
        return ((DiskLruCache$launchCleanup$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        DiskLruCache diskLruCache = this.this$0;
        synchronized (diskLruCache) {
            if (!diskLruCache.initialized || diskLruCache.closed) {
                return r.f5635a;
            }
            try {
                diskLruCache.O();
            } catch (IOException unused) {
                diskLruCache.mostRecentTrimFailed = true;
            }
            try {
                if (diskLruCache.G()) {
                    diskLruCache.Q();
                }
            } catch (IOException unused2) {
                diskLruCache.mostRecentRebuildFailed = true;
                diskLruCache.journalWriter = Okio.buffer(Okio.blackhole());
            }
            return r.f5635a;
        }
    }
}
