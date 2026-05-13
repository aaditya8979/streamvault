package nc;

import androidx.annotation.NonNull;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.HomeContentListViewModel;

/* JADX INFO: compiled from: ItemHomeContentListViewModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class e0 extends np.c<HomeContentListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f75762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pp.b f75763c;

    public e0(@NonNull HomeContentListViewModel homeContentListViewModel, RecommandVideosEntity recommandVideosEntity) {
        super(homeContentListViewModel);
        this.f75763c = new pp.b(new pp.a() { // from class: nc.d0
            @Override // pp.a
            public final void call() {
                this.f75759a.b();
            }
        });
        this.f75762b = recommandVideosEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((HomeContentListViewModel) this.f75954a).f44587r.c(this);
    }
}
