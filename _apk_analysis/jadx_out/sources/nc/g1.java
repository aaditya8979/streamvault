package nc;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.BlockListEntry;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;
import java.util.List;

/* JADX INFO: compiled from: ItemHomeContentMultipleSpecialListViewModel.java */
/* JADX INFO: loaded from: classes12.dex */
public class g1 extends np.e<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HomeMultipleEntry f75774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<BlockListEntry> f75775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f75776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableList<e1> f75777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public aq.c<e1> f75778g;

    public g1(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str, int i10) {
        super(homeContentMultipleListViewModel);
        this.f75777f = new ObservableArrayList();
        this.f75778g = aq.c.d(new aq.d() { // from class: nc.f1
            @Override // aq.d
            public final void a(aq.c cVar, int i11, Object obj) {
                cVar.f(7, R.layout.item_home_content_multiple_list_item_special_list);
            }
        });
        this.f75774c = homeMultipleEntry;
        this.f75958b = str;
        this.f75775d = homeMultipleEntry.getBlock_list();
        this.f75776e = i10;
        for (int i11 = 0; i11 < this.f75775d.size(); i11++) {
            this.f75777f.add(new e1(homeContentMultipleListViewModel, this.f75775d.get(i11), i10, i11));
        }
    }
}
