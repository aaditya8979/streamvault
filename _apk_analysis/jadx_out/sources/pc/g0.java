package pc;

import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleMultipleViewModel.java */
/* JADX INFO: loaded from: classes6.dex */
public class g0 extends np.e<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HomeMultipleEntry f77193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<String> f77194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<SpannableString> f77195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f77196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f77197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<Boolean> f77198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableList<a0> f77199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public aq.c<a0> f77200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public pp.b f77201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public pp.b f77202l;

    public g0(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeRecommendMultipleListViewModel);
        this.f77194d = new ObservableField<>();
        this.f77195e = new ObservableField<>();
        this.f77196f = new ObservableField<>();
        this.f77197g = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f77198h = new ObservableField<>(bool);
        this.f77199i = new ObservableArrayList();
        this.f77200j = aq.c.d(new aq.d() { // from class: pc.d0
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_recommend_multiple_list_item_multiple);
            }
        });
        this.f77201k = new pp.b(new pp.a() { // from class: pc.e0
            @Override // pp.a
            public final void call() {
                this.f77189a.f();
            }
        });
        this.f77202l = new pp.b(new pp.a() { // from class: pc.f0
            @Override // pp.a
            public final void call() {
                this.f77191a.g();
            }
        });
        this.f77193c = homeMultipleEntry;
        this.f75958b = str;
        if (homeMultipleEntry.getBlock_list() == null || homeMultipleEntry.getBlock_list().size() <= 0) {
            return;
        }
        this.f77199i.clear();
        this.f77194d.set(homeMultipleEntry.getBlock_list().get(0).getBanner_pic());
        this.f77197g.set(homeMultipleEntry.getBlock_list().get(0).getContent());
        if (homeMultipleEntry.getBlock_list().get(0).getVod_info() != null) {
            if (homeMultipleEntry.getBlock_list().get(0).getVod_info().getType_pid() == 1) {
                this.f77198h.set(Boolean.TRUE);
                if (!zp.o.b(homeMultipleEntry.getBlock_list().get(0).getVod_info().getVod_douban_score())) {
                    this.f77195e.set(ed.e.m(homeMultipleEntry.getBlock_list().get(0).getVod_info().getVod_douban_score()));
                }
            } else if (homeMultipleEntry.getBlock_list().get(0).getVod_info().getType_pid() == 2 || homeMultipleEntry.getBlock_list().get(0).getVod_info().getType_pid() == 4) {
                this.f77198h.set(bool);
                if (homeMultipleEntry.getBlock_list().get(0).getVod_info().getVod_isend() == 1) {
                    this.f77196f.set(homeMultipleEntry.getBlock_list().get(0).getVod_info().getVod_total() + zp.r.b().getResources().getString(R.string.text_colections));
                } else {
                    this.f77196f.set(zp.r.b().getResources().getString(R.string.text_up_colections, homeMultipleEntry.getBlock_list().get(0).getVod_info().getVod_serial()));
                }
            } else if (homeMultipleEntry.getBlock_list().get(0).getVod_info().getType_pid() == 3) {
                this.f77196f.set(homeMultipleEntry.getBlock_list().get(0).getVod_info().getCollection_new_title() + "");
            }
        }
        if (homeMultipleEntry.getBlock_list().size() <= 1 || homeMultipleEntry.getBlock_list().get(1).getVod_list() == null || homeMultipleEntry.getBlock_list().get(1).getVod_list().size() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(1).getVod_list().size(); i10++) {
            this.f77199i.add(new a0(homeRecommendMultipleListViewModel, homeMultipleEntry.getBlock_list().get(1).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.f77193c.getBlock_list().get(0).getVod_info() != null) {
            this.f77193c.getBlock_list().get(0).getVod_info().setModule_id(this.f77193c.getModule_id());
            ((HomeRecommendMultipleListViewModel) this.f75954a).f44684p.setValue(this.f77193c.getBlock_list().get(0).getVod_info());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        op.a.a().b(new ic.r(this.f77193c.getJump_channel_id()));
    }
}
