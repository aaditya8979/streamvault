package pc;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.BlockListEntry;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;
import java.util.List;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleSpecialListViewModel.java */
/* JADX INFO: loaded from: classes.dex */
public class q0 extends np.e<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<BlockListEntry> f77242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HomeMultipleEntry f77243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableList<o0> f77244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public aq.c<o0> f77245f;

    public q0(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeRecommendMultipleListViewModel);
        this.f77244e = new ObservableArrayList();
        this.f77245f = aq.c.d(new aq.d() { // from class: pc.p0
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_recommend_multiple_list_item_special_list);
            }
        });
        this.f77243d = homeMultipleEntry;
        this.f75958b = str;
        this.f77242c = homeMultipleEntry.getBlock_list();
        for (int i10 = 0; i10 < this.f77242c.size(); i10++) {
            this.f77244e.add(new o0(homeRecommendMultipleListViewModel, this.f77242c.get(i10), i10));
        }
    }
}
