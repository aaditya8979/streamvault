package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import bn.r;
import hn.c;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: PointerIcon.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"pointerHoverIcon", "Landroidx/compose/ui/Modifier;", "icon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "overrideDescendants", "", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class PointerIconKt {
    @Stable
    @NotNull
    public static final Modifier pointerHoverIcon(@NotNull Modifier modifier, @NotNull final PointerIcon pointerIcon, final boolean z10) {
        p.k(modifier, "<this>");
        p.k(pointerIcon, "icon");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                p.k(inspectorInfo, "$this$null");
                inspectorInfo.setName("pointerHoverIcon");
                inspectorInfo.getProperties().set("icon", pointerIcon);
                inspectorInfo.getProperties().set("overrideDescendants", Boolean.valueOf(z10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon.2

            /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: PointerIcon.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @d(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1", f = "PointerIcon.kt", l = {74}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements sn.p<PointerInputScope, c<? super r>, Object> {
                public final /* synthetic */ PointerIcon $icon;
                public final /* synthetic */ boolean $overrideDescendants;
                public final /* synthetic */ PointerIconService $pointerIconService;
                private /* synthetic */ Object L$0;
                public int label;

                /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: PointerIcon.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @d(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1", f = "PointerIcon.kt", l = {80}, m = "invokeSuspend")
                public static final class C01001 extends RestrictedSuspendLambda implements sn.p<AwaitPointerEventScope, c<? super r>, Object> {
                    public final /* synthetic */ PointerIcon $icon;
                    public final /* synthetic */ boolean $overrideDescendants;
                    public final /* synthetic */ PointerIconService $pointerIconService;
                    private /* synthetic */ Object L$0;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C01001(boolean z10, PointerIconService pointerIconService, PointerIcon pointerIcon, c<? super C01001> cVar) {
                        super(2, cVar);
                        this.$overrideDescendants = z10;
                        this.$pointerIconService = pointerIconService;
                        this.$icon = pointerIcon;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                        C01001 c01001 = new C01001(this.$overrideDescendants, this.$pointerIconService, this.$icon, cVar);
                        c01001.L$0 = obj;
                        return c01001;
                    }

                    @Override // sn.p
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public final Object mo2invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable c<? super r> cVar) {
                        return ((C01001) create(awaitPointerEventScope, cVar)).invokeSuspend(r.f5635a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
                    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003b -> B:17:0x0040). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
                        /*
                            r12 = this;
                            java.lang.Object r0 = in.a.g()
                            int r1 = r12.label
                            r2 = 1
                            if (r1 == 0) goto L1e
                            if (r1 != r2) goto L16
                            java.lang.Object r1 = r12.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                            kotlin.c.b(r13)
                            r3 = r1
                            r1 = r0
                            r0 = r12
                            goto L40
                        L16:
                            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r13.<init>(r0)
                            throw r13
                        L1e:
                            kotlin.c.b(r13)
                            java.lang.Object r13 = r12.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                            r1 = r13
                            r13 = r12
                        L27:
                            boolean r3 = r13.$overrideDescendants
                            if (r3 == 0) goto L2e
                            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                            goto L30
                        L2e:
                            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        L30:
                            r13.L$0 = r1
                            r13.label = r2
                            java.lang.Object r3 = r1.awaitPointerEvent(r3, r13)
                            if (r3 != r0) goto L3b
                            return r0
                        L3b:
                            r11 = r0
                            r0 = r13
                            r13 = r3
                            r3 = r1
                            r1 = r11
                        L40:
                            androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
                            int r4 = r13.getType()
                            androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE
                            int r6 = r5.m2947getRelease7fucELk()
                            boolean r4 = androidx.compose.ui.input.pointer.PointerEventType.m2939equalsimpl0(r4, r6)
                            r6 = 0
                            if (r4 == 0) goto L6e
                            java.util.List r4 = r13.getChanges()
                            java.lang.Object r4 = r4.get(r6)
                            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                            long r7 = r3.mo2903getSizeYbymL2g()
                            androidx.compose.ui.geometry.Size$Companion r9 = androidx.compose.ui.geometry.Size.INSTANCE
                            long r9 = r9.m1461getZeroNHjbRc()
                            boolean r4 = androidx.compose.ui.input.pointer.PointerEventKt.m2935isOutOfBoundsjwHxaWs(r4, r7, r9)
                            if (r4 == 0) goto L6e
                            r6 = r2
                        L6e:
                            int r13 = r13.getType()
                            int r4 = r5.m2944getExit7fucELk()
                            boolean r13 = androidx.compose.ui.input.pointer.PointerEventType.m2939equalsimpl0(r13, r4)
                            if (r13 != 0) goto L85
                            if (r6 != 0) goto L85
                            androidx.compose.ui.input.pointer.PointerIconService r13 = r0.$pointerIconService
                            androidx.compose.ui.input.pointer.PointerIcon r4 = r0.$icon
                            r13.setCurrent(r4)
                        L85:
                            r13 = r0
                            r0 = r1
                            r1 = r3
                            goto L27
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerIconKt.AnonymousClass2.AnonymousClass1.C01001.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(boolean z10, PointerIconService pointerIconService, PointerIcon pointerIcon, c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$overrideDescendants = z10;
                    this.$pointerIconService = pointerIconService;
                    this.$icon = pointerIcon;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$overrideDescendants, this.$pointerIconService, this.$icon, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // sn.p
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final Object mo2invoke(@NotNull PointerInputScope pointerInputScope, @Nullable c<? super r> cVar) {
                    return ((AnonymousClass1) create(pointerInputScope, cVar)).invokeSuspend(r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = in.a.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.c.b(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C01001 c01001 = new C01001(this.$overrideDescendants, this.$pointerIconService, this.$icon, null);
                        this.label = 1;
                        if (pointerInputScope.awaitPointerEventScope(c01001, this) == objG) {
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
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i10) {
                p.k(modifier2, "$this$composed");
                composer.startReplaceableGroup(811087536);
                PointerIconService pointerIconService = (PointerIconService) composer.consume(CompositionLocalsKt.getLocalPointerIconService());
                Modifier modifierPointerInput = pointerIconService == null ? Modifier.INSTANCE : SuspendingPointerInputFilterKt.pointerInput(modifier2, pointerIcon, Boolean.valueOf(z10), new AnonymousClass1(z10, pointerIconService, pointerIcon, null));
                composer.endReplaceableGroup();
                return modifierPointerInput;
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    public static /* synthetic */ Modifier pointerHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return pointerHoverIcon(modifier, pointerIcon, z10);
    }
}
