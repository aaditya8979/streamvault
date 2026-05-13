package ed;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import ed.s;
import java.util.Timer;
import java.util.TimerTask;
import me.goldze.mvvmhabit.base.BaseApplication;

/* JADX INFO: compiled from: KeyboardHelper.java */
/* JADX INFO: loaded from: classes6.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static s f61091a;

    /* JADX INFO: compiled from: KeyboardHelper.java */
    public class a extends TimerTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EditText f61092b;

        public a(EditText editText) {
            this.f61092b = editText;
        }

        public static /* synthetic */ void b(EditText editText) {
            editText.setSelection(editText.getText().length());
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ((InputMethodManager) BaseApplication.getInstance().getSystemService("input_method")).showSoftInput(this.f61092b, 0);
            final EditText editText = this.f61092b;
            editText.post(new Runnable() { // from class: ed.r
                @Override // java.lang.Runnable
                public final void run() {
                    s.a.b(editText);
                }
            });
        }
    }

    public static s b() {
        if (f61091a == null) {
            f61091a = new s();
        }
        return f61091a;
    }

    public static void c(View view) {
        ((InputMethodManager) BaseApplication.getInstance().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void a(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    public void d(EditText editText) {
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        new Timer().schedule(new a(editText), 200L);
    }
}
