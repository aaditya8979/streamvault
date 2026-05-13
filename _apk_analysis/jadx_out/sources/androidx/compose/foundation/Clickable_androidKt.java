package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Clickable.android.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002\"\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u001b\u0010\u000e\u001a\u00020\u0001*\u00020\u000b8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lkotlin/Function0;", "", "isComposeRootInScrollableContainer", "(Landroidx/compose/runtime/Composer;I)Lsn/a;", "Landroid/view/View;", "isInScrollableViewGroup", "", "TapIndicationDelay", "J", "getTapIndicationDelay", "()J", "Landroidx/compose/ui/input/key/KeyEvent;", "isClick-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isClick", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class Clickable_androidKt {
    private static final long TapIndicationDelay = ViewConfiguration.getTapTimeout();

    public static final long getTapIndicationDelay() {
        return TapIndicationDelay;
    }

    /* JADX INFO: renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m198isClickZmokQxo(@NotNull KeyEvent keyEvent) {
        p.k(keyEvent, "$this$isClick");
        if (KeyEventType.m2846equalsimpl0(KeyEvent_androidKt.m2854getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m2851getKeyUpCS__XNY())) {
            int iM2863getNativeKeyCodeYVgTNJs = Key_androidKt.m2863getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m2853getKeyZmokQxo(keyEvent));
            if (iM2863getNativeKeyCodeYVgTNJs == 23 || iM2863getNativeKeyCodeYVgTNJs == 66 || iM2863getNativeKeyCodeYVgTNJs == 160) {
                return true;
            }
        }
        return false;
    }

    @Composable
    @NotNull
    public static final sn.a<Boolean> isComposeRootInScrollableContainer(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1990508712);
        final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        sn.a<Boolean> aVar = new sn.a<Boolean>() { // from class: androidx.compose.foundation.Clickable_androidKt.isComposeRootInScrollableContainer.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(Clickable_androidKt.isInScrollableViewGroup(view));
            }
        };
        composer.endReplaceableGroup();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isInScrollableViewGroup(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
