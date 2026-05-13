package com.moloco.sdk.internal.publisher.nativead.parser;

import android.content.Context;
import bn.g;
import bn.r;
import cn.x;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.internal.publisher.nativead.model.a;
import com.moloco.sdk.internal.publisher.nativead.model.b;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AwaitKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt", f = "PrepareNativeAssets.kt", l = {113}, m = "prepareImageAsset")
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f46874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f46875c;

        public a(hn.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46874b = obj;
            this.f46875c |= Integer.MIN_VALUE;
            return c.g(null, null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt", f = "PrepareNativeAssets.kt", l = {37, 58}, m = "prepareNativeAssets-exY8QGI")
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f46876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f46878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f46879d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46880e;

        public b(hn.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46879d = obj;
            this.f46880e |= Integer.MIN_VALUE;
            return c.b(null, null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.parser.c$c, reason: collision with other inner class name */
    @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt$prepareNativeAssets$preparedOptionalAssets$1", f = "PrepareNativeAssets.kt", l = {61}, m = "invokeSuspend")
    public static final class C0577c extends SuspendLambda implements p<l0, hn.c<? super List<? extends Pair<? extends a.AbstractC0574a, ? extends g0<com.moloco.sdk.internal.publisher.nativead.model.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f46882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<a.AbstractC0574a> f46883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g<h> f46884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f46885e;

        /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.parser.c$c$a */
        @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt$prepareNativeAssets$preparedOptionalAssets$1$1$1", f = "PrepareNativeAssets.kt", l = {60}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements p<l0, hn.c<? super Pair<? extends a.AbstractC0574a, ? extends g0<com.moloco.sdk.internal.publisher.nativead.model.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f46886a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f46887b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a.AbstractC0574a f46888c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ g<h> f46889d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ long f46890e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(a.AbstractC0574a abstractC0574a, g<? extends h> gVar, long j10, hn.c<? super a> cVar) {
                super(2, cVar);
                this.f46888c = abstractC0574a;
                this.f46889d = gVar;
                this.f46890e = j10;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c<? super Pair<? extends a.AbstractC0574a, ? extends g0<com.moloco.sdk.internal.publisher.nativead.model.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>> cVar) {
                return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<r> create(Object obj, hn.c<?> cVar) {
                return new a(this.f46888c, this.f46889d, this.f46890e, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                a.AbstractC0574a abstractC0574a;
                Object objG = in.a.g();
                int i10 = this.f46887b;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    a.AbstractC0574a abstractC0574a2 = this.f46888c;
                    g<h> gVar = this.f46889d;
                    long j10 = this.f46890e;
                    this.f46886a = abstractC0574a2;
                    this.f46887b = 1;
                    Object objI = c.i(abstractC0574a2, gVar, j10, this);
                    if (objI == objG) {
                        return objG;
                    }
                    abstractC0574a = abstractC0574a2;
                    obj = objI;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC0574a = (a.AbstractC0574a) this.f46886a;
                    kotlin.c.b(obj);
                }
                return bn.h.a(abstractC0574a, obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0577c(List<? extends a.AbstractC0574a> list, g<? extends h> gVar, long j10, hn.c<? super C0577c> cVar) {
            super(2, cVar);
            this.f46883c = list;
            this.f46884d = gVar;
            this.f46885e = j10;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super List<? extends Pair<? extends a.AbstractC0574a, ? extends g0<com.moloco.sdk.internal.publisher.nativead.model.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>>> cVar) {
            return ((C0577c) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            C0577c c0577c = new C0577c(this.f46883c, this.f46884d, this.f46885e, cVar);
            c0577c.f46882b = obj;
            return c0577c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f46881a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                l0 l0Var = (l0) this.f46882b;
                List<a.AbstractC0574a> list = this.f46883c;
                g<h> gVar = this.f46884d;
                long j10 = this.f46885e;
                ArrayList arrayList = new ArrayList(x.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(i.b(l0Var, null, null, new a((a.AbstractC0574a) it.next(), gVar, j10, null), 3, null));
                }
                this.f46881a = 1;
                obj = AwaitKt.a(arrayList, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return obj;
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt$prepareNativeAssets$preparedRequiredAssets$1", f = "PrepareNativeAssets.kt", l = {51}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements p<l0, hn.c<? super List<? extends Pair<? extends a.AbstractC0574a, ? extends g0.b<com.moloco.sdk.internal.publisher.nativead.model.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f46892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<a.AbstractC0574a> f46893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g<h> f46894d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f46895e;

        @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt$prepareNativeAssets$preparedRequiredAssets$1$1$1", f = "PrepareNativeAssets.kt", l = {40}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements p<l0, hn.c<? super Pair<? extends a.AbstractC0574a, ? extends g0.b<com.moloco.sdk.internal.publisher.nativead.model.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f46896a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a.AbstractC0574a f46897b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g<h> f46898c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f46899d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(a.AbstractC0574a abstractC0574a, g<? extends h> gVar, long j10, hn.c<? super a> cVar) {
                super(2, cVar);
                this.f46897b = abstractC0574a;
                this.f46898c = gVar;
                this.f46899d = j10;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c<? super Pair<? extends a.AbstractC0574a, g0.b<com.moloco.sdk.internal.publisher.nativead.model.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>> cVar) {
                return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<r> create(Object obj, hn.c<?> cVar) {
                return new a(this.f46897b, this.f46898c, this.f46899d, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws com.moloco.sdk.internal.publisher.nativead.parser.b {
                Object objG = in.a.g();
                int i10 = this.f46896a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    a.AbstractC0574a abstractC0574a = this.f46897b;
                    g<h> gVar = this.f46898c;
                    long j10 = this.f46899d;
                    this.f46896a = 1;
                    obj = c.i(abstractC0574a, gVar, j10, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                g0 g0Var = (g0) obj;
                if (g0Var instanceof g0.b) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "PrepareNativeAssets", "Successfully prepared native asset: " + this.f46897b.a(), null, false, 12, null);
                    return bn.h.a(this.f46897b, g0Var);
                }
                if (!(g0Var instanceof g0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "PrepareNativeAssets", "Failed to prepare required native asset: " + this.f46897b.a(), null, false, 12, null);
                throw new com.moloco.sdk.internal.publisher.nativead.parser.b(this.f46897b.a(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((g0.a) g0Var).a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends a.AbstractC0574a> list, g<? extends h> gVar, long j10, hn.c<? super d> cVar) {
            super(2, cVar);
            this.f46893c = list;
            this.f46894d = gVar;
            this.f46895e = j10;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super List<? extends Pair<? extends a.AbstractC0574a, g0.b<com.moloco.sdk.internal.publisher.nativead.model.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>>> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            d dVar = new d(this.f46893c, this.f46894d, this.f46895e, cVar);
            dVar.f46892b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f46891a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                l0 l0Var = (l0) this.f46892b;
                List<a.AbstractC0574a> list = this.f46893c;
                g<h> gVar = this.f46894d;
                long j10 = this.f46895e;
                ArrayList arrayList = new ArrayList(x.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(i.b(l0Var, null, null, new a((a.AbstractC0574a) it.next(), gVar, j10, null), 3, null));
                }
                this.f46891a = 1;
                obj = AwaitKt.a(arrayList, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return obj;
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt", f = "PrepareNativeAssets.kt", l = {148, 155}, m = "prepareVideoAsset-exY8QGI")
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f46902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f46903d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46904e;

        public e(hn.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46903d = obj;
            this.f46904e |= Integer.MIN_VALUE;
            return c.h(null, null, 0L, this);
        }
    }

    public static final h a(Context context) {
        return o.a(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@org.jetbrains.annotations.NotNull final android.content.Context r11, @org.jetbrains.annotations.NotNull java.util.List<? extends com.moloco.sdk.internal.publisher.nativead.model.a.AbstractC0574a> r12, long r13, @org.jetbrains.annotations.NotNull hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.internal.publisher.nativead.parser.b>> r15) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.parser.c.b(android.content.Context, java.util.List, long, hn.c):java.lang.Object");
    }

    public static /* synthetic */ Object d(a.AbstractC0574a.b bVar, n nVar, hn.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            nVar = b.g.f47660a.a();
        }
        return g(bVar, nVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(com.moloco.sdk.internal.publisher.nativead.model.a.AbstractC0574a.b r7, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n r8, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.internal.publisher.nativead.model.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> r9) {
        /*
            boolean r0 = r9 instanceof com.moloco.sdk.internal.publisher.nativead.parser.c.a
            if (r0 == 0) goto L13
            r0 = r9
            com.moloco.sdk.internal.publisher.nativead.parser.c$a r0 = (com.moloco.sdk.internal.publisher.nativead.parser.c.a) r0
            int r1 = r0.f46875c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46875c = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.nativead.parser.c$a r0 = new com.moloco.sdk.internal.publisher.nativead.parser.c$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f46874b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f46875c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f46873a
            com.moloco.sdk.internal.publisher.nativead.model.a$a$b r7 = (com.moloco.sdk.internal.publisher.nativead.model.a.AbstractC0574a.b) r7
            kotlin.c.b(r9)
            goto L47
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.c.b(r9)
            java.lang.String r9 = r7.c()
            r0.f46873a = r7
            r0.f46875c = r3
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L47
            return r1
        L47:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n$a r9 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n.a) r9
            boolean r8 = r9 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n.a.b
            if (r8 == 0) goto L95
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE     // Catch: java.lang.Exception -> L7e
            java.lang.String r1 = "PrepareNativeAssets"
            java.lang.String r2 = "Successfully loaded image asset media"
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L7e
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n$a$b r9 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n.a.b) r9     // Catch: java.lang.Exception -> L7e
            java.io.File r8 = r9.a()     // Catch: java.lang.Exception -> L7e
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Exception -> L7e
            java.lang.String r9 = "getAbsolutePath(...)"
            tn.p.j(r8, r9)     // Catch: java.lang.Exception -> L7e
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: java.lang.Exception -> L7e
            java.lang.String r9 = "parse(this)"
            tn.p.j(r8, r9)     // Catch: java.lang.Exception -> L7e
            com.moloco.sdk.internal.g0$b r9 = new com.moloco.sdk.internal.g0$b
            com.moloco.sdk.internal.publisher.nativead.model.b$b r0 = new com.moloco.sdk.internal.publisher.nativead.model.b$b
            r0.<init>(r7, r8)
            r9.<init>(r0)
            goto Laa
        L7e:
            r7 = move-exception
            r3 = r7
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r4 = 0
            r5 = 8
            r6 = 0
            java.lang.String r1 = "PrepareNativeAssets"
            java.lang.String r2 = "Failed to prepare image asset"
            com.moloco.sdk.internal.MolocoLogger.warn$default(r0, r1, r2, r3, r4, r5, r6)
            com.moloco.sdk.internal.g0$a r7 = new com.moloco.sdk.internal.g0$a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.f48070c
            r7.<init>(r8)
            return r7
        L95:
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            java.lang.String r1 = "PrepareNativeAssets"
            java.lang.String r2 = "Failed to fetch image asset media"
            com.moloco.sdk.internal.MolocoLogger.warn$default(r0, r1, r2, r3, r4, r5, r6)
            com.moloco.sdk.internal.g0$a r9 = new com.moloco.sdk.internal.g0$a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.f48069b
            r9.<init>(r7)
        Laa:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.parser.c.g(com.moloco.sdk.internal.publisher.nativead.model.a$a$b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(com.moloco.sdk.internal.publisher.nativead.model.a.AbstractC0574a.d r11, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h r12, long r13, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.internal.publisher.nativead.model.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> r15) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.parser.c.h(com.moloco.sdk.internal.publisher.nativead.model.a$a$d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h, long, hn.c):java.lang.Object");
    }

    public static final Object i(a.AbstractC0574a abstractC0574a, g<? extends h> gVar, long j10, hn.c<? super g0<com.moloco.sdk.internal.publisher.nativead.model.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> cVar) {
        if (abstractC0574a instanceof a.AbstractC0574a.C0575a) {
            return new g0.b(new b.a((a.AbstractC0574a.C0575a) abstractC0574a));
        }
        if (abstractC0574a instanceof a.AbstractC0574a.b) {
            return d((a.AbstractC0574a.b) abstractC0574a, null, cVar, 2, null);
        }
        if (abstractC0574a instanceof a.AbstractC0574a.c) {
            return new g0.b(new b.c((a.AbstractC0574a.c) abstractC0574a));
        }
        if (abstractC0574a instanceof a.AbstractC0574a.d) {
            return h((a.AbstractC0574a.d) abstractC0574a, gVar.getValue(), j10, cVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
