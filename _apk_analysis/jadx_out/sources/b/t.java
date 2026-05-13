package b;

import android.view.View;
import com.yk.e.activity.GameActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GameActivity f5338b;

    public t(GameActivity gameActivity) {
        this.f5338b = gameActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        GameActivity.IL1Iii(this.f5338b, true);
    }
}
