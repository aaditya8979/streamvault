package com.mgs.carparking.shorttk;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.dramarush.shortin.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import zp.c;

/* JADX INFO: loaded from: classes4.dex */
public class BaseBottomSheetDialog extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FrameLayout f44326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f44327c;

    public int c() {
        return getResources().getDisplayMetrics().heightPixels;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.BaseDialog);
        setCancelable(true);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) getDialog();
        bottomSheetDialog.setCanceledOnTouchOutside(true);
        FrameLayout frameLayout = (FrameLayout) bottomSheetDialog.getDelegate().findViewById(R.id.design_bottom_sheet);
        this.f44326b = frameLayout;
        if (frameLayout != null) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) frameLayout.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).height = c.a(600.0f);
            this.f44326b.setLayoutParams(layoutParams);
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorFrom = BottomSheetBehavior.from(this.f44326b);
            this.f44327c = bottomSheetBehaviorFrom;
            bottomSheetBehaviorFrom.setPeekHeight(c());
            this.f44327c.setState(3);
        }
    }
}
