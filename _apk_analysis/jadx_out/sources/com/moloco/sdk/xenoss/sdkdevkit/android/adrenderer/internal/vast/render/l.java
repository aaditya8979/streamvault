package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt", f = "PreparedVastResource.kt", l = {76, 140}, m = "prepareVastResource")
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f50555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f50556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f50557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f50558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f50559e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f50560f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f50561g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f50562h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f50563i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f50564j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f50565k;

        public a(hn.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f50564j = obj;
            this.f50565k |= Integer.MIN_VALUE;
            return l.c(null, null, null, null, 0, 0, null, null, false, null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt$prepareVastResource$2", f = "PreparedVastResource.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<String> f50567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f50568c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref$ObjectRef<String> ref$ObjectRef, a0 a0Var, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f50567b = ref$ObjectRef;
            this.f50568c = a0Var;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new b(this.f50567b, this.f50568c, cVar);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50566a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.f50567b.element = l.e(this.f50568c);
            return bn.r.f5635a;
        }
    }

    public static final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Integer f50569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m> f50570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<i0> f50571d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<l0> f50572e;

        public c(Integer num, Ref$ObjectRef<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m> ref$ObjectRef, Ref$ObjectRef<i0> ref$ObjectRef2, Ref$ObjectRef<l0> ref$ObjectRef3) {
            this.f50569b = num;
            this.f50570c = ref$ObjectRef;
            this.f50571d = ref$ObjectRef2;
            this.f50572e = ref$ObjectRef3;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
        public void destroy() {
            Integer num = this.f50569b;
            if (num != null) {
                g0.f48150a.c(num.intValue());
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m mVar = this.f50570c.element;
            if (mVar != null) {
                mVar.destroy();
            }
            this.f50570c.element = null;
            i0 i0Var = this.f50571d.element;
            if (i0Var != null) {
                i0Var.destroy();
            }
            this.f50571d.element = null;
            l0 l0Var = this.f50572e.element;
            if (l0Var != null) {
                kotlinx.coroutines.d.e(l0Var, null, 1, null);
            }
            this.f50572e.element = null;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt$prepareVastResource$webView$1$1", f = "PreparedVastResource.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements sn.p<bn.r, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sn.a<bn.r> f50574b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(sn.a<bn.r> aVar, hn.c<? super d> cVar) {
            super(2, cVar);
            this.f50574b = aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(bn.r rVar, hn.c<? super bn.r> cVar) {
            return ((d) create(rVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new d(this.f50574b, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50573a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.f50574b.invoke();
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt$prepareVastResource$webView$1$2", f = "PreparedVastResource.kt", l = {109}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f50576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ sn.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, bn.r> f50577c;

        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt$prepareVastResource$webView$1$2$1", f = "PreparedVastResource.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements sn.p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g, hn.c<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f50578a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f50579b;

            public a(hn.c<? super a> cVar) {
                super(2, cVar);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, hn.c<? super Boolean> cVar) {
                return ((a) create(gVar, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                a aVar = new a(cVar);
                aVar.f50579b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f50578a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                return jn.a.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.f50579b) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, bn.r> lVar, hn.c<? super e> cVar) {
            super(2, cVar);
            this.f50576b = aVar;
            this.f50577c = lVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((e) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new e(this.f50576b, this.f50577c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50575a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                go.u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> unrecoverableError = this.f50576b.getUnrecoverableError();
                a aVar = new a(null);
                this.f50575a = 1;
                obj = go.f.w(unrecoverableError, aVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj;
            if (gVar != null) {
                this.f50577c.invoke(gVar);
            }
            return bn.r.f5635a;
        }
    }

    public static final bn.r a() {
        return bn.r.f5635a;
    }

    @Nullable
    public static final j b(@NotNull a0 a0Var, int i10, int i11) {
        tn.p.k(a0Var, "<this>");
        if (a0Var instanceof a0.c) {
            a0.c cVar = (a0.c) a0Var;
            if (cVar.a().a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.f49887a) {
                return new j.b(cVar.a().b(), i10, i11);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, do.l0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@org.jetbrains.annotations.NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 r30, @org.jetbrains.annotations.NotNull android.content.Context r31, @org.jetbrains.annotations.NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a r32, @org.jetbrains.annotations.NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0 r33, int r34, int r35, @org.jetbrains.annotations.NotNull sn.a<bn.r> r36, @org.jetbrains.annotations.NotNull sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, bn.r> r37, boolean r38, @org.jetbrains.annotations.Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o r39, @org.jetbrains.annotations.NotNull hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k> r40) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0, android.content.Context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0, int, int, sn.a, sn.l, boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o, hn.c):java.lang.Object");
    }

    @Nullable
    public static final String e(@NotNull a0 a0Var) {
        tn.p.k(a0Var, "<this>");
        if (a0Var instanceof a0.a) {
            a0.a aVar = (a0.a) a0Var;
            if (n0.f48494a.a(aVar.a().a())) {
                return aVar.a().a();
            }
        } else if (a0Var instanceof a0.b) {
            a0.b bVar = (a0.b) a0Var;
            if (n0.f48494a.a(bVar.a().a())) {
                return bVar.a().a();
            }
        } else {
            if (!(a0Var instanceof a0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a0.c cVar = (a0.c) a0Var;
            if (cVar.a().a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.f49888b && n0.f48494a.a(cVar.a().b())) {
                return cVar.a().b();
            }
        }
        return null;
    }

    public static final bn.r f() {
        return bn.r.f5635a;
    }
}
