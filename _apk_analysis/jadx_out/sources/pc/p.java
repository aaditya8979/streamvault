package pc;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.channelcontent.SpecialDetailNewActivity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleCategoryViewModel.java */
/* JADX INFO: loaded from: classes12.dex */
public class p extends np.e<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HomeMultipleEntry f77238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableList<w> f77239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public aq.c<w> f77240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pp.b f77241f;

    public p(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeRecommendMultipleListViewModel);
        this.f77239d = new ObservableArrayList();
        this.f77240e = aq.c.d(new aq.d() { // from class: pc.n
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_recommend_multiple_list_item_category);
            }
        });
        this.f77241f = new pp.b(new pp.a() { // from class: pc.o
            @Override // pp.a
            public final void call() {
                this.f77234a.e();
            }
        });
        this.f77238c = homeMultipleEntry;
        this.f75958b = str;
        if (homeMultipleEntry.getBlock_list() == null || homeMultipleEntry.getBlock_list().size() <= 0 || homeMultipleEntry.getBlock_list().get(0).getVod_list() == null || homeMultipleEntry.getBlock_list().get(0).getVod_list().size() <= 0) {
            return;
        }
        this.f77239d.clear();
        for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(0).getVod_list().size(); i10++) {
            this.f77239d.add(new w(homeRecommendMultipleListViewModel, homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.f77238c.getBlock_list().get(0).getTopic_id());
        ((HomeRecommendMultipleListViewModel) this.f75954a).startActivity(SpecialDetailNewActivity.class, bundle);
    }
}
