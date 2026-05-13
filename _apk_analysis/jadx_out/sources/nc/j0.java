package nc;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.channelcontent.SpecialDetailNewActivity;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeContentMultipleCategoryViewModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class j0 extends np.e<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HomeMultipleEntry f75782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableList<o0> f75783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public aq.c<o0> f75784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pp.b f75785f;

    public j0(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeContentMultipleListViewModel);
        this.f75783d = new ObservableArrayList();
        this.f75784e = aq.c.d(new aq.d() { // from class: nc.h0
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_content_multiple_list_item_category);
            }
        });
        this.f75785f = new pp.b(new pp.a() { // from class: nc.i0
            @Override // pp.a
            public final void call() {
                this.f75780a.e();
            }
        });
        this.f75782c = homeMultipleEntry;
        this.f75958b = str;
        if (homeMultipleEntry.getBlock_list().get(0).getVod_list() == null || homeMultipleEntry.getBlock_list().get(0).getVod_list().size() <= 0) {
            return;
        }
        this.f75783d.clear();
        for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(0).getVod_list().size(); i10++) {
            this.f75783d.add(new o0(homeContentMultipleListViewModel, homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.f75782c.getBlock_list().get(0).getTopic_id());
        ((HomeContentMultipleListViewModel) this.f75954a).startActivity(SpecialDetailNewActivity.class, bundle);
    }
}
