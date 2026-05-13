package io.ktor.client.plugins;

import bn.r;
import gl.f;
import gl.n;
import gl.s;
import gl.v;
import gl.w;
import jl.c;
import jl.e;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.q;
import tn.t;

/* JADX INFO: compiled from: DefaultTransform.kt */
/* JADX INFO: loaded from: classes3.dex */
@d(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", f = "DefaultTransform.kt", l = {61}, m = "invokeSuspend")
public final class DefaultTransformKt$defaultTransformers$1 extends SuspendLambda implements q<ql.c<Object, cl.d>, Object, hn.c<? super r>, Object> {
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: compiled from: DefaultTransform.kt */
    public static final class a extends c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f71096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f71097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f71098c;

        public a(f fVar, Object obj) {
            this.f71098c = obj;
            this.f71096a = fVar == null ? f.a.f62501a.a() : fVar;
            this.f71097b = ((byte[]) obj).length;
        }

        @Override // jl.c
        public Long a() {
            return Long.valueOf(this.f71097b);
        }

        @Override // jl.c
        public f b() {
            return this.f71096a;
        }

        @Override // jl.c.a
        public byte[] d() {
            return (byte[]) this.f71098c;
        }
    }

    /* JADX INFO: compiled from: DefaultTransform.kt */
    public static final class b extends c.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f71099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f71100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f71101c;

        public b(ql.c<Object, cl.d> cVar, f fVar, Object obj) {
            this.f71101c = obj;
            String strJ = cVar.getContext().getHeaders().j(s.f62569a.g());
            this.f71099a = strJ != null ? Long.valueOf(Long.parseLong(strJ)) : null;
            this.f71100b = fVar == null ? f.a.f62501a.a() : fVar;
        }

        @Override // jl.c
        public Long a() {
            return this.f71099a;
        }

        @Override // jl.c
        public f b() {
            return this.f71100b;
        }

        @Override // jl.c.d
        public io.ktor.utils.io.a d() {
            return (io.ktor.utils.io.a) this.f71101c;
        }
    }

    public DefaultTransformKt$defaultTransformers$1(hn.c<? super DefaultTransformKt$defaultTransformers$1> cVar) {
        super(3, cVar);
    }

    @Override // sn.q
    public final Object invoke(ql.c<Object, cl.d> cVar, Object obj, hn.c<? super r> cVar2) {
        DefaultTransformKt$defaultTransformers$1 defaultTransformKt$defaultTransformers$1 = new DefaultTransformKt$defaultTransformers$1(cVar2);
        defaultTransformKt$defaultTransformers$1.L$0 = cVar;
        defaultTransformKt$defaultTransformers$1.L$1 = obj;
        return defaultTransformKt$defaultTransformers$1.invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        jl.c aVar;
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            ql.c cVar = (ql.c) this.L$0;
            Object obj2 = this.L$1;
            n headers = ((cl.d) cVar.getContext()).getHeaders();
            s sVar = s.f62569a;
            if (headers.j(sVar.c()) == null) {
                ((cl.d) cVar.getContext()).getHeaders().e(sVar.c(), "*/*");
            }
            f fVarD = w.d((v) cVar.getContext());
            if (obj2 instanceof String) {
                String str = (String) obj2;
                if (fVarD == null) {
                    fVarD = f.d.f62534a.a();
                }
                aVar = new e(str, fVarD, null, 4, null);
            } else {
                aVar = obj2 instanceof byte[] ? new a(fVarD, obj2) : obj2 instanceof io.ktor.utils.io.a ? new b(cVar, fVarD, obj2) : obj2 instanceof jl.c ? (jl.c) obj2 : DefaultTransformersJvmKt.a(fVarD, (cl.d) cVar.getContext(), obj2);
            }
            if ((aVar != null ? aVar.b() : null) != null) {
                ((cl.d) cVar.getContext()).getHeaders().l(sVar.i());
                DefaultTransformKt.f71095a.trace("Transformed with default transformers request body for " + ((cl.d) cVar.getContext()).i() + " from " + t.b(obj2.getClass()));
                this.L$0 = null;
                this.label = 1;
                if (cVar.d(aVar, this) == objG) {
                    return objG;
                }
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
