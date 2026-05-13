package gc;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: DetachClickListener.java */
/* JADX INFO: loaded from: classes12.dex */
public class a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DialogInterface.OnClickListener f62367b;

    /* JADX INFO: renamed from: gc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DetachClickListener.java */
    public class ViewTreeObserverOnWindowAttachListenerC0771a implements ViewTreeObserver.OnWindowAttachListener {
        public ViewTreeObserverOnWindowAttachListenerC0771a() {
        }

        @Override // android.view.ViewTreeObserver.OnWindowAttachListener
        public void onWindowAttached() {
        }

        @Override // android.view.ViewTreeObserver.OnWindowAttachListener
        public void onWindowDetached() {
            a.this.f62367b = null;
        }
    }

    public a(DialogInterface.OnClickListener onClickListener) {
        this.f62367b = onClickListener;
    }

    public static a c(DialogInterface.OnClickListener onClickListener) {
        return new a(onClickListener);
    }

    public void b(Dialog dialog) {
        if (dialog.getWindow() != null) {
            dialog.getWindow().getDecorView().getViewTreeObserver().addOnWindowAttachListener(new ViewTreeObserverOnWindowAttachListenerC0771a());
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        DialogInterface.OnClickListener onClickListener = this.f62367b;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i10);
        }
    }
}
