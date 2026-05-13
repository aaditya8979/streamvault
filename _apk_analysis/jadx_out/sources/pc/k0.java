package pc;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.homecontent.more.VideoMoreListActivity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleNewViewModel.java */
/* JADX INFO: loaded from: classes5.dex */
public class k0 extends np.e<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f77214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HomeMultipleEntry f77215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableList<c0> f77216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public aq.c<c0> f77217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pp.b f77218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public pp.b f77219h;

    public k0(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeRecommendMultipleListViewModel);
        this.f77216e = new ObservableArrayList();
        this.f77217f = aq.c.d(new aq.d() { // from class: pc.h0
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_recommend_multiple_list_item_new);
            }
        });
        this.f77218g = new pp.b(new pp.a() { // from class: pc.i0
            @Override // pp.a
            public final void call() {
                this.f77205a.f();
            }
        });
        this.f77219h = new pp.b(new pp.a() { // from class: pc.j0
            @Override // pp.a
            public final void call() {
                this.f77212a.g();
            }
        });
        this.f77215d = homeMultipleEntry;
        this.f75958b = str;
        if (homeMultipleEntry.getBlock_list() == null || homeMultipleEntry.getBlock_list().size() <= 0 || homeMultipleEntry.getBlock_list().get(0).getVod_list() == null || homeMultipleEntry.getBlock_list().get(0).getVod_list().size() <= 0) {
            return;
        }
        this.f77216e.clear();
        this.f77214c = "";
        for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(0).getVod_list().size(); i10++) {
            if (i10 == homeMultipleEntry.getBlock_list().get(0).getVod_list().size() - 1) {
                this.f77214c += homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10).getId();
            } else {
                this.f77214c += homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10).getId() + StringUtils.COMMA;
            }
            this.f77216e.add(new c0(homeRecommendMultipleListViewModel, homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        Bundle bundle = new Bundle();
        bundle.putString("videoTitle", this.f77215d.getModule_name());
        bundle.putInt("videoModuleId", this.f77215d.getBlock_list().get(0).getTopic_id());
        ((HomeRecommendMultipleListViewModel) this.f75954a).startActivity(VideoMoreListActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        ((HomeRecommendMultipleListViewModel) this.f75954a).r(this, this.f77215d.getBlock_list().get(0).getTopic_id(), this.f77216e, this.f77214c, this.f77215d.getModule_id());
    }
}
