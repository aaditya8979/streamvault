package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.DecayAnimationSpec;
import hn.c;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialVelocity", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLhn/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "flingDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "<init>", "(Landroidx/compose/animation/core/DecayAnimationSpec;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
final class DefaultFlingBehavior implements FlingBehavior {

    @NotNull
    private final DecayAnimationSpec<Float> flingDecay;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1, reason: invalid class name */
    /* JADX INFO: compiled from: Scrollable.kt */
    @d(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior", f = "Scrollable.kt", l = {496}, m = "performFling")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultFlingBehavior.this.performFling(null, 0.0f, this);
        }
    }

    public DefaultFlingBehavior(@NotNull DecayAnimationSpec<Float> decayAnimationSpec) {
        p.k(decayAnimationSpec, "flingDecay");
        this.flingDecay = decayAnimationSpec;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object performFling(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.gestures.ScrollScope r18, float r19, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.Float> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof androidx.compose.foundation.gestures.DefaultFlingBehavior.AnonymousClass1
            if (r2 == 0) goto L17
            r2 = r1
            androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1 r2 = (androidx.compose.foundation.gestures.DefaultFlingBehavior.AnonymousClass1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1 r2 = new androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1
            r2.<init>(r1)
        L1c:
            r7 = r2
            java.lang.Object r1 = r7.result
            java.lang.Object r2 = in.a.g()
            int r3 = r7.label
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            java.lang.Object r2 = r7.L$0
            kotlin.jvm.internal.Ref$FloatRef r2 = (kotlin.jvm.internal.Ref$FloatRef) r2
            kotlin.c.b(r1)
            goto L82
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            kotlin.c.b(r1)
            float r1 = java.lang.Math.abs(r19)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L85
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r3 = r19
            r1.element = r3
            kotlin.jvm.internal.Ref$FloatRef r5 = new kotlin.jvm.internal.Ref$FloatRef
            r5.<init>()
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 28
            r16 = 0
            r9 = r19
            androidx.compose.animation.core.AnimationState r3 = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(r8, r9, r10, r12, r14, r15, r16)
            androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r6 = r0.flingDecay
            r8 = 0
            androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2 r9 = new androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2
            r10 = r18
            r9.<init>()
            r10 = 2
            r11 = 0
            r7.L$0 = r1
            r7.label = r4
            r4 = r6
            r5 = r8
            r6 = r9
            r8 = r10
            r9 = r11
            java.lang.Object r3 = androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L81
            return r2
        L81:
            r2 = r1
        L82:
            float r1 = r2.element
            goto L88
        L85:
            r3 = r19
            r1 = r3
        L88:
            java.lang.Float r1 = jn.a.c(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DefaultFlingBehavior.performFling(androidx.compose.foundation.gestures.ScrollScope, float, hn.c):java.lang.Object");
    }
}
