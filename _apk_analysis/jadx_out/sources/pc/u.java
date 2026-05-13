package pc;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleHotViewModel.java */
/* JADX INFO: loaded from: classes12.dex */
public class u extends np.e<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HomeMultipleEntry f77251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableList<j> f77252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public aq.c<j> f77253e;

    public u(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeRecommendMultipleListViewModel);
        this.f77252d = new ObservableArrayList();
        this.f77253e = aq.c.d(new aq.d() { // from class: pc.t
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_recommend_multiple_list_item_hot);
            }
        });
        this.f77251c = homeMultipleEntry;
        this.f75958b = str;
        if (homeMultipleEntry.getBlock_list() == null || homeMultipleEntry.getBlock_list().size() <= 0 || homeMultipleEntry.getBlock_list().get(0).getVod_list() == null || homeMultipleEntry.getBlock_list().get(0).getVod_list().size() <= 0) {
            return;
        }
        this.f77252d.clear();
        for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(0).getVod_list().size(); i10++) {
            this.f77252d.add(new j(homeRecommendMultipleListViewModel, homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
        }
    }
}
