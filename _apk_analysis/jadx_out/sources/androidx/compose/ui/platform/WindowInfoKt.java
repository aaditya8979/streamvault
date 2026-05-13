package androidx.compose.ui.platform;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: compiled from: WindowInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "", "Lbn/r;", "onWindowFocusChanged", "WindowFocusObserver", "(Lsn/l;Landroidx/compose/runtime/Composer;I)V", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class WindowInfoKt {
    @Composable
    public static final void WindowFocusObserver(@NotNull final sn.l<? super Boolean, bn.r> lVar, @Nullable Composer composer, final int i10) {
        int i11;
        tn.p.k(lVar, "onWindowFocusChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(127829799);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(lVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            WindowInfo windowInfo = (WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo());
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composerStartRestartGroup, i11 & 14);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(windowInfo) | composerStartRestartGroup.changed(stateRememberUpdatedState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new WindowInfoKt$WindowFocusObserver$1$1(windowInfo, stateRememberUpdatedState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(windowInfo, (sn.p<? super l0, ? super hn.c<? super bn.r>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, bn.r>() { // from class: androidx.compose.ui.platform.WindowInfoKt.WindowFocusObserver.2
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

            public final void invoke(@Nullable Composer composer2, int i12) {
                WindowInfoKt.WindowFocusObserver(lVar, composer2, i10 | 1);
            }
        });
    }
}
