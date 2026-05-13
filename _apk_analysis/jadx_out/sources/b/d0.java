package b;

import android.view.View;
import com.yk.e.activity.GameActivity;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GameActivity f5313b;

    public d0(GameActivity gameActivity) {
        this.f5313b = gameActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5313b.finish();
    }
}
