package com.moloco.sdk.internal.services.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.scheduling.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import p000do.i;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
public final class b implements com.moloco.sdk.internal.services.analytics.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final l f47113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f47114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f47115c;

    @d(c = "com.moloco.sdk.internal.services.analytics.AnalyticsServiceImpl$recordApplicationBackground$1", f = "AnalyticsService.kt", l = {48}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47116a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f47118c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, c<? super a> cVar) {
            super(2, cVar);
            this.f47118c = j10;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return b.this.new a(this.f47118c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47116a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = b.this.f47114b;
                long j10 = this.f47118c;
                a.AbstractC0696a.C0697a c0697a = a.AbstractC0696a.C0697a.f50938a;
                String strA = b.this.f47115c.a();
                this.f47116a = 1;
                obj = aVar.a(j10, c0697a, strA, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            b.this.f47113a.a((String) obj);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.services.analytics.b$b, reason: collision with other inner class name */
    @d(c = "com.moloco.sdk.internal.services.analytics.AnalyticsServiceImpl$recordApplicationForeground$1", f = "AnalyticsService.kt", l = {31}, m = "invokeSuspend")
    public static final class C0581b extends SuspendLambda implements p<l0, c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47119a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f47121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f47122d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0581b(long j10, long j11, c<? super C0581b> cVar) {
            super(2, cVar);
            this.f47121c = j10;
            this.f47122d = j11;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, c<? super r> cVar) {
            return ((C0581b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return b.this.new C0581b(this.f47121c, this.f47122d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47119a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = b.this.f47114b;
                long j10 = this.f47121c;
                a.AbstractC0696a.b bVar = new a.AbstractC0696a.b(this.f47122d);
                String strD = b.this.f47115c.d();
                this.f47119a = 1;
                obj = aVar.a(j10, bVar, strD, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            b.this.f47113a.a((String) obj);
            return r.f5635a;
        }
    }

    public b(@NotNull l lVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar) {
        tn.p.k(lVar, "persistentHttpRequest");
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(bVar, "configService");
        this.f47113a = lVar;
        this.f47114b = aVar;
        this.f47115c = bVar;
    }

    @Override // com.moloco.sdk.internal.services.analytics.a
    public void a(long j10) {
        if (!this.f47115c.c() || this.f47115c.a().length() <= 0) {
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AnalyticsService", "Recording applicationBackground with timestamp: " + j10, false, 4, null);
        i.d(e.f47086a.a(), null, null, new a(j10, null), 3, null);
    }

    @Override // com.moloco.sdk.internal.services.analytics.a
    public void a(long j10, long j11) {
        if (!this.f47115c.c() || this.f47115c.d().length() <= 0) {
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AnalyticsService", "Recording applicationForeground with timestamp: " + j10 + ", lastBgTimestamp: " + j11, false, 4, null);
        i.d(e.f47086a.a(), null, null, new C0581b(j10, j11, null), 3, null);
    }
}
