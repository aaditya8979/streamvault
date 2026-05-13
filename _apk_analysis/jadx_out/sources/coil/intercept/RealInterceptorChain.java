package coil.intercept;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.vungle.ads.internal.ui.AdActivity;
import e0.a;
import j0.f;
import j0.h;
import java.util.List;
import k0.Size;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import y.c;

/* JADX INFO: compiled from: RealInterceptorChain.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010+\u001a\u00020'¢\u0006\u0004\b,\u0010-J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010&\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b\u001d\u0010%R\u0017\u0010+\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001f\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcoil/intercept/RealInterceptorChain;", "Le0/a$a;", "Lj0/f;", AdActivity.REQUEST_KEY_EXTRA, "Lj0/g;", InneractiveMediationDefs.GENDER_FEMALE, "(Lj0/f;Lhn/c;)Ljava/lang/Object;", "Le0/a;", "interceptor", "Lbn/r;", "a", "", "index", "Lk0/g;", "size", "b", "Lj0/f;", "getInitialRequest", "()Lj0/f;", "initialRequest", "", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "interceptors", "c", "I", "getIndex", "()I", "d", "getRequest", "e", "Lk0/g;", "getSize", "()Lk0/g;", "Ly/c;", "Ly/c;", "()Ly/c;", "eventListener", "", "g", "Z", "()Z", "isPlaceholderCached", "<init>", "(Lj0/f;Ljava/util/List;ILj0/f;Lk0/g;Ly/c;Z)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class RealInterceptorChain implements a.InterfaceC0737a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f initialRequest;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<a> interceptors;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f request;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Size size;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c eventListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isPlaceholderCached;

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(@NotNull f fVar, @NotNull List<? extends a> list, int i10, @NotNull f fVar2, @NotNull Size size, @NotNull c cVar, boolean z10) {
        this.initialRequest = fVar;
        this.interceptors = list;
        this.index = i10;
        this.request = fVar2;
        this.size = size;
        this.eventListener = cVar;
        this.isPlaceholderCached = z10;
    }

    public static /* synthetic */ RealInterceptorChain c(RealInterceptorChain realInterceptorChain, int i10, f fVar, Size size, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = realInterceptorChain.index;
        }
        if ((i11 & 2) != 0) {
            fVar = realInterceptorChain.getRequest();
        }
        if ((i11 & 4) != 0) {
            size = realInterceptorChain.getSize();
        }
        return realInterceptorChain.b(i10, fVar, size);
    }

    public final void a(f fVar, a aVar) {
        if (!(fVar.getIo.bidmachine.ads.networks.gam_dynamic.GAMConfig.KEY_CONTEXT java.lang.String() == this.initialRequest.getIo.bidmachine.ads.networks.gam_dynamic.GAMConfig.KEY_CONTEXT java.lang.String())) {
            throw new IllegalStateException(("Interceptor '" + aVar + "' cannot modify the request's context.").toString());
        }
        if (!(fVar.getData() != h.f72136a)) {
            throw new IllegalStateException(("Interceptor '" + aVar + "' cannot set the request's data to null.").toString());
        }
        if (!(fVar.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET java.lang.String() == this.initialRequest.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET java.lang.String())) {
            throw new IllegalStateException(("Interceptor '" + aVar + "' cannot modify the request's target.").toString());
        }
        if (!(fVar.getLifecycle() == this.initialRequest.getLifecycle())) {
            throw new IllegalStateException(("Interceptor '" + aVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (fVar.getSizeResolver() == this.initialRequest.getSizeResolver()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + aVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    public final RealInterceptorChain b(int index, f request, Size size) {
        return new RealInterceptorChain(this.initialRequest, this.interceptors, index, request, size, this.eventListener, this.isPlaceholderCached);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getEventListener() {
        return this.eventListener;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(@org.jetbrains.annotations.NotNull j0.f r12, @org.jetbrains.annotations.NotNull hn.c<? super j0.g> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof coil.intercept.RealInterceptorChain$proceed$1
            if (r0 == 0) goto L13
            r0 = r13
            coil.intercept.RealInterceptorChain$proceed$1 r0 = (coil.intercept.RealInterceptorChain$proceed$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil.intercept.RealInterceptorChain$proceed$1 r0 = new coil.intercept.RealInterceptorChain$proceed$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r12 = r0.L$1
            e0.a r12 = (e0.a) r12
            java.lang.Object r0 = r0.L$0
            coil.intercept.RealInterceptorChain r0 = (coil.intercept.RealInterceptorChain) r0
            kotlin.c.b(r13)
            goto L74
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            kotlin.c.b(r13)
            int r13 = r11.index
            if (r13 <= 0) goto L4c
            java.util.List<e0.a> r2 = r11.interceptors
            int r13 = r13 - r3
            java.lang.Object r13 = r2.get(r13)
            e0.a r13 = (e0.a) r13
            r11.a(r12, r13)
        L4c:
            java.util.List<e0.a> r13 = r11.interceptors
            int r2 = r11.index
            java.lang.Object r13 = r13.get(r2)
            e0.a r13 = (e0.a) r13
            int r2 = r11.index
            int r5 = r2 + 1
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r11
            r6 = r12
            coil.intercept.RealInterceptorChain r12 = c(r4, r5, r6, r7, r8, r9)
            r0.L$0 = r11
            r0.L$1 = r13
            r0.label = r3
            java.lang.Object r12 = r13.a(r12, r0)
            if (r12 != r1) goto L70
            return r1
        L70:
            r0 = r11
            r10 = r13
            r13 = r12
            r12 = r10
        L74:
            j0.g r13 = (j0.g) r13
            j0.f r1 = r13.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String()
            r0.a(r1, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.RealInterceptorChain.f(j0.f, hn.c):java.lang.Object");
    }

    @Override // e0.a.InterfaceC0737a
    @NotNull
    public f getRequest() {
        return this.request;
    }

    @Override // e0.a.InterfaceC0737a
    @NotNull
    public Size getSize() {
        return this.size;
    }
}
