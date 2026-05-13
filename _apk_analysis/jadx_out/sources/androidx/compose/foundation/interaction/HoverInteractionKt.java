package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import bn.r;
import go.e;
import hn.c;
import in.a;
import java.util.ArrayList;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: HoverInteraction.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"collectIsHoveredAsState", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class HoverInteractionKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1, reason: invalid class name */
    /* JADX INFO: compiled from: HoverInteraction.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @d(c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1", f = "HoverInteraction.kt", l = {69}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ MutableState<Boolean> $isHovered;
        public final /* synthetic */ InteractionSource $this_collectIsHoveredAsState;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InteractionSource interactionSource, MutableState<Boolean> mutableState, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$this_collectIsHoveredAsState = interactionSource;
            this.$isHovered = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new AnonymousClass1(this.$this_collectIsHoveredAsState, this.$isHovered, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                final ArrayList arrayList = new ArrayList();
                go.d<Interaction> interactions = this.$this_collectIsHoveredAsState.getInteractions();
                final MutableState<Boolean> mutableState = this.$isHovered;
                e<Interaction> eVar = new e<Interaction>() { // from class: androidx.compose.foundation.interaction.HoverInteractionKt.collectIsHoveredAsState.1.1
                    @Nullable
                    /* JADX INFO: renamed from: emit, reason: avoid collision after fix types in other method */
                    public final Object emit2(@NotNull Interaction interaction, @NotNull c<? super r> cVar) {
                        if (interaction instanceof HoverInteraction.Enter) {
                            arrayList.add(interaction);
                        } else if (interaction instanceof HoverInteraction.Exit) {
                            arrayList.remove(((HoverInteraction.Exit) interaction).getEnter());
                        }
                        mutableState.setValue(jn.a.a(!arrayList.isEmpty()));
                        return r.f5635a;
                    }

                    @Override // go.e
                    public /* bridge */ /* synthetic */ Object emit(Interaction interaction, c cVar) {
                        return emit2(interaction, (c<? super r>) cVar);
                    }
                };
                this.label = 1;
                if (interactions.collect(eVar, this) == objG) {
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

    @Composable
    @NotNull
    public static final State<Boolean> collectIsHoveredAsState(@NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        tn.p.k(interactionSource, "<this>");
        composer.startReplaceableGroup(1206586544);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        EffectsKt.LaunchedEffect(interactionSource, new AnonymousClass1(interactionSource, mutableState, null), composer, i10 & 14);
        composer.endReplaceableGroup();
        return mutableState;
    }
}
