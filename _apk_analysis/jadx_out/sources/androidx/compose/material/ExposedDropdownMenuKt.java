package androidx.compose.material;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import bn.r;
import com.ironsource.C3996e4;
import com.mbridge.msdk.MBridgeConstans;
import hn.c;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.a;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001aN\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u000f\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a6\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¨\u0006\u0018"}, d2 = {"", "expanded", "Lkotlin/Function1;", "Lbn/r;", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "content", "ExposedDropdownMenuBox", "(ZLsn/l;Landroidx/compose/ui/Modifier;Lsn/q;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "", "menuLabel", "expandable", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/compose/ui/layout/LayoutCoordinates;", C3996e4.f31528f, "", "verticalMarginInPx", "onHeightUpdate", "updateHeight", "material_release"}, k = 2, mv = {1, 6, 0})
public final class ExposedDropdownMenuKt {

    /* JADX INFO: renamed from: androidx.compose.material.ExposedDropdownMenuKt$expandable$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1", f = "ExposedDropdownMenu.kt", l = {516}, m = "invokeSuspend")
    public static final class C12731 extends SuspendLambda implements p<PointerInputScope, c<? super r>, Object> {
        public final /* synthetic */ a<r> $onExpandedChange;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @d(c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1", f = "ExposedDropdownMenu.kt", l = {517}, m = "invokeSuspend")
        public static final class C00741 extends SuspendLambda implements p<PointerInputScope, c<? super r>, Object> {
            public final /* synthetic */ a<r> $onExpandedChange;
            private /* synthetic */ Object L$0;
            public int label;

            /* JADX INFO: renamed from: androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @d(c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1$1", f = "ExposedDropdownMenu.kt", l = {518}, m = "invokeSuspend")
            public static final class C00751 extends SuspendLambda implements p<l0, c<? super r>, Object> {
                public final /* synthetic */ PointerInputScope $$this$forEachGesture;
                public final /* synthetic */ a<r> $onExpandedChange;
                public int label;

                /* JADX INFO: renamed from: androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
                @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
                @d(c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1$1$1", f = "ExposedDropdownMenu.kt", l = {521}, m = "invokeSuspend")
                public static final class C00761 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super r>, Object> {
                    public final /* synthetic */ a<r> $onExpandedChange;
                    private /* synthetic */ Object L$0;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00761(a<r> aVar, c<? super C00761> cVar) {
                        super(2, cVar);
                        this.$onExpandedChange = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                        C00761 c00761 = new C00761(this.$onExpandedChange, cVar);
                        c00761.L$0 = obj;
                        return c00761;
                    }

                    @Override // sn.p
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public final Object mo2invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable c<? super r> cVar) {
                        return ((C00761) create(awaitPointerEventScope, cVar)).invokeSuspend(r.f5635a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[SYNTHETIC] */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:13:0x0039). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                        /*
                            r9 = this;
                            java.lang.Object r0 = in.a.g()
                            int r1 = r9.label
                            r2 = 1
                            if (r1 == 0) goto L1e
                            if (r1 != r2) goto L16
                            java.lang.Object r1 = r9.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                            kotlin.c.b(r10)
                            r3 = r1
                            r1 = r0
                            r0 = r9
                            goto L39
                        L16:
                            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r10.<init>(r0)
                            throw r10
                        L1e:
                            kotlin.c.b(r10)
                            java.lang.Object r10 = r9.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
                            r1 = r10
                            r10 = r9
                        L27:
                            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                            r10.L$0 = r1
                            r10.label = r2
                            java.lang.Object r3 = r1.awaitPointerEvent(r3, r10)
                            if (r3 != r0) goto L34
                            return r0
                        L34:
                            r8 = r0
                            r0 = r10
                            r10 = r3
                            r3 = r1
                            r1 = r8
                        L39:
                            androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
                            java.util.List r10 = r10.getChanges()
                            int r4 = r10.size()
                            r5 = 0
                            r6 = r5
                        L45:
                            if (r6 >= r4) goto L57
                            java.lang.Object r7 = r10.get(r6)
                            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
                            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(r7)
                            if (r7 != 0) goto L54
                            goto L58
                        L54:
                            int r6 = r6 + 1
                            goto L45
                        L57:
                            r5 = r2
                        L58:
                            if (r5 == 0) goto L62
                            sn.a<bn.r> r10 = r0.$onExpandedChange
                            r10.invoke()
                            bn.r r10 = bn.r.f5635a
                            return r10
                        L62:
                            r10 = r0
                            r0 = r1
                            r1 = r3
                            goto L27
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuKt.C12731.C00741.C00751.C00761.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00751(PointerInputScope pointerInputScope, a<r> aVar, c<? super C00751> cVar) {
                    super(2, cVar);
                    this.$$this$forEachGesture = pointerInputScope;
                    this.$onExpandedChange = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                    return new C00751(this.$$this$forEachGesture, this.$onExpandedChange, cVar);
                }

                @Override // sn.p
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
                    return ((C00751) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = in.a.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.c.b(obj);
                        PointerInputScope pointerInputScope = this.$$this$forEachGesture;
                        C00761 c00761 = new C00761(this.$onExpandedChange, null);
                        this.label = 1;
                        if (pointerInputScope.awaitPointerEventScope(c00761, this) == objG) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00741(a<r> aVar, c<? super C00741> cVar) {
                super(2, cVar);
                this.$onExpandedChange = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                C00741 c00741 = new C00741(this.$onExpandedChange, cVar);
                c00741.L$0 = obj;
                return c00741;
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull PointerInputScope pointerInputScope, @Nullable c<? super r> cVar) {
                return ((C00741) create(pointerInputScope, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = in.a.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    C00751 c00751 = new C00751((PointerInputScope) this.L$0, this.$onExpandedChange, null);
                    this.label = 1;
                    if (kotlinx.coroutines.d.f(c00751, this) == objG) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12731(a<r> aVar, c<? super C12731> cVar) {
            super(2, cVar);
            this.$onExpandedChange = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C12731 c12731 = new C12731(this.$onExpandedChange, cVar);
            c12731.L$0 = obj;
            return c12731;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull PointerInputScope pointerInputScope, @Nullable c<? super r> cVar) {
            return ((C12731) create(pointerInputScope, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                C00741 c00741 = new C00741(this.$onExpandedChange, null);
                this.label = 1;
                if (ForEachGestureKt.forEachGesture(pointerInputScope, c00741, this) == objG) {
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

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ExposedDropdownMenuBox(final boolean r19, @org.jetbrains.annotations.NotNull final sn.l<? super java.lang.Boolean, bn.r> r20, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r21, @org.jetbrains.annotations.NotNull final sn.q<? super androidx.compose.material.ExposedDropdownMenuBoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r22, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuKt.ExposedDropdownMenuBox(boolean, sn.l, androidx.compose.ui.Modifier, sn.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ExposedDropdownMenuBox$lambda-1, reason: not valid java name */
    public static final int m1039ExposedDropdownMenuBox$lambda1(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ExposedDropdownMenuBox$lambda-2, reason: not valid java name */
    public static final void m1040ExposedDropdownMenuBox$lambda2(MutableState<Integer> mutableState, int i10) {
        mutableState.setValue(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ExposedDropdownMenuBox$lambda-4, reason: not valid java name */
    public static final int m1041ExposedDropdownMenuBox$lambda4(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ExposedDropdownMenuBox$lambda-5, reason: not valid java name */
    public static final void m1042ExposedDropdownMenuBox$lambda5(MutableState<Integer> mutableState, int i10) {
        mutableState.setValue(Integer.valueOf(i10));
    }

    private static final Modifier expandable(Modifier modifier, final a<r> aVar, final String str) {
        return SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput(modifier, r.f5635a, new C12731(aVar, null)), false, new l<SemanticsPropertyReceiver, r>() { // from class: androidx.compose.material.ExposedDropdownMenuKt.expandable.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                tn.p.k(semanticsPropertyReceiver, "$this$semantics");
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                final a<r> aVar2 = aVar;
                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new a<Boolean>() { // from class: androidx.compose.material.ExposedDropdownMenuKt.expandable.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final Boolean invoke() {
                        aVar2.invoke();
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateHeight(View view, LayoutCoordinates layoutCoordinates, int i10, l<? super Integer, r> lVar) {
        if (layoutCoordinates == null) {
            return;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        lVar.invoke(Integer.valueOf(((int) Math.max(LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getTop() - rect.top, (rect.bottom - r1) - LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getBottom())) - i10));
    }
}
