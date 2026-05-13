package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: PagerSnapStartHelper.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class PagerSnapStartHelper extends PagerSnapHelper {

    @Nullable
    private OrientationHelper _horizontalHelper;

    @Nullable
    private OrientationHelper _verticalHelper;
    private int itemSpacing;

    public PagerSnapStartHelper(int i10) {
        this.itemSpacing = i10;
    }

    private final int distanceToCenter(RecyclerView.LayoutManager layoutManager, View view, OrientationHelper orientationHelper) {
        float y10;
        int height;
        if (layoutManager.canScrollHorizontally()) {
            y10 = view.getX();
            height = view.getWidth() / 2;
        } else {
            y10 = view.getY();
            height = view.getHeight() / 2;
        }
        return ((int) (y10 + height)) - (layoutManager.getClipToPadding() ? orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2) : orientationHelper.getEnd() / 2);
    }

    private final OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this._horizontalHelper;
        if (orientationHelper != null) {
            if (!p.f(orientationHelper.getLayoutManager(), layoutManager)) {
                orientationHelper = null;
            }
            if (orientationHelper != null) {
                return orientationHelper;
            }
        }
        OrientationHelper orientationHelperCreateHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        this._horizontalHelper = orientationHelperCreateHorizontalHelper;
        return orientationHelperCreateHorizontalHelper;
    }

    private final OrientationHelper getVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this._verticalHelper;
        if (orientationHelper != null) {
            if (!p.f(orientationHelper.getLayoutManager(), layoutManager)) {
                orientationHelper = null;
            }
            if (orientationHelper != null) {
                return orientationHelper;
            }
        }
        OrientationHelper orientationHelperCreateVerticalHelper = OrientationHelper.createVerticalHelper(layoutManager);
        this._verticalHelper = orientationHelperCreateVerticalHelper;
        return orientationHelperCreateVerticalHelper;
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    @NotNull
    public int[] calculateDistanceToFinalSnap(@NotNull RecyclerView.LayoutManager layoutManager, @NotNull View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(layoutManager, view, getHorizontalHelper(layoutManager));
        } else if (layoutManager.canScrollVertically()) {
            iArr[1] = distanceToCenter(layoutManager, view, getVerticalHelper(layoutManager));
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(@NotNull RecyclerView.LayoutManager layoutManager, int i10, int i11) {
        p.i(layoutManager, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper");
        DivGalleryItemHelper divGalleryItemHelper = (DivGalleryItemHelper) layoutManager;
        if (divGalleryItemHelper.getLayoutManagerOrientation() != 0) {
            i10 = i11;
        } else if (layoutManager.getLayoutDirection() != 0) {
            i10 = -i10;
        }
        int iFirstCompletelyVisibleItemPosition = i10 < 0 ? divGalleryItemHelper.firstCompletelyVisibleItemPosition() : divGalleryItemHelper.lastCompletelyVisibleItemPosition();
        if (iFirstCompletelyVisibleItemPosition != -1) {
            return iFirstCompletelyVisibleItemPosition;
        }
        int iFirstVisibleItemPosition = divGalleryItemHelper.firstVisibleItemPosition();
        int iLastVisibleItemPosition = divGalleryItemHelper.lastVisibleItemPosition();
        if (iLastVisibleItemPosition != iFirstVisibleItemPosition) {
            return i10 < 0 ? iFirstVisibleItemPosition : iLastVisibleItemPosition;
        }
        if (iLastVisibleItemPosition != -1) {
            return iLastVisibleItemPosition;
        }
        return 0;
    }

    public final void setItemSpacing(int i10) {
        this.itemSpacing = i10;
    }
}
