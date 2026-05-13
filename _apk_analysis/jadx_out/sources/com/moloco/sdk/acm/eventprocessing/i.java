package com.moloco.sdk.acm.eventprocessing;

import android.database.sqlite.SQLiteException;
import bn.r;
import cn.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import p000do.w0;
import sn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f45797e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.db.d f45798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.services.f f45799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final g f45800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.services.b f45801d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @jn.d(c = "com.moloco.sdk.acm.eventprocessing.EventProcessorImpl$processCountEvent$2", f = "EventProcessor.kt", l = {49}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45802a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.b f45804c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.acm.b bVar, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f45804c = bVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return i.this.new b(this.f45804c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f45802a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                i iVar = i.this;
                String strC = this.f45804c.c();
                com.moloco.sdk.acm.db.c cVar = com.moloco.sdk.acm.db.c.f45755b;
                long jA = this.f45804c.a();
                List<com.moloco.sdk.acm.c> listB = this.f45804c.b();
                ArrayList arrayList = new ArrayList(x.x(listB, 10));
                Iterator<T> it = listB.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.moloco.sdk.acm.i.a((com.moloco.sdk.acm.c) it.next()));
                }
                this.f45802a = 1;
                if (iVar.e(strC, cVar, jA, arrayList, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.acm.eventprocessing.EventProcessorImpl$processEvent$2", f = "EventProcessor.kt", l = {79, 80}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f45806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f45807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.db.c f45808d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f45809e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List<String> f45810f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, i iVar, com.moloco.sdk.acm.db.c cVar, long j10, List<String> list, hn.c<? super c> cVar2) {
            super(2, cVar2);
            this.f45806b = str;
            this.f45807c = iVar;
            this.f45808d = cVar;
            this.f45809e = j10;
            this.f45810f = list;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((c) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new c(this.f45806b, this.f45807c, this.f45808d, this.f45809e, this.f45810f, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f45805a;
            try {
            } catch (SQLiteException e10) {
                com.moloco.sdk.acm.services.e.f(com.moloco.sdk.acm.services.e.f45892a, "EventProcessor", "Database error: " + e10.getMessage(), false, 4, null);
            } catch (Exception e11) {
                com.moloco.sdk.acm.services.e.f(com.moloco.sdk.acm.services.e.f45892a, "EventProcessor", "Unexpected error while processing event: " + e11.getMessage(), false, 4, null);
            }
            if (i10 == 0) {
                kotlin.c.b(obj);
                this.f45807c.f45798a.a(new com.moloco.sdk.acm.db.b(0L, this.f45806b, this.f45807c.f45799b.invoke(), this.f45808d, jn.a.e(this.f45809e), this.f45810f, 1, null));
                g gVar = this.f45807c.f45800c;
                this.f45805a = 1;
                if (gVar.b(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    return r.f5635a;
                }
                kotlin.c.b(obj);
            }
            com.moloco.sdk.acm.services.b bVar = this.f45807c.f45801d;
            this.f45805a = 2;
            if (bVar.a(this) == objG) {
                return objG;
            }
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.acm.eventprocessing.EventProcessorImpl$processTimerEvent$2", f = "EventProcessor.kt", l = {58, 60}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.e f45812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f45813c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.acm.e eVar, i iVar, hn.c<? super d> cVar) {
            super(2, cVar);
            this.f45812b = eVar;
            this.f45813c = iVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new d(this.f45812b, this.f45813c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f45811a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                if (this.f45812b.c() > 0) {
                    i iVar = this.f45813c;
                    String strB = this.f45812b.b();
                    com.moloco.sdk.acm.db.c cVar = com.moloco.sdk.acm.db.c.f45754a;
                    long jC = this.f45812b.c();
                    List<com.moloco.sdk.acm.c> listA = this.f45812b.a();
                    ArrayList arrayList = new ArrayList(x.x(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        arrayList.add(com.moloco.sdk.acm.i.a((com.moloco.sdk.acm.c) it.next()));
                    }
                    this.f45811a = 1;
                    if (iVar.e(strB, cVar, jC, arrayList, this) == objG) {
                        return objG;
                    }
                } else {
                    i iVar2 = this.f45813c;
                    String str = "negative_time_" + this.f45812b.b();
                    com.moloco.sdk.acm.db.c cVar2 = com.moloco.sdk.acm.db.c.f45754a;
                    long jC2 = this.f45812b.c();
                    List<com.moloco.sdk.acm.c> listA2 = this.f45812b.a();
                    ArrayList arrayList2 = new ArrayList(x.x(listA2, 10));
                    Iterator<T> it2 = listA2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(com.moloco.sdk.acm.i.a((com.moloco.sdk.acm.c) it2.next()));
                    }
                    this.f45811a = 2;
                    if (iVar2.e(str, cVar2, jC2, arrayList2, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    public i(@NotNull com.moloco.sdk.acm.db.d dVar, @NotNull com.moloco.sdk.acm.services.f fVar, @NotNull g gVar, @NotNull com.moloco.sdk.acm.services.b bVar) {
        tn.p.k(dVar, "metricsDAO");
        tn.p.k(fVar, "timeProviderService");
        tn.p.k(gVar, "requestScheduler");
        tn.p.k(bVar, "applicationLifecycle");
        this.f45798a = dVar;
        this.f45799b = fVar;
        this.f45800c = gVar;
        this.f45801d = bVar;
    }

    @Override // com.moloco.sdk.acm.eventprocessing.f
    @Nullable
    public Object a(@NotNull com.moloco.sdk.acm.b bVar, @NotNull hn.c<? super r> cVar) {
        Object objG = p000do.g.g(w0.b(), new b(bVar, null), cVar);
        return objG == in.a.g() ? objG : r.f5635a;
    }

    @Override // com.moloco.sdk.acm.eventprocessing.f
    @Nullable
    public Object b(@NotNull com.moloco.sdk.acm.e eVar, @NotNull hn.c<? super r> cVar) {
        Object objG = p000do.g.g(w0.b(), new d(eVar, this, null), cVar);
        return objG == in.a.g() ? objG : r.f5635a;
    }

    public final Object e(String str, com.moloco.sdk.acm.db.c cVar, long j10, List<String> list, hn.c<? super r> cVar2) {
        Object objG = p000do.g.g(w0.b(), new c(str, this, cVar, j10, list, null), cVar2);
        return objG == in.a.g() ? objG : r.f5635a;
    }
}
