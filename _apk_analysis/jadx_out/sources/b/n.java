package b;

import android.view.KeyEvent;
import android.view.View;
import com.yk.e.activity.GameActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements View.OnKeyListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GameActivity f5332b;

    public n(GameActivity gameActivity) {
        this.f5332b = gameActivity;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i10 != 4 || !this.f5332b.ILil.canGoBack()) {
            return false;
        }
        this.f5332b.ILil.goBack();
        return true;
    }
}
