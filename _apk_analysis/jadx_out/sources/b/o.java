package b;

import android.view.View;
import com.yk.e.activity.GameActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GameActivity f5333b;

    public o(GameActivity gameActivity) {
        this.f5333b = gameActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f5333b.ILil.canGoBack()) {
            this.f5333b.ILil.goBack();
        } else {
            this.f5333b.finish();
        }
    }
}
