package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import bn.r;
import cn.w;
import hn.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.l;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aB\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00052\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\n\u001aL\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\f\u001aP\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\r\"\u0004\u0018\u00010\u00052\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lhn/c;", "Lbn/r;", "", "block", "pointerInput", "(Landroidx/compose/ui/Modifier;Lsn/p;)Landroidx/compose/ui/Modifier;", "key1", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lsn/p;)Landroidx/compose/ui/Modifier;", "key2", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Lsn/p;)Landroidx/compose/ui/Modifier;", "", "keys", "(Landroidx/compose/ui/Modifier;[Ljava/lang/Object;Lsn/p;)Landroidx/compose/ui/Modifier;", "", "PointerInputModifierNoParamError", "Ljava/lang/String;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "EmptyPointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class SuspendingPointerInputFilterKt {

    @NotNull
    private static final PointerEvent EmptyPointerEvent = new PointerEvent(w.m());

    @NotNull
    private static final String PointerInputModifierNoParamError = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";

    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier, @Nullable final Object obj, @Nullable final Object obj2, @NotNull final p<? super PointerInputScope, ? super c<? super r>, ? extends Object> pVar) {
        tn.p.k(modifier, "<this>");
        tn.p.k(pVar, "block");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$2
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
                tn.p.k(inspectorInfo, "$this$null");
                inspectorInfo.setName("pointerInput");
                inspectorInfo.getProperties().set("key1", obj);
                inspectorInfo.getProperties().set("key2", obj2);
                inspectorInfo.getProperties().set("block", pVar);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i10) {
                tn.p.k(modifier2, "$this$composed");
                composer.startReplaceableGroup(1175567217);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(density);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new SuspendingPointerInputFilter(viewConfiguration, density);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) objRememberedValue;
                EffectsKt.LaunchedEffect(suspendingPointerInputFilter, obj, obj2, new SuspendingPointerInputFilterKt$pointerInput$4$2$1(suspendingPointerInputFilter, pVar, null), composer, 576);
                composer.endReplaceableGroup();
                return suspendingPointerInputFilter;
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier, @Nullable final Object obj, @NotNull final p<? super PointerInputScope, ? super c<? super r>, ? extends Object> pVar) {
        tn.p.k(modifier, "<this>");
        tn.p.k(pVar, "block");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$1
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
                tn.p.k(inspectorInfo, "$this$null");
                inspectorInfo.setName("pointerInput");
                inspectorInfo.getProperties().set("key1", obj);
                inspectorInfo.getProperties().set("block", pVar);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i10) {
                tn.p.k(modifier2, "$this$composed");
                composer.startReplaceableGroup(-906157935);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(density);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new SuspendingPointerInputFilter(viewConfiguration, density);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) objRememberedValue;
                EffectsKt.LaunchedEffect(suspendingPointerInputFilter, obj, new SuspendingPointerInputFilterKt$pointerInput$2$2$1(suspendingPointerInputFilter, pVar, null), composer, 64);
                composer.endReplaceableGroup();
                return suspendingPointerInputFilter;
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier, @NotNull p<? super PointerInputScope, ? super c<? super r>, ? extends Object> pVar) {
        tn.p.k(modifier, "<this>");
        tn.p.k(pVar, "block");
        throw new IllegalStateException(PointerInputModifierNoParamError.toString());
    }

    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier, @NotNull final Object[] objArr, @NotNull final p<? super PointerInputScope, ? super c<? super r>, ? extends Object> pVar) {
        tn.p.k(modifier, "<this>");
        tn.p.k(objArr, "keys");
        tn.p.k(pVar, "block");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$3
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
                tn.p.k(inspectorInfo, "$this$null");
                inspectorInfo.setName("pointerInput");
                inspectorInfo.getProperties().set("keys", objArr);
                inspectorInfo.getProperties().set("block", pVar);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i10) {
                tn.p.k(modifier2, "$this$composed");
                composer.startReplaceableGroup(664422852);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(density);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new SuspendingPointerInputFilter(viewConfiguration, density);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Object[] objArr2 = objArr;
                p<PointerInputScope, c<? super r>, Object> pVar2 = pVar;
                SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) objRememberedValue;
                tn.w wVar = new tn.w(2);
                wVar.a(suspendingPointerInputFilter);
                wVar.b(objArr2);
                EffectsKt.LaunchedEffect(wVar.d(new Object[wVar.c()]), (p<? super l0, ? super c<? super r>, ? extends Object>) new SuspendingPointerInputFilterKt$pointerInput$6$2$1(suspendingPointerInputFilter, pVar2, null), composer, 8);
                composer.endReplaceableGroup();
                return suspendingPointerInputFilter;
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }
}
