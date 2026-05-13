package b;

import android.view.View;
import com.yk.e.activity.WebActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebActivity f5329b;

    public l(WebActivity webActivity) {
        this.f5329b = webActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5329b.finish();
    }
}
