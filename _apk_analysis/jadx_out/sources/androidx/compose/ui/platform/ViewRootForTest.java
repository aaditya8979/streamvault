package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.node.RootForTest;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewRootForTest.android.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bg\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\b\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/node/RootForTest;", "Lbn/r;", "invalidateDescendants", "Landroid/view/View;", "getView", "()Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "isLifecycleInResumedState", "()Z", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", VastTagName.COMPANION, "ui_release"}, k = 1, mv = {1, 6, 0})
@VisibleForTesting
public interface ViewRootForTest extends RootForTest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: ViewRootForTest.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\fR6\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/ViewRootForTest$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/ViewRootForTest;", "Lbn/r;", "onViewCreatedCallback", "Lsn/l;", "getOnViewCreatedCallback", "()Lsn/l;", "setOnViewCreatedCallback", "(Lsn/l;)V", "getOnViewCreatedCallback$annotations", "()V", "<init>", "ui_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Nullable
        private static sn.l<? super ViewRootForTest, bn.r> onViewCreatedCallback;

        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getOnViewCreatedCallback$annotations() {
        }

        @Nullable
        public final sn.l<ViewRootForTest, bn.r> getOnViewCreatedCallback() {
            return onViewCreatedCallback;
        }

        public final void setOnViewCreatedCallback(@Nullable sn.l<? super ViewRootForTest, bn.r> lVar) {
            onViewCreatedCallback = lVar;
        }
    }

    boolean getHasPendingMeasureOrLayout();

    @NotNull
    View getView();

    void invalidateDescendants();

    boolean isLifecycleInResumedState();
}
