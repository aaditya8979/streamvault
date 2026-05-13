package nc;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;
import com.mgs.carparking.ui.homecontent.more.VideoMoreListActivity;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: ItemHomeContentMultipleNewViewModel.java */
/* JADX INFO: loaded from: classes10.dex */
public class y0 extends np.e<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f75839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HomeMultipleEntry f75840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableList<s0> f75841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public aq.c<s0> f75842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pp.b f75843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public pp.b f75844h;

    public y0(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeContentMultipleListViewModel);
        this.f75839c = "";
        this.f75841e = new ObservableArrayList();
        this.f75842f = aq.c.d(new aq.d() { // from class: nc.v0
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_content_multiple_list_item_new);
            }
        });
        this.f75843g = new pp.b(new pp.a() { // from class: nc.w0
            @Override // pp.a
            public final void call() {
                this.f75835a.f();
            }
        });
        this.f75844h = new pp.b(new pp.a() { // from class: nc.x0
            @Override // pp.a
            public final void call() {
                this.f75837a.g();
            }
        });
        this.f75840d = homeMultipleEntry;
        this.f75958b = str;
        if (homeMultipleEntry.getBlock_list() == null || homeMultipleEntry.getBlock_list().size() <= 0 || homeMultipleEntry.getBlock_list().get(0).getVod_list() == null || homeMultipleEntry.getBlock_list().get(0).getVod_list().size() <= 0) {
            return;
        }
        this.f75841e.clear();
        this.f75839c = "";
        for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(0).getVod_list().size(); i10++) {
            if (i10 == homeMultipleEntry.getBlock_list().get(0).getVod_list().size() - 1) {
                this.f75839c += homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10).getId();
            } else {
                this.f75839c += homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10).getId() + StringUtils.COMMA;
            }
            this.f75841e.add(new s0(homeContentMultipleListViewModel, homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        Bundle bundle = new Bundle();
        bundle.putString("videoTitle", this.f75840d.getModule_name());
        bundle.putInt("videoModuleId", this.f75840d.getBlock_list().get(0).getTopic_id());
        ((HomeContentMultipleListViewModel) this.f75954a).startActivity(VideoMoreListActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        ((HomeContentMultipleListViewModel) this.f75954a).s(this, this.f75840d.getBlock_list().get(0).getTopic_id(), this.f75841e, this.f75839c, this.f75840d.getModule_id());
    }
}
