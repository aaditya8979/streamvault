package sg.bigo.ads.controller.form;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.ad.c;
import sg.bigo.ads.common.form.a;
import sg.bigo.ads.common.form.render.b;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.controller.landing.e;

/* JADX INFO: loaded from: classes6.dex */
public class AdFormActivity extends Activity implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private c<?, ?> f83371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f83372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f83373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f83374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f83375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f83376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private sg.bigo.ads.common.form.c f83377g;

    @NonNull
    public static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) AdFormActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    @Override // sg.bigo.ads.common.form.render.b.a
    public final void a() {
        this.f83374d = true;
        c<?, ?> cVar = this.f83371a;
        if (cVar != null) {
            cVar.f80029j = true;
        }
    }

    @Override // sg.bigo.ads.common.form.render.b.a
    public final void a(String str) {
        if (q.a((CharSequence) str)) {
            return;
        }
        e.a(this, this, str, this.f83371a);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if ((currentFocus instanceof EditText) && !u.a(currentFocus, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentFocus.clearFocus();
                try {
                    ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
                } catch (Throwable unused) {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f83374d) {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013d  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(@androidx.annotation.Nullable android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.form.AdFormActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    @CallSuper
    public void onDestroy() {
        sg.bigo.ads.common.form.c cVar;
        b bVar;
        super.onDestroy();
        try {
            if (this.f83371a != null && (cVar = this.f83377g) != null && (bVar = cVar.f82041a) != null) {
                Map<String, Object> mapA = a.a(bVar.f82074b, bVar.f82075c.b(), bVar.f82075c.a());
                boolean z10 = this.f83374d;
                if (!z10) {
                    a.a(this.f83373c, mapA);
                } else if (z10) {
                    a.a(this.f83373c, 3);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
