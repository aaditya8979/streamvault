package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a.\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000\u001a:\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0014\b\b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0000H\u0086\bø\u0001\u0000\u001a(\u0010\n\u001a\u00020\u0005*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0001\"#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lbn/r;", "definitions", "debugInspectorInfo", "Landroidx/compose/ui/Modifier;", "inspectorInfo", "factory", "inspectable", "wrapped", "inspectableWrapper", "NoInspectorInfo", "Lsn/l;", "getNoInspectorInfo", "()Lsn/l;", "", "isDebugInspectorInfoEnabled", "Z", "()Z", "setDebugInspectorInfoEnabled", "(Z)V", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class InspectableValueKt {

    @NotNull
    private static final sn.l<InspectorInfo, bn.r> NoInspectorInfo = new sn.l<InspectorInfo, bn.r>() { // from class: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1
        @Override // sn.l
        public /* bridge */ /* synthetic */ bn.r invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return bn.r.f5635a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
            tn.p.k(inspectorInfo, "$this$null");
        }
    };
    private static boolean isDebugInspectorInfoEnabled;

    @NotNull
    public static final sn.l<InspectorInfo, bn.r> debugInspectorInfo(@NotNull final sn.l<? super InspectorInfo, bn.r> lVar) {
        tn.p.k(lVar, "definitions");
        return isDebugInspectorInfoEnabled() ? new sn.l<InspectorInfo, bn.r>() { // from class: androidx.compose.ui.platform.InspectableValueKt.debugInspectorInfo.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ bn.r invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return bn.r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                tn.p.k(inspectorInfo, "$this$null");
                lVar.invoke(inspectorInfo);
            }
        } : getNoInspectorInfo();
    }

    @NotNull
    public static final sn.l<InspectorInfo, bn.r> getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    @NotNull
    public static final Modifier inspectable(@NotNull Modifier modifier, @NotNull sn.l<? super InspectorInfo, bn.r> lVar, @NotNull sn.l<? super Modifier, ? extends Modifier> lVar2) {
        tn.p.k(modifier, "<this>");
        tn.p.k(lVar, "inspectorInfo");
        tn.p.k(lVar2, "factory");
        return inspectableWrapper(modifier, lVar, lVar2.invoke(Modifier.INSTANCE));
    }

    @NotNull
    public static final Modifier inspectableWrapper(@NotNull Modifier modifier, @NotNull sn.l<? super InspectorInfo, bn.r> lVar, @NotNull Modifier modifier2) {
        tn.p.k(modifier, "<this>");
        tn.p.k(lVar, "inspectorInfo");
        tn.p.k(modifier2, "wrapped");
        InspectableModifier inspectableModifier = new InspectableModifier(lVar);
        return modifier.then(inspectableModifier).then(modifier2).then(inspectableModifier.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z10) {
        isDebugInspectorInfoEnabled = z10;
    }
}
