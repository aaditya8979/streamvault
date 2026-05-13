package kotlinx.coroutines.flow;

import bn.r;
import go.d;
import go.e;
import hn.c;
import ho.m;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DistinctFlowImpl<T> implements d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d<T> f73322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l<T, Object> f73323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final p<Object, Object, Boolean> f73324d;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2, reason: invalid class name */
    /* JADX INFO: compiled from: Distinct.kt */
    public static final class AnonymousClass2<T> implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DistinctFlowImpl<T> f73325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<Object> f73326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e<T> f73327d;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(DistinctFlowImpl<T> distinctFlowImpl, Ref$ObjectRef<Object> ref$ObjectRef, e<? super T> eVar) {
            this.f73325b = distinctFlowImpl;
            this.f73326c = ref$ObjectRef;
            this.f73327d = eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
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
        @Override // go.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, hn.c<? super bn.r> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = (kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = new kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = in.a.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.c.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.c.b(r7)
                kotlinx.coroutines.flow.DistinctFlowImpl<T> r7 = r5.f73325b
                sn.l<T, java.lang.Object> r7 = r7.f73323c
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.f73326c
                T r2 = r2.element
                io.e0 r4 = ho.m.f63563a
                if (r2 == r4) goto L58
                kotlinx.coroutines.flow.DistinctFlowImpl<T> r4 = r5.f73325b
                sn.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f73324d
                java.lang.Object r2 = r4.mo2invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                bn.r r6 = bn.r.f5635a
                return r6
            L58:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.f73326c
                r2.element = r7
                go.e<T> r7 = r5.f73327d
                r0.label = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                bn.r r6 = bn.r.f5635a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.DistinctFlowImpl.AnonymousClass2.emit(java.lang.Object, hn.c):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(@NotNull d<? extends T> dVar, @NotNull l<? super T, ? extends Object> lVar, @NotNull p<Object, Object, Boolean> pVar) {
        this.f73322b = dVar;
        this.f73323c = lVar;
        this.f73324d = pVar;
    }

    @Override // go.d
    @Nullable
    public Object collect(@NotNull e<? super T> eVar, @NotNull c<? super r> cVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = (T) m.f63563a;
        Object objCollect = this.f73322b.collect(new AnonymousClass2(this, ref$ObjectRef, eVar), cVar);
        return objCollect == in.a.g() ? objCollect : r.f5635a;
    }
}
