package pc;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleGusslikeHorizationViewModel.java */
/* JADX INFO: loaded from: classes12.dex */
public class s extends np.e<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HomeMultipleEntry f77247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableList<y> f77248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public aq.c<y> f77249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pp.b f77250f;

    public s(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, HomeMultipleEntry homeMultipleEntry, String str) {
        super(homeRecommendMultipleListViewModel);
        this.f77248d = new ObservableArrayList();
        this.f77249e = aq.c.d(new aq.d() { // from class: pc.q
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_recommend_multiple_list_item_gusslike_horization);
            }
        });
        this.f77250f = new pp.b(new pp.a() { // from class: pc.r
            @Override // pp.a
            public final void call() {
                this.f77246a.e();
            }
        });
        this.f77247c = homeMultipleEntry;
        this.f75958b = str;
        if (homeMultipleEntry.getBlock_list() == null || homeMultipleEntry.getBlock_list().size() <= 0 || homeMultipleEntry.getBlock_list().get(0).getVod_list() == null || homeMultipleEntry.getBlock_list().get(0).getVod_list().size() <= 0) {
            return;
        }
        this.f77248d.clear();
        homeMultipleEntry.getBlock_list().get(0).getVod_list().add(new RecommandVideosEntity());
        for (int i10 = 0; i10 < homeMultipleEntry.getBlock_list().get(0).getVod_list().size(); i10++) {
            this.f77248d.add(new y(homeRecommendMultipleListViewModel, homeMultipleEntry.getBlock_list().get(0).getVod_list().get(i10), homeMultipleEntry.getModule_id()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        ((HomeRecommendMultipleListViewModel) this.f75954a).s();
    }
}
