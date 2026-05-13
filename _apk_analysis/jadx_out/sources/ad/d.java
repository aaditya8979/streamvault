package ad;

import androidx.annotation.NonNull;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.ranklist.RankContentListViewModel;
import java.util.List;

/* JADX INFO: compiled from: ItemRankAdsMutipleFirstViewModel.java */
/* JADX INFO: loaded from: classes4.dex */
public class d extends np.e<RankContentListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<RecommandVideosEntity> f3720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pp.b f3721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public pp.b f3722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pp.b f3723f;

    public d(@NonNull RankContentListViewModel rankContentListViewModel, List<RecommandVideosEntity> list, String str) {
        super(rankContentListViewModel);
        this.f3721d = new pp.b(new pp.a() { // from class: ad.a
            @Override // pp.a
            public final void call() {
                this.f3717a.e();
            }
        });
        this.f3722e = new pp.b(new pp.a() { // from class: ad.b
            @Override // pp.a
            public final void call() {
                this.f3718a.f();
            }
        });
        this.f3723f = new pp.b(new pp.a() { // from class: ad.c
            @Override // pp.a
            public final void call() {
                this.f3719a.g();
            }
        });
        this.f3720c = list;
        this.f75958b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        ((RankContentListViewModel) this.f75954a).f44925r.setValue(this.f3720c.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        ((RankContentListViewModel) this.f75954a).f44925r.setValue(this.f3720c.get(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        ((RankContentListViewModel) this.f75954a).f44925r.setValue(this.f3720c.get(2));
    }
}
