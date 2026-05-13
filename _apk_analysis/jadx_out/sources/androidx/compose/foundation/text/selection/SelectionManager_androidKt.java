package androidx.compose.foundation.text.selection;

import android.annotation.SuppressLint;
import android.view.KeyEvent;
import androidx.compose.foundation.MagnifierKt;
import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import bn.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: SelectionManager.android.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"isCopyKeyEvent", "", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "isCopyKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "selectionMagnifier", "Landroidx/compose/ui/Modifier;", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SelectionManager_androidKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1, reason: invalid class name */
    /* JADX INFO: compiled from: SelectionManager.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass1 extends Lambda implements q<Modifier, Composer, Integer, Modifier> {
        public final /* synthetic */ SelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SelectionManager selectionManager) {
            super(3);
            this.$manager = selectionManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
        public static final long m837invoke$lambda1(MutableState<IntSize> mutableState) {
            return mutableState.getValue().getPackedValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-2, reason: not valid java name */
        public static final void m838invoke$lambda2(MutableState<IntSize> mutableState, long j10) {
            mutableState.setValue(IntSize.m3978boximpl(j10));
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier modifier, @Nullable Composer composer, int i10) {
            p.k(modifier, "$this$composed");
            composer.startReplaceableGroup(-1914520728);
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3978boximpl(IntSize.INSTANCE.m3991getZeroYbymL2g()), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            final SelectionManager selectionManager = this.$manager;
            Modifier modifierAnimatedSelectionMagnifier = SelectionMagnifierKt.animatedSelectionMagnifier(modifier, new sn.a<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt.selectionMagnifier.1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // sn.a
                public /* bridge */ /* synthetic */ Offset invoke() {
                    return Offset.m1372boximpl(m839invokeF1C5BW0());
                }

                /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
                public final long m839invokeF1C5BW0() {
                    return SelectionManagerKt.m832calculateSelectionMagnifierCenterAndroidO0kMr_c(selectionManager, AnonymousClass1.m837invoke$lambda1(mutableState));
                }
            }, new l<sn.a<? extends Offset>, Modifier>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt.selectionMagnifier.1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Modifier invoke2(@NotNull final sn.a<Offset> aVar) {
                    p.k(aVar, "center");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MagnifierStyle textDefault = MagnifierStyle.INSTANCE.getTextDefault();
                    l<Density, Offset> lVar = new l<Density, Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt.selectionMagnifier.1.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // sn.l
                        public /* bridge */ /* synthetic */ Offset invoke(Density density2) {
                            return Offset.m1372boximpl(m840invoketuRUvjQ(density2));
                        }

                        /* JADX INFO: renamed from: invoke-tuRUvjQ, reason: not valid java name */
                        public final long m840invoketuRUvjQ(@NotNull Density density2) {
                            p.k(density2, "$this$magnifier");
                            return aVar.invoke().getPackedValue();
                        }
                    };
                    final Density density2 = density;
                    final MutableState<IntSize> mutableState2 = mutableState;
                    return MagnifierKt.magnifier$default(companion, lVar, null, 0.0f, textDefault, new l<DpSize, r>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt.selectionMagnifier.1.2.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // sn.l
                        public /* bridge */ /* synthetic */ r invoke(DpSize dpSize) {
                            m841invokeEaSLcWc(dpSize.getPackedValue());
                            return r.f5635a;
                        }

                        /* JADX INFO: renamed from: invoke-EaSLcWc, reason: not valid java name */
                        public final void m841invokeEaSLcWc(long j10) {
                            MutableState<IntSize> mutableState3 = mutableState2;
                            Density density3 = density2;
                            AnonymousClass1.m838invoke$lambda2(mutableState3, IntSizeKt.IntSize(density3.mo300roundToPx0680j_4(DpSize.m3924getWidthD9Ej5fM(j10)), density3.mo300roundToPx0680j_4(DpSize.m3922getHeightD9Ej5fM(j10))));
                        }
                    }, 6, null);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ Modifier invoke(sn.a<? extends Offset> aVar) {
                    return invoke2((sn.a<Offset>) aVar);
                }
            });
            composer.endReplaceableGroup();
            return modifierAnimatedSelectionMagnifier;
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }
    }

    /* JADX INFO: renamed from: isCopyKeyEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m834isCopyKeyEventZmokQxo(@NotNull KeyEvent keyEvent) {
        p.k(keyEvent, "keyEvent");
        return false;
    }

    @SuppressLint({"ModifierInspectorInfo"})
    @NotNull
    public static final Modifier selectionMagnifier(@NotNull Modifier modifier, @NotNull SelectionManager selectionManager) {
        p.k(modifier, "<this>");
        p.k(selectionManager, "manager");
        return !MagnifierStyle.INSTANCE.getTextDefault().isSupported() ? modifier : ComposedModifierKt.composed$default(modifier, null, new AnonymousClass1(selectionManager), 1, null);
    }
}
