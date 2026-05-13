package eh;

import android.app.Activity;
import android.content.DialogInterface;

/* JADX INFO: compiled from: FinishListener.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f61143b;

    public b(Activity activity) {
        this.f61143b = activity;
    }

    public final void a() {
        this.f61143b.finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        a();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        a();
    }
}
