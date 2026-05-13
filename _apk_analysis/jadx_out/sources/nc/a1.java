package nc;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeContentMultipleNoTitleViewModel.java */
/* JADX INFO: loaded from: classes12.dex */
public class a1 extends np.e<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HomeMultipleEntry f75745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableList<u0> f75746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public aq.c<u0> f75747e;

    public a1(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeContentMultipleListViewModel);
        this.f75746d = new ObservableArrayList();
        this.f75747e = aq.c.d(new aq.d() { // from class: nc.z0
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_recommend_multiple_list_item_no_title);
            }
        });
        this.f75745c = homeMultipleEntry;
        this.f75958b = str;
        if (homeMultipleEntry.getBlock_list().get(0).getVod_list() == null || homeMultipleEntry.getBlock_list().get(0).getVod_list().size() <= 0) {
            return;
        }
        this.f75746d.clear();
        for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(0).getVod_list().size(); i10++) {
            this.f75746d.add(new u0(homeContentMultipleListViewModel, homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
        }
    }
}
