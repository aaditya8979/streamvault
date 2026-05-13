package com.luck.picture.lib.dialog;

import ab.e;
import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$style;
import ra.k;

/* JADX INFO: loaded from: classes.dex */
public class PhotoItemSelectedDialog extends DialogFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35056b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f35057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f35058d;

    public interface a {
        void a(boolean z10, DialogInterface dialogInterface);
    }

    public static PhotoItemSelectedDialog d() {
        return new PhotoItemSelectedDialog();
    }

    public final void c() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(e.e(getContext()), -2);
        window.setGravity(80);
        window.setWindowAnimations(R$style.PictureThemeDialogFragmentAnim);
    }

    public void e(a aVar) {
        this.f35058d = aVar;
    }

    public void f(k kVar) {
        this.f35057c = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        k kVar = this.f35057c;
        if (kVar != null) {
            if (id2 == R$id.ps_tv_photo) {
                kVar.a(view, 0);
                this.f35056b = false;
            } else if (id2 == R$id.ps_tv_video) {
                kVar.a(view, 1);
                this.f35056b = false;
            }
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (getDialog() != null) {
            getDialog().requestWindowFeature(1);
            if (getDialog().getWindow() != null) {
                getDialog().getWindow().setBackgroundDrawableResource(R.color.transparent);
            }
        }
        return layoutInflater.inflate(R$layout.ps_dialog_camera_selected, viewGroup);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        a aVar = this.f35058d;
        if (aVar != null) {
            aVar.a(this.f35056b, dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R$id.ps_tv_photo);
        TextView textView2 = (TextView) view.findViewById(R$id.ps_tv_video);
        TextView textView3 = (TextView) view.findViewById(R$id.ps_tv_cancel);
        textView2.setOnClickListener(this);
        textView.setOnClickListener(this);
        textView3.setOnClickListener(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.add(this, str);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }
}
