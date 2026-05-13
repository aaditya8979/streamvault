package b;

import android.view.View;
import com.yk.e.activity.WebActivity;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebActivity f5341b;

    public w(WebActivity webActivity) {
        this.f5341b = webActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5341b.IL1Iii.reload();
    }
}
