package coil.intercept;

import bn.r;
import coil.intercept.EngineInterceptor;
import hn.c;
import j0.f;
import j0.j;
import java.util.List;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: EngineInterceptor.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lcoil/intercept/EngineInterceptor$b;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@d(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {242}, m = "invokeSuspend")
public final class EngineInterceptor$transform$3 extends SuspendLambda implements p<l0, c<? super EngineInterceptor.b>, Object> {
    public final /* synthetic */ y.c $eventListener;
    public final /* synthetic */ j $options;
    public final /* synthetic */ f $request;
    public final /* synthetic */ EngineInterceptor.b $result;
    public final /* synthetic */ List<a> $transformations;
    public int I$0;
    public int I$1;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EngineInterceptor$transform$3(EngineInterceptor engineInterceptor, EngineInterceptor.b bVar, j jVar, List<? extends a> list, y.c cVar, f fVar, c<? super EngineInterceptor$transform$3> cVar2) {
        super(2, cVar2);
        this.this$0 = engineInterceptor;
        this.$result = bVar;
        this.$options = jVar;
        this.$transformations = list;
        this.$eventListener = cVar;
        this.$request = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        EngineInterceptor$transform$3 engineInterceptor$transform$3 = new EngineInterceptor$transform$3(this.this$0, this.$result, this.$options, this.$transformations, this.$eventListener, this.$request, cVar);
        engineInterceptor$transform$3.L$0 = obj;
        return engineInterceptor$transform$3;
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super EngineInterceptor.b> cVar) {
        return ((EngineInterceptor$transform$3) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x007e -> B:13:0x0081). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            int r2 = r0.I$1
            int r4 = r0.I$0
            java.lang.Object r5 = r0.L$2
            j0.j r5 = (j0.j) r5
            java.lang.Object r6 = r0.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.L$0
            do.l0 r7 = (p000do.l0) r7
            kotlin.c.b(r20)
            r9 = r0
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r20
            goto L81
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2f:
            kotlin.c.b(r20)
            java.lang.Object r2 = r0.L$0
            do.l0 r2 = (p000do.l0) r2
            coil.intercept.EngineInterceptor r4 = r0.this$0
            coil.intercept.EngineInterceptor$b r5 = r0.$result
            android.graphics.drawable.Drawable r5 = r5.getDrawable()
            j0.j r6 = r0.$options
            java.util.List<m0.a> r7 = r0.$transformations
            android.graphics.Bitmap r4 = coil.intercept.EngineInterceptor.b(r4, r5, r6, r7)
            y.c r5 = r0.$eventListener
            j0.f r6 = r0.$request
            r5.p(r6, r4)
            java.util.List<m0.a> r5 = r0.$transformations
            j0.j r6 = r0.$options
            r7 = 0
            int r8 = r5.size()
            r9 = r0
            r17 = r8
            r8 = r2
            r2 = r17
            r18 = r5
            r5 = r4
            r4 = r7
            r7 = r18
        L62:
            if (r4 >= r2) goto L88
            java.lang.Object r10 = r7.get(r4)
            m0.a r10 = (m0.a) r10
            k0.g r11 = r6.getSize()
            r9.L$0 = r8
            r9.L$1 = r7
            r9.L$2 = r6
            r9.I$0 = r4
            r9.I$1 = r2
            r9.label = r3
            java.lang.Object r5 = r10.a(r5, r11, r9)
            if (r5 != r1) goto L81
            return r1
        L81:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            kotlinx.coroutines.d.g(r8)
            int r4 = r4 + r3
            goto L62
        L88:
            y.c r1 = r9.$eventListener
            j0.f r2 = r9.$request
            r1.h(r2, r5)
            coil.intercept.EngineInterceptor$b r10 = r9.$result
            j0.f r1 = r9.$request
            android.content.Context r1 = r1.getIo.bidmachine.ads.networks.gam_dynamic.GAMConfig.KEY_CONTEXT java.lang.String()
            android.content.res.Resources r1 = r1.getResources()
            android.graphics.drawable.BitmapDrawable r11 = new android.graphics.drawable.BitmapDrawable
            r11.<init>(r1, r5)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 14
            r16 = 0
            coil.intercept.EngineInterceptor$b r1 = coil.intercept.EngineInterceptor.b.b(r10, r11, r12, r13, r14, r15, r16)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor$transform$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
