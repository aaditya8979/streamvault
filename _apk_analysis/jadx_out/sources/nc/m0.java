package nc;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeContentMultipleHotViewModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class m0 extends np.e<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HomeMultipleEntry f75793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableList<q0> f75794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public aq.c<q0> f75795e;

    public m0(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeContentMultipleListViewModel);
        this.f75794d = new ObservableArrayList();
        this.f75795e = aq.c.d(new aq.d() { // from class: nc.l0
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_content_multiple_list_item_hot);
            }
        });
        this.f75793c = homeMultipleEntry;
        this.f75958b = str;
        if (homeMultipleEntry.getBlock_list().get(0).getVod_list() == null || homeMultipleEntry.getBlock_list().get(0).getVod_list().size() <= 0) {
            return;
        }
        this.f75794d.clear();
        for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(0).getVod_list().size(); i10++) {
            this.f75794d.add(new q0(homeContentMultipleListViewModel, homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
        }
    }
}
