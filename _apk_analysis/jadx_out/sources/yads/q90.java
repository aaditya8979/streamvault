package yads;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import yads.q90;

/* JADX INFO: loaded from: classes3.dex */
public final class q90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w40 f93956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f93957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProgressBar f93958c;

    public q90(IntegrationInspectorActivity integrationInspectorActivity, final bc1 bc1Var, LinearLayoutManager linearLayoutManager, w40 w40Var) {
        this.f93956a = w40Var;
        ImageButton imageButton = (ImageButton) integrationInspectorActivity.findViewById(R$id.toolbar_navigation_button);
        this.f93957b = (TextView) integrationInspectorActivity.findViewById(R$id.toolbar_title);
        this.f93958c = (ProgressBar) integrationInspectorActivity.findViewById(R$id.loading_view);
        RecyclerView recyclerView = (RecyclerView) integrationInspectorActivity.findViewById(R$id.recycler_view);
        a80 a80Var = new a80();
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: bt.s8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q90.a(bc1Var, view);
            }
        });
        int iA = (int) vo3.b(integrationInspectorActivity).a();
        recyclerView.setAdapter(w40Var);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(a80Var);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom() + iA);
    }

    public static final void a(sn.l lVar, View view) {
        lVar.invoke(b90.f87949a);
    }
}
