package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import tn.y;

/* JADX INFO: compiled from: Wrapper.android.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b$\u0010%J\"\u0010\u0007\u001a\u00020\u00042\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR!\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u0006&"}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Landroidx/compose/runtime/Composition;", "Landroidx/lifecycle/LifecycleEventObserver;", "Lkotlin/Function0;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Lsn/p;)V", "dispose", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "onStateChanged", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwner", "()Landroidx/compose/ui/platform/AndroidComposeView;", "original", "Landroidx/compose/runtime/Composition;", "getOriginal", "()Landroidx/compose/runtime/Composition;", "", "disposed", "Z", "Landroidx/lifecycle/Lifecycle;", "addedToLifecycle", "Landroidx/lifecycle/Lifecycle;", "lastContent", "Lsn/p;", "getHasInvalidations", "()Z", "hasInvalidations", "isDisposed", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/Composition;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
final class WrappedComposition implements Composition, LifecycleEventObserver {

    @Nullable
    private Lifecycle addedToLifecycle;
    private boolean disposed;

    @NotNull
    private sn.p<? super Composer, ? super Integer, bn.r> lastContent;

    @NotNull
    private final Composition original;

    @NotNull
    private final AndroidComposeView owner;

    public WrappedComposition(@NotNull AndroidComposeView androidComposeView, @NotNull Composition composition) {
        tn.p.k(androidComposeView, "owner");
        tn.p.k(composition, "original");
        this.owner = androidComposeView;
        this.original = composition;
        this.lastContent = ComposableSingletons$Wrapper_androidKt.INSTANCE.m3311getLambda1$ui_release();
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.addedToLifecycle;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.original.dispose();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        return this.original.getHasInvalidations();
    }

    @NotNull
    public final Composition getOriginal() {
        return this.original;
    }

    @NotNull
    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    @Override // androidx.compose.runtime.Composition
    /* JADX INFO: renamed from: isDisposed */
    public boolean getDisposed() {
        return this.original.getDisposed();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event) {
        tn.p.k(lifecycleOwner, "source");
        tn.p.k(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.disposed) {
                return;
            }
            setContent(this.lastContent);
        }
    }

    @Override // androidx.compose.runtime.Composition
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void setContent(@NotNull final sn.p<? super Composer, ? super Integer, bn.r> content) {
        tn.p.k(content, "content");
        this.owner.setOnViewTreeOwnersAvailable(new sn.l<AndroidComposeView.ViewTreeOwners, bn.r>() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ bn.r invoke(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
                invoke2(viewTreeOwners);
                return bn.r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AndroidComposeView.ViewTreeOwners viewTreeOwners) {
                tn.p.k(viewTreeOwners, "it");
                if (WrappedComposition.this.disposed) {
                    return;
                }
                Lifecycle lifecycle = viewTreeOwners.getLifecycleOwner().getLifecycle();
                tn.p.j(lifecycle, "it.lifecycleOwner.lifecycle");
                WrappedComposition.this.lastContent = content;
                if (WrappedComposition.this.addedToLifecycle == null) {
                    WrappedComposition.this.addedToLifecycle = lifecycle;
                    lifecycle.addObserver(WrappedComposition.this);
                } else if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    Composition original = WrappedComposition.this.getOriginal();
                    final WrappedComposition wrappedComposition = WrappedComposition.this;
                    final sn.p<Composer, Integer, bn.r> pVar = content;
                    original.setContent(ComposableLambdaKt.composableLambdaInstance(-2000640158, true, new sn.p<Composer, Integer, bn.r>() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1

                        /* JADX INFO: renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1, reason: invalid class name and collision with other inner class name */
                        /* JADX INFO: compiled from: Wrapper.android.kt */
                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                        @jn.d(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", l = {153}, m = "invokeSuspend")
                        public static final class C01031 extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {
                            public int label;
                            public final /* synthetic */ WrappedComposition this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C01031(WrappedComposition wrappedComposition, hn.c<? super C01031> cVar) {
                                super(2, cVar);
                                this.this$0 = wrappedComposition;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final hn.c<bn.r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                                return new C01031(this.this$0, cVar);
                            }

                            @Override // sn.p
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                            public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super bn.r> cVar) {
                                return ((C01031) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object objG = in.a.g();
                                int i10 = this.label;
                                if (i10 == 0) {
                                    kotlin.c.b(obj);
                                    AndroidComposeView owner = this.this$0.getOwner();
                                    this.label = 1;
                                    if (owner.keyboardVisibilityEventLoop(this) == objG) {
                                        return objG;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.c.b(obj);
                                }
                                return bn.r.f5635a;
                            }
                        }

                        /* JADX INFO: renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Wrapper.android.kt */
                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                        @jn.d(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2", f = "Wrapper.android.kt", l = {154}, m = "invokeSuspend")
                        public static final class AnonymousClass2 extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {
                            public int label;
                            public final /* synthetic */ WrappedComposition this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass2(WrappedComposition wrappedComposition, hn.c<? super AnonymousClass2> cVar) {
                                super(2, cVar);
                                this.this$0 = wrappedComposition;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final hn.c<bn.r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                                return new AnonymousClass2(this.this$0, cVar);
                            }

                            @Override // sn.p
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                            public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super bn.r> cVar) {
                                return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object objG = in.a.g();
                                int i10 = this.label;
                                if (i10 == 0) {
                                    kotlin.c.b(obj);
                                    AndroidComposeView owner = this.this$0.getOwner();
                                    this.label = 1;
                                    if (owner.boundsUpdatesEventLoop(this) == objG) {
                                        return objG;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.c.b(obj);
                                }
                                return bn.r.f5635a;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // sn.p
                        /* JADX INFO: renamed from: invoke */
                        public /* bridge */ /* synthetic */ bn.r mo2invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return bn.r.f5635a;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer, int i10) {
                            if ((i10 & 11) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            AndroidComposeView owner = wrappedComposition.getOwner();
                            int i11 = R.id.inspection_slot_table_set;
                            Object tag = owner.getTag(i11);
                            Set<CompositionData> set = y.o(tag) ? (Set) tag : null;
                            if (set == null) {
                                Object parent = wrappedComposition.getOwner().getParent();
                                View view = parent instanceof View ? (View) parent : null;
                                Object tag2 = view != null ? view.getTag(i11) : null;
                                set = y.o(tag2) ? (Set) tag2 : null;
                            }
                            if (set != null) {
                                set.add(composer.getCompositionData());
                                composer.collectParameterInformation();
                            }
                            EffectsKt.LaunchedEffect(wrappedComposition.getOwner(), new C01031(wrappedComposition, null), composer, 8);
                            EffectsKt.LaunchedEffect(wrappedComposition.getOwner(), new AnonymousClass2(wrappedComposition, null), composer, 8);
                            ProvidedValue[] providedValueArr = {InspectionTablesKt.getLocalInspectionTables().provides(set)};
                            final WrappedComposition wrappedComposition2 = wrappedComposition;
                            final sn.p<Composer, Integer, bn.r> pVar2 = pVar;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer, -1193460702, true, new sn.p<Composer, Integer, bn.r>() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // sn.p
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ bn.r mo2invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return bn.r.f5635a;
                                }

                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i12) {
                                    if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                    } else {
                                        AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(wrappedComposition2.getOwner(), pVar2, composer2, 8);
                                    }
                                }
                            }), composer, 56);
                        }
                    }));
                }
            }
        });
    }
}
