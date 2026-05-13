package com.ironsource;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4095je extends ScheduledThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final sn.l<Throwable, bn.r> f32080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final sn.l<String, bn.r> f32081b;

    /* JADX INFO: renamed from: com.ironsource.je$a */
    public static final class a extends Lambda implements sn.l<Throwable, bn.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32082a = new a();

        public a() {
            super(1);
        }

        public final void a(@Nullable Throwable th2) {
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ bn.r invoke(Throwable th2) {
            a(th2);
            return bn.r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.je$b */
    public static final class b extends Lambda implements sn.l<String, bn.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32083a = new b();

        public b() {
            super(1);
        }

        public final void a(@NotNull String str) {
            tn.p.k(str, "it");
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ bn.r invoke(String str) {
            a(str);
            return bn.r.f5635a;
        }
    }

    public C4095je() {
        this(0, null, null, 7, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4095je(int i10, @NotNull sn.l<? super Throwable, bn.r> lVar, @NotNull sn.l<? super String, bn.r> lVar2) {
        super(i10, new ThreadFactoryC4074ia());
        tn.p.k(lVar, CrashEvent.f52788e);
        tn.p.k(lVar2, CreativeInfo.f52469an);
        this.f32080a = lVar;
        this.f32081b = lVar2;
    }

    public /* synthetic */ C4095je(int i10, sn.l lVar, sn.l lVar2, int i11, tn.i iVar) {
        this((i11 & 1) != 0 ? C4113ke.f32171a : i10, (i11 & 2) != 0 ? a.f32082a : lVar, (i11 & 4) != 0 ? b.f32083a : lVar2);
    }

    private final String a(String str) {
        return C4095je.class.getName() + " RuntimeException caught: " + str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(@Nullable Runnable runnable, @Nullable Throwable th2) {
        super.afterExecute(runnable, th2);
        if (th2 != null) {
            this.f32081b.invoke(a(th2.toString()));
            this.f32080a.invoke(th2);
            return;
        }
        if ((runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e10) {
                C4228r4.d().a(e10);
                this.f32081b.invoke(a(e10.toString()));
                Thread.currentThread().interrupt();
            } catch (CancellationException e11) {
                C4228r4.d().a(e11);
                this.f32081b.invoke(a(e11.toString()));
                this.f32080a.invoke(e11);
            } catch (ExecutionException e12) {
                C4228r4.d().a(e12);
                this.f32081b.invoke(a(e12.toString()));
                this.f32080a.invoke(e12.getCause());
            }
        }
    }
}
